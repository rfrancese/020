package it.unisa.personaltrainer;


import android.app.AlertDialog;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;


@SuppressWarnings("deprecation")
public class MenuActivity extends TabActivity {
	private TabHost tabHost;
	
		/** Called when the activity is first created. */
		@Override
		public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// recupero il tabHost
			  tabHost = getTabHost();
			 /*
			 * SCHEDA 1
			 */
		      TabSpec spec1 = tabHost.newTabSpec("Scheda 1");
			 spec1.setIndicator("", getResources().getDrawable(R.drawable.tab1_selector)); //2. Ho definito il mio oggetto TabSpec
			
			 
			     
			 //3. definisco l'intent che punta all'Activity1
			 Intent intent1 = new Intent(this, ExcercisesActivity.class);
			  
			 //4. collego l'Intent appena creato con l'oggetto TabSpec
			 spec1.setContent(intent1);
			  
			 //5. aggiungo la scheda al'oggetto TabHost
			 tabHost.addTab(spec1);
			  
			 /*
			 * Riperto i punti 2,3,4,5 per le restanti schede 
			 */
			 //SCHEDA 2
		 TabSpec spec2 = tabHost.newTabSpec("Scheda 2");
			 spec2.setIndicator("", getResources().getDrawable(R.drawable.tab2_selector)); //2. Ho definito il mio oggetto TabSpec
			
			 //3. definisco l'intent che punta all'Activity1
			 Intent intent2 = new Intent(this, DiaryActivity.class);
			  
			 //4. collego l'Intent appena creato con l'oggetto TabSpec
			 spec2.setContent(intent2);
			  
			 //5. aggiungo la scheda al'oggetto TabHost
			 tabHost.addTab(spec2);
			  
			 //SCHEDA 3
			 TabSpec spec3 = tabHost.newTabSpec("Scheda 3");
			 spec3.setIndicator("", getResources().getDrawable(R.drawable.tab3_selector)); //2. Ho definito il mio oggetto TabSpec
			 
			 //3. definisco l'intent che punta all'Activity3
			 Intent intent3 = new Intent(this, DietActivity.class);
			  
			 //4. collego l'Intent appena creato con l'oggetto TabSpec
			 spec3.setContent(intent3);
			  
			 //5. aggiungo la scheda al'oggetto TabHost
			 tabHost.addTab(spec3);
			 
			 //SCHEDA 4
			 TabSpec spec4 = tabHost.newTabSpec("Scheda 4");
			 spec4.setIndicator("", getResources().getDrawable(R.drawable.tab4_selector)); //2. Ho definito il mio oggetto TabSpec
			
			 //3. definisco l'intent che punta all'Activity3
			 Intent intent4 = new Intent(this, AllenamentoActivity.class);
			  
			 //4. collego l'Intent appena creato con l'oggetto TabSpec
			 spec4.setContent(intent4);
			  
			 //5. aggiungo la scheda al'oggetto TabHost
			 tabHost.addTab(spec4);
			 
			 //SCHEDA 5
			 TabSpec spec5 = tabHost.newTabSpec("Scheda 5");
			 spec5.setIndicator("", getResources().getDrawable(R.drawable.tab5_selector)); //2. Ho definito il mio oggetto TabSpec
			  
			 //3. definisco l'intent che punta all'Activity3
			 Intent intent5 = new Intent(this, SettingsActivity.class);
			  
			 //4. collego l'Intent appena creato con l'oggetto TabSpec
			 spec5.setContent(intent5);
			  
			 //5. aggiungo la scheda al'oggetto TabHost
			 tabHost.addTab(spec5);
			 
			 
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
