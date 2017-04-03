package nl.ica.oose.ooad;


public class Speler {

	private int score;

	public Speler() {
		this.score = 0;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "score = " + score;
	}
}
