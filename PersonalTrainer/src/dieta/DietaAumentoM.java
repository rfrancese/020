package dieta;

import it.unisa.personalTrainer.R;


import it.unisa.personalTrainer.R.id;
import it.unisa.personalTrainer.R.layout;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DietaAumentoM extends Fragment {
View v;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		v = inflater.inflate(R.layout.fragment_dieta_aumento_m,
				container, false);
		return v;
	}
	
	public void onViewCreated(View view, Bundle savedInstanceState) {
	    super.onViewCreated(view, savedInstanceState);
	    
	TextView text1 = (TextView) view.findViewById(R.id.textView1);
	text1.setText("Consigli Alimentari per Aumento massa muscolare");

	TextView text19= (TextView) view.findViewById(R.id.textView19);
	text19.setText("Colazione:");
	
	TextView text2 = (TextView) view.findViewById(R.id.textView2);
	text2.setText("300 gr latte scremato + 6 fette biscottate");

	TextView text3 = (TextView) view.findViewById(R.id.textView3);
	text3.setText("Metà mattino:");

	TextView text4 = (TextView) view.findViewById(R.id.textView4);
	text4.setText("100 gr bresaola o fesa di tacchino+ 100 gr di pane");

	TextView text5 = (TextView) view.findViewById(R.id.textView5);
	text5.setText("Pranzo gg(allenamento):");

	TextView text6 = (TextView) view.findViewById(R.id.textView6);
	text6.setText("100gr. riso/pasta + 200 gr pollo+ verdura"
                   +"(1 cucchiaio d’olio d’oliva crudo)");

	TextView text7 = (TextView) view.findViewById(R.id.textView7);
	text7.setText("Pranzo gg(riposo): ");

	TextView text8 = (TextView) view.findViewById(R.id.textView8);
	text8.setText("100gr. riso/pasta +  250gr. carne rossa magra + verdura"
            +"(1 cucchiaio d’olio d’oliva crudo)");

	TextView text9 = (TextView) view.findViewById(R.id.textView9);
	text9.setText("Spuntino gg (allenamento):");

	TextView text10= (TextView) view.findViewById(R.id.textView10);
	text10.setText("2 scatolette di tonno al naturale + 100gr di riso + 1 banana");
	
	TextView text11= (TextView) view.findViewById(R.id.textView11);
	text11.setText("Spuntino gg (riposo):");
	
	TextView text12= (TextView) view.findViewById(R.id.textView12);
	text12.setText("2 yogurt magri alla frutta + 50gr di riso");

	
	TextView text13= (TextView) view.findViewById(R.id.textView13);
	text13.setText("Cena:");
	
	TextView text14= (TextView) view.findViewById(R.id.textView14);
	text14.setText("250 gr. pesce/pollo verdura a volontà + 200gr di patate(1 cucchiaio d’olio d’oliva crudo)");

	TextView text15= (TextView) view.findViewById(R.id.textView15);
	text15.setText("Attenzione");
	
	TextView text16= (TextView) view.findViewById(R.id.textView16);
	text16.setText("Pesa sempre i cibi a crudo. Usa il sale ma con moderazione. Oltre all’olio d’oliva che "
			+ "devi usare crudo , puoi utilizzare altri odori come: basilico, prezzemolo, aglio , "
			+ "cipolla, limone, aceto; come verdure puoi utilizzate tutto tranne: fagioli, lenticchie, "
			+ "ceci,(che sono tutti legumi), e patate (che sono amidi).");
	
	TextView text17= (TextView) view.findViewById(R.id.textView17);
	text17.setText("Domenica fai un’alimentazione libera.");
}
}
