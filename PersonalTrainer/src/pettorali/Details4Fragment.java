package pettorali;

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
		text2.setText("Croci su panca piana con manubri");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Croci su panca piana con manubri è noto anche come Dumbell crossover.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Croci su panca piana con manubri è un esercizio Monoarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Croci su panca piana ai cavi, Croci alla pectoral machine.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta sdraiato supino su una panca piana con glutei, parte alta della "
				+ "schiena, scapole e nuca sempre a contatto con essa e con i piedi appoggiati saldamente al terreno verticalmente"
				+ " sotto, o dietro le ginocchia, ma mai davanti. Le anche sono abdotte e gli arti inferiori spingono sul pavimento"
				+ " in modo equilibrato per garantire stabilità alla posizione. I flessori della colonna sono in posizione di "
				+ "allungamento, ma in contrazione isometrica, mentre gli estensori sono in accorciamento; entrambi lavorano in "
				+ "equilibrio per garantire continuità tra arti inferiori e arti superiori. Le scapole sono addotte, né depresse, "
				+ "né elevate. Le spalle sono estese su un piano ibrido tra quello trasversale e quello sagittale, mentre i gomiti"
				+ " sono quasi completamente estesi. I manubri sono impugnati saldamente utilizzando anche il pollice ed i polsi "
				+ "sono in posizione neutra o leggermente flessi. L'esecuzione consiste nel flettere le spalle in modo che ciascun"
				+ " manubrio tracci un arco di cerchio sul piano trasversale su cui giaceva in partenza. Il movimento termina poco"
				+ " prima che i manubri si trovino in posizione perpendicolare al terreno.\n");
	}
}

