package esercizio4.fumetteria;

public class MainTest {

	public static void main(String[] args) {
		int numero_di_fumetti_massimi=2;
		
		Fumetto [] myFumetto = new Fumetto[numero_di_fumetti_massimi];
		myFumetto[0] = new Fumetto("myTitolo","myAutore","myAnno","myEditore", 13.99,"myNome","myDisegnatore");
		myFumetto[1] = new Fumetto("myTitolo2","myAutore2","myAnno2","myEditore2", 23.99,"myNome2","myDisegnatore2");		
		Fumetteria myFumetteria = new Fumetteria("Pippo","Viaxx","Giorgio",numero_di_fumetti_massimi,myFumetto);
		myFumetteria.stampaDati();
	}

}
