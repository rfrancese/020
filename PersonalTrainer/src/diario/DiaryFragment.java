package diario;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import it.unisa.personalTrainer.R;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import dataBaseSqliteDate.DbAdapter;
import android.database.Cursor;
import android.graphics.Color;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;



	public class DiaryFragment extends Fragment {
	View v;
	public GregorianCalendar month, itemmonth;// calendar instances.

	public CalendarAdapter adapter;// adapter instance

	public ArrayList<String> items; // container to store calendar items which
	private DbAdapter dbHelper; 
    private Cursor cursor;		
	// needs showing the event marker
	ArrayList<String> event;
	LinearLayout rLayout;
	ArrayList<String> date;
	ArrayList<String> desc;
	LinearLayout day;
	TextView text;
	
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        // Inflate the layout for this fragment
	    	
	    	  //creazione database ok
	        
	    	/*dbHelper = new DbAdapter(getActivity());
	         dbHelper.open();

	   
	        
	 		      
	 		     
	    	getActivity().deleteDatabase("mydatabase.db");
	      /* dbHelper.createContact("ghjj", "5/6/2014");
	       dbHelper.createContact("kkkk", "5/6/2014");
	       dbHelper.createContact("uuuuuu", "5/6/2014");
	       dbHelper.createContact("iiiii", "5/6/2014");
	       dbHelper.createContact("oooo", "5/6/2014");
	       dbHelper.createContact("hhhh", "5/6/2014");
	       dbHelper.createContact("rrrrrr", "5/6/2014");
	       dbHelper.createContact("dfdfd", "5/6/2014");
	       dbHelper.createContact("rrrr", "5/6/2014");
	       dbHelper.createContact("ttt", "5/6/2014");
	       dbHelper.createContact("nnn", "5/6/2014");
	       dbHelper.createContact("iii", "5/6/2014");
	       dbHelper.createContact("kkkkkkkkkkk", "5/6/2014");
	       dbHelper.createContact("rjh", "5/6/2014");*/
	       /*  dbHelper.close();*/
	         
	         v= inflater.inflate(R.layout.calendar, container, false);
	         text = (TextView) v.findViewById(R.id.tvView);
	     

	 		month = (GregorianCalendar) GregorianCalendar.getInstance();
	 		itemmonth = (GregorianCalendar) month.clone();

	 		items = new ArrayList<String>();

	 		adapter = new CalendarAdapter(getActivity(), month);

	 		final GridView gridview = (GridView) v.findViewById(R.id.gridview);
	 		gridview.setAdapter(adapter);
	 		

	 		

	 		TextView title = (TextView) v.findViewById(R.id.title);
	 		title.setText(android.text.format.DateFormat.format("MMMM yyyy", month));

	 		RelativeLayout previous = (RelativeLayout) v.findViewById(R.id.previous);

	 		previous.setOnClickListener(new OnClickListener() {

	 			@Override
	 			public void onClick(View v) {
	 				setPreviousMonth();
	 				refreshCalendar();
	 			}
	 		});

	 		RelativeLayout next = (RelativeLayout) v.findViewById(R.id.next);
	 		next.setOnClickListener(new OnClickListener() {

	 			@Override
	 			public void onClick(View v) {
	 				setNextMonth();
	 				refreshCalendar();

	 			}
	 		});

	 		  
	            
	            
	 		gridview.setOnItemClickListener(new OnItemClickListener() {
	 			public void onItemClick(AdapterView<?> parent, View v,
	 					int position, long id) {
	 				
	 				
	 				TextView dayView = (TextView) v.findViewById(R.id.date); 
	 				String dayM=dayView.getText().toString();
	 				
	 			 	int mese;
	 		
	 				
	 				int anno=month.get(GregorianCalendar.YEAR);
	 				
	 				if(dayView.getCurrentTextColor()==Color.BLACK)
	 			        mese=month.get(GregorianCalendar.MONTH)+1;
	 				else{
	 					if(position >=0 && position < 15)
	 						mese=month.get(GregorianCalendar.MONTH);
	 						else
	 							mese=month.get(GregorianCalendar.MONTH)+2;	
	 				}
	 					
	 			    String m;
	 				String date=""+dayM+"/"+mese+"/"+anno;
	 				
	 				/*GregorianCalendar n=new GregorianCalendar();
	 		        int dayOfMonth = n.get(Calendar.DAY_OF_MONTH);
	 		        int month = n.get(Calendar.MONTH);
	 		        int year = n.get(Calendar.YEAR);*/
	 				
	 				String result=getExcercises(date);
	 				
	 				if(Integer.parseInt(dayM)<10)
	 					dayM=0+dayM;
	 				
	 				if(mese<10)
	 					m=""+0+mese;
	 				else
	 					m=""+mese;
	 				date=""+dayM+"/"+m+"/"+anno+"\n\n";

	 				if (result.equals(""))
	 				     result="\n"+date+"Nessun esercizio svolto";
	 				else
	 					result="\n"+date+result;
	 				/*AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
	 				builder.setTitle("Esercizi svolti")
	 				.setIcon( R.drawable.ic_launcher )
	 				.setMessage(result);
	 	
	 				AlertDialog alert = builder.create();
	 				alert.show();*/
	 				text.setText(result);

	 				}
	 				
	 	
	 	
	 			
	 			
	 		});
	 	
	 		
	 		
	        return v;
	    }

 	protected void setNextMonth() {
 		if (month.get(GregorianCalendar.MONTH) == month
 				.getActualMaximum(GregorianCalendar.MONTH)) {
 			month.set((month.get(GregorianCalendar.YEAR) + 1),
 					month.getActualMinimum(GregorianCalendar.MONTH), 1);
 		} else {
 			month.set(GregorianCalendar.MONTH,
 					month.get(GregorianCalendar.MONTH) + 1);
 		}

 	}

 	protected void setPreviousMonth() {
 		if (month.get(GregorianCalendar.MONTH) == month
 				.getActualMinimum(GregorianCalendar.MONTH)) {
 			month.set((month.get(GregorianCalendar.YEAR) - 1),
 					month.getActualMaximum(GregorianCalendar.MONTH), 1);
 		} else {
 			month.set(GregorianCalendar.MONTH,
 					month.get(GregorianCalendar.MONTH) - 1);
 		}

 	}

 	protected void showToast(String string) {
 		Toast.makeText(getActivity(), string, Toast.LENGTH_SHORT).show();

 	}

 	public void refreshCalendar() {
 		TextView title = (TextView) v.findViewById(R.id.title);

 		adapter.refreshDays();
 		adapter.notifyDataSetChanged();


 		title.setText(android.text.format.DateFormat.format("MMMM yyyy", month));
 	}

 	protected String getExcercises(String filter) {
 		 String ex="";
 		
 		 dbHelper = new DbAdapter(getActivity());
        dbHelper.open();

        
        cursor = dbHelper.fetchContactsByFilter(filter);
       
      
        
		 while ( cursor.moveToNext() ) {
		                
		    String excers = cursor.getString( cursor.getColumnIndex(DbAdapter.KEY_ESERCIZI));
		   ex=ex+excers +"\n";
		}           
		       cursor.close();
		       dbHelper.close();
		  return ex;       
 	}
}



