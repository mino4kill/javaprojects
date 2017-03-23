package projet1;
//Package à importer afin d'utiliser l'objet File
import java.io.File;

public class TrouverFichier {
public static void main(String[] args) {
	
	 
  //Création de l'objet File
  File f = new File("C:\\intel");
  File f2= new File("D:\\mytest_rep");
  System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
  System.out.println("Nom du fichier : " + f.getName());
  System.out.println("Est-ce qu'il existe ? " + f.exists());
  System.out.println("Est-ce un répertoire ? " + f.isDirectory());
  System.out.println("Est-ce un fichier ? " + f.isFile());
  f2.mkdirs();
  System.out.println("le dossier crée s'appel : "+f2.getName()+" il se trouve au : "+f2.getParent());
  f2.delete();
  System.out.println("le dossier : "+f2.getName()+" est supprimer");

  
//===================================== afficher le contenu de tout les disque ==================================================
  System.out.println("Affichage des lecteurs à la racine du PC : ");
    for(File file : File.listRoots())
  {
    System.out.println(file.getAbsolutePath());
    try {
      int i = 1;	
      //On parcourt la liste des fichiers et répertoires
      for(File nom : file.listFiles()){
        //S'il s'agit d'un dossier, on ajoute un "/"
        System.out.print("\t\t" + ((nom.isDirectory()) ? nom.getName()+"/" : nom.getName()));
					
        if((i%4) == 0){
          System.out.print("\n");
        }
        i++;
      }
      System.out.println("\n");
    } catch (NullPointerException e) {
      //L'instruction peut générer une NullPointerException
      //s'il n'y a pas de sous-fichier !
    	
    }
    
  }
   
  }
}

