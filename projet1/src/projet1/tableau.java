package projet1;
import java.util.Scanner;
public class tableau {

	public static void main(String[] args) {
		char tab[]={'a','b','c','d','e','f'};
		for(int i=0;i<tab.length;i++)
		{
			System.out.println("l'emplacement "+i+" dans le tableau correspond � "+tab[i]);
		}
	/*	char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		int i = 0;
		char reponse = ' ',carac = ' ';
		Scanner sc = new Scanner(System.in);
		         
		do {//Boucle principale
		  do {//On r�p�te cette boucle tant que l'utilisateur n'a pas rentr� une lettre figurant dans le tableau
		    i = 0;
		    System.out.println("Rentrez une lettre en minuscule, SVP ");
		                
		    carac = sc.nextLine().charAt(0);
		    //Boucle de recherche dans le tableau
		    while(i < tableauCaractere.length && carac != tableauCaractere[i])
		      i++;
		         
		    //Si i < 7 c'est que la boucle n'a pas d�pass� le nombre de cases du tableau 
		    if (i < tableauCaractere.length)
		      System.out.println(" La lettre " +carac+ " se trouve bien dans le tableau !");
		    else //Sinon
		      System.out.println(" La lettre " +carac+ " ne se trouve pas dans le tableau !");
		         
		  }while(i >= tableauCaractere.length);

		  //Tant que la lettre de l'utilisateur ne correspond pas � une lettre du tableau    
		  do{
		    System.out.println("Voulez-vous essayer � nouveau ? (O/N)");
		    reponse = sc.nextLine().charAt(0);
		  }while(reponse != 'N' && reponse != 'O');      
		}while (reponse == 'O');
		                
		System.out.println("Au revoir !");*/
	}

}
