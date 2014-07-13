package addominali;
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
		text2.setText("Leg Raise.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("Non disponibile.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Leg Raise è un esercizio Monoarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Crunch inverso su panca inclinata, Crunch inverso alle parallele, Crunch inverso alla sbarra.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta sdraiato supino su una panca piana con le anche flesse a 90°, le "
				+ "gambe parallele e le ginocchia flesse o estese. Le mani possono afferrare un punto fisso per facilitare l'esercizio"
				+ " oppure lasciate libere. L'esecuzione consiste nel flettere la colonna spingendo le ginocchia (variante con gambe "
				+ "flesse) o i piedi (variante con ginocchia estese) verso l'alto (l'esercizio è anche conosciuto come rising flag)"
				+ " (molto difficile), o verso la testa. In caso si decida di spingere verso l'alto, le anche si estendono leggermente"
				+ " durante la fase concentrica, mentre tutto gli angoli del corpo ad eccezione di quello della colonna vertebrale, "
				+ "devono rimanere invariati per tutta la durata dell'esercizio.\n");
	}
}

