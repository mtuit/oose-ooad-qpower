package nl.ica.oose.ooad;

/**
 * Created by Mick on 27/03/2017.
 */
public class Timer {

	private final long START_MILLISECONDE;
	private long verstrekenTijd;

	public Timer() {
		this.verstrekenTijd = 0;
		this.START_MILLISECONDE = System.currentTimeMillis();
	}

	public void setVerstrekenTijd() {
		verstrekenTijd = System.currentTimeMillis() - START_MILLISECONDE;
	}

	public long getVerstrekenTijdInSeconde() {
		setVerstrekenTijd();
		return verstrekenTijd / 1000;
	}
}
