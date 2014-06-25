package it.unisa.personalTrainer;

import it.unisa.personalTrainer.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class DeltoidiActivity extends Activity {

	private ListView listView1;
	
	  protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);

	      setContentView(R.layout.activity_exc);
	      
	      Muscles data[] = new Muscles[]
	    		  {
	    		  new Muscles(R.drawable.t, "Alzate frontali con manubri"),
	    		  new Muscles(R.drawable.u, "Alzate laterali ai cavi"),
	    		  new Muscles(R.drawable.v, "Alzate laterali "),
	    		  new Muscles(R.drawable.x, "Alzate posteriori"),
	    		  new Muscles(R.drawable.y, "Lento avanti"),
	    		  new Muscles(R.drawable.w, "Spinte con manubri"),
	    		  
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
