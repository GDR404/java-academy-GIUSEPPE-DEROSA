package esercizio2;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int voto;
		int counter=0;
		int somma = 0;
		float media;
		boolean flag = false;
		do
		{
			System.out.println("inserisci un voto: ");
			voto = sc.nextInt();
			if(voto>=18 && voto <=30)
			{
				somma += voto;
				counter++;
			}
			else if(voto == -1)
			{
				flag = true;
			}
			else
			{
				System.out.println("valore inserito non corretto!");
			}
			
		}while(!flag);
		try {
			media = somma/counter;
			System.out.println("la media degli esami sostenuti è: "+media);
		}catch (Exception e) {
		      System.out.println("Non hai inserito voti!");
	    }

		
		
		
	}

}
