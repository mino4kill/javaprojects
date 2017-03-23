package projet1;

public class DivisionException {
	public static void affecte(int j){
		
		System.out.println("wowo t nul "+j);
		}
		public static void main(String[] args){
			 int i=10;
			    i=++i;
			    affecte(i);
			    try {
					float b =10/0;
					int t=(int)b;
					System.out.println(t);
				} catch (ArithmeticException e) {
					System.out.println(e.getMessage());
					// TODO Auto-generated catch block
					//System.out.println(e);
				}finally{
					System.out.println(i);
				}
		}
}
