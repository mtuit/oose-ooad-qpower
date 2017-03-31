package nl.ica.oose.ooad;


public class Speler {

	private int score;
	private long tijd;

	public Speler() {
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
				", tijd = " + tijd + " seconde" +
				'}';
	}

	public void setTijd(long tijd) {
		this.tijd = tijd;
	}
}
