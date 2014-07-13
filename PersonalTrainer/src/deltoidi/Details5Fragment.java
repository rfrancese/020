package deltoidi;

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
		text2.setText("Lento avanti con bilanciere da seduto.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Lento avanti con bilanciere da seduto è noto anche come Seated military press, Seated front "
				+ "military press, Seated shoulder press, Distensioni sopra la nuca con bilanciere da seduto.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Lento avanti con bilanciere da seduto è un esercizio Base.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Lento avanti con bilanciere in piedi, Lento dietro con bilanciere in piedi, Lento dietro con bilanciere"
				+ "da seduto, Push press davanti, Push press dietro.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta seduto su una panca inclinata a circa 75°, con la schiena nella sua "
				+ "posizione di forza le gambe divaricate ed i piedi saldamente appoggiati al terreno dietro le ginocchia per"
				+ " favorire il mantenimento delle tre curve naturali della schiena e per reggere più efficacemente il peso. "
				+ "I gomiti sono flessi, i polsi dritti e le spalle sono addotte ed extraruotate in modo che gomito, polso e "
				+ "bilanciere siano esattamente sul piano verticale da una visione di lato. Il bilanciere è appoggiato sulla parte "
				+ "alta dello sterno o sulle clavicole oltre che sulle mani che lo afferrano ad una distanza variabile, ma sempre "
				+ "superiore a quella tra le spalle. L'esecuzione consiste nello spingere il bilanciere verso l'alto sul piano"
				+ "verticale su cui giaceva prima di iniziare, cercando quindi di tracciare un segmento di linea retta. Durante la "
				+ "spinta, le spalle si flettono sul piano sagittale e si abducono sul piano longitudinale, mentre i gomiti si "
				+ "estendono e le scapole iniziano a ruotare verso l'alto quando i gomiti si trovano all'altezza delle spalle o "
				+ "poco più in alto. L'esecuzione termina con la completa estensione dei gomiti. Durante tutta l'esecuzione "
				+ "dell'esercizio è consigliabile scaricare parte del peso sui piedi. Questo è l'esercizio base di distensione "
				+ "sopra la nuca e la corretta esecuzione richiede una buona mobilità della spalla.\n");
	}
}

