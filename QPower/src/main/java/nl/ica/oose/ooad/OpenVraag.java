package nl.ica.oose.ooad;

import java.util.List;

public class OpenVraag extends Vraag {

	private List<String> antwoorden;

	public OpenVraag(String vraag, List<String> antwoorden, String rubriek, String taal) {
		super(vraag, rubriek, taal);
		this.antwoorden = antwoorden;
	}
}
