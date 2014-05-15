package it.unisa.personaltrainer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ProblemActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_problem);


		// Gestione button invia
		Button btn1 = (Button) findViewById(R.id.button2);
		btn1.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			final EditText edit = (EditText) findViewById(R.id.editText1);
			// gestione toast
			if(edit.getText().toString().equals("")){
				Toast.makeText(getApplicationContext(), "Impossibile inviare segnalazione vuota", Toast.LENGTH_SHORT).show();
			}
			else{
				Toast.makeText(getApplicationContext(), "Segnalazione inviata correttamente", Toast.LENGTH_SHORT).show();
				finish();
			}
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
