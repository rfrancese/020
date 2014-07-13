package pettorali;

import it.unisa.personalTrainer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details11Fragment extends Fragment {

	
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
		text2.setText("Pullover con manubrio.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Pullover con manubrio è noto anche come Pull over, Dumbell pull over.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Pullover con manubrio è un esercizio Monoarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Pull alla macchina, Pull over con bilanciere, Pull over alla Lat machine.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta sdraiato supino su una panca piana con glutei, parte alta della"
				+ " schiena, scapole e testa sempre a contatto con essa e con i piedi appoggiati saldamente al terreno. Le spalle"
				+ " sono intraruotate o parzialmente extraruotate e completamente o quasi completamente flesse a seconda della "
				+ "mobilità individuale. I gomiti sono quasi completamente estesi e non dovrebbero esserci modifiche nel loro angolo "
				+ "per tutta la durata dell'esercizio. Il manubrio è tenuto da entrambe le mani come in fotografia; è anche possibile"
				+ " utilizzare dischi con maniglie o kettlebells. L'esecuzione consiste nell'estendere le spalle fino a trovarsi con "
				+ "le braccia quasi perpendicolari al terreno, per mantenere la tensione costante sui muscoli interessati; è quindi "
				+ "opportuno, terminare l'esecuzione quando il manubrio si trova sopra la fronte dell'atleta.\n");
	}
}

