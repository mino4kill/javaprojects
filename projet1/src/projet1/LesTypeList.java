package projet1;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/**Une collection permet de stocker un nombre variable d'objets.
Il y a principalement trois types de collection : les List, les Set et les Map.
Chaque type a ses avantages et ses inconv�nients.
Les Collection stockent des objets alors que les Map stockent un couple cl� - valeur.
Si vous ins�rez fr�quemment des donn�es en milieu de liste, utilisez une LinkedList.
Si vous voulez rechercher ou acc�der � une valeur via une cl� de recherche, optez pour une collection de type Map.
Si vous avez une grande quantit� de donn�es � traiter, tournez-vous vers une liste de type Set.
site de reference Openclassroom copyright 
@see <a  href="https://openclassrooms.com/courses/apprenez-a-programmer-en-java/les-collections-d-objets">Openclassroom</a>
 * 
 * @author minokil
 *
 */
/**
@see projet1
@see projet1.LesTypeList
@see tabstr 
@see #champ 
@see class#champ 
@see #method(Type,Type,...) 
@see class#method(Type,Type,...) 
@see projet1.LesTypeList#main() 
@see <a href=".."> ... </a> 
@see " ... "
*/

public class LesTypeList {
/**Une liste cha�n�e (LinkedList en anglais) est une liste dont chaque �l�ment est li� aux �l�ments adjacents par une r�f�rence � ces derniers.
 *  Chaque �l�ment contient une r�f�rence � l'�l�ment pr�c�dent et � l'�l�ment suivant, except�s le premier, dont l'�l�ment pr�c�dent vaut null, 
 *  et le dernier, dont l'�l�ment suivant vaut �galement null. 
 *   it�rateur est un objet qui a pour r�le de parcourir une collection. C'est d'ailleurs son unique raison d'�tre.
 *    Pour �tre tout � fait pr�cis, l'utilisation des it�rateurs dans Java fonctionne de la m�me mani�re que le pattern du m�me nom. *  */
	public static void main(String[] args) {
	    List l = new LinkedList();
	    l.add(12);
	    l.add("toto ! !");
	    l.add(12.20f);

	    for(int i = 0; i < l.size(); i++)
	      System.out.println("�l�ment � l'index " + i + " = " + l.get(i));

	      System.out.println("\n \tParcours avec un it�rateur ");
	      System.out.println("-----------------------------------");
	      ListIterator li = l.listIterator();

	      while(li.hasNext())
	        System.out.println(li.next());
	      /**Voici un objet bien pratique. ArrayList est un de ces objets qui n'ont pas de taille limite et qui, en plus, acceptent n'importe quel type de donn�es,
	       *  y compris null ! Nous pouvons mettre tout ce que nous voulons dans un ArrayList
	       *  add() permet d'ajouter un �l�ment ;
get(int index) retourne l'�l�ment � l'indice demand� ;
remove(int index) efface l'entr�e � l'indice demand� ;
isEmpty() renvoie � vrai � si l'objet est vide ;
removeAll() efface tout le contenu de l'objet ;
contains(Object element) retourne � vrai � si l'�l�ment pass� en param�tre est dans l'ArrayList.
	       *  */
	      ArrayList al = new ArrayList();
	      al.add(12);
	      al.add("Une cha�ne de caract�res !");
	      al.add(12.20f);
	      al.add('d');
	                  
	      for(int i = 0; i < al.size(); i++)
	      {
	        System.out.println("donn�e � l'indice " + i + " = " + al.get(i));
	      }      
	      System.out.println("=======les hashtable==========================================================================================");
	  /**L'objet Hashtable
 isEmpty() retourne � vrai � si l'objet est vide ;
contains(Object value) retourne � vrai � si la valeur est pr�sente. Identique � containsValue(Object value) ;
containsKey(Object key) retourne � vrai � si la cl� pass�e en param�tre est pr�sente dans la Hashtable ;
put(Object key, Object value) ajoute le couple key - value dans l'objet ;
elements() retourne une �num�ration des �l�ments de l'objet ;
keys() retourne la liste des cl�s sous forme d'�num�ration.
De plus, il faut savoir qu'un objet Hashtable n'accepte pas la valeur null et qu'il est Thread Safe, 
c'est-�-dire qu'il est utilisable dans plusieurs threads (cela signifie que plusieurs �l�ments de votre programme peuvent l'utiliser simultan�ment ;
 nous y reviendrons) simultan�ment sans qu'il y ait un risque de conflit de donn�es.
 L'objet HashMap

Cet objet ne diff�re que tr�s peu de la Hashtable:

il accepte la valeur null ;
il n'est pas Thread Safe.

Vous pouvez �galement dire � table de hachage �, si vous traduisez mot � mot� On parcourt cet objet gr�ce aux cl�s qu'il contient en recourant � la classe Enumeration. L'objet Enumeration contient notre Hashtable et permet de le parcourir tr�s simplement. 
Regardez, le code suivant ins�re les quatre saisons avec des cl�s qui ne se suivent pas, et notre �num�ration r�cup�re seulement les valeurs*/
	      Hashtable ht = new Hashtable();
	      ht.put(1, "printemps");
	      ht.put(10, "�t�");
	      ht.put(12, "automne");
	      ht.put(45, "hiver");

	      Enumeration e = ht.elements();

	      while(e.hasMoreElements())
	        System.out.println(e.nextElement());
	 
	      System.out.println("=======les sets==========================================================================================");
  
	      /**Un Set est une collection qui n'accepte pas les doublons. Par exemple, elle n'accepte qu'une seule fois null, 
	       * car deux valeurs null sont consid�r�es comme un doublon. On trouve parmi les Set les objets HashSet, TreeSet,
	       *  LinkedHashSet� Certains Set sont plus restrictifs que d'autres : il en existe qui n'acceptent pas null, certains types d'objets, etc.
	      Les Set sont particuli�rement adapt�s pour manipuler une grande quantit� de donn�es. Cependant, les performances de ceux-ci peuvent �tre amoindries en insertion. G�n�ralement, on opte pour un HashSet, car il est plus performant en temps d'acc�s, 
	      mais si vous avez besoin que votre collection soit constamment tri�e, optez pour un TreeSet.
	     add() ajoute un �l�ment ;
contains(Object value) retourne � vrai � si l'objet contient value ;
isEmpty() retourne � vrai � si l'objet est vide ;
iterator() renvoie un objet de type Iterator ;
remove(Object o) retire l'objet o de la collection ;
toArray() retourne un tableau d'Object.
	       */
	      HashSet hs = new HashSet();
	      hs.add("toto");
	      hs.add(12);
	      hs.add('d');

	      Iterator it = hs.iterator();
	      while(it.hasNext())
	        System.out.println(it.next());
	   
	      System.out.println("\nParcours avec un tableau d'objet");
	      System.out.println("-----------------------------------");
	                  
	      Object[] obj = hs.toArray();
	      for(Object o : obj)
	        System.out.println(o);    


	}
}
