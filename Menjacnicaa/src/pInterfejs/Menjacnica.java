package pInterfejs;

import menjacnica.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {

	@Override
	public void dodajKurs(String skraceniNaziv, String naziv, int dan, int mesec, int godina, double srednji,
			double kupovni, double prodajni) {
		

	}

	@Override
	public void izbrisiKurs(String skraceniNaziv, String naziv, int dan, int mesec, int godina, double srednji,
			double kupovni, double prodajni) {
		

	}

	@Override
	public Valuta nadjiKurs(String skraceniNaziv, int dan, int mesec, int godina) {
		
		return null;
	}

}
