package impostazioni;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import it.unisa.personalTrainer.R;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;


public class SettingsFragment extends Fragment{
	final String FILENAME1 = "LogInPT";
	final String FILENAME2 = "Levels";
	final String FILENAME3 = "risveglio";
	final String FILENAME4="switch";
	final String FILENAME5="Scelta";
	
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {

			View v= inflater.inflate(R.layout.fragment_settings,
					container, false);

		

        /* impostazione versione corrente*/
			final TextView view = (TextView) v.findViewById(R.id.textView4);
			view.setOnClickListener(new View.OnClickListener() {

			  @Override
			  public void onClick(View v) {
				  Toast.makeText(getActivity().getApplicationContext(), "Versione Corrente: 2.0", Toast.LENGTH_SHORT).show();
			  }

			});

			/* switch*/
			
			Switch s = (Switch) v.findViewById(R.id.switch1);
			
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
			    	s.setChecked(true);
			    else 
			    	s.setChecked(false);
						
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			s.setOnCheckedChangeListener(new OnCheckedChangeListener() {

				   @Override
				   public void onCheckedChanged(CompoundButton buttonView,
				     boolean isChecked) {
					   
					   File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
					   File f4= new File(directory,FILENAME4);
				     
					   PrintWriter file=null;
					try {
						file = new PrintWriter(f4);
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		      
					 if(isChecked){
				     file.write("si");
				     file.close();
					 }
				    else{
				    	file.write("no");
					    file.close();
				    }
				   }
				  });
			
			 
			
			/* impostazione segnala un problema*/
			final TextView view2 = (TextView) v.findViewById(R.id.textView7);
			view2.setOnClickListener(new View.OnClickListener() {


			@Override
			  public void onClick(View v) {
				Intent intent = new Intent(getActivity(),ProblemActivity.class);
				startActivity(intent);
			 }

			});

			
			final TextView view3 = (TextView) v.findViewById(R.id.textView5);
			view3.setOnClickListener(new View.OnClickListener() {

			  @Override
			  public void onClick(View v) {
				  Toast.makeText(getActivity().getApplicationContext(), "Ripristino effettuato", Toast.LENGTH_SHORT).show();
			  }

			});

			/*seguici su facebook*/
			final TextView view9 = (TextView) v.findViewById(R.id.textView9);
			view9.setOnClickListener(new View.OnClickListener() {

			  @Override
			  public void onClick(View v) {
				  
			  
				  if(!haveNetworkConnection()){
		                 createNetErrorDialog();
		
						}
						else{
				Intent intent = new Intent(getActivity(),WebActivity.class);
				startActivity(intent);
						}
			  }

			});


			/* modifica dati*/
			final TextView view10 = (TextView) v.findViewById(R.id.textView10);
			view10.setOnClickListener(new View.OnClickListener() {

			  @Override
			  public void onClick(View v) {
				  
			  
				Intent intent = new Intent(getActivity(),ModificaActivity.class);
				startActivity(intent);
			}
			  

			});
			
			
			/* elemina dati*/
			final TextView view11 = (TextView) v.findViewById(R.id.textView11);
			view11.setOnClickListener(new View.OnClickListener() {

			  @Override
			  public void onClick(View v) {
				  visualizza();
			  
			}
			  

			});
			
			return v;
		}
		
		public void createNetErrorDialog() {

			AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(),AlertDialog.THEME_HOLO_LIGHT);
			builder.setMessage("Hai bisogno di una connessione ad Internet. Per favore connettiti alla rete mobile"
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
				
				
				
				public void visualizza() {

					LayoutInflater li = LayoutInflater.from(getActivity());
					final LinearLayout view = (LinearLayout)li.inflate(R.layout.dialog, null);
					
					AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(),AlertDialog.THEME_HOLO_LIGHT);
					builder.setView(view)
							.setTitle("Elimina dati")
							.setIcon( R.drawable.ic_launcher )
							.setCancelable(false)
							.setPositiveButton("Si",
									new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int id) {
									
								
								    
							CheckBox c = (CheckBox) view.findViewById(R.id.checkBox1);
								    
							if(c.isChecked()){
								if(eliminaFileSD())
									getActivity().finish();
								else{
									eliminaFileMem();
									getActivity().finish();
								}
							}
								
							else{
								if(eliminaDirectorySD())
									getActivity().finish();
								else{
									eliminaDirectoryMem();
									getActivity().finish();
								}
							}
							
						}
			}
									)
									.setNegativeButton("No",
											new DialogInterface.OnClickListener() {
										public void onClick(DialogInterface dialog, int id) {

										}
									}
											);
					AlertDialog alert = builder.create();
					alert.show();
			}
		
				 public boolean eliminaFileSD() {
						try {

							File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
						    File f1= new File(directory,FILENAME1);
						    File f2= new File(directory,FILENAME2);
						    File f3= new File(directory,FILENAME3);
						    File f4= new File(directory,FILENAME4);
						    File f5= new File(directory,FILENAME5);
						    
						    f1.delete();
							f2.delete();
							f3.delete();
							f4.delete();
							f5.delete();
						    
						} catch (Exception e) {
						Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
						return false;
						}
						return true;
						}

				 public boolean eliminaDirectorySD() {
						try {

							File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
							SettingsFragment.deleteNon_EmptyDir(directory);
						   
						} catch (Exception e) {
						Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
						return false;
						}
						return true;
						}
				 
				 
				 
					public boolean eliminaFileMem() {
						try {
						@SuppressWarnings("static-access")
						File f1 = new File(getActivity().getFilesDir()+File.separator+"PersonalTrainer"+File.separator+FILENAME1);
						File f2 = new File(getActivity().getFilesDir()+File.separator+"PersonalTrainer"+File.separator+FILENAME2);
						File f3 = new File(getActivity().getFilesDir()+File.separator+"PersonalTrainer"+File.separator+FILENAME3);
						File f4 = new File(getActivity().getFilesDir()+File.separator+"PersonalTrainer"+File.separator+FILENAME4);
						File f5 = new File(getActivity().getFilesDir()+File.separator+"PersonalTrainer"+File.separator+FILENAME5);
						 f1.delete();
					     f2.delete();
					     f3.delete();
					     f4.delete();
					     f5.delete();
					     
							
						} catch (Exception e) {
						Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
						return false;
						}
						return true;
						}
					
					public boolean eliminaDirectoryMem() {
						try {
						
						File f1 = new File(getActivity().getFilesDir()+File.separator+"PersonalTrainer"+File.separator);
						SettingsFragment.deleteNon_EmptyDir(f1);
							
						} catch (Exception e) {
						Toast.makeText(getActivity(), e.getMessage(), Toast.LENGTH_SHORT).show();
						return false;
						}
						return true;
						}
					
					public static boolean deleteNon_EmptyDir(File dir) {
				        if (dir.isDirectory()) {
				            String[] children = dir.list();
				            for (int i=0; i<children.length; i++) {
				                boolean success = deleteNon_EmptyDir(new File(dir, children[i]));
				                if (!success) {
				                    return false;
				                }
				            }
				        }
				        return dir.delete();
	         }

}