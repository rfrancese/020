package it.unisa.personaltrainer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import android.widget.Toast;



public class SettingsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		
		final Spinner s = (Spinner) findViewById(R.id.spinner1);
		  ArrayAdapter adapter = ArrayAdapter.createFromResource(
		  this, R.array.lingua, android.R.layout.simple_spinner_item);
		  adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				s.setAdapter(adapter);	  
				s.setPrompt("Seleziona");
		
				
				
		        
		s.setOnItemSelectedListener(new OnItemSelectedListener() {
		
		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
			
			String voceSelezionata = (String) s.getSelectedItem();
		
		}
		
		public void onNothingSelected(AdapterView<?> arg0) {
				
		}
		});
		
		final TextView view = (TextView) findViewById(R.id.textView4);
		view.setOnClickListener(new View.OnClickListener() {

		  @Override
		  public void onClick(View v) {
			  Toast.makeText(getApplicationContext(), "Versione Corrente: 1.3", Toast.LENGTH_SHORT).show();
		  }

		});
		
		final TextView view2 = (TextView) findViewById(R.id.textView7);
		view2.setOnClickListener(new View.OnClickListener() {

		 
		@Override
		  public void onClick(View v) {
			Intent intent = new Intent(SettingsActivity.this,ProblemActivity.class);
			startActivity(intent);
		  }

		});
		
		final TextView view3 = (TextView) findViewById(R.id.textView5);
		view3.setOnClickListener(new View.OnClickListener() {

		  @Override
		  public void onClick(View v) {
			  
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