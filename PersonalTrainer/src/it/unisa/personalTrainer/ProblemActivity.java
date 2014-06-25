package it.unisa.personalTrainer;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ProblemActivity extends Activity {
	String object;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_problem);
          object="Segnalazione problema PersonalTrainer";

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
				String segn=edit.getText().toString();
				Intent imail = new Intent(Intent.ACTION_SEND);
				imail.putExtra(Intent.EXTRA_EMAIL, new String[] {"personaltrainerapp2014@gmail.com"});
				imail.putExtra(Intent.EXTRA_SUBJECT, object);
				imail.putExtra(Intent.EXTRA_TEXT, segn);
				imail.setType("message/rfc822");
				startActivity(Intent.createChooser(imail, "Email"));
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