package freecodecamp;

// https://www.freecodecamp.com/challenges/factorialize-a-number

public class Factorial {

	public static double factorialize(double num) {
		if (num == 1) {
			return num;
		} else if (num == 0) {
			return 1;
		} else {
			return num * factorialize(num - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(factorialize(0));
		System.out.println(factorialize(5));
		System.out.println(factorialize(10));
		System.out.println(factorialize(20));
	}
}