package pettorali;

import android.app.Fragment;
import android.app.FragmentManager;

import android.support.v13.app.FragmentPagerAdapter;

import android.view.View;


public class MyPagerAdapter7 extends FragmentPagerAdapter {
   
	public MyPagerAdapter7(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	View view;
    public int getCount() {
        return 2;
    }

    public Fragment getItem(int position) {
    	
    switch(position){
    case 0:// create the fragments
        Fragment Fragment1 = new Details7Fragment();
       return Fragment1 ;
	
	case 1:// create the fragments
      
        Fragment Fragment2 = new Video7Fragment();
        return Fragment2;
	}
	return null;
    }

    public CharSequence getPageTitle(int position) {
    	 switch(position){
    	    case 0:// create the fragments
    	       return "Descrizione" ;
    		
    		case 1:// create the fragments
    	      
    	        return "Esecuzione";
    		}
    		return null;
    }
   
}
