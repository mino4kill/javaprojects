package projet1;

import java.util.Scanner;

public class Basic {

	private static Scanner sc;

	public static void main(String[] args) {
		double a=10,b=3;
		double c=(double)(a/b);
		String j=new String();
		String k="2";
		j=String.valueOf(c);
		int t=Integer.valueOf(k).intValue();
		sc = new Scanner(System.in);		
		System.out.println("le resultat "+t);
		String str= sc.nextLine();
		char car= str.charAt(2);
		int f= sc.nextInt();
        System.out.println("vous avez saisi "+str+f+car);
	
		// TODO Auto-generated method stub

	}

}
