package it.unisa.personaltrainer;


import accessori.Muscles;
import accessori.MusclesAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;



public class AbdominalActivity extends Activity {

	private ListView listView1;
	
	  protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);

	      setContentView(R.layout.activity_excercises);
	      
	      Muscles data[] = new Muscles[]
	    		  {
	    		  new Muscles(R.drawable.a, "Bent Knee Hip Raise"),
	    		  new Muscles(R.drawable.b, "Cross Body Crunch"),
	    		  new Muscles(R.drawable.c, "Crunches"),
	    		  new Muscles(R.drawable.d, "Decline Crunch"),
	    		  new Muscles(R.drawable.e, "Leg Raise"),
	    		  new Muscles(R.drawable.f, "Seated Ab Crunch"),
	    		  new Muscles(R.drawable.g, "Side Bend"),
	    		  new Muscles(R.drawable.h, "Side Plank"),
		    		 
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


