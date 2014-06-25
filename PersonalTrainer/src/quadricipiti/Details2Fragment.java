package quadricipiti;
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
		text2.setText("Affondi frontali con manubri");

		TextView text3 = (TextView) view.findViewById(R.id.textView3);
		text3.setText("Sinonimi:");

		TextView text4 = (TextView) view.findViewById(R.id.textView4);
		text4.setText("L'esercizio Affondi frontali con manubri è noto anche come Lounges with dumbell, "
				+ "Front lounges with barbells, dumbell lounges, Dumbel front lounges, Affondi.");

		TextView text5 = (TextView) view.findViewById(R.id.textView5);
		text5.setText("Tipo di Esercizio:");

		TextView text6 = (TextView) view.findViewById(R.id.textView6);
		text6.setText("Affondi frontali con manubri è un esercizio Multiarticolare/accessorio.");

		TextView text7 = (TextView) view.findViewById(R.id.textView7);
		text7.setText("Varianti: ");

		TextView text8 = (TextView) view.findViewById(R.id.textView8);
		text8.setText("Affondi laterali con manubri.");

		TextView text9 = (TextView) view.findViewById(R.id.textView9);
		text9.setText("Esecuzione: ");

		TextView text10= (TextView) view.findViewById(R.id.textView10);
		text10.setText("La posizione di partenza vede l'atleta in posizione eretta con i manubri i mano. La distanza tra i piedi "
				+ "(passo) deve essere molto vicina alla distanza tra le spalle. L'angolo di apertura dei piedi deve essere di circa"
				+ " 10°, ma con margine di modifica in base alle caratteristiche individuali; generalmente tra gli 8 ed i 20 gradi."
				+ " Le braccia sono distese lungo i fianchi. L'esecuzione consiste nell'eseguire un passo avanti, mantenendo l'altro "
				+ "piede fermo sul posto. Eseguito il passo l'atleta flette anca e ginocchio dal lato della gamba davanti ed "
				+ "iperestende l'altra anca flettendo anche il ginocchio accompagnato da una flessione plantare a livello di "
				+ "caviglia e piede. Questo movimento sposta il peso sulla gamba davanti e termina quando il ginocchio della gamba"
				+ " dietro arriva a pochi centimetri dal terreno. A questo punto, evitando rimbalzi e strattoni, l'atleta ritorna "
				+ "nella posizione iniziale estendendo ginocchio e anca ed eseguendo una flessione plantare della gamba davanti. "
				+ "Il ritorno può essere fatto in due modi: riportando dietro l'arto allenato (affondi sul posto), oppure portando"
				+ " avanti l'arto non allenato (affondi in progressione). Durante tutta l'esecuzione del movimento la schiena deve "
				+ "essere mantenuta verticale e nella sua posizione di forza.\n");
	}
}

