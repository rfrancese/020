package dorsali;

import it.unisa.personalTrainer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details5Fragment extends Fragment {

	
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
		text2.setText("Rematore con manubrio");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Rematore con manubrio è noto anche come Single dumbell rower.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Rematore con manubrio è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Rematore con bilanciere a presa supina, Rematore al pulley orizzontale con maniglia a presa stretta, "
				+ "Rematore alla dorsy bar, Rematore con bilanciere a presa prona, Rematore al pulley orizzontale a presa prona.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta con il ginocchio destro appoggiato sulla panca, il piede sinistro "
				+ "appoggiato a terra, la mano sinistra appoggiata sulla panca per contribuire all'equilibrio e la mano destra che "
				+ "regge un manubrio con una presa neutra. Il peso del corpo è quindi sostenuto dal piede sinistro, dal ginocchio "
				+ "destro e dal braccio sinistro. Il busto è parallelo al pavimento, la schiena è nella sua posizione di forza, il "
				+ "braccio destro che regge il manubrio è disteso e perpendicolare al pavimento, mentre la scapola destra è abdotta."
				+ " L'esecuzione consiste nel addurre le scapole ed eseguire un'estensione della spalla destra, accompagnata da una "
				+ "contemporanea flessione del gomito; il tutto senza eseguire torsioni del busto. Il movimento termina quando il "
				+ "gomito arriva sul piano del corpo (massima estensione della spalla) o quando lo supera (iperestensione della"
				+ " spalla). N.B.: Questo esercizio è unilaterale, e la descrizione si riferisce all'allenamento del lato destro.\n");
	}
}

