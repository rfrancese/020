package addominali;
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
		text2.setText("Crunch su Panca declinata.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Crunch inverso è noto anche come Inclined bench reverse crunch, Inclined bench rising flag.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Crunch inverso su panca inclinata è un esercizio Monoarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Crunch inverso, Crunch inverso alle parallele, Crunch inverso alla sbarra.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("Le posizione di partenza vede l'atleta sdraiato supino su una panca inclinata con le mani che afferrano dei "
				+ "punti fermi di solito situati dietro la testa. La schiena è estesa, le anche possono essere flesse a 90° "
				+ "(variante monoarticolare), o estese (variante biarticolare), mentre le ginocchia possono essere flesse (facile)"
				+ " o estese (difficile). L'esecuzione consiste nell'eseguire una flessione completa delle anche (in caso di variante"
				+ " biarticolare) seguita da una flessione del tratto lombodorsale della colonna vertebrale (nel caso si voglia "
				+ "eseguire la variante monoarticolare, l'esercizio inizia con questa azione) spingendo le ginocchia (variante a "
				+ "ginocchia flesse) o i piedi (variante a ginocchia estese) verso l'alto (molto difficile; anche conosciuto come "
				+ "rising flag) o verso la testa (crunch inverso tradizionale).\n");
	}
}

