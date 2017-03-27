package nl.ica.oose.ooad;

public abstract class Vraag {

	private String vraag;
	private String rubriek;
	private String taal;
	private int punten;
	private Ronde ronde;

	public Vraag(String vraag, String rubriek, String taal) {
		this.vraag = vraag;
		this.rubriek = rubriek;
		this.taal = taal;
	}

	public abstract boolean checkAntwoord(String antwoordSpeler);

	public String getVraag() {
		return vraag;
	}
}
