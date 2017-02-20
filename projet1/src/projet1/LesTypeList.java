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
Chaque type a ses avantages et ses inconvénients.
Les Collection stockent des objets alors que les Map stockent un couple clé - valeur.
Si vous insérez fréquemment des données en milieu de liste, utilisez une LinkedList.
Si vous voulez rechercher ou accéder à une valeur via une clé de recherche, optez pour une collection de type Map.
Si vous avez une grande quantité de données à traiter, tournez-vous vers une liste de type Set.
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
/**Une liste chaînée (LinkedList en anglais) est une liste dont chaque élément est lié aux éléments adjacents par une référence à ces derniers.
 *  Chaque élément contient une référence à l'élément précédent et à l'élément suivant, exceptés le premier, dont l'élément précédent vaut null, 
 *  et le dernier, dont l'élément suivant vaut également null. 
 *   itérateur est un objet qui a pour rôle de parcourir une collection. C'est d'ailleurs son unique raison d'être.
 *    Pour être tout à fait précis, l'utilisation des itérateurs dans Java fonctionne de la même manière que le pattern du même nom. *  */
	public static void main(String[] args) {
	    List l = new LinkedList();
	    l.add(12);
	    l.add("toto ! !");
	    l.add(12.20f);

	    for(int i = 0; i < l.size(); i++)
	      System.out.println("Élément à l'index " + i + " = " + l.get(i));

	      System.out.println("\n \tParcours avec un itérateur ");
	      System.out.println("-----------------------------------");
	      ListIterator li = l.listIterator();

	      while(li.hasNext())
	        System.out.println(li.next());
	      /**Voici un objet bien pratique. ArrayList est un de ces objets qui n'ont pas de taille limite et qui, en plus, acceptent n'importe quel type de données,
	       *  y compris null ! Nous pouvons mettre tout ce que nous voulons dans un ArrayList
	       *  add() permet d'ajouter un élément ;
get(int index) retourne l'élément à l'indice demandé ;
remove(int index) efface l'entrée à l'indice demandé ;
isEmpty() renvoie « vrai » si l'objet est vide ;
removeAll() efface tout le contenu de l'objet ;
contains(Object element) retourne « vrai » si l'élément passé en paramètre est dans l'ArrayList.
	       *  */
	      ArrayList al = new ArrayList();
	      al.add(12);
	      al.add("Une chaîne de caractères !");
	      al.add(12.20f);
	      al.add('d');
	                  
	      for(int i = 0; i < al.size(); i++)
	      {
	        System.out.println("donnée à l'indice " + i + " = " + al.get(i));
	      }      
	      System.out.println("=======les hashtable==========================================================================================");
	  /**L'objet Hashtable
 isEmpty() retourne « vrai » si l'objet est vide ;
contains(Object value) retourne « vrai » si la valeur est présente. Identique à containsValue(Object value) ;
containsKey(Object key) retourne « vrai » si la clé passée en paramètre est présente dans la Hashtable ;
put(Object key, Object value) ajoute le couple key - value dans l'objet ;
elements() retourne une énumération des éléments de l'objet ;
keys() retourne la liste des clés sous forme d'énumération.
De plus, il faut savoir qu'un objet Hashtable n'accepte pas la valeur null et qu'il est Thread Safe, 
c'est-à-dire qu'il est utilisable dans plusieurs threads (cela signifie que plusieurs éléments de votre programme peuvent l'utiliser simultanément ;
 nous y reviendrons) simultanément sans qu'il y ait un risque de conflit de données.
 L'objet HashMap

Cet objet ne diffère que très peu de la Hashtable:

il accepte la valeur null ;
il n'est pas Thread Safe.

Vous pouvez également dire « table de hachage », si vous traduisez mot à mot… On parcourt cet objet grâce aux clés qu'il contient en recourant à la classe Enumeration. L'objet Enumeration contient notre Hashtable et permet de le parcourir très simplement. 
Regardez, le code suivant insère les quatre saisons avec des clés qui ne se suivent pas, et notre énumération récupère seulement les valeurs*/
	      Hashtable ht = new Hashtable();
	      ht.put(1, "printemps");
	      ht.put(10, "été");
	      ht.put(12, "automne");
	      ht.put(45, "hiver");

	      Enumeration e = ht.elements();

	      while(e.hasMoreElements())
	        System.out.println(e.nextElement());
	 
	      System.out.println("=======les sets==========================================================================================");
  
	      /**Un Set est une collection qui n'accepte pas les doublons. Par exemple, elle n'accepte qu'une seule fois null, 
	       * car deux valeurs null sont considérées comme un doublon. On trouve parmi les Set les objets HashSet, TreeSet,
	       *  LinkedHashSet… Certains Set sont plus restrictifs que d'autres : il en existe qui n'acceptent pas null, certains types d'objets, etc.
	      Les Set sont particulièrement adaptés pour manipuler une grande quantité de données. Cependant, les performances de ceux-ci peuvent être amoindries en insertion. Généralement, on opte pour un HashSet, car il est plus performant en temps d'accès, 
	      mais si vous avez besoin que votre collection soit constamment triée, optez pour un TreeSet.
	     add() ajoute un élément ;
contains(Object value) retourne « vrai » si l'objet contient value ;
isEmpty() retourne « vrai » si l'objet est vide ;
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
