package it.unisa.personaltrainer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class RegistrationActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_registration);
		
		Button btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			Intent intent = new Intent(RegistrationActivity.this,RiepilogoActivity.class);
	       startActivity(intent);
		}
		});
		}
	
		
	
	protected void onStart()
	{
	super.onStart();
	
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
    }
    protected void onDestroy() {
    	super.onDestroy();
    	
    	}
}
