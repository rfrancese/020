package bicipiti;

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
		text2.setText("Curl con manubri");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Curl con manubri è noto anche come Hammer curl, Standing hammer curl, Curl a martello.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Curl con manubri con presa neutra in piedi è un esercizio Monoarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Curl con manubri con presa neutra su panca inclinata.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta in piedi in posizione eretta, con le ginocchia leggermente flesse, "
				+ "il passo paria alla distanza tra le spalle, la schiena nella sua posizione di forza, le scapole addotte, le spalle"
				+ " estese ed addotte, i gomiti estesi. L'impugnatura è neutra e le braccia lungo i fianchi. L'esecuzione consiste nel"
				+ " flettere i gomiti senza supinare ed avendo cura di non modificare la posizione del resto del corpo. Il movimento "
				+ "termina al massimo livello di flessione dei gomiti. Flettere la spalla è considerato cheating così come aiutarsi"
				+ " estendendo le ginocchia o spostando il bacino sotto i manubri. Il mantenimento della presa neutra mette in "
				+ "vantaggio meccanico il brachioradiale ed a livello del capo lungo del bicipite privilegia le fibre più laterali "
				+ "(esterne). Enfatizzando la contrazione isometrica al termine di quella concentrica, aumenta il coinvolgimento del"
				+ " brachiale. E' possibile eseguire quest'esercizio, flettendo entrambi i gomiti contemporaneamente, oppure"
				+ " flettendoli in modo alternato; la prima opzione consente di mantenere maggiore tensione sui muscoli allenati, "
				+ "mentre la seconda richiede maggiore equilibrio, data la unilateralità, e resistenza nei muscoli della presa, "
				+ "poiché la durata dell'esercizio raddoppia.\n");
	}
}

