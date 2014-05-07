package accessori;

import it.unisa.personaltrainer.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MusclesAdapter extends ArrayAdapter<Muscles>{

	Context context;
	int layoutResourceId;
	Muscles data[] = null;

	public MusclesAdapter(Context context, int layoutResourceId, Muscles[] data) {
		super(context, layoutResourceId, data);
		this.layoutResourceId = layoutResourceId;
		this.context = context;
		this.data = data;
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
			holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
			holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);

			row.setTag(holder);
		}
		else
		{
			holder = (MusclesHolder)row.getTag();
		}

		Muscles m = data[position];
		holder.txtTitle.setText(m.title);
		holder.imgIcon.setImageResource(m.icon);

		return row;
	}

	static class MusclesHolder
	{
		ImageView imgIcon;
		TextView txtTitle;
	}
}
