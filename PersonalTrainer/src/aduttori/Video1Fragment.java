package aduttori;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import it.unisa.personalTrainer.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import android.provider.Settings;

public class Video1Fragment extends Fragment{

	ProgressBar pb;
	Dialog dialog;
	int downloadedSize = 0;
	int totalSize = 0;
	TextView cur_val;
	String dwnload_file_path = "http://personaltrainer2014.altervista.org/video/femorali/addutori.mp4";
	float per=0;
	VideoView video;
	boolean flag=false;
	File file=null,file1=null;
	ImageView image;
	View v;
	InputStream inputStream;
	Thread t;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.fragment_video3,
				container, false);

		//set the path where we want to save the file           
		File SDCardRoot = Environment.getExternalStorageDirectory(); 
		//create a new file, to save the downloaded file 
		// recupero il percorso del file
		file = new File(SDCardRoot+"/PersonalTrainer/","adduttori.mp4");
		file1 = new File(getActivity().getFilesDir()+"/PersonalTrainer/","adduttori.mp4");
		video= (VideoView) v.findViewById(R.id.videoView1);

		getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

		image=(ImageView) v.findViewById(R.id.imageView1);
		image.setClickable(true);



		return v;
	}  

	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);

		// secondo avvio
		if(file.exists()){

			image.setVisibility(View.INVISIBLE);         
			video.setVideoPath(file.getPath());

			video.setOnPreparedListener (new OnPreparedListener() {                    
				@Override
				public void onPrepared(MediaPlayer mp) {

					mp.setLooping(true);	

				}
			});


			video.start();

		}

		//primo avvio
		else{

			image.setOnClickListener(new OnClickListener(){

				public void onClick(View arg0) {
					if(file.exists()){
						image.setVisibility(View.INVISIBLE);         
						video.setVideoPath(file.getPath());

						video.setOnPreparedListener (new OnPreparedListener() {                    
							@Override
							public void onPrepared(MediaPlayer mp) {

								mp.setLooping(true);	

							}
						});


						video.start();
					}
					else{

						visualizza();

					}
				}

			});
		} 		   
	}

	public void visualizza() {
		String condizioni="Durante la visualizzazione del video la modalità standby sarà disattivata automaticamente.\n"
				+ "Si prega di non attivarla al fine di evitare problemi di visualizzazione che sono stati "
				+ "riscontrati  in alcuni smartphone. Al termine della visualizzazione del video sarà riattivata automaticamente. ";

		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(),AlertDialog.THEME_HOLO_LIGHT);
		builder.setTitle("Attenzione!!!")
		.setIcon( R.drawable.ic_launcher )
		.setMessage(condizioni)

		.setCancelable(false)

		.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				//Se ho inserito tutti i dati di registrazione scrivo su file nella scheda sd e lancio la prossima activity

				if(!haveNetworkConnection()){
					createNetErrorDialog();


					flag=false;
				}
				else{
					flag=true;

				}
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

		AlertDialog alert = builder.create();
		alert.show();
	}

	void downloadFile() {

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
			inputStream = urlConnection.getInputStream();

			//this is the total size of the file which we are downloading
			totalSize = urlConnection.getContentLength();

			getActivity().runOnUiThread(new Runnable() {
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
				getActivity().runOnUiThread(new Runnable() {
					public void run() {
						pb.setProgress(downloadedSize);
						per = ((float)downloadedSize/totalSize) * 100;
						cur_val.setText("Download   "+  (int)per + "%" );
					}
				});
			}
			//close the output stream when complete //
			fileOutput.close();
			dialog.dismiss();
			android.os.Process.killProcess(android.os.Process.myUid());
			getActivity().finish();
			Intent activity=new Intent(getActivity(),SubMenu1Activity.class);
			startActivity(activity);


		} catch (final MalformedURLException e) {
			showError("Error : MalformedURLException " + e);        
			e.printStackTrace();
			file.delete();
			downloadedSize=0;
			dialog.dismiss(); 
		} catch (final IOException e) {
			showError("Error : IOException " + e); 
			e.printStackTrace();
			downloadedSize=0;
			file.delete();
			dialog.dismiss(); 
		}
		catch (final Exception e) {
			showError("Error : Please check your internet connection " + e);
			file.delete();
			downloadedSize=0;
			dialog.dismiss(); 
		}       
	}

	void showError(final String err){
		getActivity().runOnUiThread(new Runnable() {
			public void run() {
				Toast.makeText(getActivity(), err, Toast.LENGTH_LONG).show();
			}
		});
	}

	// Dialog per il download
	void showProgress(String file_path) {
		dialog = new Dialog(getActivity(),android.R.style.Theme_DeviceDefault_Light_Dialog);
		dialog.requestWindowFeature(Window.FEATURE_LEFT_ICON);
		dialog.setContentView(R.layout.myprogressdialog);
		dialog.setTitle("Downloading video");
		dialog.setCancelable(false);
		dialog.setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ic_launcher);
		cur_val = (TextView) dialog.findViewById(R.id.cur_pg_tv);
		cur_val.setText("Starting download...");
		dialog.show();

		pb = (ProgressBar)dialog.findViewById(R.id.progress_bar);	 
		pb.setProgressDrawable(getResources().getDrawable(R.drawable.green_progress));
		pb.setProgress(0);

	}
	// controllo connessione
	public boolean haveNetworkConnection() {
		boolean haveConnectedWifi = false;
		boolean haveConnectedMobile = false;

		@SuppressWarnings("static-access")
		ConnectivityManager cm = (ConnectivityManager)getActivity().getSystemService(getActivity().CONNECTIVITY_SERVICE);
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

	//lancio dialog se non c'è connessione
	public void createNetErrorDialog() {

		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(),AlertDialog.THEME_HOLO_LIGHT);
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

	public void onStart()
	{
		super.onStart();

	}


	public void onResume() {
		super.onResume();
		video.start();

	}


	public void onStop() {
		super.onStop();
		video.pause();


	}


	public void onPause(){
		super.onPause();
		video.pause();


	}
	public void onDestroy() {
		super.onDestroy();

	}

}
