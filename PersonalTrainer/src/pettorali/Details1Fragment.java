package pettorali;

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
		text2.setText("Croci ai cavi");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Croci ai cavi è noto anche come Cable crossover.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Croci ai cavi è un esercizio Monoarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Croci su panca inclinata con manubri.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("Afferrate le impugnature a staffa delle due pulegge alte con un presa in pronazione "
				+ "(palmi rivolti verso il basso) e le braccia leggermente più in alto delle spalle. "
				+ "Piegatevi in avanti di circa 15 gradi, con la schiena nella sua naturale posizione inarcata. Nella posizione "
				+ "iniziale, le braccia si trovano infuori ed ai lati, perpendicolari al corpo, coi gomiti leggermente piegati e "
				+ "bloccati in questa angolazione. Inspirate e trattenete il respiro mentre iniziate a tirare le impugnature verso "
				+ "il basso con le braccia relativamente dritte. Mentre vi avvicinate ai lati del tronco, portate le braccia "
				+ "leggermente in avanti fino a toccare o incrociare appena. Dopo aver mantenuto per un attimo la posizione "
				+ "inferiore, iniziate ad espirare e riportate le braccia alla posizione iniziale. Mantenete il corpo stabile "
				+ "durante tutto l'esercizio.\n");
	}
}

