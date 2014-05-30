package it.unisa.personaltrainer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;




import accessori.Muscles;
import accessori.MusclesAdapter;
import accessori.Utente;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;




public class RegistrationActivity extends Activity {
	/** Called when the activity is first created. */
	final String FILENAME = "LogInPT";
	
	private EditText  età, peso,altezza,polso;
	private RadioButton radio1;
	private String sesso="";
	private Spinner preparazione;
	private Utente user;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_registration);
		
		visualizza();
		
		
		//gestione del button avanti
		Button btn1 = (Button) findViewById(R.id.button1);	
		btn1.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			
			età= (EditText) findViewById(R.id.editText2);
		    peso= (EditText) findViewById(R.id.editText3);
			altezza= (EditText) findViewById(R.id.editText4);
			polso= (EditText) findViewById(R.id.editText5);
			radio1=(RadioButton) findViewById(R.id.radio0);
			
			if(radio1.isSelected())
				sesso="Maschio";
			else 
                 sesso="Femmina";
			
			preparazione=(Spinner) findViewById(R.id.spinner1);
			
			
			// controllo che tutti i campi sono stati compilati
			if(!(età.getText().toString().equals("")) && !(peso.getText().toString().equals("")) && 
					!(altezza.getText().toString().equals("")) && !(polso.getText().toString().equals(""))){
				//Inserisco i dati ricavati nella classe Utente
				user= new Utente(età.getText().toString(),sesso,peso.getText().toString(),altezza.getText().toString(),
						polso.getText().toString(),preparazione.getSelectedItem().toString());
				
				if(Integer.parseInt(età.getText().toString())<14 || Integer.parseInt(età.getText().toString())>90)
					Toast.makeText(getApplicationContext(), "Età consentita da 14 a 90", Toast.LENGTH_SHORT).show();
				else if(Integer.parseInt(peso.getText().toString())<40 || Integer.parseInt(peso.getText().toString())>150)
					Toast.makeText(getApplicationContext(), "Peso consentito da 40 Kg a 150 Kg", Toast.LENGTH_SHORT).show();
				else if(Integer.parseInt(altezza.getText().toString())<100 || Integer.parseInt(altezza.getText().toString())>250)
					Toast.makeText(getApplicationContext(), "Altezza consentita da 100 cm a 250 cm", Toast.LENGTH_SHORT).show();
				else if(Integer.parseInt(polso.getText().toString())<10 || Integer.parseInt(polso.getText().toString())>25)
					Toast.makeText(getApplicationContext(), "Circonferenza polso consentita da 10 cm a 25 cm", Toast.LENGTH_SHORT).show();
				else
				visualizza2();
			
			}
			else{
				Toast.makeText(getApplicationContext(), "Devi compilare tutti i campi", Toast.LENGTH_SHORT).show();
			}
		}
		});
		
		// gestione dello spinner
		final Spinner s = (Spinner) findViewById(R.id.spinner1);
		//inserimento array di stringhe nello spinner
		  ArrayAdapter adapter = ArrayAdapter.createFromResource(
		  this, R.array.seleziona, android.R.layout.simple_spinner_item);
		  adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				s.setAdapter(adapter);
				s.setPrompt("Seleziona");
				s.setOnItemSelectedListener(new OnItemSelectedListener() {
		
		public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
	
		
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
		
		});
				
				 Muscles data[] = new Muscles[]
			    		  {
				    		 
			    		  };
			    		   
			    		  MusclesAdapter data1 = new MusclesAdapter(this,
			    		  R.layout.list_item, data);
			    		  
			    		   
			    		  ListView listView1 = (ListView)findViewById(R.id.listView1);


			    		  View header = (View)getLayoutInflater().inflate(R.drawable.list_registration,null);
			    		  listView1.addHeaderView(header);
			    		  listView1.setAdapter(data1);
	
	}
	
	public void visualizza() {
		String condizioni="Non tutti gli esercizi possono essere eseguiti, tutto dipende dalla tua attuale condizione fisica,"
				+ " per questo motivo ti consigliamo prima di consultare un medico specialista. Guarda i video che abbiamo "
				+"accuratamente preparato prima di eseguire gli esercizi e non esagerare con i pesi. Aumenta gradualmente i pesi di un paio di chili a settimana."
				+ " Non siamo responsabili di eventuali incidenti o infortuni dovuti al tuo allenamento. ";

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Condizioni di utilizzo")
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
	public void visualizza2() {
		String condizioni="Sei sicuro di aver inserito tutti i dati in modo veritiero?";

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
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
			Toast.makeText(getApplicationContext(), "Benvenuto! Sono il tuo nuovo Personal trainer", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(RegistrationActivity.this,MenuActivity.class);
       startActivity(intent);
       finish();
			}
			// se non riesco a salvare su sd  allora salvo sulla memoria del telefono
			else{
				if(salvaFileMem()){
					Toast.makeText(getApplicationContext(), "Benvenuto! Sono il tuo nuovo Personal trainer", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(RegistrationActivity.this,MenuActivity.class);
			       startActivity(intent);
			       finish();
				}
				else
					Toast.makeText(getApplicationContext(), "Non riesco ad accedere alla tua memoria interna", Toast.LENGTH_SHORT).show();
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
		Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
		return false;
		}
		return true;
		}
	
	public boolean salvaFileMem() {
		try {
		FileOutputStream fos = openFileOutput(getFilesDir()+File.separator+FILENAME, MODE_PRIVATE);
		ObjectOutputStream osw = new ObjectOutputStream(fos);
		osw.writeObject(user);
		osw.close();
		
		} catch (Exception e) {
		Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
		return false;
		}
		return true;
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
