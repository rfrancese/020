package pettorali;

import it.unisa.personalTrainer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details8Fragment extends Fragment {

	
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
		text2.setText("Distensioni su panca inclinata con bilanciere.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Distensioni su panca inclinata "
				+ "con bilanciere è noto anche come Inclined bench press, Panca inclinata.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Distensioni su panca inclinata con bilanciere è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Distensioni su panca inclinata con manubri.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta seduto su una panca inclinata tra i 20° e i 45°, con la schiena "
				+ "nella sua posizione di forza le gambe divaricate ed i piedi saldamente appoggiati al terreno dietro le ginocchia. "
				+ " L'esecuzione consiste nello spingere il bilanciere verso l'alto sul piano "
				+ "verticale perpendicolare al pavimento (non alla panca) su cui giaceva prima di iniziare, cercando quindi di "
				+ "tracciare un segmento di linea retta. Durante la spinta, le spalle si flettono sul piano sagittale e si abducono"
				+ " sul piano longitudinale, mentre i gomiti si estendono e le scapole iniziano a ruotare verso l'alto nell'ultimo "
				+ "terzo del movimento. L'esecuzione termina con la completa estensione dei gomiti. Durante tutta l'esecuzione dell'"
				+ "esercizio è consigliabile scaricare parte del peso sui piedi. La corretta esecuzione di questo esercizio richiede "
				+ "una buona mobilità della spalla nel primo terzo del movimento per mantenere la posizione sopra descritta.Quando "
				+ "esegui l'esercizio Distensioni su panca inclinata con bilanciere ricorda sempre chele spinta delle gambe e "
				+ "l'equilibrio dei muscoli della cintura addominale sono essenziali per una corretta esecuzione. I polsi non devono"
				+ " piegarsi indietro. al culmine della fase negativa l'avambraccio visto dal lato deve essere perpendicolare al "
				+ "pavimento. Alzare i glutei è considerato pericoloso per la schiena che in questo esercizio si trova in carico; "
				+ "mentre alzare i piedi o basculare sono considerati semplicemente errori. Terminare la distensione con le braccia "
				+ "esattamente perpendicolari al terreno toglie molta tensione sui muscoli interessati.\n");
	}
}


