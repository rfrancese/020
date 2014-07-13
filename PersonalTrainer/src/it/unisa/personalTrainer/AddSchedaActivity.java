package it.unisa.personalTrainer;

import dataBaseSqliteDate.DbAdapter;
import dataBaseSqliteSchede.DbAdapter2;
import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;


public class AddSchedaActivity extends Activity {
	Spinner s;
	private DbAdapter2 dbHelper; 
    private Cursor cursor;	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.scheda);
        
		    s = (Spinner) findViewById(R.id.spinner1);
		    @SuppressWarnings("rawtypes")
			ArrayAdapter adapter = ArrayAdapter.createFromResource(
				  this, R.array.settimana,R.layout.simple_spinner_item2);
				  adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
				 
						s.setAdapter(adapter);	  

						
						Button b= (Button) findViewById(R.id.button1);
						b.setOnClickListener(new OnClickListener() {
					 			@Override
					 			public void onClick(View arg0) {
					 				
					 				String day = (String) s.getSelectedItem();
					 				dbHelper = new DbAdapter2(AddSchedaActivity.this);
					 		         dbHelper.open();
					 		        cursor = dbHelper.fetchContactsByFilter(day);

					 				 while ( cursor.moveToNext() ) {
					 				                
					 				   dbHelper.deleteContact(cursor.getLong(cursor.getColumnIndex(DbAdapter.KEY_CONTACTID)));
					 				}           
					 				       cursor.close();

					 		       TextView t5 = (TextView) findViewById(R.id.textView5);
					 		       TextView t6 = (TextView) findViewById(R.id.textView6);
					 		       TextView t7 = (TextView) findViewById(R.id.textView7);
					 		       TextView t45 = (TextView) findViewById(R.id.textView45);
					 		       if(!(t5.getText().toString().equals("")))
					 		    	  dbHelper.createContact(day, t5.getText().toString(),t6.getText().toString(),
					 		    			  t7.getText().toString(),t45.getText().toString());
					 		        
					 		      TextView t9 = (TextView) findViewById(R.id.textView9);
					 		       TextView t10 = (TextView) findViewById(R.id.textView10);
					 		       TextView t11 = (TextView) findViewById(R.id.textView11);
					 		      TextView t46 = (TextView) findViewById(R.id.textView46);
					 		       if(!(t9.getText().toString().equals("")))
					 		    	  dbHelper.createContact(day, t9.getText().toString(),t10.getText().toString(),
					 		    			  t11.getText().toString(),t46.getText().toString());
					 		        
					 		      TextView t13 = (TextView) findViewById(R.id.textView13);
					 		       TextView t14 = (TextView) findViewById(R.id.textView14);
					 		       TextView t15 = (TextView) findViewById(R.id.textView15);
					 		      TextView t47 = (TextView) findViewById(R.id.textView47);
					 		       if(!(t13.getText().toString().equals("")))
					 		    	  dbHelper.createContact(day, t13.getText().toString(),t14.getText().toString(),
					 		    			  t15.getText().toString(),t47.getText().toString());
					 		        
					 		       
					 		      TextView t17 = (TextView) findViewById(R.id.textView17);
					 		       TextView t18 = (TextView) findViewById(R.id.textView18);
					 		       TextView t19 = (TextView) findViewById(R.id.textView19);
					 		      TextView t48 = (TextView) findViewById(R.id.textView48);
					 		       if(!(t17.getText().toString().equals("")))
					 		    	  dbHelper.createContact(day, t17.getText().toString(),t18.getText().toString(),
					 		    			  t19.getText().toString(),t48.getText().toString());
					 		        
					 		      TextView t21 = (TextView) findViewById(R.id.textView21);
					 		       TextView t22 = (TextView) findViewById(R.id.textView22);
					 		       TextView t23 = (TextView) findViewById(R.id.textView23);
					 		      TextView t49 = (TextView) findViewById(R.id.textView49);
					 		       if(!(t21.getText().toString().equals("")))
					 		    	  dbHelper.createContact(day, t21.getText().toString(),t22.getText().toString(),
					 		    			  t23.getText().toString(),t49.getText().toString());
					 		       
					 		      TextView t25 = (TextView) findViewById(R.id.textView25);
					 		       TextView t26 = (TextView) findViewById(R.id.textView26);
					 		       TextView t27 = (TextView) findViewById(R.id.textView27);
					 		      TextView t50 = (TextView) findViewById(R.id.textView50);
					 		       if(!(t25.getText().toString().equals("")))
					 		    	  dbHelper.createContact(day, t25.getText().toString(),t26.getText().toString(),
					 		    			  t27.getText().toString(),t50.getText().toString());
					 		       
					 		      TextView t29 = (TextView) findViewById(R.id.textView29);
					 		       TextView t30 = (TextView) findViewById(R.id.textView30);
					 		       TextView t31 = (TextView) findViewById(R.id.textView31);
					 		      TextView t51 = (TextView) findViewById(R.id.textView51);
					 		       if(!(t29.getText().toString().equals("")))
					 		    	  dbHelper.createContact(day, t29.getText().toString(),t30.getText().toString(),
					 		    			  t31.getText().toString(),t51.getText().toString());
					 		       
					 		      TextView t33 = (TextView) findViewById(R.id.textView33);
					 		       TextView t34 = (TextView) findViewById(R.id.textView34);
					 		       TextView t35 = (TextView) findViewById(R.id.textView35);
					 		      TextView t52 = (TextView) findViewById(R.id.textView52);
					 		       if(!(t33.getText().toString().equals("")))
					 		    	  dbHelper.createContact(day, t33.getText().toString(),t34.getText().toString(),
					 		    			  t35.getText().toString(),t52.getText().toString());
					 		       
					 		      TextView t37 = (TextView) findViewById(R.id.textView37);
					 		       TextView t38 = (TextView) findViewById(R.id.textView38);
					 		       TextView t39 = (TextView) findViewById(R.id.textView39);
					 		      TextView t53 = (TextView) findViewById(R.id.textView53);
					 		       if(!(t37.getText().toString().equals("")))
					 		    	  dbHelper.createContact(day, t37.getText().toString(),t38.getText().toString(),
					 		    			  t39.getText().toString(),t53.getText().toString());
					 		       
					 		      TextView t41 = (TextView) findViewById(R.id.textView41);
					 		       TextView t42 = (TextView) findViewById(R.id.textView42);
					 		       TextView t43 = (TextView) findViewById(R.id.textView43);
					 		      TextView t54 = (TextView) findViewById(R.id.textView54);
					 		       if(!(t41.getText().toString().equals("")))
					 		    	  dbHelper.createContact(day, t41.getText().toString(),t42.getText().toString(),
					 		    			  t43.getText().toString(),t54.getText().toString());
					 		       
					 		      
					 		       
					 		         dbHelper.close();
					 			
					 		        
					 				finish();
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
