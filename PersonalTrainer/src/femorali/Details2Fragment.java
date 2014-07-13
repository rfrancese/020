package femorali;
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
		text2.setText("Leg Curl sdraiato.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Leg Curl da sdraiato è noto anche come Lying Leg Curl, Femorali alla macchina da sdraiato.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Leg Curl da sdraiato è un esercizio Monoarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Leg Curl in piedi, Leg Curl da seduto.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta sdraiato prono sulla macchina con le ginocchia estese "
				+ "situate allo stesso livello dell'articolazione della macchina e i cuscinetti dietro le caviglie."
				+ " Normalmente le caviglie vengono mantenute in dorsiflesione per tutto l'esercizio, ma è possibile "
				+ "eseguire (in qualsiasi fase) o mantenere una flessione plantare per scaricare parte dello sforzo dal "
				+ "gastrocnemio. L'esecuzione consiste nel flettere le ginocchia, avvicinando ai glutei i cuscinetti posizionati"
				+ " dietro le caviglie. La parziale flessione dell'anca dovuta alla posizione del corpo riduce il contributo "
				+ "del sartorio alla flessione del ginocchio.\n");
	}
}

