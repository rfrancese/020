package dorsali;


import it.unisa.personalTrainer.R;
import it.unisa.personalTrainer.R.id;
import it.unisa.personalTrainer.R.layout;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details3Fragment extends Fragment {

	
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
		text2.setText("Lat Machine dietro");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Lat Machine dietro è noto anche "
				+ "come Back pull ups, Back pull ups at the bar, Rear pull ups, Rear pull ups at the bar.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Lat Machine dietro è un esercizio Multiarticolare/accessorio");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Lat Machine avanti.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta appeso alla sbarra con le mani che impugnano "
				+ "quest'ultima ad una distanza superiore a quella tra le spalle. "
				+ "Le spalle sono abdotte sul piano longitudinale, mentre i gomiti sono estesi e le scapole, "
				+ "ruotate verso l'alto, possono essere in elevazione o in depressione; in quest'ultimo caso non "
				+ "c'è l'azione 5. L'esecuzione consiste nel sollevarsi fino a toccare la barra con la parte superiore"
				+ " della schiena dietro il collo. Il movimento è perfettamente verticale così come lo è il corpo dell'atleta."
				+ " Osservando l'esercizio dal lato, occorre vedere l'avambraccio sullo stesso piano del corpo. Questa variante è "
				+ "mirata allo sviluppo dei fasci inferiori del grande dorsale che influenzano maggiormente la forma a “V” del torace;"
				+ " mentre nella flessione del gomito il carico verte maggiormente su brachioradiale e brachiale. Il coinvolgimento del "
				+ "grande pettorale è maggiore rispetto alla variante a presa prona davanti. ");
	}
}

