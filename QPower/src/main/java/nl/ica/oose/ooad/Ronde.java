package nl.ica.oose.ooad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Ronde {

	private final IPuntentellingStrategie puntentellingStrategie;
	private long rondeTijd;
	private int rondeScore;
	private List<Vraag> vragen;

	public Ronde(IPuntentellingStrategie strategie) {
		this.puntentellingStrategie = strategie;
		this.vragen = genereerRonde();
	}

	public void startRonde() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Timer timer = new Timer();
		for (Vraag vraag : vragen) {
			System.out.println(vraag.printVraag());
			String antwoord = br.readLine();

			if (vraag.checkAntwoord(antwoord)) {
				updateRondeScore(timer);
				updateRondeTijd(timer);
			} else if (!vraag.checkAntwoord(antwoord)){
				// Do nothing
			} else if (timer.getVerstrekenTijdInSeconde() > vraag.getBeschikbareTijdInSeconde()){
				System.out.println("Tijd is verstreken!");
			}
		}
		rondeTijd = timer.getVerstrekenTijdInSeconde();
	}

	private void updateRondeTijd(Timer timer) {
		rondeTijd = timer.getVerstrekenTijdInSeconde();
	}

	private void updateRondeScore(Timer timer) {
		rondeScore += puntentellingStrategie.berekenScore(timer.getVerstrekenTijdInSeconde());
	}

	public List<Vraag> genereerRonde() {
		QuizData quizData = new QuizData();
		vragen = quizData.getVragen();
		return vragen;
	}

	public int getRondeScore() {
		return rondeScore;
	}

	@Override
	public String toString() {
		return "rondeTijd = " + rondeTijd;
	}
}
