package dorsali;

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
		text2.setText("Pulley Basso");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Pulley Basso è noto anche "
				+ "come Narrow grip front cable rower.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Pulley Basso è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Rematore con bilanciere a presa supina, Rematore alla dorsy bar, Rematore con manubrio, Rematore con bilanciere a presa prona, Rematore al pulley orizzontale a presa prona.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta seduto con le anche flesse, le ginocchia semiflesse ed i piedi "
				+ "posizionati sugli appositi appoggi. L'esecuzione consiste "
				+ "nel estendere le spalle e contemporaneamente flettere i gomiti, addurre ed elevare parzialmente le scapole. "
				+ "L'azione termina quando la maniglia arriva a contatto con il busto senza che questo gesto venga completato con"
				+ " una flessione dei polsi. L'inclinazione del busto non viene modificata per tutta la durata dell'esercizio. E' "
				+ "possibile utilizzare la tecnica detta cheating con delle piccole distensioni degli arti inferiori.\n");
	}
}


