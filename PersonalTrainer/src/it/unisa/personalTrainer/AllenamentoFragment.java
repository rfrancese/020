package it.unisa.personalTrainer;


import it.unisa.personalTrainer.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class AllenamentoFragment extends Fragment {

	
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View v = inflater.inflate(R.layout.fragment_allenamento,
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
			
			
			
			
			return v;
		}
	}


