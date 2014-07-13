package tricipiti;

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
		text2.setText("French press");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio French press è noto anche come Skull crasher.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("French press è un esercizio Monoarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("French press verticale con bilanciere, French press"
				+ " con manubri, French press verticale con manubri, French press verticale ai cavi.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta sdraiato supino su una panca piana con glutei, parte alta della"
				+ " schiena, scapole e nuca sempre a contatto con essa e con i piedi appoggiati saldamente al terreno verticalmente"
				+ " sotto, o dietro le ginocchia, ma mai davanti. Le anche sono abdotte e gli arti inferiori spingono sul pavimento"
				+ " in modo equilibrato per garantire stabilità alla posizione. La schiena si trova nella sua posizione di forza, "
				+ "quindi non è a contatto con la panca a livello della lordosi fisiologica. Le braccia sono tese, le spalle flesse "
				+ "in misura variabile e proporzionale all'enfasi che si vuol dare all'allungamento del capo lungo del tricipite. Il "
				+ "livello minimo di flessione è di poco più di 90° (quindi con la barra sopra il collo quando i gomiti sono estesi), "
				+ "mentre il massimo è di circa 120° (quindi con il bilanciere sopra la fronte). Le spalle sono anche parzialmente"
				+ " abdotte. L'impugnatura può essere prona/neutra o neutra; la presa neutra riduce il coinvolgimento dei flessori "
				+ "del polso e dei come stabilizzatori, poiché si annulla il rischio di una eccessiva estensione e dei muscoli "
				+ "pronatori. Con una presa prona/neutra è consigliabile tenere i polsi flessi o in posizione intermedia. "
				+ "L'esecuzione consiste nel flettere esclusivamente i gomiti per poco più di 90°, per poi estenderli nuovamente "
				+ "evitando rimbalzi nel cambio di direzione.\n");
	}
}

