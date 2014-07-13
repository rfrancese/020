package it.unisa.personalTrainer;


import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;

import dataBaseSqliteAllen.DbAdapter3;
import dataBaseSqliteSchede.DbAdapter2;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;



public class AllenamentoFragment3 extends Fragment{
	String dwnload_file_path = "http://personaltrainer2014.altervista.org/Schede.json";
	final String FILENAME4="switch";
	TextView textviewDatiRicevuti;
	InputStream inputStream;
    Button next;
	ListView list;
	View v;
	private DbAdapter3 dbHelper;
	ItemAdapter2 adapter;
	ArrayList<Item2> item;
	 File file=null;
	 Button b;
	 @Override
	 public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
				Bundle savedInstanceState) {
			 v = inflater.inflate(R.layout.fragment_allenamento3,
					container, false);
	        
			 b=(Button)v.findViewById(R.id.button1);
			 
			 b.setOnClickListener(new OnClickListener(){
	        	  

					@Override
					public void onClick(View arg0) {
						
						if(!haveNetworkConnection())
							createNetErrorDialog();
						else{
							
							dbHelper = new DbAdapter3(getActivity());
					        dbHelper.open();
					     
						     dbHelper.close();
					        
							 Intent newActivity1 = new Intent(getActivity(), MenuActivity2.class);
							 newActivity1.putExtra("Stringa1", "scarica");
						 getActivity().finish();
			               startActivity(newActivity1);
						}
						
					}
		          });

	       return v;
	            }

	
	 public boolean haveNetworkConnection() {
			boolean haveConnectedWifi = false;
			boolean haveConnectedMobile = false;

			getActivity();
			ConnectivityManager cm = (ConnectivityManager)getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
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

	 public void createNetErrorDialog() {

			AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(),AlertDialog.THEME_HOLO_LIGHT);
			builder.setMessage("Hai bisogno di una connessione per scaricare la scheda di allenamento. Per favore connettiti alla rete mobile"
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
					})
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
		
		}
		public void onStop() {
			super.onStop();
		}


	    public void onPause(){
	    	super.onPause();
	    }
	    public void onDestroy() {
	    	super.onDestroy();
	    	
	    	}
}	 
	   