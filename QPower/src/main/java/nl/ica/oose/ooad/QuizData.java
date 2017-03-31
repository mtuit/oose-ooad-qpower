package nl.ica.oose.ooad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizData implements IPersistence {

	private List<Vraag> vragen = new ArrayList<Vraag>();
	private Vraag vraag;

	public List<Vraag> getVragen() {
		init();
		return vragen;
	}

	private void init() {
		vragen.add(new MeerkeuzeVraag("Wat is de hoofdstad van Nederland?",
									new ArrayList<String>(Arrays.asList("Amsterdam", "Rotterdam", "Utrecht", "Nijmegen")),
									"Amsterdam",
									"Topografie",
									"NL"));

		vragen.add(new MeerkeuzeVraag("Wat is de hoofdstad van Duitsland?",
									new ArrayList<String>(Arrays.asList("München", "Berlijn", "Köln", "Hannover")),
									"Berlijn",
									"Topografie",
									"NL"));
		vragen.add(new OpenVraag("Wat is de hoogste berg van de Alpen?",
									new ArrayList<String>(Arrays.asList("Mont Blanc", "mont blanc", "Witte berg", "witte berg")),
									"Topografie",
									"NL"));
	}

}
