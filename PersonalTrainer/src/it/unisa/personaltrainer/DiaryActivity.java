package it.unisa.personaltrainer;


import java.lang.reflect.Field;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;




public class DiaryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_diary);
		
		final CalendarView view = (CalendarView) findViewById(R.id.calendarView1);
		view.setWeekSeparatorLineColor(Color.rgb(204,0,0));
		view.setShowWeekNumber(false);
		
		view.setSelectedWeekBackgroundColor(Color.rgb(255,61,61));
		view.setSelectedDateVerticalBar(R.color.darkRed);
		view.setUnfocusedMonthDateColor(R.color.silver);
		view.setFocusedMonthDateColor(Color.rgb(00,00,00));
		
		
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
            tv.setTextColor(Color.rgb(204,0,0));
        } 
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
 
	
		
	}

}
