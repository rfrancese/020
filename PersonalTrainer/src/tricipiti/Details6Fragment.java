package tricipiti;

import it.unisa.personalTrainer.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Details6Fragment extends Fragment {

	
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
		text2.setText("Pushdown");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Pushdown è noto anche come tricipiti al cavo.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Pushdown è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Pushdown con corda.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("Posizionatevi di fronte ai cavi alti o ad una lat machine, con le gambe leggermente divaricate e le ginocchia"
				+ " flesse. Afferrare la barra con due mani, ad una distanza di circa 10-15 centimetri l'una dall'altra. Per tutta"
				+ " la durata dell'esercizio, i gomiti devono essere sempre perpendicolari al suolo e vicino ai fianchi. Tenendo "
				+ "la schiena dritta e i gomiti vicino ai fianchi, portate in basso la sbarra espirando e raddrizzando i gomiti, ma "
				+ "senza arrivare all'iperestensione del braccio.Riportare la barra all'altezza della parte alta del petto e ripetere"
				+ " il movimento. Variando la presa è possibile eseguire numerose varianti di pushdown, che enfatizzano il lavoro su"
				+ " un capo o l'altro del tricipite; le più utilizzate sono:\n- Pushdown con presa prona\n- Pushdown con presa supina\n"
				+ "- Pushdown unilaterale alternato\n- Power Pushdown\n- Pushdown con la corda"
				+ "\n- Push down con la barra angolare.\n");
	}
}

