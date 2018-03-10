package menjacnica;
import java.util.GregorianCalendar;

public class Valuta {
	private String naziv, skraceniNaziv;
	private int dan, mesec, godina;
	private double kupovniKurs, srednjiKurs, prodajniKurs;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(!(naziv==null))
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(!(naziv==null))
		this.skraceniNaziv = skraceniNaziv;
	}
	public int getDan() {
		return dan;
	}
	public void setDan(int dan) {
		if(dan>0&&dan<=31)
		this.dan = dan;
	}
	public int getMesec() {
		return mesec;
	}
	public void setMesec(int mesec) {
		if(mesec>0&&mesec<=12)
		this.mesec = mesec;
	}
	public int getGodina() {
		return godina;
	}
	public void setGodina(int godina) {
		if(godina>=2000&&godina<=(new GregorianCalendar().get(GregorianCalendar.YEAR)))
		this.godina = godina;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs>0)
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs>0)
		this.srednjiKurs = srednjiKurs;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs>0)
		this.prodajniKurs = prodajniKurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dan;
		result = prime * result + godina;
		result = prime * result + mesec;
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (dan != other.dan)
			return false;
		if (godina != other.godina)
			return false;
		if (mesec != other.mesec)
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return naziv+" na dan "+dan+" "+mesec+" "+godina+" :"
				+"kupovni:"+kupovniKurs+" srednji:"+srednjiKurs+" prodajni:"+prodajniKurs;
	}
	
}
