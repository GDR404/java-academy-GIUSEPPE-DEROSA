package esercizio4.fumetteria;

public class Fumetteria {
	private String nome, via, titolare;
	private int numero_di_fumetti_massimi;
	Fumetto[] myFumetto = new Fumetto[numero_di_fumetti_massimi];
	public Fumetteria(String nome, String via, String titolare, int numero_di_fumetti_massimi, Fumetto[] myFumetto) {
		this.nome = nome;
		this.via = via;
		this.titolare = titolare;
		this.numero_di_fumetti_massimi = numero_di_fumetti_massimi;
		this.myFumetto = myFumetto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getTitolare() {
		return titolare;
	}
	public void setTitolare(String titolare) {
		this.titolare = titolare;
	}
	public int getNumero_di_fumetti_massimi() {
		return numero_di_fumetti_massimi;
	}
	public void setNumero_di_fumetti_massimi(int numero_di_fumetti_massimi) {
		this.numero_di_fumetti_massimi = numero_di_fumetti_massimi;
	}
	public Fumetto[] getMyFumetto() {
		return myFumetto;
	}
	public void setMyFumetto(Fumetto[] myFumetto) {
		this.myFumetto = myFumetto;
	}
	
	public void stampaDati() {
		System.out.println("Fumetteria [Nome=" + getNome() + ", Via=" + getVia() + ", Titolare=" + getTitolare()
				+ "]");
		for(int i = 0;i < getNumero_di_fumetti_massimi();i++)
		{
			System.out.println(myFumetto[i].toString());
		}
	}
	
	
	

}
