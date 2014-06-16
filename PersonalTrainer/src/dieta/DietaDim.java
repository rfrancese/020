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

	public class DietaDim  extends Fragment {
	View v;
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			v = inflater.inflate(R.layout.fragment_dieta_dim,
					container, false);
			return v;
		}
		
		public void onViewCreated(View view, Bundle savedInstanceState) {
		    super.onViewCreated(view, savedInstanceState);
		    
			TextView text1 = (TextView) view.findViewById(R.id.textView1);
			text1.setText("Consigli Alimentari per Dimagrimento");

			TextView text19= (TextView) view.findViewById(R.id.textView19);
			text19.setText("Colazione:");
			
			TextView text2 = (TextView) view.findViewById(R.id.textView2);
			text2.setText("250 ml Latte scremato  + dolcificante + 3 fette biscottate integrali");

			TextView text3 = (TextView) view.findViewById(R.id.textView3);
			text3.setText("Metà mattino:");

			TextView text4 = (TextView) view.findViewById(R.id.textView4);
			text4.setText("60gr di fesa di tacchino / 80gr di tonno al naturale + 1 cucchiaino d’olio extravergine di oliva");

			TextView text5 = (TextView) view.findViewById(R.id.textView5);
			text5.setText("Pranzo:");

			TextView text6 = (TextView) view.findViewById(R.id.textView6);
			text6.setText("50gr di riso basmati + 150gr. pollo/tacchino/200gr "
					+ "filetto /160 gr di tonno al naturale/ 100 gr di bresaola/100 gr di fesa di tacchino"
					+ "/200 gr di pesce/ 200 gr di simmenthal+ verdura a volontà + 1 mela(1 cucchiaino d'olio d'oliva crudo)");

			TextView text7 = (TextView) view.findViewById(R.id.textView7);
			text7.setText("Cena: ");

			TextView text8 = (TextView) view.findViewById(R.id.textView8);
			text8.setText("150 gr filetto magro /250 gr simmenthal /160 gr di"
					+ " tonno al naturale/ 100 gr di bresaola/100 gr di fesa di tacchino/200 gr di pesce/ 200 gr "
					+ "di simmenthal+ verdura a volontà + 1 mela(1 cucchiaino d'olio d'oliva crudo)");

			TextView text9 = (TextView) view.findViewById(R.id.textView9);
			text9.setText("Attenzione");

			TextView text10= (TextView) view.findViewById(R.id.textView10);
			text10.setText("Usa poco sale ma usalo. Pesa sempre i cibi a crudo. Non variare alimenti e quantitativi");
			
			TextView text11= (TextView) view.findViewById(R.id.textView11);
			text11.setText("Sabato sera e Domenica, tutto il giorno , fai alimentazione LIBERA.  ");
			
		
	}


}
