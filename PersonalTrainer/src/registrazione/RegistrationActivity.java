package registrazione;

import it.unisa.personalTrainer.R;
import it.unisa.personalTrainer.R.drawable;
import it.unisa.personalTrainer.R.id;
import it.unisa.personalTrainer.R.layout;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v7.app.ActionBarActivity;


public class RegistrationActivity  extends ActionBarActivity{

	/**
	 * The {@link android.support.v4.view.PagerAdapter} that will provide
	 * fragments for each of the sections. We use a {@link FragmentPagerAdapter}
	 * derivative, which will keep every loaded fragment in memory. If this
	 * becomes too memory intensive, it may be best to switch to a
	 * {@link android.support.v13.app.FragmentStatePagerAdapter}.
	 */
	MyPagerAdapter2 mSectionsPagerAdapter;
  

	/**
	 * The {@link ViewPager} that will host the section contents.
	 */
	ViewPager mViewPager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_registration);
		getActionBar().hide();
		
		// Create the adapter that will return a fragment for each of the three
		// primary sections of the activity.
		mSectionsPagerAdapter = new MyPagerAdapter2(getFragmentManager());

		// Set up the ViewPager with the sections adapter.
		mViewPager = (ViewPager) findViewById(R.id.pager1);
		mViewPager.setAdapter(mSectionsPagerAdapter);

		CirclePageIndicator indicator = (CirclePageIndicator)findViewById(R.id.indicator2);
		indicator.setViewPager(mViewPager);
		visualizza();
	}


	/**
	 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
	 * one of the sections/tabs/pages.
	 */
	

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
	public void visualizza() {
		String condizioni="Non tutti gli esercizi possono essere eseguiti, tutto dipende dalla tua attuale condizione fisica,"
				+ " per questo motivo ti consigliamo prima la consultazione di un medico specialista. Guarda i video che abbiamo "
				+"accuratamente preparato prima di eseguire gli esercizi, focalizzando la tua attenzione sull'esecuzione del movimento."
				+ " Non siamo responsabili di eventuali incidenti o infortuni dovuti al tuo allenamento. ";
		
		
		
		AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_HOLO_LIGHT);
		builder.setTitle("Condizioni di utilizzo")
		.setIcon( R.drawable.ic_launcher )
		.setMessage(condizioni)
		
		.setCancelable(false)
		
		.setPositiveButton("Accetta", new DialogInterface.OnClickListener() {
		@Override
		public void onClick(DialogInterface dialog, int which) {
		visualizza2();
		}
		})
		
		.setNegativeButton("Rifiuta", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
			finish();
			}
			});
		AlertDialog alert = builder.create();
		alert.show();
		}
	
	public void visualizza2() {
	
		String condizioni="Inserisci i dati richiesti durante la fase di registrazione in maniera piu' accurata possibile poichè "
				+"tutti i nostri consigli dipenderanno da questi. I tuoi dati personali fornitici saranno utilizzati da parte di personal "
				+ "trainer nel pieno rispetto dei principi fondamentali: dalla LGS. 196/2003 e dalla LGS. 675/1996 sulla normativa della "
				+ "privacy. ";
		
		AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_HOLO_LIGHT);
		builder.setTitle("Attenzione!")
		.setIcon( R.drawable.ic_launcher )
		.setMessage(condizioni)
		.setCancelable(false)
		
		.setPositiveButton("Accetta", new DialogInterface.OnClickListener() {
		@Override
		public void onClick(DialogInterface dialog, int which) {
		
		}
		})
		
		.setNegativeButton("Rifiuta", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
			finish();
			}
			});
		AlertDialog alert = builder.create();
		alert.show();
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
	

