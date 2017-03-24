package nl.ica.oose.ooad;

import java.util.List;

public class MeerkeuzeVraag extends Vraag {

	private final List<String> opties;
	private String antwoord;

	public MeerkeuzeVraag(String vraag, List<String> opties, String antwoord, String rubriek, String taal) {
		super(vraag, rubriek, taal);
		this.antwoord = antwoord;
		this.opties = opties;
	}
}
