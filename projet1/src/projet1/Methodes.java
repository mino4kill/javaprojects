package projet1;
import java.lang.*;
import java.util.ArrayList;
public class Methodes {

	  public static void main(String[] args)
	  {
		  String tab1[][]={{"atig","mohamed","amine"},{"10","06","1985"}};
		  int ind=0;
		  String ph="bonjour comment allez vous";
		  int tab2[][]={{1,2,3},{2,3,5}};
		  String tab3[]={"regarde","cest","bon"};
		
		  		
		 System.out.println(returnIndexesOfChar(ph,'o'));
	   
		  //System.out.println(concat(tab1));
	  }      
	  public static void parcours(String[][] tab){
		  for(String soustab[]:tab)
			  for(String str:soustab)
				  System.out.println(str);
		  
	  }
	  public static void parcours(int[][] tab){
		  for(int soustab[]:tab)
			  for(int str:soustab)
				  System.out.println(str);
		  
	  }
	  public static String concat(String[][] tab){
		 String res=new String();
		  for(String soustab[]:tab)
			  for(String str:soustab)
				  res+=str+' ';
				  return res;
	}
	  public static String concat(String[] tab){
			 String res="";
			  for(String str:tab)
				 	  res=res+str;
					  return res;
					  
			  
		}
	  public static void index(String str,char x){
		 int i;
		 for(i=0;i<=str.length();i++){
			 if (str.indexOf(x,i)!=-1){
				 if(str.indexOf(x,i)!=-1)
			
			 System.out.println(str.indexOf(x,i));}	
		 }		  	     	  
	  }  	  
	  public static ArrayList<Integer> returnIndexesOfChar(String strToLookIn,char charToLookFor){
			ArrayList<Integer> listOfIndexes=new ArrayList<Integer>();
			for(int i=0;i<strToLookIn.length();i++){
				if(strToLookIn.charAt(i)==charToLookFor){
					listOfIndexes.add(i);				
				}			
			}		
			return listOfIndexes;
			
		}		 		 			  
		
	  }


