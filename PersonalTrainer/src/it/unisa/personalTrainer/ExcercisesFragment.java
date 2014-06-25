package it.unisa.personalTrainer;

import pettorali.PectoralActivity;
import polpacci.PolpacciActivity;
import quadricipiti.QuadricipitiActivity;
import femorali.FemoralActivity;
import glutei.GluteiActivity;
import it.unisa.personalTrainer.R;
import adduttori_abductori.AddAbducActivity;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class ExcercisesFragment extends Fragment {
    
private ListView list;
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    // Inflate the layout for this fragment
	
	View v=inflater.inflate(R.layout.fragment_excercises, container, false);
	
	 list = (ListView)v.findViewById(R.id.listView1);
	    Muscles data[] = new Muscles[]
	  		  {

	  		  new Muscles(R.drawable.pettorali, "Pettorali"),
	  		  new Muscles(R.drawable.addominali, "Addominali"),
	  		  new Muscles(R.drawable.deltoidi, "Deltoidi"),
	  		  new Muscles(R.drawable.bicipiti, "Bicipiti"),
	  		  new Muscles(R.drawable.tricipiti, "Tricipiti"),
	  		  new Muscles(R.drawable.dorsali, "Dorsali"),
	  		  new Muscles(R.drawable.aduttori, "Aduttori e Abductori"),
   		      new Muscles(R.drawable.quadricipite, "Quadricipiti"),
   		      new Muscles(R.drawable.glutei, "Glutei"),
   		      new Muscles(R.drawable.femorali, "Femorali"),
   		      new Muscles(R.drawable.polpacci, "Polpacci"), 
	  		  };
	  		   
	  		  MusclesAdapter adapter = new MusclesAdapter(getActivity(),
	  		  R.layout.list_item, data);
	  		   
	  		   
		list.setAdapter(adapter);
		list.setSelector( R.drawable.selector_list);
    		
    		  
    return  v;
}
@Override
public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
   
	
	list.setOnItemClickListener(new OnItemClickListener()
    {
        @Override public void onItemClick(AdapterView<?> arg0, View view,int position, long arg3)
        {           
        	  switch( position ) {
     	     case 0:  
 	    	           Intent newActivity1 = new Intent(view.getContext(), PectoralActivity.class);     
	                   startActivity(newActivity1);
	                   break;
     	     case 1:  
     	    	      Intent newActivity2 = new Intent(view.getContext(), AbdominalActivity.class);     
     	              startActivity(newActivity2);
     	              break;
     	  
     	     case 2:  Intent newActivity3 = new Intent(view.getContext(), DeltoidiActivity.class);     
     	              startActivity(newActivity3);
     	              break;
     	     
     	     case 3:  Intent newActivity4 = new Intent(view.getContext(), BicipitiActivity.class);     
     	              startActivity(newActivity4);
     	              break;
     	     case 4:  
     	    	      Intent newActivity5 = new Intent(view.getContext(), TricepsActivity.class);     
                     startActivity(newActivity5);
                     break;
             
     	     case 5:  
       	              Intent newActivity6 = new Intent(view.getContext(), DorsaliActivity.class);     
                     startActivity(newActivity6);
                     break;
     	     case 6:  
     	    	      Intent newActivity7 = new Intent(view.getContext(), AddAbducActivity.class);     
     	              startActivity(newActivity7);
     	              break;
     	       
     	    case 7:  
	    	      Intent newActivity8 = new Intent(view.getContext(), QuadricipitiActivity.class);     
	              startActivity(newActivity8);
	              break;
     	     case 8:  
	    	      Intent newActivity9 = new Intent(view.getContext(), GluteiActivity.class);     
	              startActivity(newActivity9);
	              break;
     	    case 9:  
	    	      Intent newActivity10 = new Intent(view.getContext(), FemoralActivity.class);     
	              startActivity(newActivity10);
	              break;
	              
     	    case 10:  
	    	      Intent newActivity11 = new Intent(view.getContext(), PolpacciActivity.class);     
	              startActivity(newActivity11);
	              break;
     	    	
     		    	 
     	    }
        }
    });

}


}


