package freecodecamp;

// https://www.freecodecamp.com/challenges/reverse-a-string

public class ReverseStr {

	public static String reverseString(String str) {
		String nuevaString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			nuevaString += str.charAt(i);
		}
		return nuevaString;
	}

	public static void main(String[] args) {
		System.out.println(reverseString("hello darkness my old friend"));
	}
}