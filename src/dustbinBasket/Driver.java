package dustbinBasket;

public class Driver {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.playTheGame();
		emp2.playTheGame();

		if (emp1.Score < emp2.Score)
			System.out.println("winner is employee 2!");
		else if (emp1.Score > emp2.Score)
			System.out.println("winner is employee 1!");
		else
			System.out.println("Draw!");

	}

}
