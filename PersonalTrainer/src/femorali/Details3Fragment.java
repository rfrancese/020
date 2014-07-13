package femorali;
import it.unisa.personalTrainer.R;

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
		text2.setText("Mezzi stacchi alla rumena.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Mezzi stacchi alla rumena � noto anche come Romenian half deadlift, Romenian deadlift, Stacchi alla rumena, Stacco alla rumena.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Mezzi stacchi alla rumena � un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Iperestensioni, Iperestensioni inverse.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta in posizione eretta con le scapole addotte e le ginocchia leggermente"
				+ " flesse ed il bilanciere tenuto nelle mani. La distanza tra i piedi (passo) deve essere molto vicina alla distanza"
				+ " tra le spalle. L'esercizio inizia dalla fase negativa, ovvero con la sola flessione delle anche accompagnata da una "
				+ "flessione molto controllata della spalla sul piano sagittale per mantenere sul piano verticale la traiettoria del "
				+ "bilanciere senza che questi si stacchi dalle gambe. Le altre articolazioni non subiscono modifiche a livello di "
				+ "angolo. La fase di discesa termina nel punto oltre al quale non � pi� possibile mantenere la schiena nella sua "
				+ "posizione di forza. L'esecuzione consiste nel sollevare il bilanciere verticalmente grazie all'esclusiva forza "
				+ "dell'estensione delle anche, accompagnata da un'estensione delle spalle sul piano sagittale, fino al ritorno alla "
				+ "posizione di partenza.\n");
	}
}

