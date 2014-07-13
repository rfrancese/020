package addominali;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentPagerAdapter;



public class MyPagerAdapter2 extends FragmentPagerAdapter {

	public MyPagerAdapter2(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	public int getCount() {
		return 2;
	}

	public Fragment getItem(int position) {

		switch(position){
		case 0:// create the fragments
			Fragment Fragment1 = new Details2Fragment();
			return Fragment1 ;

		case 1:// create the fragments

			Fragment Fragment2 = new Video2Fragment();
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
