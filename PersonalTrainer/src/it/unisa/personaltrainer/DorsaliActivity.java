package it.unisa.personaltrainer;

import accessori.Muscles;
import accessori.MusclesAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class DorsaliActivity extends Activity {

	private ListView listView1;
	
	  protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);

	      setContentView(R.layout.activity_excercises);
	      Muscles data[] = new Muscles[]
	    		  {
	    		  new Muscles(R.drawable.pp, "Lat Machine avanti impugnatura inversa"),
	    		  new Muscles(R.drawable.qq, "Lat machine avanti"),
	    		  new Muscles(R.drawable.rr, "Lat machine"),
	    		  new Muscles(R.drawable.xx, "Lat machine con maniglia"),
	    		  new Muscles(R.drawable.ss, "Rear deltoid row"),
	    		  new Muscles(R.drawable.tt, "Reverse grip bent over rows"),
	    		  new Muscles(R.drawable.uu, "Pulley basso"),
	    		  new Muscles(R.drawable.vv, "T-bar-row"),
	    		  
	    		  };
	    		   
	    		  MusclesAdapter adapter = new MusclesAdapter(this,
	    		  R.layout.list_item, data);
	    		   
	    		   
	    		  listView1 = (ListView)findViewById(R.id.listView1);
	    		   
	    		  View header = (View)getLayoutInflater().inflate(R.drawable.list_excercises, null);
	    		  listView1.addHeaderView(header);
	    		   
	    		  listView1.setAdapter(adapter);
	    		  
	    		
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