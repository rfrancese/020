package it.unisa.personaltrainer;

import adapterSpinner.NothingSelectedSpinnerAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;



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
		
		
		final Spinner s = (Spinner) findViewById(R.id.spinner1);
		  ArrayAdapter adapter = ArrayAdapter.createFromResource(
		  this, R.array.seleziona, android.R.layout.simple_spinner_dropdown_item);
		  adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				s.setAdapter(
					      new NothingSelectedSpinnerAdapter(
					            adapter,
					            R.drawable.contact_spinner_row_nothing_selected,
					            // R.layout.contact_spinner_nothing_selected_dropdown, // Optional
					            this));
				s.setPrompt("Seleziona");
		
				
				
		        
		s.setOnItemSelectedListener(new OnItemSelectedListener() {
		
		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
			
			String voceSelezionata = (String) s.getSelectedItem();
		
		}
		
		public void onNothingSelected(AdapterView<?> arg0) {
				
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
