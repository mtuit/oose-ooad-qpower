package nl.ica.oose.ooad;

/**
 * Created by Mick on 31/03/2017.
 */
public class LineairePuntentelling implements IPuntentellingStrategie {

	public int berekenScore(long verstrekenTijd) {
		int score = 100 - (int) verstrekenTijd;
		if (score < 0) {
			return 0;
		} else return score;
	}
}
