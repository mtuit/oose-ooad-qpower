package nl.ica.oose.ooad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizData implements IPersistence {

	private List<Vraag> vragen = new ArrayList<Vraag>();

	public List<Vraag> getVragen() {
		init();
		return vragen;
	}

	private void init() {
		vragen.add(new MeerkeuzeVraag("Wat is de hoofdstad van Nederland?",
									"Topografie",
									"NL",
									60,
									new ArrayList<String>(Arrays.asList("Amsterdam", "Rotterdam", "Utrecht", "Nijmegen")),
									"Amsterdam"));

		vragen.add(new MeerkeuzeVraag("Wat is de hoofdstad van Duitsland?",
									"Topografie",
									"NL",
									60,
									new ArrayList<String>(Arrays.asList("München", "Berlijn", "Köln", "Hannover")),
									"Berlijn"));

		vragen.add(new OpenVraag("Wat is de hoogste berg van de Alpen?",
									"Topografie",
									"NL",
									120,
									new ArrayList<String>(Arrays.asList("Mont Blanc", "mont blanc", "Witte berg", "witte berg"))));
	}

}
