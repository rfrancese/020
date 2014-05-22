package it.unisa.personaltrainer;

import accessori.Muscles;
import accessori.MusclesAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class TricepsActivity extends Activity {

	private ListView listView1;
	
	  protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);

	      setContentView(R.layout.activity_excercises);
	      Muscles data[] = new Muscles[]
	    		  {
	    		  new Muscles(R.drawable.hh, "Barbell incline triceps extension"),
	    		  new Muscles(R.drawable.ii, "Bench dips"),
	    		  new Muscles(R.drawable.jj, "Jm press"),
	    		  new Muscles(R.drawable.kk, "Lying triceps press"),
	    		  new Muscles(R.drawable.ll, "One arm triceps extension"),
	    		  new Muscles(R.drawable.mm, "Standing one arm triceps extension"),
	    		  new Muscles(R.drawable.nn, "Tricep dumbbell kickback"),
	    		  new Muscles(R.drawable.oo, "triceps pushdown v-bar"),
		    		 
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



