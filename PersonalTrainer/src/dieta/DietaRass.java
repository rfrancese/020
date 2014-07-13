package dieta;
import it.unisa.personalTrainer.R;


import it.unisa.personalTrainer.R.id;
import it.unisa.personalTrainer.R.layout;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DietaRass  extends Fragment {
View v;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.fragment_dieta_rass,
				container, false);
		return v;
	}
	

	public void onViewCreated(View view, Bundle savedInstanceState) {
	    super.onViewCreated(view, savedInstanceState);
	    
		TextView text1 = (TextView) view.findViewById(R.id.textView1);
		text1.setText("Consigli Alimentari per Rassodamento");

		TextView text19= (TextView) view.findViewById(R.id.textView19);
		text19.setText("Colazione:");
		
		TextView text2 = (TextView) view.findViewById(R.id.textView2);
		text2.setText("250 ml Latte scremato  + dolcificante + 4 fette biscottate integrali ");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Metà mattino:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("2 yogurt magri alla frutta 0,1% grassi");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Pranzo:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("80gr. pane +\n150gr. pollo/tacchino/200gr filetto /160 "
				+ "gr di tonno al naturale/ 100 gr di bresaola/100 gr di fesa di tacchino/150 "
				+ "gr di pesce/ 150 gr di simmenthal+\n verdura a volontà(1 cucchiaino d'olio d'oliva crudo) +\n1 mela");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Spuntino: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("2 fette biscottate +\n160 gr tonno al naturale/200gr. Simmenthal/80 gr di bresaola +\n 1 mela");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Cena:");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("50 gr pane +\n150 gr filetto magro /200 gr simmenthal /160 gr di tonno al naturale/ "
				+ "80 gr di bresaola/60 gr di fesa di tacchino/120 gr di pesce/ "
				+ "100 gr di simmenthal+\n verdura a volontà(1 cucchiaino d'olio d'oliva crudo) +\n1 mela");
		
		TextView text11= (TextView) view.findViewById(R.id.textView11);
		text11.setText("Attenzione:  ");
		
		TextView text12= (TextView) view.findViewById(R.id.textView12);
		text12.setText("Usa poco sale ma usalo. Pesa sempre i cibi a crudo. Non variare alimenti e quantitativi\n\n \\ = indica un'alternativa\n");
		
	
}



}
