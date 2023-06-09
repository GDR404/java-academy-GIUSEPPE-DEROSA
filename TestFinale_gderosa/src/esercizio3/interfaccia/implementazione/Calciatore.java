package esercizio3.interfaccia.implementazione;

import esercizio3.interfaccia.GiocatoreProfessionista;

public class Calciatore implements GiocatoreProfessionista {

	 private String nome, cognome, anno_di_nascita, luogo_di_nascita, squadra, ruolo;
	 private int anni_di_contratto;
	 private double stipendio_annuo,costo_cartellino;
	
	public void setCosto_cartellino(float costo_cartellino) {
		this.costo_cartellino = costo_cartellino;
	}






	public Calciatore(String nome, String cognome, String anno_di_nascita, String luogo_di_nascita, String squadra,
			String ruolo, double costo_cartellino, int anni_di_contratto, double stipendio_annuo) {
		this.nome = nome;
		this.cognome = cognome;
		this.anno_di_nascita = anno_di_nascita;
		this.luogo_di_nascita = luogo_di_nascita;
		this.squadra = squadra;
		this.ruolo = ruolo;
		this.costo_cartellino = costo_cartellino;
		this.anni_di_contratto = anni_di_contratto;
		this.stipendio_annuo = stipendio_annuo;
	}

	
	



	public String getNome() {
		return nome;
	}






	public void setNome(String nome) {
		this.nome = nome;
	}






	public String getCognome() {
		return cognome;
	}






	public void setCognome(String cognome) {
		this.cognome = cognome;
	}






	public String getAnno_di_nascita() {
		return anno_di_nascita;
	}






	public void setAnno_di_nascita(String anno_di_nascita) {
		this.anno_di_nascita = anno_di_nascita;
	}






	public String getLuogo_di_nascita() {
		return luogo_di_nascita;
	}






	public void setLuogo_di_nascita(String luogo_di_nascita) {
		this.luogo_di_nascita = luogo_di_nascita;
	}






	public String getSquadra() {
		return squadra;
	}






	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}






	public String getRuolo() {
		return ruolo;
	}






	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}






	public int getAnni_di_contratto() {
		return anni_di_contratto;
	}






	public void setAnni_di_contratto(int anni_di_contratto) {
		this.anni_di_contratto = anni_di_contratto;
	}






	public double getStipendio_annuo() {
		return stipendio_annuo;
	}






	public void setStipendio_annuo(float stipendio_annuo) {
		this.stipendio_annuo = stipendio_annuo;
	}






	public double getCosto_cartellino() {
		return costo_cartellino;
	}






	@Override
	public String stampaDati() {
		return "Calciatore [nome=" + nome + ", cognome=" + cognome + ", anno_di_nascita=" + anno_di_nascita
				+ ", luogo_di_nascita=" + luogo_di_nascita + ", squadra=" + squadra + ", ruolo=" + ruolo
				+ ", costo_cartellino=" + costo_cartellino + ", anni_di_contratto=" + anni_di_contratto
				+ ", stipendio_annuo=" + stipendio_annuo + "]";
	}






	@Override
	public Float calcolaStipendioMensile() {
		return (float) (this.getStipendio_annuo()/12);
	}

}
