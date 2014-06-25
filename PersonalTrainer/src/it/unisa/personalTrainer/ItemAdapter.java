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
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemAdapter extends ArrayAdapter<Item>{

	Context context;
	int layoutResourceId;
	ArrayList<Item> data = null;
    ArrayList<CheckBox> c2;
    
	public ItemAdapter(Context context, int layoutResourceId, ArrayList<Item> data) {
		super(context, layoutResourceId, data);
		this.layoutResourceId = layoutResourceId;
		this.context = context;
		this.data = data;
		c2=new ArrayList<>();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		MusclesHolder holder = null;
        
		if(row == null)
		{
			LayoutInflater inflater = ((Activity)context).getLayoutInflater();
			row = inflater.inflate(layoutResourceId, parent, false);

			holder = new MusclesHolder();
			holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
			holder.c=(CheckBox)row.findViewById(R.id.checkBox1);
			
			c2.add(holder.c);
			row.setTag(holder);
		}
		else
		{
			holder = (MusclesHolder)row.getTag();
		}

		Item m = data.get(position);
		holder.txtTitle.setText(m.day);

		
        
		return row;
	}

	public ArrayList<CheckBox> getCheckBox(){
		return c2;
	}
    public String getDay(int position){
    	return data.get(position).day;
    }
	public int getSize(){
		return data.size();
	}
	static class MusclesHolder
	{

		TextView txtTitle;
		CheckBox c;
	}
}
