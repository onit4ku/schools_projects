public class Naturales {

	void cuenta(int n) {
		if (n > 0) {
			cuenta(n - 1);
			System.out.println(n);
		}
	}

	public static void main(String[] ar) {
		Naturales re = new Naturales();
		re.cuenta(10);
	}
}