package registrazione;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;
import android.view.View;


public class MyPagerAdapter2 extends FragmentPagerAdapter {

	public MyPagerAdapter2(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	View view;
    public int getCount() {
        return 3;
    }

    public Fragment getItem(int position) {
    	
    switch(position){
    case 0:// create the fragments
    	 Fragment Fragment1 = new Reg1Fragment();
       return Fragment1 ;
	
	case 1:// create the fragments
      
		 Fragment Fragment2 = new Reg2Fragment();
        return Fragment2;
        
	case 2:// create the fragments
	      
		 Fragment Fragment3 = new Reg3Fragment();
        return Fragment3;
	}
	return null;
    }
    
    
  
}
