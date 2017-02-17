package projet1;

public class TestVille {

	public static void main(String[] args) {
		
		String tabV[]={"paris","lyon","marseille","montpellier","limoges","blois"};
		int tabH[]={12444555,6000000,8000000,305000,90000,9000};
		Ville tableau[]=new Ville[6];
		for (int i=0;i<tabV.length;i++){
			if (i<3){
				try{
			Capitale cap=new Capitale(tabV[i],tabH[i],"france","la tour eifel");
			tableau[i]=cap;
				}catch(NbrHabitantException e){}
			}
			else{
				try{
				Ville v=new Ville(tabV[i],+tabH[i],"france");
				tableau[i]=v;
				}catch(NbrHabitantException e){}
			}
		}
		for (Object tb:tableau){
			System.out.println(tb.toString());
			System.out.println(tb);
		}
		try{
		Ville v4=new Ville("paris",-1234343,"france");
		v4.decristoi();
		System.out.println(((Ville)v4).decristoi());
		}catch (NbrHabitantException e){}
		
		//v4.decristoi();
		//System.out.println(((Ville)v4).decristoi());
		

	}
}
