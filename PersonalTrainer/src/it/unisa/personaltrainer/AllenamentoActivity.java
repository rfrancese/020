package it.unisa.personaltrainer;

import accessori.Muscles;
import accessori.MusclesAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;



public class AllenamentoActivity extends Activity {

	private ListView listView1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_excercises);

		Muscles data[] = new Muscles[]
	    		  {
				  new Muscles(R.drawable.massa, "Aumento massa muscolare"),
	    		  new Muscles(R.drawable.dimag, "Dimagrimento"),
	    		  new Muscles(R.drawable.rassod, "Rassodamento"),
	    		 
	    		   
	    		  };
	    		   
	    		  MusclesAdapter adapter = new MusclesAdapter(this,
	    		  R.layout.list_item, data);
	    		 
	    		   
	    		  listView1 = (ListView)findViewById(R.id.listView1);
	    		   
	    		  View header = (View)getLayoutInflater().inflate(R.drawable.list_obiettivi, null);
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
