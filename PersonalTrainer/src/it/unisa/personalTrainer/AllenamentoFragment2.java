package it.unisa.personalTrainer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import dataBaseSqliteAllen.DbAdapter3;
import dataBaseSqliteDate.DbAdapter;
import dataBaseSqliteSchede.DbAdapter2;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.StrictMode;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;




@SuppressLint("NewApi")
public class AllenamentoFragment2 extends Fragment{
	String dwnload_file_path = "http://personaltrainer2014.altervista.org/Schede.json";
	final String FILENAME4="switch";
	TextView textviewDatiRicevuti;
	InputStream inputStream;
	private DbAdapter3 dbHelper; 
	private DbAdapter dbHelper2; 
    private Cursor cursor;	
    Button next;
    Button inizio;
    Button termina;
	ListView list;
	View v;
	int cont=0;
	ItemAdapter2 adapter;
	ArrayList<Item2> item;
	String s1;
	ArrayList<TextView> a,a1,a2,a3;
	
	ArrayList<View> lay;
	TextView giorno;
	TextView gg;
	 File file=null;
	 int numeroS;
	 @Override
	 public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
				Bundle savedInstanceState) {
		 
			 v = inflater.inflate(R.layout.fragment_allenamento2,
					container, false);
	        
			 giorno = (TextView)v.findViewById(R.id.textView6);
			 gg= (TextView)v.findViewById(R.id.textView1);
			 
			 
	        list = (ListView)v.findViewById(R.id.listView1);
	        inizio=(Button)v.findViewById(R.id.button1);
	        next=(Button)v.findViewById(R.id.button2);
	        termina=(Button)v.findViewById(R.id.button3);
	        
	        termina.setEnabled(false);
		    termina.setClickable(false);
	        next.setEnabled(false);
		    next.setClickable(false);
	      

	        File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
			File f4= new File(directory,FILENAME4);
			BufferedReader b;
			String s1;
		    try {
				FileReader i =new FileReader(f4);
				
			    b=new BufferedReader(i);
			    
			    s1=b.readLine();
			    b.close();
					
			    if(s1.equals("si"))
			    getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
			    
			    	
						
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 
	       StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
          StrictMode.setThreadPolicy(policy);

          try{
          Intent intent = getActivity().getIntent();
          String s=intent.getStringExtra("Stringa1");
          
          if(s.equals("scarica")){
         /*if(!haveNetworkConnection());
        		 /* createNetErrorDialog();*/
       
              popolaDB();
        	  setListView();
          }
          }catch(Exception e){
        	  setListView();
         }

          
         
          next.setOnClickListener(new OnClickListener(){
        	  
			@Override
			public void onClick(View arg0) {
				TextView t;
				TextView t2;
				String subString;
				String subString1;
				
             
			int n;

			 t2=a1.get(cont);
			
		/*	Intent i=new Intent(getActivity(),TimerActivity.class);
			i.putExtra("Stringa1", t2.getText().toString());
			startActivity(i);*/
			
			
			 t=a.get(cont);
			 
			 subString=t.getText().toString().substring(0, 1);
			subString1=t.getText().toString().substring(2, 3);
				if(Integer.parseInt(subString) < Integer.parseInt(subString1)){
				n=Integer.parseInt(subString)+1;
				t.setText(Integer.toString(n)+"/"+subString1);
                lay.get(cont).setBackgroundColor(Color.rgb(3, 192, 60));
			}
			else{
				if(adapter.getSize()-1 == cont){
					TextView text;
										
					for(int j=0;j<=cont;j++){
					lay.get(j).setBackgroundColor(Color.TRANSPARENT);
					text=a.get(j);
					String subString4=text.getText().toString().substring(2, 3);
					text.setText(0+"/"+subString4);
					}
					cont=0;
					visualizza3();
					 next.setEnabled(false);
		  			    next.setClickable(false);
		  			  inizio.setEnabled(true);
		  			    inizio.setClickable(true);
		  			  termina.setEnabled(false);
		  			   termina.setClickable(false);
		  		
			       	if(numeroS==1){

		  			    String s=giorno.getText().toString();
		  			  subString=s.substring(0, 1);
						 subString1=s.substring(2, 3);
						 
						 if(Integer.parseInt(subString) < Integer.parseInt(subString1)){
								n=Integer.parseInt(subString)+1;
								giorno.setText(Integer.toString(n)+"/"+subString1);
						 }
						 else
							 giorno.setText(1+"/"+subString1);
							 
				 }
				}
				else{
 
	                dbHelper2 = new DbAdapter(getActivity());
	    	         dbHelper2.open();
                    
	    	         t=a2.get(cont);
	                 t2=a3.get(cont);
	                 
	                 String result=t.getText().toString()+"  "+subString1+"X"+t2.getText().toString();
	                 
	                  GregorianCalendar date=new GregorianCalendar();
	                  String m;
	                  String dat;
		 		        int dayM = date.get(Calendar.DAY_OF_MONTH);
		 		        int month = date.get(Calendar.MONTH)+1;
		 		        int year = date.get(Calendar.YEAR);
	                 
		 		        
		 		       if(dayM<10)
		 					dayM=0+dayM;
		 				
		 				if(month<10)
		 					m=""+0+month;
		 				else
		 					m=""+month;
		 				dat=""+dayM+"/"+m+"/"+year;

		 		        		
	    	      dbHelper2.createContact(result, dat);
	    	       
	    	       dbHelper2.close();
	    	       
	    	       lay.get(cont).setBackgroundColor(R.color.green);
	    	       cont++;
	    	       
				    t=a.get(cont);
					 subString=t.getText().toString().substring(0, 1);
					 subString1=t.getText().toString().substring(2, 3);
					 n=Integer.parseInt(subString)+1;
						t.setText(Integer.toString(n)+"/"+subString1);
		                lay.get(cont).setBackgroundColor(Color.rgb(3, 192, 60));
		                
	    	       
				}
			
			}
			}
          });
        
          inizio.setOnClickListener(new OnClickListener(){
        	  

  			@Override
  			public void onClick(View arg0) {
  				
  				
  				
  				inizio.setEnabled(false);
  				inizio.setClickable(false);
  				
  				next.setEnabled(true);
  			    next.setClickable(true);
  			    
  			  termina.setEnabled(true);
  			   termina.setClickable(true);
  			   
  			   
  				visualizza();
  				a= adapter.getStr();
  				a1=adapter.geRec();
  				a2=adapter.geEser();
  				a3=adapter.getRip();
  				TextView t=a.get(0);
  				
  				String subString=t.getText().toString().substring(0, 1);
  				String subString1=t.getText().toString().substring(2, 3);
  				int n=Integer.parseInt(subString)+1;
  					t.setText(Integer.toString(n)+"/"+subString1);
  					
  					lay=adapter.getLayout();
  					lay.get(0).setBackgroundColor(Color.rgb(3, 192, 60));
  			}
            });
          
          termina.setOnClickListener(new OnClickListener(){
        	  
    			@Override
    			public void onClick(View arg0) {
    				
    				visualizza2();
		 	      
			       
			  			   
    			}
                 });
          
	       return v;
	            }

	 

	 public void popolaDB() {

	
		   String result = "";

           InputStream is = null;
           
           try{
                   HttpClient httpclient = new DefaultHttpClient();
                   
              
               HttpGet request=new HttpGet("http://personaltrainer2014.altervista.org/Schede.json");
                request.addHeader("Cache-Control", "no-cache");
             
       		   HttpResponse response = httpclient.execute(request);
               HttpEntity entity = response.getEntity();
               is = entity.getContent();
                
               }catch(Exception e){
                   Log.e("log_REMOTO", "Errore nella connessione HTTP: "+e.toString());
              }
                
           //convert response to string
                 
           try{
                   BufferedReader reader = new BufferedReader(new InputStreamReader(is,"iso-8859-1"),8);
               StringBuilder sb = new StringBuilder();
               String line=null;
               while ((line = reader.readLine()) != null) {
                                 sb.append(line + "\n");  
                                 
                                 

                                 
               }
               
               is.close();
               result = sb.toString();
                   
               }catch(Exception e){
                         Log.e("log_REMOTO", "Errore nella conversione del risultato: "+e.toString());
              }
           try{

        	   File directory2=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
			   File f2= new File(directory2,"risveglio");
			   BufferedReader b;
				
			    try {
					FileReader i =new FileReader(f2);
					
				    b=new BufferedReader(i);
				    
				    s1=b.readLine();
				    b.close();

					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	
               JSONArray jArray = new JSONArray(result);
         /*  for(int i=0;i<jArray.length();i++){*/
               JSONObject json;
               JSONArray json2;
               if(s1.equals("no")){
            	   json =jArray.getJSONObject(0);
            	   json2=json.getJSONArray("scheda0");
            	   numeroS=0;
            	   
               }
				    else {
				    	numeroS=1;
				    	json =jArray.getJSONObject(1);
				    	json2=json.getJSONArray("scheda1");
				    	File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
						   File f4= new File(directory,"Levels");
						   BufferedReader buffer;
							String s1;
						    try {
								FileReader i =new FileReader(f4);
								
							    buffer=new BufferedReader(i);
							    
							    s1=buffer.readLine();
							    buffer.close();
									
							    if(s1.equals("Principiante"))
							    	giorno.setText("1/3");
							    else 
							    	giorno.setText("1/4");
										
							} catch (FileNotFoundException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				    }
                   
               
               
              dbHelper = new DbAdapter3(getActivity());
  	        dbHelper.open();
        	   for(int i=0;i<json2.length();i++){
                  
        		   dbHelper.createContact(json2.getJSONObject(i).getString("esercizio"),json2.getJSONObject(i).getString("gruppo"),
        				   json2.getJSONObject(i).getString("categoria"),json2.getJSONObject(i).getString("serie"),
        				   json2.getJSONObject(i).getString("ripetizioni"),json2.getJSONObject(i).getString("sesso"),
        				   json2.getJSONObject(i).getString("giorno"),new GregorianCalendar().toString(),Integer.toString(numeroS),
        				   json2.getJSONObject(i).getString("rec"),json2.getJSONObject(i).getString("livello"));
        		   
                  
                          
         }
        	   dbHelper.close();
       }catch(JSONException e1){
               Log.e("log_REMOTO", "Errore json: "+e1.toString());
           }catch (Exception e1){
               Log.e("log_REMOTO", "Errore JSON: "+e1.toString());
               e1.printStackTrace();   
           }
	       
  }
	 
	 public void setListView(){
		 String d5="",obiettivo="",sesso="",preparazione="",gior="";
		
		  item=new ArrayList<>();
			dbHelper = new DbAdapter3(getActivity());
	        dbHelper.open();
	        /*numeroS=1;*/
	        if(numeroS==0){
	        cursor = dbHelper.fetchContacts();
	        while(cursor.moveToNext()){
	       	 String d= cursor.getString(cursor.getColumnIndex(DbAdapter3.KEY_GRUPPO));
	       	 String d1= cursor.getString(cursor.getColumnIndex(DbAdapter3.KEY_ESERCIZI));
	       	 String d2= "0/"+cursor.getString(cursor.getColumnIndex(DbAdapter3.KEY_SERIE));
	       	 String d3= cursor.getString(cursor.getColumnIndex(DbAdapter3.KEY_RIPETIZIONI));
	       	String d4= cursor.getString(cursor.getColumnIndex(DbAdapter3.KEY_RECUPERO));
	       /*	d5=cursor.getColumnIndex(DbAdapter3.KEY_GIORNO)+"/"+3;*/
	       	
		         item.add(new Item2(d,d1,d2,d3,d4));
	        }
	        }
	        else{
	        	File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
				File f1= new File(directory,"Scelta");
				
				BufferedReader b;
				String s1;
			    try {
					FileReader i =new FileReader(f1);
					
				    b=new BufferedReader(i);
				    
				    s1=b.readLine();
				    b.close();
						
				    if(s1.equals("Aumento"))
				    	obiettivo="a";
				    else if (s1.equals("Dimagrimento"))
				    	obiettivo="d";
				    else
				    	obiettivo="r";
							
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			    sesso=getUtente().getSesso();
			    if (sesso.equals("Maschio"))
			    	sesso="m";
			    else 
			    	sesso="f";
			    
			   directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
				 f1= new File(directory,"Levels");
				
				
			    try {
					FileReader i =new FileReader(f1);
					
				    b=new BufferedReader(i);
				    
				    s1=b.readLine();
				    b.close();
						
				    if(s1.equals("Principiante"))
				    	preparazione="p";
				    else if (s1.equals("Intermedio"))
				    	preparazione="i";
				    else
				    	preparazione="a";
							
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    

			    directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
				 f1= new File(directory,"Giorno");
				
				
			    try {
					FileReader i =new FileReader(f1);
					
				    b=new BufferedReader(i);
				    
				    gior=b.readLine();
				    b.close();
						
	
							
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    
			  
	        	cursor = dbHelper.fetchContactsByFilter(obiettivo, sesso, preparazione,gior);
		        while(cursor.moveToNext()){
		       	 String d= cursor.getString(cursor.getColumnIndex(DbAdapter3.KEY_GRUPPO));
		       	 String d1= cursor.getString(cursor.getColumnIndex(DbAdapter3.KEY_ESERCIZI));
		       	 String d2= "0/"+cursor.getString(cursor.getColumnIndex(DbAdapter3.KEY_SERIE));
		       	 String d3= cursor.getString(cursor.getColumnIndex(DbAdapter3.KEY_RIPETIZIONI));
		       	String d4= cursor.getString(cursor.getColumnIndex(DbAdapter3.KEY_RECUPERO));
		       /*	d5=cursor.getColumnIndex(DbAdapter3.KEY_GIORNO)+"/"+3;*/
		       	
			         item.add(new Item2(d,d1,d2,d3,d4));
	        }
	        
	        }

	       	
	        
	        cursor.close();
		     dbHelper.close();
		 
		    if(numeroS==0)
		       		gg.setText("Obiettivo del giorno:\nRisveglio muscolare(Scheda unica)");
		    else
		    	giorno.setText(d5);
		
		       
			     
	            
			       
		  		  adapter = new ItemAdapter2(getActivity(),
		  		  R.layout.list_item4, item);
		  		   
		  		   
			list.setAdapter(adapter);
			list.setSelector( R.drawable.selector_list);
			list.setClickable(false);
			list.setFocusable(false);
		
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
					}
				);
							
								
			AlertDialog alert = builder.create();
			alert.show();
	}
	 
		public void visualizza() {
			String condizioni="Premi il pulsante 'Riposo' dopo aver completato una serie. La linea verde sulla tabella "
						+ "indica l'esercizio che devi eseguire "
						+ "ed ogni volta che premerai 'Riposo' passerai alla serie successiva. Solo dopo aver completato tutte le serie di"
						+ "un esercizio potrai passare a quello successivo. ";

			AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(),AlertDialog.THEME_HOLO_LIGHT);
			builder.setTitle("Leggi attentamente prima di iniziare!")
			.setIcon( R.drawable.ic_launcher )
			.setMessage(condizioni)

			.setCancelable(false)

			.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

				@Override
				public void onClick(DialogInterface arg0, int arg1) {
					// TODO Auto-generated method stub
					String message="Esegui la prima serie";
					  Toast.makeText(getActivity().getApplicationContext(), message, Toast.LENGTH_LONG).show();
				}
	
				
			});

			AlertDialog alert = builder.create();
			alert.show();
		}
		public void visualizza2() {
			String condizioni="Sei sicuro di voler terminare l'allenamento? L'allenamento verrà considerato completato e si passerà "
					+ "a quello del giorno successivo.";

			AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(),AlertDialog.THEME_HOLO_LIGHT);
			builder.setTitle("Termina allenamento")
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
				String subString,subString1;
				int n;
			
				TextView t;
				
				for(int i=0;i<=cont;i++){
				lay.get(i).setBackgroundColor(Color.TRANSPARENT);
				t=a.get(i);
				String subString4=t.getText().toString().substring(2, 3);

				t.setText(0+"/"+subString4);
				
				}
				cont=0;
				if(numeroS==1){
   				 String s=giorno.getText().toString();
		  			  subString=s.substring(0, 1);
						 subString1=s.substring(2, 3);
						 
						 if(Integer.parseInt(subString) < Integer.parseInt(subString1)){
								n=Integer.parseInt(subString)+1;
								giorno.setText(Integer.toString(n)+"/"+subString1);
						 }
						 else
							 giorno.setText(1+"/"+subString1);
						 
			       	}
			  				inizio.setEnabled(true);
			  				inizio.setClickable(true);
			  				
			  				next.setEnabled(false);
			  			    next.setClickable(false);
			  			    
			  			  termina.setEnabled(false);
			  			   termina.setClickable(false);
			  			   
				
			}
			});
			
			AlertDialog alert = builder.create();
			alert.show();
			}
		
		public void visualizza3() {
			String condizioni="Complimenti hai completato il tuo allenamento. Avrai bisogno di un giorno di riposo per passare"
					+ " al prossimo allenamento.";

			AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(),AlertDialog.THEME_HOLO_LIGHT);
			builder.setTitle("Bravo!")
			.setIcon( R.drawable.ic_launcher )
			.setMessage(condizioni)
			.setCancelable(false)
			
			.setPositiveButton("ok", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
					
			}
			});
			
			AlertDialog alert = builder.create();
			alert.show();
			}
	 public void onStart()
		{
		super.onStart();
		}

	 
		
		public void onResume() {
			super.onResume();
			
			/*setListView();*/

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
	    public Utente getUtente(){
	     	  
	      	File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
	        Utente u=null;
	  		File f = new File(directory,"LogInPT");

	  		File fmem=new File(getActivity().getFilesDir()+File.separator+"LogInPT");
	  		
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
}	 
	   



