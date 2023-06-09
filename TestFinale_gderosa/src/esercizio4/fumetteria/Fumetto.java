package esercizio4.fumetteria;

public class Fumetto extends Libro {
	private String nome, disegnatore;
	
	public Fumetto(String titolo, String autore, String anno_di_pubblicazione, String editore, double costo, String nome, String disegnatore) {
		super(titolo, autore, anno_di_pubblicazione, editore, costo);
		this.nome = nome;
		this.disegnatore = disegnatore;
	}

	public Fumetto() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisegnatore() {
		return disegnatore;
	}

	public void setDisegnatore(String disegnatore) {
		this.disegnatore = disegnatore;
	}

	@Override
	public String toString() {
		return "Fumetto [Nome=" + getNome() + ", Disegnatore=" + getDisegnatore() + ", String="
				+ super.toString() + "]";
	}
	
	
	
	
}
