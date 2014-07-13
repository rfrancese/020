package tricipiti;
import it.unisa.personalTrainer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details3Fragment extends Fragment {

	
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View v = inflater.inflate(R.layout.fragment_details3,
					container, false);
			return v;
		}
		
		public void onViewCreated(View view, Bundle savedInstanceState) {
		    super.onViewCreated(view, savedInstanceState);
		TextView text1 = (TextView) view.findViewById(R.id.textView1);
		text1.setText("Nome Esercizio:");

		TextView text2 = (TextView) view.findViewById(R.id.textView2);
		text2.setText("Distensioni su panca a presa stretta");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Distensioni su panca a presa stretta è noto anche come JM Press.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Distensioni alle parallele è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Non disponibile.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("Sdraiati con la schiena ben aderente alla panca. Afferrare il bilanciere con una presa medio stretta, appena"
				+ " più stretta delle spalle, tale da mantenere i gomiti affiancati al busto durante tutto il movimento. Espirando "
				+ "Sollevate il bilanciere , senza allargare eccessivamente  i gomiti. Inspirando tornate lentamente alla posizione"
				+ " iniziale. E' possibile seguire la variante di distensioni su panca a presa stretta per i tricipiti, utilizzando "
				+ "una presa più stretta e i gomiti più larghi, questa variante è più efficace sui tricipiti, coinvolge meno i"
				+ " pettorali, ma comporta un maggiore rischio per l'articolazioni dei polsi e dei gomiti.\n");
	}
}

