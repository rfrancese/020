package pettorali;

import it.unisa.personalTrainer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details9Fragment extends Fragment {

	
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
		text2.setText("Distensioni su panca piana con manubri.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Distensioni su panca piana con manubri è noto anche come Dumbell bench press,"
				+ " Bench press with dumbells, spinte con manubri su panca.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Distensioni su panca piana con manubri è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Distensioni su panca piana con bilanciere.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta sdraiato supino su una panca piana con glutei, parte alta "
				+ "della schiena, scapole e nuca sempre a contatto con essa e con i piedi appoggiati saldamente al terreno "
				+ "verticalmente sotto, o dietro le ginocchia, ma mai davanti. Le anche sono abdotte e gli arti inferiori "
				+ "spingono sul pavimento in modo equilibrato per garantire stabilità alla posizione. I flessori della colonna "
				+ "sono in posizione di allungamento, ma in contrazione isometrica, mentre gli estensori sono in accorciamento; "
				+ "entrambi lavorano in equilibrio per garantire continuità tra arti inferiori e arti superiori. Le scapole sono "
				+ "addotte, né depresse, né elevate. Quella appena descritta non è altro che la posizione di forza della schiena,"
				+ " quindi è perfettamente normale che a livello della lordosi lombare fisiologica, non ci sia contatto con la panca."
				+ " Le braccia sono tese, le spalle flesse in misura variabile, con un massimo di 90° (braccia perpendicolari al"
				+ " terreno) e l'impugnatura dei bilanciere può essere prona o neutra. Al variare della distanza tra le mani, "
				+ "corrispondono un diverso grado di flessione delle spalle ed un diverso collocamento spaziale dei manubri. La "
				+ "posizione di partenza con una distanza tra le mani relativamente stretta vede quindi l'atleta con le spalle "
				+ "leggermente meno flesse sul piano sagittale ed i manubri sopra la parte superiore dell'addome/bassa del petto, "
				+ "rispetto alla posizione di partenza distanza maggiore tra le mani in cui le spalle possono arrivare ad un grado "
				+ "di flessione sul piano sagittale vicino ai 90° posizionando così i manubri sopra la parte alta del pettorale. "
				+ "L'esecuzione consiste nell'abbassare i manubri sul piano verticale fino a che consentito dalla mobilità individuale."
				+ " Questo movimento deve tracciare un segmento di linea retta che tende a far divergere i manubri verso il "
				+ "corrispettivo lato del coropo. Al termine della discesa, da una visione laterale l'avambraccio deve risultare "
				+ "perpendicolare al terreno e si consiglia una presa neutra quando si utilizzano manubri grossi per evitare che "
				+ "questi vengano a contatto con il corpo. A questo punto, l'atleta spinge i manubri verso l'alto facendogli "
				+ "ripercorrere l'esatta traiettoria che ha tracciato durante la discesa, fino a tornare nella posizione di "
				+ "partenza.\n");
	}
}

