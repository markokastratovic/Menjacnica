package pInterfejs;

import java.util.LinkedList;

import menjacnica.Valuta;

public class Menjacnica implements MenjacnicaInterfejs {
	LinkedList<Valuta>listaValuta=new LinkedList<Valuta>();
	
	@Override
	public void dodajKurs(String skraceniNaziv, String naziv, int dan, int mesec, int godina, double srednji,
			double kupovni, double prodajni) {
		Valuta v=new Valuta();
		v.setDan(dan);
		v.setGodina(godina);
		v.setMesec(mesec);
		v.setKupovniKurs(kupovni);
		v.setProdajniKurs(prodajni);
		v.setSrednjiKurs(srednji);
		v.setNaziv(naziv);
		v.setSkraceniNaziv(skraceniNaziv);
		listaValuta.addFirst(v);

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
