package nl.ica.oose.ooad;

import java.util.List;

public class OpenVraag extends Vraag {

	private List<String> antwoorden;

	public OpenVraag(String vraag, String rubriek, String taal, int beschikbareTijd, List<String> antwoorden) {
		super(vraag, rubriek, taal, beschikbareTijd);
		this.vraag = vraag;
		this.antwoorden = antwoorden;
	}

	public boolean checkAntwoord(String antwoordSpeler) {
		for (String antwoord : antwoorden) {
			if (antwoord.equals(antwoordSpeler)) {
				return true;
			}
		}
		return false;
	}

	public String printVraag() {
		StringBuilder sb = new StringBuilder();
		sb.append(vraag);
		return sb.toString();
	}

}
