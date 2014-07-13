package registrazione;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import it.unisa.personalTrainer.R;
import it.unisa.personalTrainer.R.array;
import it.unisa.personalTrainer.R.id;
import it.unisa.personalTrainer.R.layout;
import android.app.Fragment;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;


public class Reg2Fragment extends Fragment {
	Spinner s;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_reg2,
				container, false);
		
		 s = (Spinner) v.findViewById(R.id.spinner1);
		    @SuppressWarnings("rawtypes")
			ArrayAdapter adapter = ArrayAdapter.createFromResource(
				  getActivity(), R.array.seleziona,R.layout.simple_spinner_item2);
				  adapter.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
				 
						s.setAdapter(adapter);	  
                     
						s.setOnItemSelectedListener(new OnItemSelectedListener() {
				
				public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
					
					if(salvaFileSD())
						;
					else
						salvaFileMem();
					
				salvaGiorno();
				}
				
				public void onNothingSelected(AdapterView<?> arg0) {
						
				}
				});
						
		return v;
	}
	public boolean salvaFileSD() {
		try {
	    //crea path di salvataggio
		File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
		    directory.mkdirs();
		
		File f = new File(directory,"Levels");
		// controlla esistenza directory

		FileOutputStream output = new FileOutputStream(f);

		//scrittura oggetto su file
		PrintWriter fos = new PrintWriter(output);
		fos.write(s.getSelectedItem().toString());
		fos.close();
	    output.close();
		} catch (Exception e) {
		Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
		return false;
		}
		return true;
		}

	public boolean salvaGiorno() {
		try {
	    //crea path di salvataggio
		File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
		File f = new File(directory,"Giorno");
		// controlla esistenza directory

		FileOutputStream output = new FileOutputStream(f);

		//scrittura oggetto su file
		PrintWriter fos = new PrintWriter(output);
		fos.write("1");
		fos.close();
	    output.close();
		} catch (Exception e) {
		Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
		return false;
		}
		return true;
		}

	
	public boolean salvaFileMem() {
		try {
		@SuppressWarnings("static-access")
		File directory=new File(getActivity().getFilesDir()+"/PersonalTrainer/");
	    directory.mkdirs();
		FileOutputStream output = getActivity().openFileOutput(directory +"Levels", getActivity().MODE_PRIVATE);
		PrintWriter fos2 = new PrintWriter(output);
		fos2.write(s.getSelectedItem().toString());
		output.close();
		
		} catch (Exception e) {
		Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
		return false;
		}
		return true;
		}
 
}
