package dorsali;



import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import it.unisa.personaltrainer.R;
import accessori.Muscles;
import accessori.MusclesAdapter;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


import android.widget.VideoView;
import android.os.Environment;
import android.provider.Settings;


public class Pulley_bassoActivity extends Activity {


	ProgressBar pb;
	Dialog dialog;
	int downloadedSize = 0;
	int totalSize = 0;
	TextView cur_val;
	String dwnload_file_path = "http://personaltrainer2014.altervista.org/video/dorso/pulley_basso.mp4";
	float per=0;
	VideoView video;
	ImageView previewImage;
	boolean flag=false;
	File file=null;
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_lat_machine);
		// setto tutte le textView
		setText();
		
		previewImage = (ImageView) findViewById(R.id.imageView1);
		previewImage.setClickable(true);

		
   
		
        // inserimento listview per il titolo
		Muscles data[] = new Muscles[]
				{

				};

		MusclesAdapter adapter = new MusclesAdapter(this,
				R.layout.list_item, data);


		ListView listView1 = (ListView)findViewById(R.id.listView1);


		View header = (View)getLayoutInflater().inflate(R.drawable.list_esec,null);
		listView1.addHeaderView(header);
		listView1.setAdapter(adapter);


		//set the path where we want to save the file           
		File SDCardRoot = Environment.getExternalStorageDirectory(); 
		//create a new file, to save the downloaded file 
		// recupero il percorso del file
		file = new File(SDCardRoot+"/PersonalTrainer/","pulley_basso.mp4");

		// secondo avvio
		if(file.exists()){
			previewImage.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
					previewImage.setVisibility(ImageView.INVISIBLE);
					setContentView(R.layout.activity_video);
					getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
					video= (VideoView) findViewById(R.id.videoView1);
					MediaController mediaController = new MediaController(Pulley_bassoActivity.this);

					mediaController.setAnchorView(video);
					video.setMediaController(mediaController);

					video.setVideoPath(file.getPath());
					video.setOnPreparedListener (new OnPreparedListener() {                    
						@Override
						public void onPrepared(MediaPlayer mp) {
							mp.setLooping(true);
						}
					});

					video.start(); 

				}
			});
		}

		//primo avvio
		else{

            
			previewImage.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {
                    
					if(!haveNetworkConnection())

						createNetErrorDialog();
					else
						flag=true;

					if(flag){
						showProgress(dwnload_file_path);


						new Thread(new Runnable() {
							public void run() {
								downloadFile();
							}
						}).start();

					}

				}



			});


		}
	} 



	void downloadFile(){

		try {
			per=0;
			URL url = new URL(dwnload_file_path);
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();

			urlConnection.setRequestMethod("GET");
			urlConnection.setDoOutput(true);

			//connect
			urlConnection.connect();



			FileOutputStream fileOutput = new FileOutputStream(file);

			//Stream used for reading the data from the internet
			InputStream inputStream = urlConnection.getInputStream();

			//this is the total size of the file which we are downloading
			totalSize = urlConnection.getContentLength();

			runOnUiThread(new Runnable() {
				public void run() {
					pb.setMax(totalSize);
				}               
			});

			//create a buffer...
			byte[] buffer = new byte[1024];
			int bufferLength = 0;

			while ( (bufferLength = inputStream.read(buffer)) > 0 ) {
				fileOutput.write(buffer, 0, bufferLength);
				downloadedSize += bufferLength;
				// update the progressbar //
				runOnUiThread(new Runnable() {
					public void run() {
						pb.setProgress(downloadedSize);
						per = ((float)downloadedSize/totalSize) * 100;
						cur_val.setText("Downloaded " + downloadedSize + "KB / " + totalSize + "KB (" + (int)per + "%)" );
					}
				});
			}
			//close the output stream when complete //
			fileOutput.close();
			runOnUiThread(new Runnable() {
				public void run() {
					dialog.dismiss(); 

					setContentView(R.layout.activity_video);
					getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
					video= (VideoView) findViewById(R.id.videoView1);
					MediaController mediaController = new MediaController(Pulley_bassoActivity.this);
					mediaController.setAnchorView(video);
					video.setMediaController(mediaController);

					video.setVideoPath(file.getPath());
					video.setOnPreparedListener (new OnPreparedListener() {                    
						@Override
						public void onPrepared(MediaPlayer mp) {
							mp.setLooping(true);
						}
					});
					video.start();
				}
			});         

		} catch (final MalformedURLException e) {
			showError("Error : MalformedURLException " + e);        
			e.printStackTrace();
			file.delete();
			dialog.dismiss(); 
		} catch (final IOException e) {
			showError("Error : IOException " + e);          
			e.printStackTrace();
			file.delete();
			dialog.dismiss(); 
		}
		catch (final Exception e) {
			showError("Error : Please check your internet connection " + e);
			file.delete();
			dialog.dismiss(); 
		}       
	}

	void showError(final String err){
		runOnUiThread(new Runnable() {
			public void run() {
				Toast.makeText(Pulley_bassoActivity.this, err, Toast.LENGTH_LONG).show();
			}
		});
	}

	// Dialog per il download
	void showProgress(String file_path) {
		dialog = new Dialog(Pulley_bassoActivity.this);
		dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
		dialog.setContentView(R.layout.myprogressdialog);
		dialog.setTitle("Video Downloading");
		dialog.setCancelable(false);
		dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_launcher);
		TextView text = (TextView) dialog.findViewById(R.id.tv1);
		text.setText("Downloading file from ... " + file_path);
		cur_val = (TextView) dialog.findViewById(R.id.cur_pg_tv);
		cur_val.setText("Starting download...");
		dialog.show();

		pb = (ProgressBar)dialog.findViewById(R.id.progress_bar);
		pb.setProgressDrawable(getResources().getDrawable(R.drawable.green_progress));
		pb.setProgress(0);

	}

	// controllo connessione
	private boolean haveNetworkConnection() {
		boolean haveConnectedWifi = false;
		boolean haveConnectedMobile = false;

		ConnectivityManager cm = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
		NetworkInfo[] netInfo = cm.getAllNetworkInfo();
		for (NetworkInfo ni : netInfo) {
			if (ni.getTypeName().equalsIgnoreCase("WIFI"))
				if (ni.isConnected())
					haveConnectedWifi = true;
			if (ni.getTypeName().equalsIgnoreCase("MOBILE"))
				if (ni.isConnected())
					haveConnectedMobile = true;
		}
		return haveConnectedWifi || haveConnectedMobile;
	}

