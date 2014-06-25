package adduttori_abductori;


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
		text2.setText("Abductor");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Abduttori alla macchina è noto anche come Standing abductor machine, "
				+ "Abduttori in piedi, Macchina abduttori in piedi.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Abduzioni dell’ anca alla macchina è un esercizio Monoarticolare");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Abduzioni delle anche sul piano trasversale alla macchina.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta in piedi con l'anca addotta, la schiena nella sua "
				+ "posizione di forza, il bacino in anteroversione e i cuscinetti dell'attrezzo appoggiati "
				+ "nella parte esterna della gamba ad altezza variabile a seconda della macchina e "
				+ "dell'altezza dell'atleta. L'esecuzione consiste nell'abdurre l'anca fin dove consentito dalla "
				+ "mobilità articolare individuale, mantenendo inalterata la posizione del resto del corpo."
                +"Ricorda sempre di mantenere il bacino in anteroversione e la schiena verticale nella "
                + "sua posizione di forza. Più i cuscinetti della macchina sono appoggiati vicino all'anca "
                + "e più l'esercizio risulta leggero.\n");
	}
}

