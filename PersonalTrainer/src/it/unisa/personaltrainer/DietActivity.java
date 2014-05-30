package it.unisa.personaltrainer;

import accessori.Muscles;
import accessori.MusclesAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;


public class DietActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.activity_dieta);
		 
		 
		
		 
		  Muscles data[] = new Muscles[]
	    		  {
		    		 
	    		  };
	    		   
	    		  MusclesAdapter adapter = new MusclesAdapter(this,
	    		  R.layout.list_item, data);
	    		  
	    		   
	    		  ListView listView1 = (ListView)findViewById(R.id.listView1);


	    		  View header = (View)getLayoutInflater().inflate(R.drawable.list_diet,null);
	    		  listView1.addHeaderView(header);
	    		  listView1.setAdapter(adapter);
		
	    		  Button btn1 = (Button) findViewById(R.id.button1);
	    			/*btn1.setOnClickListener(new OnClickListener() {
	    			@Override
	    			/*public void onClick(View arg0) {
	    				//vado alla prossima activity
	    				Intent intent = new Intent(DietActivity.this,DieteConsActivity.class);
	    		       startActivity(intent);
	    			}
	    			});
	    			
*/
	    			
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
