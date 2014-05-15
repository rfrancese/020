package it.unisa.personaltrainer;

import java.lang.reflect.Field;

import accessori.Muscles;
import accessori.MusclesAdapter;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.TextView;




public class DiaryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diary);
		
		final CalendarView view = (CalendarView) findViewById(R.id.calendarView1);
		
		view.setWeekSeparatorLineColor(Color.rgb(0,150,204));
		view.setShowWeekNumber(false);
		view.setBackgroundColor(Color.rgb(224,255,255));
		view.setSelectedDateVerticalBar(R.color.blue);
		view.setUnfocusedMonthDateColor(Color.rgb(192,192,192));
		view.setFocusedMonthDateColor(Color.rgb(00,00,00));
		
		// cambio il colore del mese e dell'anno del calendario
		Class<?> cvClass = view.getClass();
        Field field=null;
		try {
			field = cvClass.getDeclaredField("mMonthName");
		} catch (NoSuchFieldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        field.setAccessible(true);

        try
        {
            TextView tv = (TextView) field.get(view);
            tv.setTextColor(Color.BLACK);
        } 
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
	      
	      Muscles data[] = new Muscles[]
	    		  {
		    		 
	    		  };
	    		   
	    		  MusclesAdapter adapter = new MusclesAdapter(this,
	    		  R.layout.list_item, data);
	    		  
	    		   
	    		  ListView listView1 = (ListView)findViewById(R.id.listView1);


	    		  View header = (View)getLayoutInflater().inflate(R.drawable.list_diary,null);
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
