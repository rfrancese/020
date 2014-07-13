package aduttori;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;



public class MyPagerAdapter1 extends FragmentPagerAdapter {

	public MyPagerAdapter1(FragmentManager fm) {
		super(fm);
	}

	public int getCount() {
		return 2;
	}

	public Fragment getItem(int position) {

		switch(position){
		case 0:// create the fragments
			Fragment Fragment1 = new Details1Fragment();
			return Fragment1 ;

		case 1:// create the fragments

			Fragment Fragment2 = new Video1Fragment();
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
