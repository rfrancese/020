package addominali;


import it.unisa.personalTrainer.R;
import it.unisa.personalTrainer.TitlePageIndicator;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;



public class SubMenu4Activity extends Activity {

	MyPagerAdapter4 mSectionsPagerAdapter;


	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;
	protected ImageButton icon;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_sun_menu3);


		// Create the adapter that will return a fragment for each of the three
		// primary sections of the activity.
		mSectionsPagerAdapter = new MyPagerAdapter4(getFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager);
		mViewPager.setAdapter(mSectionsPagerAdapter);

		TitlePageIndicator indicator = (TitlePageIndicator)findViewById(R.id.indicator1);
		indicator.setViewPager(mViewPager);



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
			View rootView = inflater.inflate(R.layout.fragment_sun_menu3,
					container, false);
			TextView textView = (TextView) rootView
					.findViewById(R.id.section_label);
			textView.setText(Integer.toString(getArguments().getInt(
					ARG_SECTION_NUMBER)));
			return rootView;
		}
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
