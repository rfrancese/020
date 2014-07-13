package bicipiti;

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
		text2.setText("Curl con bilanciere.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Curl con bilanciere a presa supina è noto anche come Biceps curl, Barbell curl, Arm curl, Barbell elbows "
				+ "flexion, Bicipiti con bilanciere, Curl, Curl in piedi.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Curl con bilanciere è un esercizio Monoarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Curl con manubri in supinazone in piedi, Curl con manubri in supinazione su panca inclinata, Curl al pulley verticale.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta in piedi in posizione eretta, con le ginocchia leggermente"
				+ " flesse, il passo paria alla distanza tra le spalle, la schiena nella sua posizione di forza, le scapole "
				+ "addotte, le spalle estese ed addotte, i gomiti estesi. L'impugnatura è supina a larghezza spalle ed il bilanciere appoggiato sui "
				+ "quadricipiti. I polsi sono dritti o flessi, ma mai estesi; in caso si tengano flessi, si riduce il contributo alla flessione del "
				+ "gomito di: flessore superficiale delle dita, flessore radiale del carpo, flessore ulnare del carpo e palmare lungo. L'esecuzione "
				+ "consiste nel flettere i gomiti avendo cura di non modificare la posizione del resto del corpo. Il movimento termina al massimo"
				+ " livello di flessione dei gomiti. Flettere la spalla è considerato cheating così come aiutarsi estendendo le ginocchia o spostando "
				+ "il bacino sotto la barra. Gli atleti con una circonferenza vita abbondante, devono iniziare il movimento con le spalle più flesse"
				+ " del normale, per consentire il passaggio della barra davanti all'addome senza dover flettere le spalle una volta che la ripetizione"
				+ " è iniziata. Questo è l'esercizio base per il bicipite brachiale. Enfatizzando la contrazione isometrica al termine di quella"
				+ " concentrica, aumenta il coinvolgimento del brachiale. Utilizzando un bilanciere ondulato ed una presa supina/neutra, aumenta il "
				+ "contributo del brachioradiale alla flessione del gomito e si riduce la tensione sui fasci mediali del capo lungo del bicipite"
				+ " brachiale, del supinatore breve "
				+ "e dell'estensore lungo del pollice, quali supinatori dell'avambraccio.\n");
	}
}

