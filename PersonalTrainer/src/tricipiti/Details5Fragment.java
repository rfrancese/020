package tricipiti;

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
		text2.setText("Kickback");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Kickback è noto anche come tricep dumbbell kickback.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Tricipiti Kickback è un esercizio Monoarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Triceps-extension machine.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("Esecuzione dei Kickback con manubri, ovvero le estensioni  unilaterali per i tricipiti con manubrio. "
				+ "Appoggiate una mano e un ginocchio su una panca, con il tronco parallelo al suolo e alla panca. Con l'altra mano"
				+ "afferrate un manubrio, con una presa neutra.Con il gomito piegato e fisso al fianco e l'avambraccio perpendicolare"
				+ " al suolo. Espirando raddrizzate il gomito spostando indietro il manubrio, sollevandolo il più possibile."
				+ "Inspirando tornate nella posizione di partenza.Alternare una serie con un braccio e poi con l'altro.E' possibile"
				+ " eseguire i Kickback con due manubri (bilaterale), ma si consiglia la versione unilaterale, perchè permette di "
				+ "scaricare, con il braccio poggiato sulla panca, lo stress a carico dei lombari e della schiena, che si verifica "
				+ "appunto nella versione bilaterale.\n");
	}
}

