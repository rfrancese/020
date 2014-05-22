package it.unisa.personaltrainer;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;


public class DietaRActivity extends Activity{
	private float x1,x2;
	private int i;
	private ArrayList<Integer> layout= new ArrayList<>();
	      
	static final int MIN_DISTANCE = 150;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dieta_a);
		
		layout.add (R.layout.activity_dieta_a);
		layout.add (R.layout.activity_dieta_d);
	    layout.add(R.layout.activity_dieta_r);
	    i=0;
	}
	
	 public boolean onTouchEvent(MotionEvent event){
	 switch(event.getAction())
	    {
	      case MotionEvent.ACTION_DOWN:
	          x1 = event.getX();                         
	      break;         
	      case MotionEvent.ACTION_UP:
	          x2 = event.getX();
	          float deltaX = x2 - x1;

	          if (Math.abs(deltaX) > MIN_DISTANCE)
	          {
	              // Left to Right swipe action
	              if (x2 > x1)
	              {
	            	 
	            	  if(i<=0) 
	            		 ;
	                   else
	                	   setContentView(layout.get(--i));                          
	              }

	              // Right to left swipe action               
	              else 
	              {
	            	  if(i>=2)
	            		  ;
	            	  else
	            	  setContentView(layout.get(++i));
	            	  
	            	                
	              }

	          }
	          else
	          {
	              // consider as something else - a screen tap for example
	          }                          
	      break;   
	    }           
	    return super.onTouchEvent(event);       
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