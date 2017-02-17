package projet1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne {
    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private String lieuDeNaissance;
      
      public Personne(){
    	  nom="nul";
    	  prenom="nul";
    	  SimpleDateFormat dateDeNaissance=new SimpleDateFormat();
    	  lieuDeNaissance="nul";	
      }
      public Personne(String nm,String pn, String dt,String lx){
    	  nom=nm;
    	  prenom=pn;
    	  lieuDeNaissance=lx;
    	  try{
    		    dateDeNaissance=new SimpleDateFormat("yyyy-MM-dd").parse(dt);
    		  } catch(ParseException e) {
    		     e.printStackTrace();
    		  }
      }
      //*****************************************************************************************************
      public String getNom(){
    	  return nom;
      }
      public String getPrenom(){
    	  return prenom;
      }
      public String getLieux(){
    	  return lieuDeNaissance;
      }
      public Date getDate(){
    	  return dateDeNaissance;
      }
      //******************************************************************************************************
      public void setNom(String nm){
    	  nom=nm;
      }
      public void setPrenom(String pn){
    	  prenom=pn;
      }
      public void setDate(Date dt){
    	  dateDeNaissance=dt;
      }
      public void setLieux(String lx){
    	  lieuDeNaissance=lx;
      }
}