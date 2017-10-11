package rangeClosed;

import java.util.stream.IntStream;

public class SomaDosDivisores {

	public static void main(String[] args) {
		AdvancedArithmetic my_calculator = (i) -> IntStream.rangeClosed(1, i).filter(e -> i % e == 0).sum();
		int n = 18;
		System.out.print(my_calculator.somatoriaDosDivisores(n) + "\n");
	}
}

interface AdvancedArithmetic {
	public int somatoriaDosDivisores(int n);
}
