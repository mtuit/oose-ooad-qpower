package nl.ica.oose.ooad;


import java.io.IOException;

public class Quiz {
	private String taal;
	private Speler speler;
	private Ronde ronde;

	public Quiz(String taal, Speler speler) {
		this.taal = taal;
		this.speler = speler;
	}

	public static void main(String[] args) {
		Speler mick = new Speler("Mick");
		Quiz quiz = new Quiz("NL", mick);
		quiz.nieuwSinglePlayerQuiz();

	}

	public void nieuwSinglePlayerQuiz() {
		this.ronde = new Ronde(speler);
		try {
			ronde.startRonde();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void beëindigspel() {

	}

}
