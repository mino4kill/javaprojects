package projet1;
import java.util.*;

public class Boucles {
	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
char reponse='o';
String prenom;
while(reponse=='o')
{
	System.out.println("donner un prenom : ");
	prenom=sc.nextLine();
	System.out.println("bonjour " +prenom+ ", Comment allez vous");
	reponse = ' ';
    
	  //Tant que la réponse n'est pas O ou N, on repose la question
	  while(reponse !='o'&& reponse != 'n')
	  {
	    //On demande si la personne veut faire un autre essai
	    System.out.println("Voulez-vous réessayer ? (O/N)");
	    reponse = sc.nextLine().charAt(0);
}
}
System.out.println("au revoir");

/*String prenom = new String();
//Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
char reponse = ' ';
 
Scanner sc = new Scanner(System.in);
 
do{
  System.out.println("Donnez un prénom : ");
  prenom = sc.nextLine();
  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
       
  do{
    System.out.println("Voulez-vous réessayer ? (O/N)");
    reponse = sc.nextLine().charAt(0);
  }while(reponse != 'O' && reponse != 'N');
        
}while (reponse == 'O');
 
System.out.println("Au revoir…");

for(int i = 1; i <= 10; i++)
{
  System.out.println("Voici la ligne "+i);
}
for(int i = 0, j = 2; (i < 10 && j < 6); i++, j+=2){
  System.out.println("i = " + i + ", j = " + j);
}

*/
	}

}
