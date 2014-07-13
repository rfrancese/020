package impostazioni;

import it.unisa.personalTrainer.R;
import it.unisa.personalTrainer.Utente;
import it.unisa.personalTrainer.R.id;
import it.unisa.personalTrainer.R.layout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import android.os.Build;

public class ModificaActivity extends Activity {

		final String FILENAME = "LogInPT";
	private EditText  età, peso,altezza;
	private RadioButton radio1,radio2;
	private String sesso="";

	private Utente user;
	private Button btn1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_modifica);

		  btn1 = (Button) findViewById(R.id.button1);
		    età= (EditText) findViewById(R.id.editText1);
		    peso= (EditText) findViewById(R.id.editText2);
			altezza= (EditText) findViewById(R.id.editText3);
			radio1=(RadioButton) findViewById(R.id.radio0);
			radio2=(RadioButton) findViewById(R.id.radio1);
			
			Utente u=getUtente();
			
			età.setText(u.getEtà());
			peso.setText(u.getPeso());
			altezza.setText(u.getAltezza());
			
			String sex=u.getSesso();
			
			if(sex.equals("Maschio")){
				radio1.setChecked(true);
			    radio2.setChecked(false);
			}
			else{
				radio1.setChecked(false);
		        radio2.setChecked(true);
			}
			
	
			
			btn1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				
				
				
				if(radio1.isChecked())
					sesso="Maschio";
				else 
	                 sesso="Femmina";
				
				
		
				// controllo che tutti i campi sono stati compilati
				if(!(età.getText().toString().equals("")) && !(peso.getText().toString().equals("")) && 
						!(altezza.getText().toString().equals(""))){
					//Inserisco i dati ricavati nella classe Utente
					user= new Utente(età.getText().toString(),sesso,peso.getText().toString(),altezza.getText().toString());
					
					
					
					if(Integer.parseInt(età.getText().toString())<14 || Integer.parseInt(età.getText().toString())>90)
						Toast.makeText(getApplicationContext(), "Età consentita da 14 a 90", Toast.LENGTH_SHORT).show();
					else if(Integer.parseInt(peso.getText().toString())<40 || Integer.parseInt(peso.getText().toString())>150)
						Toast.makeText(getApplicationContext(), "Peso consentito da 40 Kg a 150 Kg", Toast.LENGTH_SHORT).show();
					else if(Integer.parseInt(altezza.getText().toString())<100 || Integer.parseInt(altezza.getText().toString())>250)
						Toast.makeText(getApplicationContext(), "Altezza consentita da 100 cm a 250 cm", Toast.LENGTH_SHORT).show();

				}
				else
					Toast.makeText(getApplicationContext(), "Devi compilare tutti i campi", Toast.LENGTH_SHORT).show();
				
				
				if(salvaFileSD())
			         finish();
					
					// se non riesco a salvare su sd  allora salvo sulla memoria del telefono
					else{
						if(salvaFileMem())
					     finish();
						
						else
							Toast.makeText(getApplicationContext(), "Non riesco ad accedere alla tua memoria interna", Toast.LENGTH_SHORT).show();
			
					  }
				}
			});
			
			
			
	}

	 public Utente getUtente(){
   	  
	      	File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
	        Utente u=null;
	  		File f = new File(directory,"LogInPT");

	  		File fmem=new File(getFilesDir()+File.separator+"LogInPT");
	  		
	  		if(f.exists()){
	  			ObjectInputStream in=null;
	  			try {
	  				in = new ObjectInputStream(new FileInputStream(f));
	  				 u = (Utente) in.readObject();
	  				 in.close();
	  				 return u;
	  			} catch (StreamCorruptedException e1) {
	  				// TODO Auto-generated catch block
	  				e1.printStackTrace();
	  			} catch (FileNotFoundException e1) {
	  				// TODO Auto-generated catch block
	  				e1.printStackTrace();
	  			} catch (IOException e1) {
	  				// TODO Auto-generated catch block
	  				e1.printStackTrace();
	  			}
	  			 catch (ClassNotFoundException e) {
	  						// TODO Auto-generated catch block
	  						e.printStackTrace();
	  					}
	  					
	  			}
	  			else{
	  				ObjectInputStream in=null;
	  				try {
	  					in = new ObjectInputStream(new FileInputStream(fmem));
	  					 u = (Utente) in.readObject();
	  					 in.close();
	  					 return u;
	  				} catch (StreamCorruptedException e1) {
	  					// TODO Auto-generated catch block
	  					e1.printStackTrace();
	  				} catch (FileNotFoundException e1) {
	  					// TODO Auto-generated catch block
	  					e1.printStackTrace();
	  				} catch (IOException e1) {
	  					// TODO Auto-generated catch block
	  					e1.printStackTrace();
	  				}
	  			      catch (ClassNotFoundException e) {
	  							// TODO Auto-generated catch block
	  							e.printStackTrace();
	  						} 
	  	
	      
	             }
	  		
	  	          return u;
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
			@SuppressWarnings("static-access")
			FileOutputStream fos = openFileOutput(getFilesDir()+File.separator+"PersonalTrainer"+File.separator+FILENAME,MODE_PRIVATE);
			ObjectOutputStream osw = new ObjectOutputStream(fos);
			osw.writeObject(user);
			osw.close();
			
			} catch (Exception e) {
			Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
			return false;
			}
			return true;
			}

	}


