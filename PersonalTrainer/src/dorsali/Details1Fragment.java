package dorsali;

import it.unisa.personalTrainer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details1Fragment extends Fragment {

	
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
		text2.setText("Lat Machine Impugnatura Inversa");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Lat Machine Impugnatura Inversa è noto anche come Lat machine chin ups, Reverse "
				+ "grip lat machine, "
				+ "Trazioni alla lat machine a presa inversa, Trazioni inverse.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Lat Machine Impugnatura Inversa è un esercizio Base.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Trazioni alla sbarra a presa supina.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta seduto sulla lat machine con le gambe bloccate, la schiena nella "
				+ "sua posizione di forza e il busto di poco inclinato indietro. Le mani che tengono la barra con una presa supina, "
				+ "quindi con il palmo rivolto verso l'atleta, sono disposte ad una distanza pari o leggermente superiore a quella "
				+ "delle spalle che sono quasi completamente flesse sul piano sagittale. I gomiti sono estesi. Le scapole, ruotate "
				+ "verso l'alto, possono trovarsi in elevazione o in depressione; nel secondo caso non c'è l'azione 5. L'esecuzione "
				+ "consiste nel deprimere le scapole (se la posizione di partenza era con le scapole elevate) e successivamente "
				+ "estendere le spalle e contemporaneamente flettere i gomiti e fino a portare la sbarra a contatto con la parte "
				+ "superiore del petto. Il movimento più efficiente è quello che più si avvicina a tracciare un segmento di linea "
				+ "retta. L'inclinazione del busto non deve variare per tutta l'esecuzione del movimento, tuttavia è possibile "
				+ "estendere parzialmente l'anca durante la fase concentrica del movimento come tecnica di cheating.\n");
	}
}

