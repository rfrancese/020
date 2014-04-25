package it.unisa.personaltrainer;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class RiepilogoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent intent = new Intent(this,AvvioActivity.class);
		startActivity(intent);
		

	}
	protected void onStart()
	{
	super.onStart();
	
	setContentView(R.layout.activity_riepilogo_main);
	}
	
	protected void onRestart()
	{
	super.onRestart();

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
