package it.unisa.personaltrainer;

import accessori.Muscles;
import accessori.MusclesAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;


public class ExcercisesActivity extends Activity {
	private ListView listView1;
	  protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);

	      setContentView(R.layout.activity_excercises);
	      
	      Muscles data[] = new Muscles[]
	    		  {
	    		  new Muscles(R.drawable.image1, "Pettorali"),
	    		  /*new Muscles(R.drawable.weather_showers, "Showers"),
	    		  new Weather(R.drawable.weather_snow, "Snow"),
	    		  new Weather(R.drawable.weather_storm, "Storm"),
	    		  new Weather(R.drawable.weather_sunny, "Sunny")*/
	    		  };
	    		   
	    		  MusclesAdapter adapter = new MusclesAdapter(this,
	    		  R.layout.list_item, data);
	    		   
	    		   
	    		  listView1 = (ListView)findViewById(R.id.listView1);
	    		   
	    		  View header = (View)getLayoutInflater().inflate(R.drawable.list_muscles, null);
	    		  listView1.addHeaderView(header);
	    		   
	    		  listView1.setAdapter(adapter);
	    		  }
	  }


