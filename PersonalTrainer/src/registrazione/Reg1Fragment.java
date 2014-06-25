package registrazione;

import it.unisa.personalTrainer.R;
import it.unisa.personalTrainer.R.array;
import it.unisa.personalTrainer.R.id;
import it.unisa.personalTrainer.R.layout;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class Reg1Fragment extends Fragment {

	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_reg1,
				container, false);
	
		
		 Spinner s = (Spinner) v.findViewById(R.id.spinner1);
		    @SuppressWarnings("rawtypes")
			ArrayAdapter adapter = ArrayAdapter.createFromResource(
				  getActivity(), R.array.lingua,R.layout.simple_spinner_item2);
				  adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
				 
						s.setAdapter(adapter);	  
                        
						s.setOnItemSelectedListener(new OnItemSelectedListener() {
				
				public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
					
					/*String voceSelezionata = (String) s.getSelectedItem();*/
				
				}
				
				public void onNothingSelected(AdapterView<?> arg0) {
						
				}
				});
				
		return v;
	}

	
}
