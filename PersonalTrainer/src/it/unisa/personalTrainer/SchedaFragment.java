package it.unisa.personalTrainer;


import java.util.ArrayList;

import dataBaseSqliteDate.DbAdapter;
import dataBaseSqliteSchede.DbAdapter2;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class SchedaFragment extends Fragment {

	ImageButton add;
	ImageButton delete;
	private DbAdapter2 dbHelper; 
    private Cursor cursor;	
	View v;
	ListView list;
	ItemAdapter adapter;
	boolean flag=false;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	    // Inflate the layout for this fragment
		
		 v=inflater.inflate(R.layout.fragment_scheda, container, false);
	     add=(ImageButton)v.findViewById(R.id.imageButton1);
	     delete=(ImageButton)v.findViewById(R.id.imageButton2);
	      list = (ListView) v.findViewById(R.id.listView1);
	      setListView();
	      
		  return  v;
	}
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
	    super.onViewCreated(view, savedInstanceState);
	   
		 list.setOnItemClickListener(new OnItemClickListener()
		    {
		        @Override public void onItemClick(AdapterView<?> arg0, View view,int position, long arg3)
		        {         
		        	 String day;
		        	 Intent intent;

		        	     day=adapter.getDay(position);
		        	     intent = new Intent(getActivity(),SchedaActivity.class);
		        	     intent.putExtra("Stringa1", day);
				         startActivity(intent);
		        
		        }
		    });
	
	   
	    add.setOnClickListener(new OnClickListener() {
 			@Override
 			public void onClick(View arg0) {
 				//vado alla prossima activity
 			   Intent intent = new Intent(getActivity(),AddSchedaActivity.class);
 		       startActivity(intent);
 			}
 			});
	    
	    delete.setOnClickListener(new OnClickListener() {
 			@Override
 			public void onClick(View arg0) {
 				
 				ArrayList<CheckBox> c= adapter.getCheckBox();
 				if(!flag){
 				for(int i=0;i<adapter.getSize();i++)
 					c.get(i).setVisibility(CheckBox.VISIBLE);
 					flag=true;
 				}
 				else{

	 					dbHelper = new DbAdapter2(getActivity());
	 			        dbHelper.open();
	 			        
 					for(int i=0;i<adapter.getSize();i++){
 						if(c.get(i).isChecked()){
 	 					c.get(i).setVisibility(CheckBox.VISIBLE);
 	 					String day=adapter.getDay(i);
 	 					

 	 			        cursor = dbHelper.fetchContactsByFilter(day);
 	 			        
 	 			        while(cursor.moveToNext())
 	 			        	dbHelper.deleteContact(cursor.getLong(cursor.getColumnIndex(DbAdapter2.KEY_CONTACTID)));
 	 			       	

 	 			        }
 	 			      }
 	 			        cursor.close();
 	 				     dbHelper.close();
 	 				     
 	 				   setListView();
 	 				   flag=false;
 						}
 					  
 				}
 				
 				
 			
 			});
	    
	    

	}
	
	public void setListView(){
		  
		   
		   ArrayList<Item> it=new ArrayList<>();
			String day[]={"n°1","n°2","n°3","n°4","n°5","n°6"};
			dbHelper = new DbAdapter2(getActivity());
	        dbHelper.open();
	        
	        for(int i=0;i<6;i++){
	       	 
	        cursor = dbHelper.fetchContactsByFilter2(day[i]);
	        if(cursor.moveToFirst()){
	       	 String d= cursor.getString(cursor.getColumnIndex(DbAdapter2.KEY_DAY));
		         it.add(new Item(d));
	        }

	       	
	        }
	        cursor.close();
		     dbHelper.close();
	            
			       
		  		  adapter = new ItemAdapter(getActivity(),
		  		  R.layout.list_item_2, it);
		  		   
		  		   
			list.setAdapter(adapter);
			list.setSelector( R.drawable.selector_list);
			
		
	}

	public void onStart()
	{
	super.onStart();
	}

	
	public void onResume() {
		super.onResume();
		
		setListView();

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