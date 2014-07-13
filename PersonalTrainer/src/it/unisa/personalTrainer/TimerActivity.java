package it.unisa.personalTrainer;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class TimerActivity extends Activity {

	private CountDownTimer countDownTimer;

	 public TextView text;
	 private long startTime;
	 private final long interval = 1 * 1000;
	 MediaPlayer player;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timer);

	     getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

		text = (TextView) this.findViewById(R.id.timer);
		Intent i=getIntent();
		
		startTime=(long)Integer.parseInt(i.getStringExtra("Stringa1"))*1000;
		
		  countDownTimer = new MyCountDownTimer(startTime, interval);
		  text.setText(text.getText() + String.valueOf(startTime / 1000));
		  
		  countDownTimer.start();
		
		   player= MediaPlayer.create(this, R.raw.music);
		
		  
		}
	public class MyCountDownTimer extends CountDownTimer {

		  public MyCountDownTimer(long startTime, long interval) {

		   super(startTime, interval);

		  }

		  @Override

		  public void onFinish() {
			  player.stop();
		   finish();
		   String message="Esegui la prossima serie";
			  Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
		  }

		 

		  @Override

		  public void onTick(long millisUntilFinished) {
		   text.setText("" + millisUntilFinished / 1000);
		  
		   if((millisUntilFinished / 1000)==8)
			   player.start();
		   player.setVolume(100, 100);
			  
		   
		   
			   
		  }

		 }
	@Override
	public void onBackPressed() {
	    // do nothing
	}
	}


