package tricipiti;

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
		text2.setText("French Press con manubrio.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio French press con manubrio è noto anche come one arm triceps "
				+ "extension, estensione dei tricipiti con manubrio sopra la testa.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("French Press con manubrio è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("French Press con bilanciere, Tricipiti ai cavi alti.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("In piedi con le gambe leggermente flesse o seduti su una panca. Afferrare un manubrio e portarlo dietro la "
				+ "nuca, sostenendo il manubrio con una presa neutra. Mantenere con il gomito rivolto verso l'alto, perpendicolare "
				+ "al suolo. Espirando sollevate il manubrio sopra la testa, estendendo il braccio. Evitare di muovere il gomito "
				+ "verso l'interno o verso l'esterno. Inspirando tornate lentamente nella posizione di partenza. Non inarcare la "
				+ "schiena durante il movimento di estensione. Una panca dotata di schienale, può garantire una maggiore sicurezza"
				+ " durante l'esecuzione dell'esercizio, a patto che lo schienale non sia troppo alto da inteferire con il movimento "
				+ "del manubrio. L'esecuzione della French Press con manubrio, richiede una buona mobilità della spalla, per poter "
				+ "mantenere la spalla indietro e il gomito perpendicolare a suolo.\n");
	}
}

