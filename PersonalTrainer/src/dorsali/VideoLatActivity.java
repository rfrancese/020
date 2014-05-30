package dorsali;

import it.unisa.personaltrainer.R;








import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

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
import android.os.Environment;
import android.provider.Settings;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoLatActivity extends Activity{
	
ProgressBar pb;
Dialog dialog;
int downloadedSize = 0;
int totalSize = 0;
TextView cur_val;
String dwnload_file_path = "http://personaltrainer2014.altervista.org/video/dorso/lat_machine4.mp4";
float per=0;
VideoView video;
boolean flag=false;
File file=null;
FrameLayout layout;

@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	
	setContentView(R.layout.activity_video);

	//set the path where we want to save the file           
	File SDCardRoot = Environment.getExternalStorageDirectory(); 
	//create a new file, to save the downloaded file 
	// recupero il percorso del file
	file = new File(SDCardRoot+"/PersonalTrainer/","lat_machine.mp4");
	video= (VideoView) findViewById(R.id.videoView1);
   layout=  (FrameLayout)findViewById(R.id.container);
     layout.setClickable(true);
	// secondo avvio
	if(file.exists()){
		        video.setBackgroundColor(0);
		     
				MediaController mediaController = new MediaController(VideoLatActivity.this);
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

	//primo avvio
	else{
      video.setBackgroundResource(R.drawable.download);
      layout.setOnClickListener(new OnClickListener(){
     
			@Override
			public void onClick(View arg0) {
				
				if(!haveNetworkConnection()){
                 createNetErrorDialog();
				
				flag=false;
				}
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
					cur_val.setText("Download   "+  (int)per + "%" );
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
				MediaController mediaController = new MediaController(VideoLatActivity.this);
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
			Toast.makeText(VideoLatActivity.this, err, Toast.LENGTH_LONG).show();
		}
	});
}

// Dialog per il download
void showProgress(String file_path) {
	dialog = new Dialog(VideoLatActivity.this);
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

//lancio dialog se non c'è connessione
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
