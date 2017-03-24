package nl.ica.oose.ooad;

import java.util.ArrayList;
import java.util.List;

public class Ronde {

	private int totaleTijd;
	private List<Vraag> vragen;
	private Quiz quiz;

	public Ronde() {
		this.vragen = genereerRonde();
	}

	public void startRonde() {
	}

	public List<Vraag> genereerRonde() {
		vragen = new ArrayList<Vraag>();
		return vragen;
	}


}
