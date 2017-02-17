package projet1;

public class LesExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j=20,i=0;
		try {
			System.out.println(j/i);
		} catch (ClassCastException e) {
			//System.out.println(e +" "+e.getMessage());
			e.printStackTrace();
			
		}finally {
			System.out.println("sdfsdfsdfsdfsdfsdf");
		}
		
		
		

	}

}
