package quadricipiti;

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
		text2.setText("Leg press ");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Leg press a 45 gradi è noto anche come 45 Degree leg press, Pressa a 45°.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Leg press a 45 gradi è un esercizio Multiarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Leg press orizzontale, Squat al multipower.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta seduto nella macchina, con le ginocchia flesse ed i piedi sull'apposita"
				+ " pedana, in modo che: la schiena sia nella sua posizione di forza a contatto con lo schienale, la parte posteriore "
				+ "dei glutei sia a contatto con lo schienale e la parte inferiore dei glutei sia a contatto con il sedile. Quando "
				+ "possibile, è consigliabile regolare l'inclinazione dello schienale in modo tale da rendere confortevole il "
				+ "movimento in tutta la sua escursione, senza modificare quanto descritto sopra. I piedi (passo) sono posti ad una "
				+ "distanza pari o superiore a quella tra le spalle ed il grado di apertura varia in funzione del passo, tra i 10° "
				+ "(passo larghezza spalle) e i 45° (passo molto più largo delle spalle), ma con margini di modifica in base alle "
				+ "caratteristiche individuali. Avvicinando i piedi al margine superiore della pedana, si riduce il grado di "
				+ "allungamento del quadricipite e si aumenta quello di semimembranoso, semitendinoso e capo lungo del bicipite "
				+ "femorale, favorendo il coinvolgimento di questo gruppo muscolare nell'estensione dell'anca in fase concentrica. "
				+ "Viceversa accade quando si avvicinano i piedi al margine inferiore della pedana. In ogni caso è sempre "
				+ "sconsigliabile abbassare i piedi a tal punto da trovarsi con le ginocchia oltre le punte dei piedi al termine "
				+ "o durante la fase eccentrica. L'esecuzione consiste nello spingere la pendana verso l'alto (oppure il sedile "
				+ "indietro, a seconda della macchina) in modo da poter rimuovere i fermi di sicurezza attraverso le apposite "
				+ "maniglie (in alcune macchine non ci sono fermi); a questo punto inizia la fase eccentrica del movimento con una "
				+ "flessione contemporanea di anche, ginocchia e le caviglie (flessione dorsale) fino a che è possibile mantenere "
				+ "invariata la posizione del resto del corpo. La fase concentrica vede l'atleta eseguire contemporaneamente "
				+ "un'estensione anche e ginocchia insieme ad una flessione plantare (senza però staccare i talloni dall'appoggio). "
				+ "L'esecuzione termina pochi istanti prima che le ginocchia si trovino ad essere completamente estese."
				+ " In ogni parte dell'esecuzione le ginocchia devono rimanere allineate con i piedi.\n");
	}
}

