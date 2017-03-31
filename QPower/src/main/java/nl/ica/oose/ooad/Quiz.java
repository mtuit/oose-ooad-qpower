package nl.ica.oose.ooad;


import java.io.IOException;

public class Quiz {
	private final IPuntentellingStrategie puntentellingStrategie;
	private String taal;
	private Speler speler;
	private Ronde ronde;

	public Quiz(String taal, Speler speler, IPuntentellingStrategie strategie) {
		this.taal = taal;
		this.speler = speler;
		this.puntentellingStrategie = strategie;
	}

	public static void main(String[] args) {
		Speler speler = new Speler();
		IPuntentellingStrategie lineairePuntentelling = new LineairePuntentelling();
		Quiz quiz = new Quiz("NL", speler, lineairePuntentelling);
		quiz.nieuwSinglePlayerQuiz();

	}

	public void nieuwSinglePlayerQuiz() {
		this.ronde = new Ronde(speler, puntentellingStrategie);
		try {
			ronde.startRonde();
			beëindigSpel();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void beëindigSpel() {
		printSpelGegevens();
	}

	private void printSpelGegevens() {
		System.out.println("Uw eindstatistieken zijn als volgt: ");
		System.out.println(speler.toString());
		System.out.println(ronde.toString());
	}

}
