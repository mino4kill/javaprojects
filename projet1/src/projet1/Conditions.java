package projet1;
import java.util.*;
public class Conditions {

	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("donner votre avis sur ce cours bon,mauvais,moyen?");
		sc = new Scanner(System.in);
		String avis=sc.nextLine();
		/*float a=sc.nextFloat();
		if (a<0)
		System.out.println("le nombre est negatif");
		else if (a==0)
			System.out.println("le nombre est nul");
		else
			System.out.println("le nombre est postif");
			*/
	/*	int x = 10, y = 20;
		int max = (x < y) ? y : x ; //Maintenant, max vaut 20
		Ce qui se trouve entre les parenthèses est évalué : x est-il plus petit que y ? Donc, deux cas de figure se profilent à l'horizon :
				si la condition renvoie true (vrai), qu'elle est vérifiée, la valeur qui se trouve après le ? sera affectée ;
				sinon, la valeur se trouvant après le symbole: sera affectée.*/
		switch (avis)
		{
			case "bon":
			System.out.println("tres bon");
			break;
			case "mauvais":
				System.out.println("c'est de la merde");
				break;
			case "moyen":
				System.out.println("pas mal");
				break;
			default:
				System.out.println("try again please");
				
		}
		
	}

}
