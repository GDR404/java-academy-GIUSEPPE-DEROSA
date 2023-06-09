package esercizio1;

public class main {

	public static void main(String[] args) {
		int [] arr =  {547, 87, 1, 24, 4, 9, 54, 37, 26, 19};
		int somma = 0;
		float media;
		for(int i = 0;i< arr.length;i++)
		{
			somma += arr[i];
		}
		media = somma/arr.length;
		System.out.println("la media è: " + media);
	}

}
