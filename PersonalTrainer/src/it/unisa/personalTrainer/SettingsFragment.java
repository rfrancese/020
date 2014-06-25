package it.unisa.personalTrainer;


import it.unisa.personalTrainer.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.os.Bundle;

public class SettingsFragment extends Fragment{


		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {

			View v= inflater.inflate(R.layout.fragment_settings,
					container, false);

			final Spinner s = (Spinner) v.findViewById(R.id.spinner1);
			  @SuppressWarnings("rawtypes")
			ArrayAdapter adapter = ArrayAdapter.createFromResource(
			  getActivity(), R.array.lingua, android.R.layout.simple_spinner_item);
			  adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
					s.setAdapter(adapter);	  
					s.setPrompt("Seleziona");




			s.setOnItemSelectedListener(new OnItemSelectedListener() {

			public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

				/*String voceSelezionata = (String) s.getSelectedItem();*/

			}

			public void onNothingSelected(AdapterView<?> arg0) {

			}
			});

			final TextView view = (TextView) v.findViewById(R.id.textView4);
			view.setOnClickListener(new View.OnClickListener() {

			  @Override
			  public void onClick(View v) {
				  Toast.makeText(getActivity().getApplicationContext(), "Versione Corrente: 1.3", Toast.LENGTH_SHORT).show();
			  }

			});

			final TextView view2 = (TextView) v.findViewById(R.id.textView7);
			view2.setOnClickListener(new View.OnClickListener() {


			@Override
			  public void onClick(View v) {
				/*Intent intent = new Intent(SettingsFragment.class,ProblemActivity.class);
				startActivity(intent);*/
			 }

			});

			final TextView view3 = (TextView) v.findViewById(R.id.textView5);
			view3.setOnClickListener(new View.OnClickListener() {

			  @Override
			  public void onClick(View v) {

			  }

			});



			return v;
		}
	}
