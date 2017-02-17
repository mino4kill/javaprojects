package projet1;
import java.util.Scanner;

public class tabtest {

	public static void main(String[] args) {
		int tab[][]=new int[2][3];
		int i,j;
		int res= 0;
		Scanner sc= new Scanner(System.in);
		for(i=0;i<2;i++) 
		 {
			for(j=0;j<=3;j++)
			{
				tab[i][j]=sc.nextInt();
				
				
			}
		 }
			for(i=0;i<2;i++) 
			{
				for(j=0;j<3;j++)
				{
					
					System.out.println("tab["+i+"]["+j+"]= "+tab[i][j]);
					test(tab[i][j]);
					
				}
				
			}
			/*
			i=0;
			j=0;
				for(int soustab[]:tab) 
				{
					
					for(int nbr:soustab)
					{
						
						System.out.println(nbr);
						test(nbr);
						j++;
					}
					i++;
					
				}
			*/
		
		
	}
	public static void test(int a){
		
		if (a%2==0){
			
		System.out.println(a+"  est pair");
		}
		else {
			
		System.out.println(a+"  est impair");
		}
		

	}
}
