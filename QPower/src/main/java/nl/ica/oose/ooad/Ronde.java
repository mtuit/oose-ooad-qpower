package nl.ica.oose.ooad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Ronde {

	private Speler speler;
	private long totaleTijd;
	private List<Vraag> vragen;

	public Ronde(Speler speler) {
		this.speler = speler;
		this.vragen = genereerRonde();
	}

	public void startRonde() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Timer timer = new Timer();
		for (Vraag vraag : vragen) {
			System.out.println(vraag.printVraag());
			String antwoord = br.readLine();

			if (vraag.checkAntwoord(antwoord)) {
				speler.setScore(speler.getScore() + 10);
				totaleTijd = timer.getVerstrekenTijdInSeconde();
			} else if (!vraag.checkAntwoord(antwoord)){
				// Do nothing
			} else if (timer.getVerstrekenTijdInSeconde() > vraag.getBeschikbareTijdInSeconde()){
				System.out.println("Tijd is verstreken!");
			}
		}
		totaleTijd = timer.getVerstrekenTijdInSeconde();
	}

	public List<Vraag> genereerRonde() {
		QuizData quizData = new QuizData();
		vragen = quizData.getVragen();
		return vragen;
	}

	@Override
	public String toString() {
		return "totaleTijd = " + totaleTijd;
	}
}
