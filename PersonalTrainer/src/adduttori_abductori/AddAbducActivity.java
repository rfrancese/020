package adduttori_abductori;

import it.unisa.personalTrainer.DorsaliActivity;
import it.unisa.personalTrainer.Muscles;
import it.unisa.personalTrainer.MusclesAdapter;
import it.unisa.personalTrainer.R;
import it.unisa.personalTrainer.SubMenu3Activity;
import it.unisa.personalTrainer.R.drawable;
import it.unisa.personalTrainer.R.id;
import it.unisa.personalTrainer.R.layout;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class AddAbducActivity extends Activity {

	private ListView listView1;
	
	  protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);

	      setContentView(R.layout.activity_exc);
	      Muscles data[] = new Muscles[]
	    		  {
	    		  new Muscles(R.drawable.aaa, "Abductor"),
	    		  new Muscles(R.drawable.bbb, "Adductor"),
	    		
		    		 
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
	    					  
	    					    case 1:  Intent newActivity2 = new Intent(AddAbducActivity.this, SubMenu2Activity.class);     
	    					              startActivity(newActivity2);
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



