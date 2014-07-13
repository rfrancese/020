package it.unisa.personalTrainer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import dataBaseSqliteDate.DbAdapter;
import dataBaseSqliteSchede.DbAdapter2;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Environment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SchedaActivity extends Activity {
	private DbAdapter2 dbHelper; 
    private Cursor cursor;
    private int cont=0;
    private Button b,b1,b2,b3,b4 ;
    private TextView txt;
    final String FILENAME4="switch";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scheda);

		
		  b1 = (Button) findViewById(R.id.button2);
		  b2 = (Button) findViewById(R.id.button3);
		  b3 = (Button) findViewById(R.id.button4);
		  b4 = (Button) findViewById(R.id.button5);
		  
		 File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
			File f4= new File(directory,FILENAME4);
			BufferedReader buffer;
			String s1;
		    try {
				FileReader i =new FileReader(f4);
				
			    buffer=new BufferedReader(i);
			    
			    s1=buffer.readLine();
			    buffer.close();
					
			    if(s1.equals("si"))
			    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
			    
			    	
						
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    
		 txt = (TextView) findViewById(R.id.textView1);
		Intent intent = getIntent();
		String day=intent.getStringExtra("Stringa1");
		txt.setText(day);
	      b = (Button) findViewById(R.id.button1);
		b.setEnabled(false);
		b.setClickable(false);
		
		
		 dbHelper = new DbAdapter2(SchedaActivity.this);
         dbHelper.open();
         
        cursor = dbHelper.fetchContactsByFilter3(day);

        
		cursor.moveToNext();
		cont++;                
		  

       if(!cursor.isAfterLast() && cont==1){
       TextView t5 = (TextView) findViewById(R.id.textView5);
       TextView t6 = (TextView) findViewById(R.id.textView6);
       TextView t7 = (TextView) findViewById(R.id.textView7);
       EditText t45 = (EditText) findViewById(R.id.textView45);
       t5.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_ESERCIZI)));
       t6.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_SERIE)));
       t7.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_RIP)));
       t45.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_PESI)));
       cursor.moveToNext();
       cont++;
       }

       
       
       if(!cursor.isAfterLast() && cont==2){
      TextView t9 = (TextView) findViewById(R.id.textView9);
      TextView t10 = (TextView) findViewById(R.id.textView10);
      TextView t11 = (TextView) findViewById(R.id.textView11);
      EditText t46 = (EditText) findViewById(R.id.textView46);
      t9.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_ESERCIZI)));
      t10.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_SERIE)));
      t11.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_RIP)));
      t46.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_PESI)));
      cursor.moveToNext();
      cont++;
       }
    
       if(!cursor.isAfterLast()  && cont==3){
      TextView t13 = (TextView) findViewById(R.id.textView13);
      TextView t14 = (TextView) findViewById(R.id.textView14);
      TextView t15 = (TextView) findViewById(R.id.textView15);
      EditText t47 = (EditText) findViewById(R.id.textView47);
      t13.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_ESERCIZI)));
      t14.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_SERIE)));
      t15.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_RIP)));
      t47.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_PESI)));
      cursor.moveToNext();
      cont++;
       }
      
       if(!cursor.isAfterLast()  && cont==4){
      TextView t17 = (TextView) findViewById(R.id.textView17);
      TextView t18 = (TextView) findViewById(R.id.textView18);
      TextView t19 = (TextView) findViewById(R.id.textView19);
      EditText t48 = (EditText) findViewById(R.id.textView48);
      t17.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_ESERCIZI)));
      t18.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_SERIE)));
      t19.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_RIP)));
      t48.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_PESI)));
      cursor.moveToNext();
      cont++;
       }
      
       if(!cursor.isAfterLast()  && cont==5){
      TextView t21 = (TextView) findViewById(R.id.textView21);
      TextView t22 = (TextView) findViewById(R.id.textView22);
      TextView t23 = (TextView) findViewById(R.id.textView23);
      EditText t49 = (EditText) findViewById(R.id.textView49);
      t21.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_ESERCIZI)));
      t22.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_SERIE)));
      t23.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_RIP)));
      t49.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_PESI)));
      cursor.moveToNext();
      cont++;
       }
      
       if(!cursor.isAfterLast()  && cont==6){
      TextView t25 = (TextView) findViewById(R.id.textView25);
      TextView t26 = (TextView) findViewById(R.id.textView26);
      TextView t27 = (TextView) findViewById(R.id.textView27);
      EditText t50 = (EditText) findViewById(R.id.textView50);
      t25.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_ESERCIZI)));
      t26.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_SERIE)));
      t27.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_RIP)));
      t50.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_PESI)));
      cursor.moveToNext();
      cont++;
       }
      
       if(!cursor.isAfterLast()  && cont==7){
      TextView t29 = (TextView) findViewById(R.id.textView29);
      TextView t30 = (TextView) findViewById(R.id.textView30);
      TextView t31 = (TextView) findViewById(R.id.textView31);
      EditText t51 = (EditText) findViewById(R.id.textView51);
      t29.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_ESERCIZI)));
      t30.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_SERIE)));
      t31.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_RIP)));
      t51.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_PESI)));
      cursor.moveToNext();
      cont++;
       }
      
       if(!cursor.isAfterLast()  && cont==8){
      TextView t33 = (TextView) findViewById(R.id.textView33);
      TextView t34 = (TextView) findViewById(R.id.textView34);
      TextView t35 = (TextView) findViewById(R.id.textView35);
      EditText t52 = (EditText) findViewById(R.id.textView52);
      t33.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_ESERCIZI)));
      t34.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_SERIE)));
      t35.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_RIP)));
      t52.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_PESI)));
      cursor.moveToNext();
      cont++;
       }
       
       if(!cursor.isAfterLast()  && cont==9){
      TextView t37 = (TextView) findViewById(R.id.textView37);
      TextView t38 = (TextView) findViewById(R.id.textView38);
      TextView t39 = (TextView) findViewById(R.id.textView39);
      EditText t53 = (EditText) findViewById(R.id.textView53);
      t37.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_ESERCIZI)));
      t38.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_SERIE)));
      t39.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_RIP)));
      t53.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_PESI)));
      cursor.moveToNext();
      cont++;
       }
      
       if(!cursor.isAfterLast()  && cont==10){
      TextView t41 = (TextView) findViewById(R.id.textView41);
      TextView t42 = (TextView) findViewById(R.id.textView42);
      TextView t43 = (TextView) findViewById(R.id.textView43);
      EditText t54 = (EditText) findViewById(R.id.textView54);
      t41.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_ESERCIZI)));
      t42.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_SERIE)));
      t43.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_RIP)));
      t54.setText(cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_PESI)));
      cursor.moveToNext();
    
       } 
       
      
       
            
	     cursor.close();
         dbHelper.close();
         
         // rendo cliccabili solo editext pieni
         EditText t45 = (EditText) findViewById(R.id.textView45);
         if(t45.getText().toString().equals(""))
        	 t45.setFocusable(false);
             
         t45.addTextChangedListener(new TextWatcher() {

             public void afterTextChanged(Editable s) {


             }

             public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

             public void onTextChanged(CharSequence s, int start, int before, int count) {
            	 b.setEnabled(true);
         		b.setClickable(true);
             }
          });
         
         EditText t46 = (EditText) findViewById(R.id.textView46);
         if(t46.getText().toString().equals(""))
        	 t46.setFocusable(false);
         
         t46.addTextChangedListener(new TextWatcher() {

             public void afterTextChanged(Editable s) {


             }

             public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

             public void onTextChanged(CharSequence s, int start, int before, int count) {
            	 b.setEnabled(true);
         		b.setClickable(true);
             }
          });
         
         EditText t47 = (EditText) findViewById(R.id.textView47);
         if(t47.getText().toString().equals(""))
        	 t47.setFocusable(false);
         
         t47.addTextChangedListener(new TextWatcher() {

             public void afterTextChanged(Editable s) {


             }

             public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

             public void onTextChanged(CharSequence s, int start, int before, int count) {
            	 b.setEnabled(true);
         		b.setClickable(true);
             }
          });
         
         EditText t48 = (EditText) findViewById(R.id.textView48);
         if(t48.getText().toString().equals(""))
        	 t48.setFocusable(false);
         
         t48.addTextChangedListener(new TextWatcher() {

             public void afterTextChanged(Editable s) {


             }

             public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

             public void onTextChanged(CharSequence s, int start, int before, int count) {
            	 b.setEnabled(true);
         		b.setClickable(true);
             }
          });
         
         EditText t49 = (EditText) findViewById(R.id.textView49);
         if(t49.getText().toString().equals(""))
        	 t49.setFocusable(false);
         
         t49.addTextChangedListener(new TextWatcher() {

             public void afterTextChanged(Editable s) {


             }

             public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

             public void onTextChanged(CharSequence s, int start, int before, int count) {
            	 b.setEnabled(true);
         		b.setClickable(true);
             }
          });
         
         EditText t50 = (EditText) findViewById(R.id.textView50);
         if(t50.getText().toString().equals(""))
        	 t50.setFocusable(false);
         t50.addTextChangedListener(new TextWatcher() {

             public void afterTextChanged(Editable s) {


             }

             public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

             public void onTextChanged(CharSequence s, int start, int before, int count) {
            	 b.setEnabled(true);
         		b.setClickable(true);
             }
          });
         
         EditText t51 = (EditText) findViewById(R.id.textView51);
         if(t51.getText().toString().equals(""))
        	 t51.setFocusable(false);
         
         t51.addTextChangedListener(new TextWatcher() {

             public void afterTextChanged(Editable s) {


             }

             public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

             public void onTextChanged(CharSequence s, int start, int before, int count) {
            	 b.setEnabled(true);
         		b.setClickable(true);
             }
          });
         
         EditText t52 = (EditText) findViewById(R.id.textView52);
         if(t52.getText().toString().equals(""))
        	 t52.setFocusable(false);
         
         t52.addTextChangedListener(new TextWatcher() {

             public void afterTextChanged(Editable s) {


             }

             public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

             public void onTextChanged(CharSequence s, int start, int before, int count) {
            	 b.setEnabled(true);
         		b.setClickable(true);
             }
          });
         
         EditText t53 = (EditText) findViewById(R.id.textView53);
         if(t53.getText().toString().equals(""))
        	 t53.setFocusable(false);
         
         t53.addTextChangedListener(new TextWatcher() {

             public void afterTextChanged(Editable s) {


             }

             public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

             public void onTextChanged(CharSequence s, int start, int before, int count) {
            	 b.setEnabled(true);
         		b.setClickable(true);
             }
          });
         
         EditText t54 = (EditText) findViewById(R.id.textView54);
         if(t54.getText().toString().equals(""))
        	 t54.setFocusable(false);
         t54.addTextChangedListener(new TextWatcher() {

             public void afterTextChanged(Editable s) {


             }

             public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

             public void onTextChanged(CharSequence s, int start, int before, int count) {
            	 b.setEnabled(true);
         		b.setClickable(true);
             }
          });
         
       
         
         
         
         b.setOnClickListener(new OnClickListener() {
	 			@Override
	 			public void onClick(View arg0) {
	 				
				String day = txt.getText().toString();
				dbHelper = new DbAdapter2(SchedaActivity.this);
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
         
         
         b1.setOnClickListener(new OnClickListener() {
	 			@Override
	 			public void onClick(View arg0) {
	 				Intent i=new Intent(SchedaActivity.this,TimerActivity.class);
	 				i.putExtra("Stringa1", "30");
	 				startActivity(i);
	 			}
         });
	 			
         b2.setOnClickListener(new OnClickListener() {
	 			@Override
	 			public void onClick(View arg0) {
	 				Intent i=new Intent(SchedaActivity.this,TimerActivity.class);
	 				i.putExtra("Stringa1", "60");
	 				startActivity(i);
	 			}
      });
         
         b3.setOnClickListener(new OnClickListener() {
	 			@Override
	 			public void onClick(View arg0) {
	 				Intent i=new Intent(SchedaActivity.this,TimerActivity.class);
	 				i.putExtra("Stringa1", "90");
	 				startActivity(i);
	 			}
      });
         b4.setOnClickListener(new OnClickListener() {
	 			@Override
	 			public void onClick(View arg0) {
	 				Intent i=new Intent(SchedaActivity.this,TimerActivity.class);
	 				i.putExtra("Stringa1", "120");
	 				startActivity(i);
	 			}
      });
         }
         
       
	}


