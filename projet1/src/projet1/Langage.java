package projet1;

public enum Langage {
	JAVA("langage java","eclipe, netbeants..."),
	PHP("langage php","text editor"),
	CSHARP("langage csharp","visual studio");

	
	private String name="";
	private String editeur="";

	
	Langage(String nm,String ed){
		this.name=nm;
		this.editeur=ed;
	}
	public String getEditor(){
		return editeur;
	}
	public String getName(){
		return name;
	}
	public String toString(){
		return name;
		
	}

public static void main(String arg[]){
	Langage l1= Langage.JAVA;
	Langage l2=Langage.PHP;
	Langage l3=Langage.CSHARP;
System.out.println(l1.toString()+' '+l1.getEditor()+' ');
	
	
	for(Langage lang : Langage.values()){
	      if(l1.equals(lang))
	        System.out.println("J'aime le : " + lang.getName()+" et je code avec ide "+lang.getEditor());
	      
		      else{
	        System.out.println(lang);
		          }
	      
	}
}
}

	
	
	


