package projet1;



public class Ville {
	/** {@code protected/private Type nomdevariable } ici on declare les variable d'instance qui servent comme attributs a notre class et on
	 * les protege avec private or protected pour etre accessible qu'a l'interieur de notre classe  */
   protected String nomVille;
   protected String nomPays;
   protected int nbreHabitants;
   protected char categorie;
   protected static int nbreInstance=0;
   
 //faire les constructeur de class
   public Ville(){
	    nomVille="inconnu";
	    nomPays="inconnu";
	    nbreHabitants=0;
	    this.setCategorie();
	    nbreInstance++;
	    
	   
   }
   public Ville(String pNom, int pNbre,String pPays)
	  throws NbrHabitantException,VilleNameException
	   {
		   if (pNbre<0)
		   {
			   throw new NbrHabitantException();
		   }
		   if(pNom.length() < 3)
		   {
			   throw new VilleNameException("veuillez saisir le nom complet de la ville");
		   }
		   
		   else 
		   {
	   nomVille=pNom;
	   nomPays=pPays;
	   nbreHabitants=pNbre;
	   nbreInstance++;
	   this.setCategorie();
		   }
		   	   
   }
   
   //les getters et setters (accesseur mutateurs)
   public String getNom(){
	   return nomVille;
   }
   public String getPays(){
	   return nomPays;
   }
   public int getNbrehab(){
	   return nbreHabitants;
  
   }
   public char getCategorie(){
	   return categorie;
   }
   public static int getNbreInstance(){
	   return nbreInstance;
   }
   //============= les setters===========
   public void setNom(String pNom){
	   	   
	   nomVille=pNom;
   }
   public void setPays(String pPays){
	   nomPays=pPays;
   }
   public void setNbreHab(int pNbre)throws NbrHabitantException{
	   
	   
	   if (pNbre<0)
		   throw new NbrHabitantException();
	   else
	   {
		   nbreHabitants=pNbre;
	       this.setCategorie();
	   }
   }
   private void setCategorie(){
	   int born[]={0,1000,10000,100000,1000000,10000000};
	   char cat[]={'?','A','B','C','D','E','F'};
	   int i=0;
	   while(i< born.length && this.nbreHabitants>born[i])
		   i++;
		   this.categorie=cat[i];
		   
	   
   }
   public String decristoi(){
	   return (this.getNom()+" est une ville de : "+this.getNbrehab()+" habitant situé en "+this.getPays()+" dans la categorie : "+this.getCategorie());
   }
   public String toString(){
	   return (this.getNom()+" est une ville de : "+this.getNbrehab()+" situé en "+this.getPays()+" dans la categorie : "+this.getCategorie());
   }
   
	   
   
   public String comparer(Ville v){
	   String str= new String();
	   if (this.getNbrehab()>v.getNbrehab())
	   str=this.getNom()+" est une ville plus peuplé que "+v.getNom();
	   else
		   str=this.getNom()+" est une ville moins peuplé que "+v.getNom();
	   return str;
   }
   
   
   
   
}