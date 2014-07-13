package addominali;

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
		text2.setText("Crunches.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Crunches è noto anche come Addominali alti.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Crunches è un esercizio Monoarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Crunch a terra, Crunch con anche flesse a 90 gradi e piedi in sospensione, Crunch su panca piana con "
				+ "anche flesse a 90 gradi e piedi appoggiati su rialzo,"
				+ " Crunch su panca piana con anche flesse a 90 gradi e piedi in sospensione.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("Le posizione di partenza vede l'atleta sdraiato supino sul pavimento o su una panca con le anche flesse a 90° "
				+ "e ginocchia flesse in modo che entrambi i piedi siano appoggiati su un rialzo, come una sedia, una panca (se "
				+ "sdraiato sul pavimento), o su un bilanciere (se sdraiato su panca da distensioni su panca piana con bilanciere)."
				+ " Gli arti inferiori dovranno rimanere immobili per tutta la durata dell'esercizio. La testa inizialmente è a "
				+ "contatto con il pavimento o con la panca. Le mani possono essere tenute lungo i fianchi, incrociate sul petto, "
				+ "ai lati della testa all'altezza delle tempie, oppure dietro la testa con le spalle completamente flesse ed i "
				+ "gomiti estesi. L'elenco è stato scritto in ordine crescente di difficoltà. Una volta stabilito dove posizionare "
				+ "gli arti, non è più possibile cambiare questo parametro se non come tecnica di cheating o per alleggerire il "
				+ "carico durante una serie in “stripping”. L'esecuzione consiste nell'eseguire una flessione colonna in modo che si"
				+ " stacchi la parte alta della schiena dalla superficie d'appoggio, mentre la parte bassa della schiena rimane a "
				+ "contatto con il pavimento per tutta la durata dell'esercizio. La distanza tra mento e sterno deve rimanere quanto "
				+ "più possibile costante. Il range di movimento è ridotto, poiché sollevando troppo la schiena si finisce per "
				+ "flettere anche l'anca trasformando il crunch in un sit up. Per enfatizzare il lavoro degli addominali obliqui "
				+ "è possibile eseguire la fase concentrica del movimento torcendo il busto verso il lato destro; in questo movimento "
				+ "viene massimizzato il lavoro degli obliqui esterni del lato sinistro e degli obliqui interni del lato destro. Il "
				+ "movimento è unilaterale e la descrizione si riferisce ad il lato destro. Ripetere in modo speculare per il lato "
				+ "sinistro.\n");
	}
}

