package nl.ica.oose.ooad;


public class Speler {

	private int score;
	private String naam;
	private long tijd;

	public Speler(String naam) {
		this.naam = naam;
		this.score = 0;
		this.tijd = 0;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Speler{" +
				"score = " + score +
				", naam = '" + naam + '\'' +
				", tijd = " + tijd + " seconde" +
				'}';
	}

	public void setTijd(long tijd) {
		this.tijd = tijd;
	}
}
