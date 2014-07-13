package deltoidi;
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
		text2.setText("Alzate laterali con manubri");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Alzate laterali con manubri è noto anche come Lateral dumbell raise, Aperture laterali, "
				+ "Shoulder abductions with dumbells, Dumbell shouder sbductions.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Alzate laterali con manubri è un esercizio Monoarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Alzate laterali da sdraiato.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta in piedi in posizione eretta con la schiena nella sua posizione di"
				+ " forza, le ginocchia leggermente flesse e la distanza tra i piedi pari o leggermente superiore a quella delle "
				+ "spalle. Le spalle non sono completamente addotte anche se le braccia si possono comunque considerare lungo i "
				+ "fianchi. I gomiti sono quasi completamente estesi. Ciascuna mano impugna un manubrio. L'esecuzione consiste "
				+ "nell'abdurre/flettere le spalle, sollevando così i manubri fino a che l'omero non arriva ad essere parallelo al "
				+ "terreno. Flettere i gomiti è considerato cheating e sposta il carico di lavoro sulla porzione anteriore delle "
				+ "spalle. L'ausilio della spinta degli arti inferiori e l'eccessiva iperestensione della colonna vertebrale è "
				+ "considerato cheating. Nonostante questo sia un esercizio che viene inserito per allenare la porzione laterale "
				+ "del deltoide, è possibile aumentare il contributo della porzione anteriore del deltoide se si extraruota la "
				+ "spalla. Un'eccessiva intrarotazione della spalla è sempre sconsigliabile. La posizione verticale del corpo "
				+ "tende a privilegiare il lavoro dei muscoli che intervengono nella seconda metà dell'abduzione della spalla. "
				+ "Esiste anche una variante da seduti di questo esercizio.\n");
	}
}

