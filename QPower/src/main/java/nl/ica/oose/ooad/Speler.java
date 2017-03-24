package nl.ica.oose.ooad;

public class Speler {

	private int score;
	private String naam;

	public Speler(String naam) {
		this.naam = naam;
		this.score = 0;
	}

	public boolean beantwoordVraag(Vraag vraag, String antwoord) {
		return false;
	}

}
