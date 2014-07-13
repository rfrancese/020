package it.unisa.personalTrainer;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.io.StreamCorruptedException;
import it.unisa.personalTrainer.R;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class AllenamentoFragment extends Fragment {
 
	View v;
		public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
				Bundle savedInstanceState) {
			 v = inflater.inflate(R.layout.fragment_allenamento,
					container, false);
			 
			
			Muscles data[] = new Muscles[]
		    		  {
					  new Muscles(R.drawable.consig, "Scelta cosigliata"),
					  new Muscles(R.drawable.massa, "Aumento massa muscolare"),
		    		  new Muscles(R.drawable.dimag, "Dimagrimento"),
		    		  new Muscles(R.drawable.rassod, "Rassodamento"),
		    		 
		    		   
		    		  };
		    		   
		    		  MusclesAdapter adapter = new MusclesAdapter(getActivity(),
		    		  R.layout.list_item3, data);
		    		 
		    		   
		    		  ListView listView1 = (ListView)v.findViewById(R.id.listView1);
		    		  listView1.setSelector( R.drawable.selector_list);
		    		 
		    		  listView1.setAdapter(adapter);
			
		    		  listView1.setOnItemClickListener(new OnItemClickListener() {
		    		        public void onItemClick(AdapterView<?> parent, View view,
		    		            int position, long id) {
		    		        	
		    		        	final Intent newActivity1 = new Intent(getActivity(), MenuActivity2.class);
		    		        	
		    		        	  switch( position ) {

		    		        	  case 0: 
		    					    	 
		    					        	   File directory=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
		    								   File f= new File(directory,"Scelta");
		    							     
		    								   PrintWriter file=null;
		    								try {
		    									file = new PrintWriter(f);
		    								} catch (FileNotFoundException e) {
		    									// TODO Auto-generated catch block
		    									e.printStackTrace();
		    								}
		    								String w="";
		    					             Utente u=getUtente();
		    								int peso=Integer.parseInt(u.getPeso());
		    						  		double h=Integer.parseInt(u.getAltezza())*0.01;
		    						  		double BMI=peso/(h*h);
		    								
		    						  		if(BMI<18)
		    						            /* settare la dieta consigliata*/
		    						           w="Aumento";
		    						    		
		    						    		else if(BMI>18 && BMI <26 && u.getSesso().equals("Femmina"))
		    						    			w="Rassodamento";
		    						    		
		    						    		else if(BMI>18 && BMI <26 && u.getSesso().equals("Maschio"))
		    						    			w="Aumento";
		    						    		else
		    						    			w="Dimagrimento";
		    						  		
		    							     file.write(w);
		    							     file.close();
		    								
		    							    
		    					        	    
		    					               getActivity().finish();
		    					               startActivity(newActivity1);
		    					        		
		    					        	   
		    					               break;
		    		        	  case 1: 
	    					    	
	    					        	   File directory1=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
	    								   File f1= new File(directory1,"Scelta");
	    							     String w1="Aumento";
	    								   PrintWriter file1=null;
	    								try {
	    									file1 = new PrintWriter(f1);
	    								} catch (FileNotFoundException e) {
	    									// TODO Auto-generated catch block
	    									e.printStackTrace();
	    								}
	    								
	    								file1.write(w1);
	    								  file1.close();
	    								
	    						
	    					               getActivity().finish();
	    					               startActivity(newActivity1);
	    					               break;
	    					               
		    		        	  case 2: 
	    					    	 
	    					        	   File directory2=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
	    								   File f2= new File(directory2,"Scelta");
	    							     String w2="Dimagrimento";
	    								   PrintWriter file2=null;
	    								try {
	    									file2 = new PrintWriter(f2);
	    								} catch (FileNotFoundException e) {
	    									// TODO Auto-generated catch block
	    									e.printStackTrace();
	    								}
	    								
	    								file2.write(w2);
	    								  file2.close();
	    								
	    						
	    					               getActivity().finish();
	    					               startActivity(newActivity1);
	    					               break;
		    		        	  case 3: 
	    					    	  
	    					        	   File directory3=new File(Environment.getExternalStorageDirectory()+"/PersonalTrainer/");
	    								   File f3= new File(directory3,"Scelta");
	    							     String w3="Rasodamento";
	    								   PrintWriter file3=null;
	    								try {
	    									file3 = new PrintWriter(f3);
	    								} catch (FileNotFoundException e) {
	    									// TODO Auto-generated catch block
	    									e.printStackTrace();
	    								}
	    								
	    								file3.write(w3);
	    								  file3.close();
	    								
	    						
	    					               getActivity().finish();
	    					               startActivity(newActivity1);
	    					        	   
	    					               break;
		    					     
		    					  
		    					    }
		    		        }

							
		    		
		    	  });
			
			
			return v;
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
		public void onResume() {
			   super.onResume();
			
			}

	}


