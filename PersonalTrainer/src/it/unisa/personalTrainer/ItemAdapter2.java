package it.unisa.personalTrainer;


import java.util.ArrayList;

import it.unisa.personalTrainer.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ItemAdapter2 extends ArrayAdapter<Item2>{

	Context context;
	int layoutResourceId;
	ArrayList<Item2> data ;
	ArrayList<TextView> str;
	ArrayList<View> layout;
	ArrayList<TextView>rec;
	ArrayList<TextView>eser;
	ArrayList<TextView>rip;
	MusclesHolder holder;

	public ItemAdapter2(Context context, int layoutResourceId, ArrayList<Item2> data) {
		super(context, layoutResourceId, data);
		this.layoutResourceId = layoutResourceId;
		this.context = context;
		this.data = data;
		str=new ArrayList<>();
		layout=new ArrayList<>();
		rec=new ArrayList<>();
		eser=new ArrayList<>();
		rip=new ArrayList<>();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		 holder = null;

		if(row == null)
		{
			LayoutInflater inflater = ((Activity)context).getLayoutInflater();
			row = inflater.inflate(layoutResourceId, parent, false);

			holder = new MusclesHolder();
			holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
			holder.txtTitle1 = (TextView)row.findViewById(R.id.txtTitle1);
			holder.txtTitle2 = (TextView)row.findViewById(R.id.txtTitle2);
			holder.txtTitle3 = (TextView)row.findViewById(R.id.txtTitle3);
			holder.txtTitle4 = (TextView)row.findViewById(R.id.txtTitle4);
			
			layout.add(row);
			str.add(holder.txtTitle2);
			rec.add(holder.txtTitle4);
			eser.add(holder.txtTitle1);
			rip.add(holder.txtTitle3);
			row.setTag(holder);
		}
		else
		{
			holder = (MusclesHolder)row.getTag();
		}

		Item2 m = data.get(position);
		holder.txtTitle.setText(m.gr);
		holder.txtTitle.setTextColor(Color.WHITE);
		holder.txtTitle.setTextSize(16);
		holder.txtTitle1.setText(m.es);
		holder.txtTitle1.setTextColor(Color.WHITE);
		holder.txtTitle1.setTextSize(16);
		holder.txtTitle2.setText(m.ser);
		holder.txtTitle2.setTextColor(Color.WHITE);
		holder.txtTitle2.setTextSize(16);
		holder.txtTitle3.setText(m.rip);
		holder.txtTitle3.setTextColor(Color.WHITE);
		holder.txtTitle3.setTextSize(16);
		holder.txtTitle4.setText(m.rec);
		holder.txtTitle4.setTextColor(Color.TRANSPARENT);
		holder.txtTitle4.setTextSize(6);
	

		return row;
	}
	
	public ArrayList<TextView> getStr(){
		return str;
	}
	
	public ArrayList<TextView> geRec(){
		return rec;
	}
	public ArrayList<TextView> getRip(){
		return rip;
	}
	public ArrayList<TextView> geEser(){
		return eser;
	}
	public ArrayList<View> getLayout(){
		return layout;
	}
	
	public int getSize(){
	return data.size();
	}
	static class MusclesHolder
	{
		TextView txtTitle;
		TextView txtTitle1;
		TextView txtTitle2;
		TextView txtTitle3;
		TextView txtTitle4;
		
		LinearLayout l;
	}
}
