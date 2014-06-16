package it.unisa.personalTrainer;


import it.unisa.personalTrainer.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class PectoralActivity extends Activity {

	private ListView listView1;
	
	  protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);

	      setContentView(R.layout.activity_exc);
	      
	      Muscles data[] = new Muscles[]
	    		  {
	    		  new Muscles(R.drawable.i, "Croci ai cavi"),
	    		  new Muscles(R.drawable.j, "Croci con manubri su panca inclinata"),
	    		  new Muscles(R.drawable.k, "Croci alla macchina "),
	    		  new Muscles(R.drawable.l, "Croci con manubri su panca piana"),
	    		  new Muscles(R.drawable.m, "Panca al multipowe"),
	    		  new Muscles(R.drawable.n, "Panca declinata"),
	    		  new Muscles(R.drawable.o, "Panca inclinata con manubri"),
	    		  new Muscles(R.drawable.p, "Panca inclinata"),
	    		  new Muscles(R.drawable.q, "Panca piana con manubri"),	
	    		  new Muscles(R.drawable.r, "Panca piana"),
	    		  new Muscles(R.drawable.s, "Pullover con manubrio"),
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





