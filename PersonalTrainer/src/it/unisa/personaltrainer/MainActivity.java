package it.unisa.personaltrainer;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;

public class MainActivity extends Activity {

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

		// Timer che dopo 3 secondi termina l'attività contenente l'immagine e avvia RegistrationActivity
		@SuppressWarnings("unused")
		CountDownTimer cdt = new CountDownTimer(3000,1000){
			@Override
			public void onFinish() {
				finish();

				// controllo esistenza file su sd
				File directory=new File("/sdcard/PersonalTrainer/");

				File f = new File(directory,"LogInPT");
				File fmem=new File(getFilesDir()+File.separator+"LogInPT");

				if(Environment.isExternalStorageRemovable()){
					if(f.exists()){
						Intent intent = new Intent(MainActivity.this,MenuActivity.class);
						startActivity(intent);
					}
					else{
						Intent intent = new Intent(MainActivity.this,RegistrationActivity.class);
						startActivity(intent);
					}

				}

				else{ 

					if(fmem.exists()){
						Intent intent = new Intent(MainActivity.this,MenuActivity.class);
						startActivity(intent);
					}
					else{
						Intent intent = new Intent(MainActivity.this,RegistrationActivity.class);
						startActivity(intent);
					}
				}	
			}

			@Override
			public void onTick(long millisUntilFinished) {

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
