package it.unisa.personalTrainer;


import it.unisa.personalTrainer.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class TricepsActivity extends Activity {

	private ListView listView1;
	
	  protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);

	      setContentView(R.layout.activity_exc);
	      Muscles data[] = new Muscles[]
	    		  {
	    		  new Muscles(R.drawable.hh, "French Press"),
	    		  new Muscles(R.drawable.ii, "Distensioni alle parallele"),
	    		  new Muscles(R.drawable.jj, "Distensioni su Panca a presa stretta"),
	    		  new Muscles(R.drawable.ll, "French Press con manubrio"),
	    		  new Muscles(R.drawable.nn, " Kickback"),
	    		  new Muscles(R.drawable.oo, "Pushdown"),
		    		 
	    		  };
	    		   
	    		  MusclesAdapter adapter = new MusclesAdapter(this,
	    		  R.layout.list_item, data);
	    		   
	    		   
	    		  listView1 = (ListView)findViewById(R.id.listView1);
	    		  listView1.setSelector( R.drawable.selector_list);
	    		   
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



