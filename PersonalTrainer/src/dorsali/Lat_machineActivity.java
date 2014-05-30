package dorsali;

import java.io.File;


import it.unisa.personaltrainer.R;
import accessori.Muscles;
import accessori.MusclesAdapter;
import android.app.Activity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import android.widget.ListView;

import android.widget.ProgressBar;
import android.widget.TextView;

import android.os.Environment;


public class Lat_machineActivity extends Activity {


	ProgressBar pb;
	Dialog dialog;
	int downloadedSize = 0;
	int totalSize = 0;
	TextView cur_val;
	String dwnload_file_path = "http://personaltrainer2014.altervista.org/video/dorso/lat_machine4.mp4";
	float per=0;
	boolean flag=false;
	File file=null;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_lat_machine);
		// setto tutte le textView
		setText();
		
		//set the path where we want to save the file           
		File SDCardRoot = Environment.getExternalStorageDirectory(); 
		//create a new file, to save the downloaded file 
		// recupero il percorso del file
		file = new File(SDCardRoot+"/PersonalTrainer/","lat_machine.mp4");

		// secondo avvio
		
	}

	protected void onStart()
	{
		super.onStart();

	}

	public void setText(){
		TextView text1 = (TextView) findViewById(R.id.textView1);
		text1.setText("Nome Esercizio:");

		TextView text2 = (TextView) findViewById(R.id.textView2);
		text2.setText("Lat Machine");

		TextView text3 = (TextView) findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) findViewById(R.id.textView4);
		text4.setText("L'esercizio Trazioni alla sbarra a presa prona dietro è noto anche "
				+ "come Back pull ups, Back pull ups at the bar, Rear pull ups, Rear pull ups at the bar.");

		TextView text5 = (TextView) findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) findViewById(R.id.textView6);
		text6.setText("Trazioni alla sbarra a presa prona dietro è un esercizio Multiarticolare/accessorio");

		TextView text7 = (TextView) findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) findViewById(R.id.textView8);
		text8.setText("Trazioni alla lat machine a presa prona dietro.");

		TextView text9 = (TextView) findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta appeso alla sbarra con le mani che impugnano "
				+ "quest'ultima ad una distanza superiore a quella tra le spalle. "
				+ "Le spalle sono abdotte sul piano longitudinale, mentre i gomiti sono estesi e le scapole, "
				+ "ruotate verso l'alto, possono essere in elevazione o in depressione; in quest'ultimo caso non "
				+ "c'è l'azione 5. L'esecuzione consiste nel sollevarsi fino a toccare la barra con la parte superiore"
				+ " della schiena dietro il collo. Il movimento è perfettamente verticale così come lo è il corpo dell'atleta."
				+ " Osservando l'esercizio dal lato, occorre vedere l'avambraccio sullo stesso piano del corpo. Questa variante è "
				+ "mirata allo sviluppo dei fasci inferiori del grande dorsale che influenzano maggiormente la forma a “V” del torace;"
				+ " mentre nella flessione del gomito il carico verte maggiormente su brachioradiale e brachiale. Il coinvolgimento del "
				+ "grande pettorale è maggiore rispetto alla variante a presa prona davanti. ");
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