package dorsali;
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
		text2.setText("Lat Machine Avanti.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Lat Machine Avanti è noto anche come Lat machine pull downs, "
				+ "Lat machine front pull donws, Front pull downs, Pull downs.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Lat Machine Avanti è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Trazioni alla sbarra a presa prona davanti.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta seduto sulla lat machine con le gambe bloccate, la schiena nella sua"
				+ " posizione di forza e il busto inclinato indietro di 20/30 gradi. Le mani che tengono la barra con una presa "
				+ "prona, quindi con il dorso rivolto verso l'atleta, sono disposte ad una distanza superiore a quella delle spalle "
				+ "che sono quasi completamente flesse sul piano trasversale e abdotte sul piano longitudinale mentre i gomiti sono "
				+ "estesi. Le scapole, ruotate verso l'alto, possono trovarsi in elevazione o in depressione; nel secondo caso non "
				+ "c'è l'azione 6. L'esecuzione consiste nel tirare giù/indietro la barra, prima deprimendo le scapole (se la "
				+ "posizione di partenza era con le scapole elevate), poi, mantenendo il movimento fluido, adducendo le spalle "
				+ "sul piano longitudinale e estendendole sul piano trasversale, mentre le scapole ruotano verso il basso, vengono "
				+ "addotte ed i gomiti si flettono. Il movimento termina quando la barra tocca la parte superiore del petto. "
				+ "L'inclinazione del busto non deve variare per tutta l'esecuzione del movimento, tuttavia è possibile estendere "
				+ "parzialmente l'anca durante la fase concentrica del movimento come tecnica di cheating. Questa variante è mirata "
				+ "allo sviluppo dei fasci superiori del grande dorsale, ai fasci centrali ed inferiori del trapezio, mentre nella "
				+ "flessione del gomito il carico grava maggiormente su brachioradiale e brachiale. Il coinvolgimento del grande "
				+ "pettorale è maggiore rispetto alla variante a presa supina o neutra.\n");
	}
}

