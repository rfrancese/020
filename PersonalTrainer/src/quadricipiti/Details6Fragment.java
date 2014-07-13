package quadricipiti;

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
		text2.setText("Squat.");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Squat con bilanciere è noto anche come Accosciata, Back squat, Rear squat.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Squat con bilanciere è un esercizio Base.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Front squat.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta in piedi, con la schiena nella sua posizione di forza e ginocchia"
				+ " estese o quasi completamente estese. Il bilanciere è tenuto appoggiato saldamente sui fasci superiori del"
				+ " trapezio o all'altezza delle spine scapolari. La distanza tra i piedi (passo) può variare a seconda della tecnica,"
				+ " ma sempre pari o superiore alla larghezza delle spalle. L'apertura dei piedi (angolazione) varia a seconda "
				+ "del passo: generalmente con un passo breve i piedi sono solo leggermente rivolti verso l'esterno, mentre "
				+ "con un passo lungo l'angolo è più accentuato. L'esecuzione consiste nel flettere contemporaneamente anca,"
				+ " ginocchia e caviglia come se ci si volesse sedere, mantenere la schiena nella sua posizione di forza. E'"
				+ " consigliabile proseguire nella discesa fino a che si riesce a tenere la schiena con le sue tre curve naturali,"
				+ " facendo anche attenzione a non proiettare le ginocchia oltre le punte dei piedi. Invertire il movimento senza "
				+ "rimbalzi, estendendo contemporaneamente anche e ginocchia ed eseguendo una flessione plantare a livello delle "
				+ "caviglie; avendo cura di mantenere contratti ed in equilibrio tutti i muscoli che stabilizzano la schiena. "
				+ "Particolare attenzione a non avvicinare le ginocchia che devono rimanere allineate con i piedi per tutto il"
				+ " movimento. L'esecuzione termina con il ritorno alla posizione di partenza.\n");
	}
}

