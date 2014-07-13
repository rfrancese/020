package it.unisa.personalTrainer;

import java.io.File;

import diario.DiaryFragment;
import dieta.DietaFragment;
import impostazioni.SettingsFragment;
import it.unisa.personalTrainer.R;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentPagerAdapter;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MenuActivity2 extends ActionBarActivity implements
		ActionBar.TabListener {

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a {@link FragmentPagerAdapter}
	 * derivative, which will keep every loaded fragment in memory. If this
	 * becomes too memory intensive, it may be best to switch to a
	 * {@link android.support.v4.app.FragmentStatePagerAdapter}.
	 */
	SectionsPagerAdapter mSectionsPagerAdapter;

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;
	Fragment Fragment4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		
		setContentView(R.layout.activity_main);
		
		
		// Set up the action bar.
		final ActionBar actionBar = getSupportActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		getSupportActionBar().setDisplayShowTitleEnabled(false);
		getSupportActionBar().setDisplayShowHomeEnabled(false);
		
		// Create the adapter that will return a fragment for each of the three
		// primary sections of the activity.
		mSectionsPagerAdapter = new SectionsPagerAdapter(
				getSupportFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);
          
		
		
		// When swiping between different sections, select the corresponding
		// tab. We can also use ActionBar.Tab#select() to do this if we have
		// a reference to the Tab.
		mViewPager
				.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
					@Override
					public void onPageSelected(int position) {
						actionBar.setSelectedNavigationItem(position);
					}
				});

		// For each of the sections in the app, add a tab to the action bar.
	/*	for (int i = 0; i < mSectionsPagerAdapter.getCount(); i++) {
			// Create a tab with text corresponding to the page title defined by
			// the adapter. Also specify this Activity object, which implements
			// the TabListener interface, as the callback (listener) for when
			// this tab is selected.*/
			 ActionBar.Tab m1Tab = actionBar.newTab().setText(
                     getString(R.string.title_section1));
             
			 ActionBar.Tab m2Tab = actionBar.newTab().setText(
                     getString(R.string.title_section2));
            
             ActionBar.Tab m3Tab = actionBar.newTab().setText(
                     getString(R.string.title_section3));
             
             ActionBar.Tab m4Tab = actionBar.newTab().setText(
                     getString(R.string.title_section4));
        	 
             ActionBar.Tab m5Tab = actionBar.newTab().setText(
                    getString(R.string.title_section5));
             
             ActionBar.Tab m6Tab = actionBar.newTab().setText(
                     getString(R.string.title_section6));

            


             // bind the fragments to the tabs - set up tabListeners for each tab
             m1Tab.setTabListener(this);
             m2Tab.setTabListener(this);
             m3Tab.setTabListener(this);
             m4Tab.setTabListener(this);
             m5Tab.setTabListener(this);
             m6Tab.setTabListener(this);
             // add the tabs to the action bar
             actionBar.addTab(m1Tab);
             actionBar.addTab(m2Tab);
             actionBar.addTab(m3Tab);
             actionBar.addTab(m4Tab);
             actionBar.addTab(m5Tab);
             actionBar.addTab(m6Tab);
             actionBar.selectTab(m2Tab);
             		}
	

	

	

	@Override
	public void onTabSelected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
		// When the given tab is selected, switch to the corresponding page in
		// the ViewPager.
		mViewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	@Override
	public void onTabReselected(ActionBar.Tab tab,
			FragmentTransaction fragmentTransaction) {
	}

	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	public class SectionsPagerAdapter extends FragmentPagerAdapter {

		public SectionsPagerAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			// getItem is called to instantiate the fragment for the given page.
			// Return a PlaceholderFragment (defined as a static inner class
			// below).
			switch(position){
			case 0:// create the fragments
	             Fragment Fragment1 = new ExcercisesFragment();
	            return Fragment1 ;
			
			case 1:// create the fragments
				
				 File dbtest =new File("/data/data/it.unisa.personalTrainer/databases/my.db");
				 File directory1=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
				   File f1= new File(directory1,"Scelta");
				 
				if(!f1.exists())
					 Fragment4 = new AllenamentoFragment();
				
				else{
					if(dbtest.exists())
					Fragment4 = new AllenamentoFragment2();
					else
						Fragment4 = new AllenamentoFragment3();
				}
				
	            
	             return Fragment4;
	             
			 case 2:// create the fragments
		           
				 Fragment Fragment5 = new SchedaFragment();
		            
	             return Fragment5;
		
			 case 3:// create the fragments
				 Fragment Fragment3 = new DietaFragment();
	             return Fragment3;
				
			case 4:// create the fragments
				
				 Fragment Fragment2 = new DiaryFragment();
	             return Fragment2;
	         
			case 5:// create the fragments
		           
	            Fragment Fragment6 = new SettingsFragment();
	             return Fragment6;
			}
			return null;
		}

		@Override
		public int getCount() {
			// Show 3 total pages.
			return 6;
		}
		
	}
	
	

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		private static final String ARG_SECTION_NUMBER = "section_number";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */
		public static PlaceholderFragment newInstance(int sectionNumber) {
			PlaceholderFragment fragment = new PlaceholderFragment();
			Bundle args = new Bundle();
			args.putInt(ARG_SECTION_NUMBER, sectionNumber);
			fragment.setArguments(args);
			return fragment;
		}

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			TextView textView = (TextView) rootView
					.findViewById(R.id.section_label);
			textView.setText(Integer.toString(getArguments().getInt(
					ARG_SECTION_NUMBER)));
			return rootView;
		}
	}

	@Override
	public void onBackPressed() {
	    visualizza();
	}
	
	public void visualizza() {
		String condizioni="Sei sicuro di voler uscire?";

		AlertDialog.Builder builder = new AlertDialog.Builder(MenuActivity2.this);
		builder.setTitle("Uscita")
		.setIcon( R.drawable.ic_launcher )
		.setMessage(condizioni)
		
		.setCancelable(false)
		.setNegativeButton("No", new DialogInterface.OnClickListener() {
		@Override
		public void onClick(DialogInterface dialog, int which) {
		
		}
		})
		.setPositiveButton("Si", new DialogInterface.OnClickListener() {
		@Override
		public void onClick(DialogInterface dialog, int which) {
			
			finish();
		}
		});
		
		AlertDialog alert = builder.create();
		alert.show();
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