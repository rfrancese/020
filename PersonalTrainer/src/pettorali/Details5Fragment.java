package pettorali;

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
		text2.setText("Distensioni su panca piana al Multipower");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L� esercizio Distensioni su panca piana al multipower � noto anche come Distensione alla Smith machine.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Distensioni su panca piana al multipower � un esercizio Base.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Distensioni su panca piana con manubri, distensione su panca piana con bilanciere.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta sdraiato supino su una panca piana con glutei, parte alta della schiena,"
				+ " scapole e nuca sempre a contatto con essa e con i piedi appoggiati saldamente al terreno verticalmente sotto, o "
				+ "dietro le ginocchia, ma mai davanti. Le anche sono abdotte e gli arti inferiori spingono sul pavimento in modo "
				+ "equilibrato per garantire stabilit� alla posizione.L'esecuzione "
				+ "consiste nell'abbassare il bilanciere sul piano verticale fino a che non si trovi a contatto con il torace. "
				+ "Questo movimento deve tracciare un segmento di linea retta esattamente perpendicolare alla panca. Al termine "
				+ "della discesa del bilanciere, da una visione laterale l'avambraccio deve risultare perpendicolare al terreno. "
				+ "A questo punto, l'atleta spinge il bilanciere verso l'alto facendogli ripercorrere l'esatta traiettoria che ha"
				+ " tracciato durante la discesa, fino a tornare nella posizione di partenza.\n");
	}
}

