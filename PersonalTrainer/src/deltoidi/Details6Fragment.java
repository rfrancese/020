package deltoidi;

import it.unisa.personalTrainer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details6Fragment extends Fragment {

	
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
		text2.setText("Spinte con manubri.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Spinte con manubri seduto è noto anche come Dumbell seated military press, "
				+ "Dumbell seated shoulder press.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Spinte con manubri è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Distensioni sopra la nuca con manubri in piedi, Distensioni dietro la nuca con manubri in piedi,"
				+ " Distensioni dietro la nuca con manubri da seduto.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta seduto su una panca inclinata a circa 75°, con la schiena nella "
				+ "sua posizione di forza le gambe divaricate ed i piedi saldamente appoggiati al terreno dietro le ginocchia "
				+ "per favorire il mantenimento delle tre curve naturali della schiena e per reggere più efficacemente il peso. "
				+ " L'esecuzione termina"
				+ " con la completa estensione dei gomiti e poco prima che le braccia arrivino a trovarsi perpendicolari al terreno."
				+ " E' possibile eseguire questo esercizio anche in versione unilaterale con conseguente maggiore stimolazione degli "
				+ "stabilizzatori della colonna. L'esecuzione di questo esercizio richiede una discreta mobilità della spalla se non"
				+ " la si tiene completamente abdotta sul piano trasversale, mentre è necessaria una buona mobilità della spalla per "
				+ "tenerla completamente abdotta sul piano trasversale.\n");
	}
}

