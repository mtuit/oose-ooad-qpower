package nl.ica.oose.ooad;

public abstract class Vraag {

	protected String vraag;
	protected String rubriek;
	protected String taal;
	protected int beschikbareTijdInSeconde;

	public Vraag(String vraag, String rubriek, String taal, int beschikbareTijdInSeconde) {
		this.vraag = vraag;
		this.rubriek = rubriek;
		this.taal = taal;
		this.beschikbareTijdInSeconde = beschikbareTijdInSeconde;
	}

	public abstract boolean checkAntwoord(String antwoordSpeler);

	public abstract String printVraag();

	public int getBeschikbareTijdInSeconde() {
		return beschikbareTijdInSeconde;
	}
}
