package projet1;

public class NbrHabitantException extends Exception {
	public NbrHabitantException(){
		System.out.println("vous essayer d'instancier le nombre d'habitant avec une valeur negative");
	}

}
