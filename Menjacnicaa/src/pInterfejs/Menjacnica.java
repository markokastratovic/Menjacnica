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
		v.setMesec(mesec);
		v.setGodina(godina);
		v.setKupovniKurs(kupovni);
		v.setProdajniKurs(prodajni);
		v.setSrednjiKurs(srednji);
		v.setNaziv(naziv);
		v.setSkraceniNaziv(skraceniNaziv);
		listaValuta.add(v);
	}

	@Override
	public void izbrisiKurs(String skraceniNaziv, int dan, int mesec, int godina) {
		Valuta v=new Valuta();
		v.setDan(dan);
		v.setMesec(mesec);
		v.setGodina(godina);
		v.setSkraceniNaziv(skraceniNaziv);
		if(listaValuta.contains(v)) {
			listaValuta.remove(v);
		}
	}

	@Override
	public Valuta nadjiKurs(String skraceniNaziv, int dan, int mesec, int godina) {
		Valuta v=new Valuta();
		v.setDan(dan);
		v.setMesec(mesec);
		v.setGodina(godina);
		v.setSkraceniNaziv(skraceniNaziv);
		if(listaValuta.contains(v)) {
			int i;
			i=listaValuta.indexOf(v);
			return listaValuta.get(i);
		}
		return null;
	}

}
