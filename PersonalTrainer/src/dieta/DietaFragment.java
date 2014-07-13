package dieta;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;

import it.unisa.personalTrainer.R;
import it.unisa.personalTrainer.Utente;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;

public class DietaFragment extends Fragment {

	
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View v = inflater.inflate(R.layout.fragment_dieta,
					container, false);
			
			
			 Button btn1 = (Button) v.findViewById(R.id.button1);
 			 btn1.setOnClickListener(new OnClickListener() {
 			@Override
 			public void onClick(View arg0) {
 				//vado alla prossima activity
 				Intent intent = new Intent(getActivity(),DieteActivity.class);
 		       startActivity(intent);
 			}
 			});
 			
 			 ImageView img = (ImageView) v.findViewById(R.id.imageView2);
 			 
 			 TextView line = (TextView) v.findViewById(R.id.textView1);
 			line.setText("|");
 			int coord=-10;
			line.setX(coord);
			
			Utente u=getUtente();
			
			int peso=Integer.parseInt(u.getPeso());
	  		double h=Integer.parseInt(u.getAltezza())*0.01;
	  		double BMI=peso/(h*h);
	  		
	  		float value=0;
	  		
	  		if(BMI < 15)
	  			value=(float)BMI*7-5;
	  		
	  		else if(BMI >= 15 && BMI <18)
                   value=(float)BMI*8-9;
	  		
	  		else if(BMI >=18 && BMI <21)
	  			value=(float)BMI*8+6;
	  		
	  		else if(BMI >= 21 && BMI <=25)
	  			value=(float)BMI*9-2;
	  		
	  		else if(BMI > 25 && BMI <30)
	  			value=(float) BMI*10-15;
	  		
	  		else if (BMI >= 30 && BMI <=32)
	  			value=(float) BMI*10-10;
	  		
	  		else if (BMI > 32 && BMI <=35)
	  			value=(float) BMI*10;
	  		
	  		else if(BMI > 35 && BMI <=40)
	  			value=(float) BMI*10+10;
	  		
	  		else if(BMI > 40 && BMI <=50)
	  			value=(float) BMI*10+20;
	  		else
	  			value=(float) 50*10+20;
	  					
	  		
	  		line.setX(value);
	  		
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
	}

