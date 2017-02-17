package projet1;

public class Capitale extends Ville {
	private String monument;
	public Capitale(){
		super();
		this.monument="aucun";
	}
	public Capitale(String nm,int nbre, String pp, String mn)
	throws NbrHabitantException{
		super(nm,nbre,pp);
		this.monument=mn;
		
	}
	public String decristoi(){
		String str =super.decristoi()+ " à comme monument "+this.monument;
		return str;
	}
	public String toString(){
		String str =super.toString()+ " à comme monument "+this.monument;
		return str;
	}
	public String getMonu(){
	return monument;
	}
	public void setMonu(String mn){
		monument=mn;
	}
	
	

}
