package MathFunctions;
import java.util.Random;

public class mathFunctions {

	public static void main(String[] args) {
		int i = 8, j = -10;
		float x = 72.87f, y = -0.001234f;

		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("x: " + x);
		System.out.println("y: " + y);

		System.out.println();

		// absolute
		System.out.println(" | " + i + " | " + Math.abs(i));
		System.out.println(" | " + j + " | " + Math.abs(j));
		System.out.println(" | " + x + " | " + Math.abs(x));
		System.out.println(" | " + y + " | " + Math.abs(y));

		System.out.println();

		// rounds
		double round = 100000;
		System.out.println(Math.round(x * round) / round);
		// or
		System.out.println("round: " + (double) (Math.round(x * 10) / 10));

		// round up
		System.out.println("round up" + Math.ceil(x));

		// round down
		System.out.println("round down" + Math.floor(x));

		// max
		System.out.println("max: " + Math.max(i, j));

		// min
		System.out.println("min: " + Math.min(x, y));

		// PI
		System.out.println("PI: " + Math.PI);

		// power
		System.out.println("power: 2^2: " + Math.pow(2, 2));

		// square root
		System.out.println("square root: " + Math.sqrt(64));

		// random number
		System.out.println(Math.random());

		// random number
		System.out.println((int) (Math.random() * 10));
		// or
		Random r = new Random();
		System.out.println(r.nextInt(10));

		// type casting
		int a = 10;
		float b = a;
		System.out.println(a);

		double s = 1.23;
		int k = (int) s;
		System.out.println(k);

		double num1 = 10, num2 = 3;
		int result = (int) (num1 / num2);
		System.out.println("the result is = " + result);

		int n3 = 10, n4 = 3;
		double res2 = n3 / n4;
		System.out.println("result: " + res2);

		// convert to a string
		System.out.println(String.valueOf(res2));
		// or
		System.out.println(res2 + "");

		// convert string into a number
		String test = String.valueOf(res2);
		// int num1 = (Integer.valueOf(test).intValue());

		String str1 = "test";
		String str2 = "test";

		System.out.println(str1.equals(str2));

		int ii = 45;
		String jj = String.valueOf(ii);
		System.out.println(ii + " hello");

	}

}
