package it.unisa.personaltrainer;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ProblemActivity extends FragmentActivity implements ActionBar.TabListener {
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


	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}



}
