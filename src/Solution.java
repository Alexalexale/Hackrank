import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		in.close();
		if (n.isProbablePrime(0)) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}

interface AdvancedArithmetic {
	public int divisor_sum(int n);
}

class tal implements AdvancedArithmetic {
	@Override
	public int divisor_sum(int i) {
		return java.util.stream.IntStream.rangeClosed(1, i).filter(e -> i % e == 0).sum();
	}
}
