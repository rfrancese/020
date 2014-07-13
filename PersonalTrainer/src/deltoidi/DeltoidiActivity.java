package deltoidi;


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
	    		  
	    		  listView1.setOnItemClickListener(new OnItemClickListener() {
	    		        public void onItemClick(AdapterView<?> parent, View view,
	    		            int position, long id) {
	    		        	
	    		        	  switch( position ) {

	    		        	    case 0:  Intent newActivity1 = new Intent(DeltoidiActivity.this, SubMenu1Activity.class);     
			                             startActivity(newActivity1);
			                             break;
	    					    case 1:  Intent newActivity2 = new Intent(DeltoidiActivity.this, SubMenu2Activity.class);     
	    					              startActivity(newActivity2);
	    					              break;
	    					    case 2:  Intent newActivity3 = new Intent(DeltoidiActivity.this, SubMenu3Activity.class);     
					              startActivity(newActivity3);
					              break;
					              
	    					    case 3:  Intent newActivity4 = new Intent(DeltoidiActivity.this, SubMenu4Activity.class);     
					              startActivity(newActivity4);
					              break;
	    					   
	    					    case 4:  Intent newActivity5 = new Intent(DeltoidiActivity.this, SubMenu5Activity.class);     
					              startActivity(newActivity5);
					              break;
					              
	    					    case 5:  Intent newActivity6 = new Intent(DeltoidiActivity.this, SubMenu6Activity.class);     
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
