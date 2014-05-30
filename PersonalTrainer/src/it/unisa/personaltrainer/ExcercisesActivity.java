package it.unisa.personaltrainer;

import dorsali.DorsaliActivity;
import accessori.Muscles;
import accessori.MusclesAdapter;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;


public class ExcercisesActivity extends Activity{
	
	private ListView listView1;
	
	  protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);

	      setContentView(R.layout.activity_excercises);
	      
	      TextView text= (TextView)findViewById(R.id.txtHeader1);
	      text.setBackgroundColor(Color.WHITE);
	      Muscles data[] = new Muscles[]
	    		  {
	    		  new Muscles(R.drawable.pettorali, "Pettorali"),
	    		  new Muscles(R.drawable.addominali, "Addominali"),
	    		  new Muscles(R.drawable.deltoidi, "Deltoidi"),
	    		  new Muscles(R.drawable.bicipiti, "Bicipiti"),
	    		  new Muscles(R.drawable.tricipiti, "Tricipiti"),
	    		  new Muscles(R.drawable.dorsali, "Dorsali"),
	    		  new Muscles(R.drawable.gambe, "Gambe"), 
	    		  };
	    		   
	    		  MusclesAdapter adapter = new MusclesAdapter(this,
	    		  R.layout.list_item, data);
	    		   
	    		   
	    		  listView1 = (ListView)findViewById(R.id.listView1);
	    		   
	    		  View header = (View)getLayoutInflater().inflate(R.drawable.list_muscles, null);
	    		  listView1.addHeaderView(header);
	    		   
	    		  listView1.setAdapter(adapter);
	    		  listView1.setOnItemClickListener(new OnItemClickListener() {
	    		        public void onItemClick(AdapterView<?> parent, View view,
	    		            int position, long id) {
	    		        	
	    		        	  switch( position ) {
	    		        	     case 1:  
	    		        	    	      Intent newActivity1 = new Intent(view.getContext(), PectoralActivity.class);     
				                          startActivity(newActivity1);
				                          break;
	    					     case 2:  
	    					    	      Intent newActivity2 = new Intent(view.getContext(), AbdominalActivity.class);     
	    					              startActivity(newActivity2);
	    					              break;
	    					  
	    					     case 3:  Intent newActivity3 = new Intent(view.getContext(), DeltoidiActivity.class);     
	    					              startActivity(newActivity3);
	    					              break;
	    					     
	    					     case 4:  Intent newActivity4 = new Intent(view.getContext(), BicipitiActivity.class);     
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
	    					    	      Intent newActivity7 = new Intent(view.getContext(), GambeActivity.class);     
	    					              startActivity(newActivity7);
	    					              break;
	    					    	
	    						    	 
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


