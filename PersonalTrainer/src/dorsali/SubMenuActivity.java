package dorsali;

import it.unisa.personaltrainer.R;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;


@SuppressWarnings("deprecation")
public class SubMenuActivity extends TabActivity {
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
			 spec1.setIndicator("Esecuzione"); //2. Ho definito il mio oggetto TabSpec
			 
			     
			 //3. definisco l'intent che punta all'Activity1
			 Intent intent1 = new Intent(this, VideoLatActivity.class);
			  
			 //4. collego l'Intent appena creato con l'oggetto TabSpec
			 spec1.setContent(intent1);
			  
			 //5. aggiungo la scheda al'oggetto TabHost
			 tabHost.addTab(spec1);
			  
			 /*
			 * Riperto i punti 2,3,4,5 per le restanti schede 
			 */
			 //SCHEDA 2
		 TabSpec spec2 = tabHost.newTabSpec("Scheda 2");
			 spec2.setIndicator("Descrizione"); //2. Ho definito il mio oggetto TabSpec
			
			 //3. definisco l'intent che punta all'Activity1
			 Intent intent2 = new Intent(this, Lat_machineActivity.class);
			  
			 //4. collego l'Intent appena creato con l'oggetto TabSpec
			 spec2.setContent(intent2);
			  
			 //5. aggiungo la scheda al'oggetto TabHost
			 tabHost.addTab(spec2);
			  
			 for (int i = 0; i < tabHost.getTabWidget().getTabCount(); i++) 
			 {
				 tabHost.getTabWidget().getChildAt(i).getLayoutParams().height = (int) (50* this.getResources()
						 .getDisplayMetrics().density);
				 
				 TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title);
			        tv.setTextSize(22);
			        tv.setGravity(Gravity.CENTER);
				 
			  }  
			 
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
