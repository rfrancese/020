package pettorali;
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
		text2.setText("Croci su panca inclinata con manubri.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Croci su panca inclinata con manubri è noto anche come Inclined bench dumbell crossover..");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Croci su panca inclinata con manubri è un esercizio Monoarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Croci su panca inclinata ai cavi.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta seduto su una panca inclinata di 45°, con la schiena nella sua "
				+ "posizione di forza le gambe divaricate ed i piedi saldamente appoggiati al terreno dietro le ginocchia per "
				+ "favorire il mantenimento delle tre curve naturali della schiena e per reggere più efficacemente il peso. "
				+ "I gomiti sono leggermente flessi, i polsi dritti o flessi e le spalle sono estese e parzialmente addotte in"
				+ " proporzioni differenti a seconda dell'inclinazione della panca. I manubri sono tenuti alla stessa altezza dello "
				+ "sterno con una presa neutra. L'esecuzione consiste nel flettere ed abdurre le spalle in modo che i manubri "
				+ "traccino un arco di cerchio sullo stesso piano verticale perpendicolare al pavimento (non alla panca) su cui si "
				+ "trovavano in partenza. L'esecuzione termina poco prima che le braccia arrivino a trovarsi perpendicolari al "
				+ "terreno. Durante tutta l'esecuzione dell'esercizio è consigliabile scaricare parte del peso sui piedi.\n");
	}
}

