package impostazioni;


import it.unisa.personalTrainer.R;
import it.unisa.personalTrainer.R.drawable;
import it.unisa.personalTrainer.R.id;
import it.unisa.personalTrainer.R.layout;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ProblemActivity extends Activity {
	String object;
	boolean flag=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_problem);
          object="Segnalazione problema PersonalTrainer";

		// Gestione button invia
		Button btn1 = (Button) findViewById(R.id.button2);
		btn1.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			final EditText edit = (EditText) findViewById(R.id.editText1);
			// gestione toast
			if(edit.getText().toString().equals("")){
				Toast.makeText(getApplicationContext(), "Impossibile inviare segnalazione vuota", Toast.LENGTH_SHORT).show();
			}
			else{
				
				if(!haveNetworkConnection()){
	                 createNetErrorDialog();
	
					}
					else{
						
				String segn=edit.getText().toString();
				Intent imail = new Intent(Intent.ACTION_SEND);
				imail.putExtra(Intent.EXTRA_EMAIL, new String[] {"personaltrainerapp2014@gmail.com"});
				imail.putExtra(Intent.EXTRA_SUBJECT, object);
				imail.putExtra(Intent.EXTRA_TEXT, segn);
				imail.setType("message/rfc822");
				startActivity(Intent.createChooser(imail, "Email"));
				finish();
		    }
		}
	}
});


		
	}


	public void createNetErrorDialog() {

		AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_HOLO_LIGHT);
		builder.setMessage("Hai bisogno di una connessione per inviare la segnalazione. Per favore connettiti alla rete mobile"
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

	// controllo connessione
			public boolean haveNetworkConnection() {
				boolean haveConnectedWifi = false;
				boolean haveConnectedMobile = false;

				
				ConnectivityManager cm = (ConnectivityManager)getSystemService(CONNECTIVITY_SERVICE);
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