// lancio dialog se non c'è connessione
	protected void createNetErrorDialog() {

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setMessage("Hai bisogno di una connessione per scaricare il video. Per favore connettiti alla rete mobile"
				+ " o ad una rete Wi-fi.")
				.setTitle("Connessione a internet mancante")
				.setIcon( R.drawable.ic_launcher )
				.setCancelable(false)
				.setPositiveButton("Impostazioni",
						new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int id) {
						Intent i = new Intent(Settings.ACTION_WIRELESS_SETTINGS);
						startActivity(i);
					}
				}
						)
						.setNegativeButton("Annulla",
								new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {

							}
						}
								);
		AlertDialog alert = builder.create();
		alert.show();
	}

	protected void onStart()
	{
		super.onStart();

	}

	public void setText(){
		TextView text1 = (TextView) findViewById(R.id.textView1);
		text1.setText("Nome Esercizio:");

		TextView text2 = (TextView) findViewById(R.id.textView2);
		text2.setText("Pulley basso");

		TextView text3 = (TextView) findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) findViewById(R.id.textView4);
		text4.setText("L'esercizio Rematore al pulley orizzontale con maniglia a presa "
				+ "stretta è noto anche come Narrow grip front cable rower.");

		TextView text5 = (TextView) findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) findViewById(R.id.textView6);
		text6.setText("Rematore al pulley orizzontale con maniglia a presa stretta è un esercizio Multiarticolare/accessorio");

		TextView text7 = (TextView) findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) findViewById(R.id.textView8);
		text8.setText("Rematore con bilanciere a presa supina, Rematore alla dorsy bar, Rematore con manubrio, Rematore con bilanciere a presa prona, Rematore al pulley orizzontale a presa prona.");

		TextView text9 = (TextView) findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta seduto con le anche flesse, le ginocchia semiflesse ed i piedi "
				+ "posizionati sugli appositi appoggi. Le scapole sono abdotte e le mani afferrano con presa neutra o "
				+ "neutra/prona l'apposita maniglia. La schiena può trovarsi sia in flessione (variante 1) che nella "
				+ "sua posizione di forza (variante 2); in quest'ultimo caso non c'è l'azione 6 ed i muscoli in essa coinvolti "
				+ "diventano stabilizzatori della colonna. Nella variante 1 (si effettua anche l'azione 5) le anche sono totalmente "
				+ "flesse e l'esecuzione consiste nel estendere contemporaneamente colonna vertebrale e anche per giungere nella "
				+ "posizione di partenza della variante 2. A questo punto il movimento continua esattamente allo stesso modo in "
				+ "entrambe le opzioni. Variante 2 (chi parte da questa variante, cioè chi si trova a questo punto senza aver "
				+ "eseguito prima i movimenti della variante 1, non esegue l'azione 5 ed i muscoli in essa coinvolti vengono "
				+ "considerati come stabilizzatori dell'anca): La posizione di partenza vede l'atleta con la schiena nella sua "
				+ "posizione di forza, le anche quasi completamente flesse, le scapole abdotte, le spalle parzialmente flesse ed i"
				+ " gomiti estesi. L'esecuzione consiste nel estendere le spalle e contemporaneamente flettere i gomiti, addurre ed"
				+ " elevare parzialmente le scapole. L'azione termina quando la maniglia arriva a contatto con il busto senza che "
				+ "questo gesto venga completato con una flessione dei polsi. L'inclinazione del busto non viene modificata per tutta "
				+ "la durata dell'esercizio. E' possibile utilizzare la tecnica detta cheating con delle piccole distensioni degli"
				+ "arti inferiori.");
		
	
	    
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