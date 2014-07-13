package bicipiti;

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
		text2.setText("Curl in concentrazione.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("Non disponibile.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Curl in concentrazione è un esercizio Monoarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Non disponibile.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta seduto con le gambe divaricate, il gomito destro è esteso ed appoggiato "
				+ "all'interno della gamba in prossimità del ginocchio destro. La spalla è intraruotata in modo che il braccio destro "
				+ "sia direzionato verso la coscia sinistra. L'impugnatura del manubrio è supina. Il polso è dritto o flesso, ma mai "
				+ "esteso; in caso si tenga flesso, si riduce il contributo alla flessione del gomito di: flessore superficiale delle "
				+ "dita, flessore radiale del carpo, flessore ulnare del carpo e palmare lungo. Il la mano o il gomito del lato sinistro "
				+ "si possono appoggiare sulla gamba sinistra per una maggiore stabilità. L'esecuzione consiste nel flettere il gomito "
				+ "avendo cura di non modificare la posizione del resto del corpo. Il movimento termina poco prima che il manubrio "
				+ "tocchi la spalla o il busto dell'atleta. Questo esercizio riduce l'importanza del bicipite brachiale (in particolare "
				+ "del capo breve) come flessore del gomito. Enfatizzando la contrazione isometrica al termine di quella concentrica,"
				+ " aumenta il coinvolgimento del brachiale. In questo esercizio gli adduttori dell'anca sono importanti stabilizzatori "
				+ "del movimento. La descrizione è riferita all'allenamento dell'arto destro; seguire in modo speculare per l'altro "
				+ "braccio.\n");
	}
}

