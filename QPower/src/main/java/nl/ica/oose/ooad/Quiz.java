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
		Speler speler = new Speler();
		Quiz quiz = new Quiz("NL", speler);
		quiz.nieuwSinglePlayerQuiz();

	}

	public void nieuwSinglePlayerQuiz() {
		this.ronde = new Ronde(speler);
		try {
			ronde.startRonde();
			beëindigSpel();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void beëindigSpel() {
		System.out.println("Uw eindstatistieken zijn als volgt: ");
		System.out.println(speler.toString());
	}

}
