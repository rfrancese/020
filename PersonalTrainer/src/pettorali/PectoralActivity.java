package pettorali;

import it.unisa.personalTrainer.Muscles;
import it.unisa.personalTrainer.MusclesAdapter;
import it.unisa.personalTrainer.R;
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

public class PectoralActivity extends Activity {

	private ListView listView1;
	
	  protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);

	      setContentView(R.layout.activity_exc);
	      
	      Muscles data[] = new Muscles[]
	    		  {
	    		  new Muscles(R.drawable.i, "Croci ai cavi"),
	    		  new Muscles(R.drawable.j, "Croci con manubri su panca inclinata"),
	    		  new Muscles(R.drawable.k, "Croci alla macchina "),
	    		  new Muscles(R.drawable.l, "Croci con manubri su panca piana"),
	    		  new Muscles(R.drawable.m, "Panca al Multipower"),
	    		  new Muscles(R.drawable.n, "Panca declinata"),
	    		  new Muscles(R.drawable.o, "Panca inclinata con manubri"),
	    		  new Muscles(R.drawable.p, "Panca inclinata"),
	    		  new Muscles(R.drawable.q, "Panca piana con manubri"),	
	    		  new Muscles(R.drawable.r, "Panca piana"),
	    		  new Muscles(R.drawable.s, "Pullover con manubrio"),
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

	    		        	    case 0:  Intent newActivity1 = new Intent(PectoralActivity.this, SubMenu1Activity.class);     
			                             startActivity(newActivity1);
			                             break;
	    					    case 1:  Intent newActivity2 = new Intent(PectoralActivity.this, SubMenu2Activity.class);     
	    					              startActivity(newActivity2);
	    					              break;
	    					    case 2:  Intent newActivity3 = new Intent(PectoralActivity.this, SubMenu3Activity.class);     
					              startActivity(newActivity3);
					              break;
					              
	    					    case 3:  Intent newActivity4 = new Intent(PectoralActivity.this, SubMenu4Activity.class);     
					              startActivity(newActivity4);
					              break;
	    					   
	    					    case 4:  Intent newActivity5 = new Intent(PectoralActivity.this, SubMenu5Activity.class);     
					              startActivity(newActivity5);
					              break;
					              
	    					    case 5:  Intent newActivity6 = new Intent(PectoralActivity.this, SubMenu6Activity.class);     
					              startActivity(newActivity6);
					              break;
					              
	    					    case 6:  Intent newActivity7 = new Intent(PectoralActivity.this, SubMenu7Activity.class);     
					              startActivity(newActivity7);
					              break;
					              
	    					    case 7:  Intent newActivity8 = new Intent(PectoralActivity.this, SubMenu8Activity.class);     
					              startActivity(newActivity8);
					              break;
					              
	    					    case 8:  Intent newActivity9 = new Intent(PectoralActivity.this, SubMenu9Activity.class);     
					              startActivity(newActivity9);
					              break;
					              
	    					    case 9:  Intent newActivity10 = new Intent(PectoralActivity.this, SubMenu10Activity.class);     
					              startActivity(newActivity10);
					              break;
					              
	    					    case 10:  Intent newActivity11 = new Intent(PectoralActivity.this, SubMenu11Activity.class);     
					              startActivity(newActivity11);
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





