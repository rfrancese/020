package glutei;

import it.unisa.personalTrainer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details1Fragment extends Fragment {

	
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
		text2.setText("Glutei alla Glutei Machine.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L' esercizio Glutei alla Glutei Machine è noto anche come Glutei Machine.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Glutei alla Glutei Machine è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Non disponibile.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("Distesi proni sulla macchina, regolarsi il rullo imbottito su una gamba all’altezza della caviglia. "
				+ "L’altra gamba rimane appoggiata sulla pedana dell’attrezzo. Le mani sono ancorate sugli appositi braccioli "
				+ "avanti al corpo. Flettere la gamba sul rullo imbottito fino a completa chiusura, poi lentamente tornare nella "
				+ "posizione di partenza. L’esercizio può essere svolto su un solo arto fino ha completare le serie suggerite, "
				+ "oppure alternando il lavoro su entrambi gli arti.\n");
	}
}

