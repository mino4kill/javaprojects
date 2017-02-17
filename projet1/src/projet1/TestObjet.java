package projet1;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class TestObjet {

	public static void main(String[] args) {
		try{
		Ville v = new Ville();
		Ville v1 = new Ville("Marseille", 123456, "France");       
		Ville v2 = new Ville("Rio", 32_160_054, "Brésil");
		Capitale cap= new Capitale();
		Capitale cap2=new Capitale("paris",1200004,"France","la tour eifel");
		Personne p1= new Personne("Atig","Amine","1985-06-10","Saida");
		
		v.setNom("paris");
		System.out.println(v2.comparer(v1));
		System.out.println(cap2.decristoi());
		System.out.println(Ville.getNbreInstance());
		}catch(NbrHabitantException e){}
		
	/*   Ville temp = new Ville();
		temp = v1;
		v1 = v2;
		v2 = temp;
		System.out.println("changement de parametres entre v1 et V2");       
		Afficher(v1);
		Afficher(v2);
		
		v1.setNom("Hong Kong");
		v2.setNom("Djibouti");
		System.out.println("changement nom de ville de v1 et v2");
		Afficher(v1);
		Afficher(v2);     
		
	}
	public static void Afficher(Ville v){
		 
		System.out.println(v.getNom()+" ville de  "+v.getNombreHabitants()+ " habitants se situant en "+v.getNomPays());
	 }*/
}
}
