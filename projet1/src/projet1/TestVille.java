package projet1;

public class TestVille {

	public static void main(String[] args) {
		
		String tabV[]={"paris","lyon","marseille","montpellier","limoges","blois"};
		int tabH[]={12444555,6000000,8000000,305000,90000,9000};
		Capitale cap=null;
		Ville v=new Ville();
		Ville v4=null;
		Ville tableau[]=new Ville[6];

		for (int i=0;i<tabV.length;i++){
			try{
			if (i<3){
				
			 cap=new Capitale(tabV[i],tabH[i],"france","la tour eifel");
			
			 tableau[i]=cap;
				
			} else
				v=new Ville(tabV[i],+tabH[i],"france");
				tableau[i]=v;
			
		
		
		}catch(VilleNameException | NbrHabitantException e){
			e.printStackTrace();
		}
		}
		for (Object tb:tableau){
			System.out.println(tb.toString());
			System.out.println(tb);
		}
		
		
			try {
				v4=new Ville("paris",1234343,"france");
			} catch (NbrHabitantException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (VilleNameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		v4.decristoi();
		System.out.println(((Ville)v4).decristoi());
		
		
		//v4.decristoi();
		//System.out.println(((Ville)v4).decristoi());
		

	}
}

