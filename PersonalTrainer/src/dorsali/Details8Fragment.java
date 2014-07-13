package dorsali;

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
		text2.setText("T-bar");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio T-bar è noto anche come Dorsy bar rower, T bar rower, "
				+ "Rematore alla barra T, Rematore alla T-bar.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("T-bar è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Rematore con bilanciere a presa supina, Rematore al pulley orizzontale con maniglia a presa stretta, "
				+ "Rematore alla dorsy bar, Rematore con manubrio, Rematore con bilanciere a presa prona, Rematore al "
				+ "pulley orizzontale a presa prona.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta in piedi sulla pedana della Dorsy bar con la schiena nella sua "
				+ "posizione di forza, ma con le scapole abdotte; le anche sono flesse a formare un angolo variabile a seconda"
				+ " della zona in cui si vuole concentrare lo sforzo. Le ginocchia sono semiflesse e la distanza tra i piedi è pari o "
				+ "leggermente superiore a quella tra le spalle. L'impugnatura può essere: 1) Supina con le mani poste ad una distanza pari "
				+ "a quella tra le spalle; 2) Neutra/prona sulle apposite maniglie; 3) Prona con le mani poste sulla barra ad una distanza "
				+ "superiore a quella tra le spalle. L'esecuzione consiste nel tirare la barra verso il torace attraverso un'adduzione/e"
				+ "levazione (varianti 1 e 2) o da un'adduzione (variante 3) scapolare prima, poi un'estensione (variante 1), o un'estension"
				+ "e/estensione trasversale (variante 2), o un'estensione trasversale (variante 3) accompagnata da una contemporanea flessi"
				+ "one del gomito. Il tutto senza modificare l'inclinazione del busto e senza modificare l'angolo delle ginocchia. In questo"
				+ " esercizio è possibile usare la tecnica del cheating con delle piccole estensioni delle ginocchia che possono essere ac"
				+ "compagnate da leggere estensioni delle anche. In ogni caso la schiena deve rimanere nella sua posizione di forza.\n");
	}
}


