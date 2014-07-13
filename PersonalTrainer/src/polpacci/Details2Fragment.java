package polpacci;

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
		text2.setText("Calf Machine in piedi.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Calf machine in piedi è noto anche come Standing Calf machine, Polpacci in piedi alla macchina, Calf machine.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Calf machine in piedi è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Calf rise con manubrio.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta in posizione eretta con entrambi gli avampiedi posizionati "
				+ "sull'apposito scalino della macchina, le caviglie in completa dorsiflessione ed i cuscinetti della macchina "
				+ "appoggiati sopra le spalle. La schiena è nella sua posizione di forza, ginocchia e anche sono estese e gli "
				+ "arti superiori lungo i fianchi o appoggiati delicatamente sui lati della macchina per stabilizzare il movimento "
				+ "quando necessario. L'esecuzione consiste nel sollevare i talloni eseguendo una completa flessione plantare che, "
				+ "accompagnata da altre articolazioni a livello del piede consente si muovere il corpo lungo un segmento.\n");
	}
}

