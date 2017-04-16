package projet1;
//Package � importer afin d'utiliser l'objet File
import java.io.File;
/**
 * 
 * @author minokil
 * {@code} 
 * @see TrouverFichier
 * 
 *
 */
public class TrouverFichier {
	/**
	 * cette methode permet d'affichage du chemin exact d'un fichier
	 * @param args
	 */

public static void main(String[] args) {
  //Cr�ation de l'objet File
  File f = new File("C:\\intel");
  File f2= new File("D:\\mytest_rep");
  System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
  System.out.println("Nom du fichier : " + f.getName());
  System.out.println("Est-ce qu'il existe ? " + f.exists());
  System.out.println("Est-ce un r�pertoire ? " + f.isDirectory());
  System.out.println("Est-ce un fichier ? " + f.isFile());
  f2.mkdirs();
  System.out.println("le dossier cr�e s'appel : "+f2.getName()+" il se trouve au : "+f2.getParent());
  f2.delete();
  System.out.println("le dossier : "+f2.getName()+" est supprimer");

  
//===================================== afficher le contenu de tout les disque ==================================================
  /**
   * on afficher les lecteurs de root
   */
  
  System.out.println("Affichage des lecteurs � la racine du PC : ");
    for(File file : File.listRoots())
  {
    System.out.println(file.getAbsolutePath());
    try {
      int i = 1;	
      //On parcourt la liste des fichiers et r�pertoires
      for(File nom : file.listFiles()){
        //S'il s'agit d'un dossier, on ajoute un "/"
        System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName()+"/" : nom.getName()));
					
        if((i%4) == 0){
          System.out.print("\n");
        }
        i++;
      }
      System.out.println("\n");
      /**
       * recuperer l'exception si ya pas de pointeurs vers le sous fichier
       */
    } catch (NullPointerException e) {
      //L'instruction peut g�n�rer une NullPointerException
      //s'il n'y a pas de sous-fichier !
    	int i=10;
    	int j=++i; 
    	System.out.println(j);
    }
  }
  }
}

