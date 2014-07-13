package glutei;
import it.unisa.personalTrainer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details2Fragment extends Fragment {

	
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
		text2.setText("Hyperextension gamba singola.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Hyperextension è noto anche come Iperestensioni gamba singola.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Iperestensioni gamba singola è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Non disponibile.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta in posizione prona con i quadricipiti appoggiati sull'apposita panca "
				+ "e la parte posteriore delle caviglia a a contatto con la faccia inferiore dei fermi. La schiena può essere nella "
				+ "sua posizione di forza (variante 1) o completamente flessa (variante 2), di conseguenza le anche possono essere "
				+ "flesse il più possibile (secondo le variabili individuali), ma senza perdere la posizione di forza della schiena "
				+ "(variante 1); oppure flesse al massimo (variante 2). L'esecuzione della variante 1 consiste nell'estendere le "
				+ "anche ed eventualmente iperestendere la colonna vertebrale oppure mantenere quest'ultima nella sua posizione di "
				+ "forza. Le mani possono essere tenute (da più facile a più difficile) incrociate sul petto, appoggiate sulle tempie, "
				+ "oppure davanti alla testa con le spalle completamente flesse; nella prima e nella terza opzione è possibile"
				+ " reggere un disco o un manubrio per sovraccaricare. L'esecuzione della variante 2 consiste nell'estendere le anche,"
				+ " la colonna vertebrale ed il capo fino al livello di estensione o di iperestensione. In questo modo le mani "
				+ "possono essere tenute incrociate sul petto, o appoggiate sulle tempie, con possibilità di reggere un disco o un "
				+ "manubrio nella prima opzione.\n");
	}
}

