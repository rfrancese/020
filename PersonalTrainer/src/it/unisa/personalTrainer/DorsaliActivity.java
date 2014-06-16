package it.unisa.personalTrainer;


import it.unisa.personalTrainer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class DorsaliActivity extends Activity {

	private ListView listView1;
	
	  protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);

	      setContentView(R.layout.activity_exc);
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
	    		  listView1.setSelector( R.drawable.selector_list);
	    		 
	    		   
	    		  listView1.setAdapter(adapter);
	    		  
	    	 listView1.setOnItemClickListener(new OnItemClickListener() {
	    		        public void onItemClick(AdapterView<?> parent, View view,
	    		            int position, long id) {
	    		        	
	    		        	  switch( position ) {
	    		        	    /*case 1:  
	    		        	    	      Intent newActivity1 = new Intent(view.getContext(), PectoralActivity.class);     
				                          startActivity(newActivity1);
				                          break;
	    					     case 2:  
	    					    	      Intent newActivity2 = new Intent(view.getContext(), AbdominalActivity.class);     
	    					              startActivity(newActivity2);
	    					              break;*/
	    					  
	    					    case 2:  Intent newActivity3 = new Intent(DorsaliActivity.this, SubMenu3Activity.class);     
	    					              startActivity(newActivity3);
	    					              break;
	    					     
	    					    /*case 4:  Intent newActivity4 = new Intent(view.getContext(), BicipitiActivity.class);     
	    					              startActivity(newActivity4);
	    					              break;
	    					     case 5:  
	    					    	      Intent newActivity5 = new Intent(view.getContext(), TricepsActivity.class);     
					                      startActivity(newActivity5);
					                      break;
					              
	    					     case 6: 
 					    	              Intent newActivity6 = new Intent(view.getContext(), DorsaliActivity.class);     
				                          startActivity(newActivity6);
				                          break;
	    					     case 7:  
	    					    	      Intent newActivity7 = new Intent(view.getContext(), Pulley_bassoActivity.class);     
	    					              startActivity(newActivity7);
	    					              break;
	    					    	*/
	    						    	
	    					    }
	    		        }

						
	    		
	    	  });
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
	    		  