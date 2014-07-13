package addominali;

import it.unisa.personalTrainer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details5Fragment extends Fragment {


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
		text2.setText("Side Bend.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("Non disponibile.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Side Bend è un esercizio Monoarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Non disponibile.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("L'esercizio del side-bend inizia in posizione eretta, con le gambe leggermente divaricate, impugnando un "
				+ "manubrio per braccio per sollecitare entrambe le parti (modalità bilaterale), oppure impugnando un solo manubrio "
				+ "per sollecitare un solo lato (modalità monolaterale). L'esercizio consiste nell'eseguire una flessione laterale "
				+ "del busto dalla parte opposta rispetto al manubrio impugnato, oppure, se in modalità bilaterale, consiste nell'"
				+ "eseguire in alternanza una flessione laterale in entrambi i lati. Esistono altre varianti del side-bend come la"
				+ " modalità con bilanciere (barbell side-bend), la modalità al cavo basso alla poliercolina (cable side-bend) o "
				+ "sulla sedia romana usata normalmente per le iperestensioni del busto. N.B. può essere eseguito anche senza alcun "
				+ "sovraccarico.\n");
	}
}

