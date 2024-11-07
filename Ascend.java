// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code

		int number = Integer.parseInt(args[0]);

		int a = (int)(Math.random() * number);
		int b = (int)(Math.random() * number);
		int c = (int)(Math.random() * number);


		System.err.println(a + " " + b + " " + c);

		int minnumber = Math.min(a, (Math.min(b, c)));
		int maxnumber = Math.max(a, (Math.max(b, c)));

		int sum = a + b + c;
		int middlenumber = sum - (minnumber + maxnumber);


		System.out.println(minnumber + " " + middlenumber + " " + maxnumber);
      
	}
}
