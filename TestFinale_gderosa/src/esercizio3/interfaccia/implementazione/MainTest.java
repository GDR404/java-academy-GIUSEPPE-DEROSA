package esercizio3.interfaccia.implementazione;

public class MainTest {

	public static void main(String[] args) {
		Calciatore myCalciatore = new Calciatore("Cristiano","Ronaldo","29/05/1990","Spagna","Roma","Attaccante",800.65,4,100000.56);
		System.out.println(myCalciatore.calcolaStipendioMensile());
		System.out.println(myCalciatore.stampaDati());
	}

}
