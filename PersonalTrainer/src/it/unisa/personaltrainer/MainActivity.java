package it.unisa.personaltrainer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);

	}

	protected void onRestart()
	{
	super.onRestart();

	}
	protected void onStart()
	{
	super.onStart();
	@SuppressWarnings("unused")
	CountDownTimer cdt = new CountDownTimer(3000,1000){
		@Override
		public void onFinish() {
			finish();
			Intent intent = new Intent(MainActivity.this,RegistrationActivity.class);
			startActivity(intent);
		}

		@Override
		public void onTick(long millisUntilFinished) {
		//cosa fare ad ogni passaggio
		}
		}.start();
	}
	
	protected void onResume() {
		super.onResume();
	}
	protected void onStop() {
		super.onStop();
	}
	

    protected void onPause(){
    	super.onPause();
    	finish();
    }
    protected void onDestroy() {
    	super.onDestroy();
		
    	}
	

}
