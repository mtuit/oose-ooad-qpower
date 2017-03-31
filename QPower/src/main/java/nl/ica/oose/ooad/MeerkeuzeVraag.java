package nl.ica.oose.ooad;

import java.util.List;

public class MeerkeuzeVraag extends Vraag {

	private final List<String> opties;
	private String vraag;
	private String antwoord;

	public MeerkeuzeVraag(String vraag, List<String> opties, String antwoord, String rubriek, String taal) {
		super(vraag, rubriek, taal);
		this.vraag = vraag;
		this.antwoord = antwoord;
		this.opties = opties;
	}

	public boolean checkAntwoord(String antwoordSpeler) {
		return antwoord.equals(antwoordSpeler);
	}

	public String printVraag() {
		StringBuilder sb = new StringBuilder();
		sb.append(vraag + "\n");
		sb.append(opties);
		return sb.toString();
	}
}
