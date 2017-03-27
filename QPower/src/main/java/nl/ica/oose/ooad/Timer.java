package nl.ica.oose.ooad;

/**
 * Created by Mick on 27/03/2017.
 */
public class Timer {

	private final long START_MILLIS;
	private long verstrekenTijd;

	public Timer() {
		this.verstrekenTijd = 0;
		this.START_MILLIS = System.currentTimeMillis();
	}

	public void setVerstrekenTijd() {
		verstrekenTijd = System.currentTimeMillis() - START_MILLIS;
	}

	public long getVerstrekenTijdInSeconde() {
		setVerstrekenTijd();
		return verstrekenTijd / 1000;
	}
}
