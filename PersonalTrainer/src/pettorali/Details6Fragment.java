package pettorali;

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
		text2.setText("Distensioni su panca declinata con bilanciere.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Distensioni su panca declinata con bilanciere è noto anche come Declined bench press, Panca declinata.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Distensioni su panca declinata con bilanciere è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Distensioni su panca declinata con manubri.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta seduto su una panca declinata tra i 10° e i 30°, con la schiena nella "
				+ "sua posizione di forza le gambe divaricate ed i piedi saldamente appoggiati al terreno dietro le ginocchia o meglio"
				+ " ancora bloccati negli appositi fermi, quando presenti. I gomiti sono flessi, i polsi dritti e le spalle sono"
				+ " addotte e orientate in modo che gomito, polso e bilanciere siano esattamente allineati sullo stesso piano "
				+ "verticale perpendicolare al pavimento (non alla panca) da una visione di lato. Il bilanciere è appoggiato "
				+ "sulla parte più bassa dello sterno o sulla parte superiore dell'addome oltre che sulle mani che lo afferrano ad "
				+ "una distanza variabile pari o superiore a quella tra le spalle. L'esecuzione consiste nello spingere il bilanciere"
				+ " verso l'alto sul piano verticale su cui giaceva prima di iniziare, cercando quindi di tracciare un segmento di "
				+ "linea retta. Durante la spinta, le spalle si flettono sul piano sagittale e si adducono sul piano longitudinale, "
				+ "mentre i gomiti si estendono e le scapole iniziano ad abdursi ed a ruotare verso il basso nell'ultimo terzo del "
				+ "movimento. L'esecuzione termina con la completa estensione dei gomiti.\n");
	}
}

