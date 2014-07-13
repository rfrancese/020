package femorali;

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
		text2.setText("Leg Curl in piedi.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Leg Curl in piedi è noto anche come Standing Leg Curl, Femorali alla macchina in piedi.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Leg Curl in piedi è un esercizio Monoarticolare.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Leg Curl da sdraiato, Leg Curl da seduto.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta in posizione eretta con un ginocchio posizionato a livello "
				+ "dell'articolazione della macchina, il cuscinetto posizionato dietro la caviglia. La caviglia viene mantenuta in "
				+ "dorsiflessione per tutto il movimento. L'esecuzione consiste nel flettere lil ginocchio di circa 90° facendo "
				+ "tracciare al cuscinetto un arco di cerchio. La variante in piedi con il busto verticale coinvolge maggiormente"
				+ " il capo corto del bicipite femorale rispetto alle altre varianti, poiché i restanti flessori del ginocchio, "
				+ "essendo biarticolari, sono impegnati a mantenere l'anca estesa.\n");
	}
}

