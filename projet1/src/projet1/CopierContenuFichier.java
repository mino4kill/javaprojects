package projet1;
//Packages à importer afin d'utiliser les objets
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class CopierContenuFichier {
	
	   public static void main(String[] args) {
		   /**double[] data = {15.9, 21.2, 18.4, 25.4, 31.1};
File f = new File ("temperatures");
 
try
{
    FileWriter fw = new FileWriter (f);
 
    for (double d : data)
    {
        fw.write (String.valueOf (d));
        fw.write ("\r\n");
    }
 
    fw.close();
}
catch (IOException exception)
{
    System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
}
FileInputStream fis = new FileInputStream(new File("toto.txt"));
DataInputStream dis = new DataInputStream(fis);
BufferedInputStream bis = new BufferedInputStream(dis);
//Ou en condensé : 
BufferedInputStream  bis = new BufferredInputStream(
                             new DataInputStream(
                               new FileInputStream(
                                 new File("toto.txt"))));
*/
		   
	      // Nous déclarons nos objets en dehors du bloc try/catch
	      FileInputStream fis = null;
	      FileOutputStream fos = null;
	      FileWriter fichier = null;
	      String str = new String("ceci est un test");
	      try {
	    	fichier = new FileWriter("c:\\text3.txt");
			fichier.write("Mon premier fichier, priere de m'aider!  "+(int)Math.random()+" "+String.valueOf(str)+"\r\n"+args[0]);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fichier.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
	         // On instancie nos objets :
	         // fis va lire le fichier
	         // fos va écrire dans le nouveau !
	          fis = new FileInputStream(new File("c:\\text1.txt"));
	          fos = new FileOutputStream(new File("c:\\text2.txt"));

	         // On crée un tableau de byte pour indiquer le nombre de bytes lus à
	         // chaque tour de boucle
	         byte[] buf = new byte[1];

	         // On crée une variable de type int pour y affecter le résultat de
	         // la lecture
	         // Vaut -1 quand c'est fini
	         int n = 0;

	         // Tant que l'affectation dans la variable est possible, on boucle
	         // Lorsque la lecture du fichier est terminée l'affectation n'est
	         // plus possible !
	         // On sort donc de la boucle
	         while ((n = fis.read(buf)) >= 0) {
	            // On écrit dans notre deuxième fichier avec l'objet adéquat
	            fos.write(buf);
	            
	            // On affiche ce qu'a lu notre boucle au format byte et au
	            // format char
	            for (byte bit : buf) {
	               System.out.print("\t" + bit + "(" + (char) bit + ")");
	            }
	            System.out.println("");
	            //Nous réinitialisons le buffer à vide
	            //au cas où les derniers byte lus ne soient pas un multiple de 8
	            //Ceci permet d'avoir un buffer vierge à chaque lecture et ne pas avoir de doublon en fin de fichier
	           // buf = new byte[8];
	           

	         }
	         System.out.println("Copie terminée !");

	      } catch (FileNotFoundException e) {
	         // Cette exception est levée si l'objet FileInputStream ne trouve
	         // aucun fichier
	         e.printStackTrace();
	      } catch (IOException e) {
	         // Celle-ci se produit lors d'une erreur d'écriture ou de lecture
	         e.printStackTrace();
	      } finally {
	    	  
	         // On ferme nos flux de données dans un bloc finally pour s'assurer
	         // que ces instructions seront exécutées dans tous les cas même si
	         // une exception est levée !
	         try {
	            if (fis != null)
	               fis.close();
	         } catch (IOException e) {
	            e.printStackTrace();
	         }

	         try {
	            if (fos != null)
	               fos.close();
	         } catch (IOException e) {
	            e.printStackTrace();
	         }
	      }
	   }
	}
