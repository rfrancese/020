package registrazione;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import it.unisa.personalTrainer.MenuActivity;
import it.unisa.personalTrainer.R;
import it.unisa.personalTrainer.Utente;
import it.unisa.personalTrainer.R.drawable;
import it.unisa.personalTrainer.R.id;
import it.unisa.personalTrainer.R.layout;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Reg3Fragment  extends Fragment {
final String FILENAME = "LogInPT";
	
	private EditText  età, peso,altezza,polso;
	private RadioButton radio1;
	private String sesso="";

	private Utente user;
	private Button btn1;
	View v;


	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		 
		 v = inflater.inflate(R.layout.fragment_reg3,
				container, false);
		//gestione del button avanti
			    btn1 = (Button) v.findViewById(R.id.button1);
			    età= (EditText) v.findViewById(R.id.editText1);
			    peso= (EditText) v.findViewById(R.id.editText2);
				altezza= (EditText) v.findViewById(R.id.editText3);
				polso= (EditText) v.findViewById(R.id.editText4);
				radio1=(RadioButton) v.findViewById(R.id.radio0);
				
				btn1.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					
					
					
					if(radio1.isSelected())
						sesso="Maschio";
					else 
		                 sesso="Femmina";
					
					
			
					// controllo che tutti i campi sono stati compilati
					if(!(età.getText().toString().equals("")) && !(peso.getText().toString().equals("")) && 
							!(altezza.getText().toString().equals("")) && !(polso.getText().toString().equals(""))){
						//Inserisco i dati ricavati nella classe Utente
						user= new Utente(età.getText().toString(),sesso,peso.getText().toString(),altezza.getText().toString(),
								polso.getText().toString());
						
						
						
						if(Integer.parseInt(età.getText().toString())<14 || Integer.parseInt(età.getText().toString())>90)
							Toast.makeText(getActivity().getApplicationContext(), "Età consentita da 14 a 90", Toast.LENGTH_SHORT).show();
						else if(Integer.parseInt(peso.getText().toString())<40 || Integer.parseInt(peso.getText().toString())>150)
							Toast.makeText(getActivity().getApplicationContext(), "Peso consentito da 40 Kg a 150 Kg", Toast.LENGTH_SHORT).show();
						else if(Integer.parseInt(altezza.getText().toString())<100 || Integer.parseInt(altezza.getText().toString())>250)
							Toast.makeText(getActivity().getApplicationContext(), "Altezza consentita da 100 cm a 250 cm", Toast.LENGTH_SHORT).show();
						else if(Integer.parseInt(polso.getText().toString())<10 || Integer.parseInt(polso.getText().toString())>25)
							Toast.makeText(getActivity().getApplicationContext(), "Circonferenza polso consentita da 10 cm a 25 cm", Toast.LENGTH_SHORT).show();
						else
						visualizza2();
					
					}
					else{
						Toast.makeText(getActivity().getApplicationContext(), "Devi compilare tutti i campi", Toast.LENGTH_SHORT).show();
					}
				}
				});
				
				
		return v;
	}


	    
	   
public void visualizza2() {
	String condizioni="Sei sicuro di aver inserito tutti i dati in modo veritiero?";

	AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
	builder.setTitle("Conferma i dati inseriti")
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
		//Se ho inserito tutti i dati di registrazione scrivo su file nella scheda sd e lancio la prossima activity
		if(salvaFileSD()){
		Toast.makeText(getActivity().getApplicationContext(), "Benvenuto! Sono il tuo nuovo Personal trainer", Toast.LENGTH_SHORT).show();
	     Intent intent = new Intent(getActivity(),MenuActivity.class);
         startActivity(intent);
         getActivity().finish();
		}
		// se non riesco a salvare su sd  allora salvo sulla memoria del telefono
		else{
			if(salvaFileMem()){
				Toast.makeText(getActivity().getApplicationContext(), "Benvenuto! Sono il tuo nuovo Personal trainer", Toast.LENGTH_SHORT).show();
				Intent intent = new Intent(getActivity(),MenuActivity.class);
		       startActivity(intent);
		     getActivity().finish();
			}
			else
				Toast.makeText(getActivity().getApplicationContext(), "Non riesco ad accedere alla tua memoria interna", Toast.LENGTH_SHORT).show();
		}
	}
	});
	
	AlertDialog alert = builder.create();
	alert.show();
	}
public boolean salvaFileSD() {
	try {
    //crea path di salvataggio
	File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
	    directory.mkdirs();
	
	File f = new File(directory,FILENAME);
	// controlla esistenza directory

	FileOutputStream output = new FileOutputStream(f);

	//scrittura oggetto su file
	ObjectOutputStream fos = new ObjectOutputStream(output);
	fos.writeObject(user);
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
	FileOutputStream fos = getActivity().openFileOutput(getActivity().getFilesDir()+File.separator+FILENAME, getActivity().MODE_PRIVATE);
	ObjectOutputStream osw = new ObjectOutputStream(fos);
	osw.writeObject(user);
	osw.close();
	
	} catch (Exception e) {
	Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
	return false;
	}
	return true;
	}

}
