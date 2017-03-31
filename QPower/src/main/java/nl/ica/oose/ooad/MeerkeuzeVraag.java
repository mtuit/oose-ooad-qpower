package nl.ica.oose.ooad;

import java.util.List;

public class MeerkeuzeVraag extends Vraag {

	private final List<String> opties;
	private String vraag;
	private String antwoord;

	public MeerkeuzeVraag(String vraag, String rubriek, String taal, int beschikbareTijd, List<String> opties, String antwoord) {
		super(vraag, rubriek, taal, beschikbareTijd);
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
