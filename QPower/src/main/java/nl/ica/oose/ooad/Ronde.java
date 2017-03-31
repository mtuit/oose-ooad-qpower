package nl.ica.oose.ooad;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Ronde {

	private Speler speler;
	private int totaleTijd;
	private List<Vraag> vragen;
	private Quiz quiz;

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
				speler.setTijd(timer.getVerstrekenTijdInSeconde());
			} else {
				speler.setTijd(timer.getVerstrekenTijdInSeconde());
				System.out.println("Fout!");
				break;
			}
		}
	}

	public List<Vraag> genereerRonde() {
		QuizData quizData = new QuizData();
		vragen = quizData.getVragen();
		return vragen;
	}


}
