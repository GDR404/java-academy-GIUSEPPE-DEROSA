package esercizio4.fumetteria;

public class Libro {
	private String titolo, autore, anno_di_pubblicazione,editore;
	private double  costo;
	public Libro(String titolo, String autore, String anno_di_pubblicazione, String editore, double costo) {
		this.titolo = titolo;
		this.autore = autore;
		this.anno_di_pubblicazione = anno_di_pubblicazione;
		this.editore = editore;
		this.costo = costo;
	}
	
	public Libro() {
		
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getAnno_di_pubblicazione() {
		return anno_di_pubblicazione;
	}
	public void setAnno_di_pubblicazione(String anno_di_pubblicazione) {
		this.anno_di_pubblicazione = anno_di_pubblicazione;
	}
	public String getEditore() {
		return editore;
	}
	public void setEditore(String editore) {
		this.editore = editore;
	}
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	@Override
	public String toString() {
		return "Libro [Titolo=" + getTitolo() + ", Autore=" + getAutore() + ", Anno_di_pubblicazione="
				+ getAnno_di_pubblicazione() + ", Editore=" + getEditore() + ", Costo=" + getCosto() + "]";
	}

	
}
