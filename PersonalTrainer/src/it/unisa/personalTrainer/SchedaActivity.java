package it.unisa.personalTrainer;

import dataBaseSqliteSchede.DbAdapter2;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class SchedaActivity extends Activity {
	private DbAdapter2 dbHelper; 
    private Cursor cursor;
    private int cont=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scheda);

		TextView txt = (TextView) findViewById(R.id.textView1);
		Intent intent = getIntent();
		String day=intent.getStringExtra("Stringa1");
		txt.setText(day);
		
		
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
		
	}

	

}
