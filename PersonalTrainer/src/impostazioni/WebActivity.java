package impostazioni;

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
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WebActivity  extends Activity {
	String object;
	boolean flag=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		
		
		WebView web = new WebView(this);
		web.loadUrl("http://www.google.com");
     
	    if(!web.isActivated())
	    	finish();
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
