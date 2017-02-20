package projet1;

import java.util.Scanner;

public class TestObjet {

	public static void main(String[] args) {
		Ville v= null;
		Ville v2= null;
		Ville v1= null;
		Personne p1=null;
		Capitale cap2 = null; 
		Scanner sc= new Scanner(System.in);
		Ville v3= new Ville();
		
		
		try {
			//v3=new Ville(v3.setNom(sc.nextLine()),v3.setNbreHab(sc.nextInt()),v3.setPays(sc.next()));
			//v3=new Ville(sc.nextLine(),sc.nextInt(),sc.next());
			 v=new Ville();
			 p1= new Personne("Atig","Amine","1988-11-10","Saida");
			cap2 = new Capitale("paris ",1200004,"France","la tour eifel");
			 v1 = new Ville("Marseille", -123456, "France");  
			 v2 = new Ville("Rio", 32_160_054, "Brésil");
			/* System.out.println("veuillez definir le nombre d'habitants");
			 v1.setNbreHab(sc.nextInt());*/
			 
		} catch (NbrHabitantException|VilleNameException e) {
			// catch exception si le nombre de population est negative
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}finally{
			if(v1==null)
				v1=new Ville();
				
		}
		//System.out.println(v3.decristoi());
	  //  System.out.println(p1.getClass().getSimpleName()+'\b'+p1.getNom()+'\b'+p1.getPrenom()+'\b'+p1.getDate()+'\b'+p1.getLieux());
		//v.setNom("paris");
		//System.out.println(v2.comparer(v1));
		System.out.println(v1.decristoi());
		//System.out.println(Ville.getNbreInstance());
		//System.out.println(v1.decristoi());
		
		
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
