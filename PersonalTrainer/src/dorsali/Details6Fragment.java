package dorsali;

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
		text2.setText("Rematore con bilanciere.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Rematore con bilanciere è noto anche come Barbell rower, Rower, Rematore con bilanciere, Rematore.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Rematore con bilanciere è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Rematore con bilanciere a presa supina, Rematore al pulley orizzontale con maniglia a presa stretta,"
				+ " Rematore alla dorsy bar, Rematore con manubrio, Rematore al pulley orizzontale a presa prona.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta in piedi con la schiena nella sua posizione di forza, ma con le "
				+ "scapole abdotte; le anche sono flesse a formare un angolo variabile a seconda della zona in cui si vuole "
				+ "concentrare lo sforzo. Le ginocchia sono semiflesse e la distanza tra i piedi è pari o leggermente superiore a "
				+ "quella tra le spalle. Le mani impugnano il bilanciere con una presa prona ad una distanza superiore a quella tra "
				+ "le spalle. A seconda del grado di flessione delle anche il bilanciere si può trovare poco sotto o poco sopra le"
				+ " ginocchia, ma in ogni caso a contatto con le gambe. L'esecuzione consiste nell'addurre ed elevare le scapole "
				+ "estendere prima, ed estendere le spalle sia sul piano trasversale che su quello sagittale e contemporaneamente "
				+ "flettere i gomiti, poi. L'esecuzione termina quando Il bilanciere arriva a contatto con il busto. Il movimento "
				+ "più efficiente è quello che traccia un segmento di linea retta, quindi il bilanciere è a contatto con il corpo "
				+ "solo all'inizio e alla fine. I gradi di flessione di anche e ginocchia dovrebbero rimanere invariati per tutta la"
				+ "durata del esercizio, tuttavia è possibile estendere parzialmente le ginocchia e/o le anche durante la fase "
				+ "concentrica del movimento come tecnica di cheating. In ogni caso la schiena deve rimanere sempre nella sua"
				+ " posizione di forza. Più le anche sono flesse, più è ampio il range di movimento di estensione della spalla,"
				+ " di flessione del gomito e di adduzione scapolare; viceversa con le anche poco flesse e quindi un busto quasi "
				+ "verticale, l'azione principale diventa l'elevazione scapolare. Questa variante concentra maggiormente lo sforzo "
				+ "sugli estensori trasversali della spalla a scapito di quelli sagittali, man mano che si allarga la presa e si "
				+ "inclina il busto in avanti. A livello di flessione del gomito, la presa prona favorisce il brachioradiale ed "
				+ "il brachiale.\n");
	}
}

