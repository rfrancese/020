package it.unisa.personaltrainer;

import accessori.Muscles;
import accessori.MusclesAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class BicipitiActivity extends Activity {

	private ListView listView1;
	
	  protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);

	      setContentView(R.layout.activity_excercises);
	      Muscles data[] = new Muscles[]
	    		  {
	    		  new Muscles(R.drawable.aa, "Alternate hammer-curl-1"),
	    		  new Muscles(R.drawable.bb, "Biceps curl dumbell"),
	    		  new Muscles(R.drawable.cc, "Biceps curl with deadlift"),
	    		  new Muscles(R.drawable.dd, "Bicipes curl barbell"),
	    		  new Muscles(R.drawable.ee, "Concentration-curls-1"),
	    		  new Muscles(R.drawable.ff, "Overhead-curl-2"),
	    		  new Muscles(R.drawable.gg, "Rope hammer curl"),
		    		 
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



