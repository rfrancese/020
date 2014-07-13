package femorali;

import it.unisa.personalTrainer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details4Fragment extends Fragment {

	
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
		text2.setText("Stacchi a gambe tese");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Stacchi a gambe tese è noto anche come Stiff-legged deadlift, Stiff leg deadlift, Stacco "
				+ "a gambe tese, Stacchi a gambe tese.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Stacchi a gambe tese è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Non disponibile.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta in piedi con la colonna vertebrale e le anche flesse in avanti. "
				+ "Il bilanciere è attaccato alle tibie, appoggiato a terra a circa 23 cm di altezza. La distanza tra i piedi "
				+ "(passo) è molto vicina alla distanza tra le spalle. L'angolo di apertura dei piedi è di circa 10°, ma con margine "
				+ "di modifica in base alle caratteristiche individuali; generalmente tra gli 8 ed i 20 gradi. Le spalle si trovano "
				+ "qualche centimetro più avanti del bilanciere da una visione laterale. Le braccia tese scendono immediatamente all'"
				+ "esterno delle gambe. Le ginocchia sono completamente estese o poco meno e di conseguenza tibia e perone sono "
				+ "perfettamente verticali o quasi. Anche e colonna vertebrale sono flesse quel tanto che basta per consentire all'"
				+ "atleta di raggiungere con le mani il bilanciere con le scapole addotte. La presa può essere supina, prona o mista"
				+ " (una mano supina e l'altra prona); quest'ultima conferisce una maggiore solidità. Le scapole sono abdotte. "
				+ "L'esecuzione consiste nell'estensione contemporanea di anche e colonna vertebrale. Per alleggerire il carico"
				+ " sulla colonna vertebrale, durante il movimento del bilanciere, questo deve essere mantenuto attaccato al corpo "
				+ "grazie ad un'estensione della spalla. Ginocchia e caviglie non modificano il proprio angolo per tutta la durata "
				+ "dell'esercizio. La posizione finale vede l'atleta con la schiena nella sua posizione di forza, le anche addotte e "
				+ "le ginocchia con lo stesso grado di flessione che avevano in partenza.\n");
	}
}

