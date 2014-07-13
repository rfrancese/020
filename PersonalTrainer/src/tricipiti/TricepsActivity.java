package tricipiti;


import it.unisa.personalTrainer.Muscles;
import it.unisa.personalTrainer.MusclesAdapter;
import it.unisa.personalTrainer.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class TricepsActivity extends Activity {

	private ListView listView1;
	
	  protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);

	      setContentView(R.layout.activity_exc);
	      Muscles data[] = new Muscles[]
	    		  {
	    		  new Muscles(R.drawable.hh, "French Press"),
	    		  new Muscles(R.drawable.jj, "Distensioni su Panca a presa stretta"),
	    		  new Muscles(R.drawable.ll, "French Press con manubrio"),
	    		  new Muscles(R.drawable.nn, " Kickback"),
	    		  new Muscles(R.drawable.oo, "Pushdown"),
		    		 
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

	    		        	    case 0:  Intent newActivity1 = new Intent(TricepsActivity.this, SubMenu1Activity.class);     
			                             startActivity(newActivity1);
			                             break;
	    					              
	    					    case 1:  Intent newActivity3 = new Intent(TricepsActivity.this, SubMenu3Activity.class);     
					              startActivity(newActivity3);
					              break;
					              
	    					    case 2:  Intent newActivity4 = new Intent(TricepsActivity.this, SubMenu4Activity.class);     
					              startActivity(newActivity4);
					              break;
					              
	    					    case 3:  Intent newActivity5 = new Intent(TricepsActivity.this, SubMenu5Activity.class);     
					              startActivity(newActivity5);
					              break;
					              
	    					    case 4:  Intent newActivity6 = new Intent(TricepsActivity.this, SubMenu6Activity.class);     
					              startActivity(newActivity6);
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



