package pettorali;

import it.unisa.personalTrainer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details7Fragment extends Fragment {

	
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
		text2.setText("Panca inclinata con manubri");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Distensioni su panca inclinata con manubri è noto anche come Dumbell "
				+ "inclined bench press, Inclined bench press with dumbells, Spinte su panca inclinata.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Distensioni su panca inclinata con manubri è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Distensioni su panca inclinata con bilanciere.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta seduto su una panca inclinata i 20° e i 45°, con la schiena nella "
				+ "sua posizione di forza le gambe divaricate ed i piedi saldamente appoggiati al terreno dietro le ginocchia per"
				+ " favorire il mantenimento delle tre curve naturali della schiena e per reggere più efficacemente il peso. I manubri"
				+ " sono tenuti alla stessa altezza dello"
				+ " sterno con una presa che può essere prona o neutra; quest'ultima è più corretta e particolarmente consigliata. "
				+ "L'esecuzione consiste nello spingere i manubri verso l'alto sul piano verticale "
				+ "perpendicolare al pavimento (non alla panca) su cui giacevano prima di iniziare, cercando quindi di tracciare un "
				+ "segmento di linea retta e non una curva. Durante la spinta, le spalle si flettono sul piano sagittale e si abducono"
				+ " sul piano longitudinale, mentre i gomiti si estendono e le scapole iniziano a ruotare verso l'alto nell'ultimo "
				+ "terzo di movimento. L'esecuzione termina con la completa estensione dei gomiti e poco prima che le braccia arrivino"
				+ " a trovarsi perpendicolari al terreno. E' possibile eseguire questo esercizio anche in versione unilaterale con "
				+ "conseguente maggiore stimolazione degli stabilizzatori della colonna. Durante tutta l'esecuzione dell'esercizio è "
				+ "consigliabile scaricare parte del peso sui piedi.\n");
	}
}


