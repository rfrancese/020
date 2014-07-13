package aduttori;

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
		text2.setText("Adductor");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Adductor machine è noto anche come Seated adductor machine,"
				+ " Adduttori da seduti, Macchina adduttori da seduti.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Adduzioni delle anche sul piano trasversale alla macchina è un esercizio Monoarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Adduzioni dell’ anca alla macchina specifica.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta seduto sulla macchina con le anche abdotte sul "
				+ "piano trasversale, il bacino in anteroversione, la schiena nella sua posizione di forza e i "
				+ "cuscinetti dell'attrezzo appoggiati nella parte interna di ciascuna gamba ad altezza variabile a"
				+ " seconda della macchina e dell'altezza dell'atleta. L'esecuzione consiste nell'addurre completamente "
				+ "entrambe le anche sul piano trasversale mantenendo inalterata la posizione del resto del corpo.\n");
	}
}

