package addominali;

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
		text2.setText("Crunch ai cavi.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("Non disponibile.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Crunch ai cavi � un esercizio Monoarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Non disponibile.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("POSIZIONE INIZIALE: Inginocchiati davanti i cavi e con entrambe le mani impugnare una corda o un manubrio. "
				+ "L'esercizio pu� essere svolto sia difronte che di schiena all'attrezzo. MOVIMENTO: Portare il peso in avanti "
				+ "flettendo il busto fino al punto di massima contrazione muscolare, senza arrivare a toccare per terra. L'esercizio"
				+ " crunch hai cavi, utilizzando la resistenza costante dei cavi, � un ottimo esercizio per lo sviluppo di tutta la "
				+ "parete addominale. Inspirare durante la fase di salita ed espirare nella fase di discesa e contrazione degli "
				+ "addominali.\n");
	}
}

