package dustbinBasket;

import java.util.Random;

public class Employee {
	public int sayi;
	public String name;
	public final int numberOfThrows = 10; // max atış miktarı
	public int Score;

	public void Throw() {
		Random rnd = new Random();
		// System.out.println(rnd.nextInt());
		sayi = rnd.nextInt(100) + 1;
		// System.out.println(sayi);

		if (sayi <= 50) {
			System.out.println("miss");
		} else {
			System.out.println("hit");
		Score+=1;
		System.out.println("Score is: "+Score); }
	}

	public void playTheGame() {
		for (int i = 1; i <= numberOfThrows; i++) {
			System.out.println(i + ". throw");

			Throw();
		}
		System.out.println("TOTAL SCORE is " + Score);
	}
}