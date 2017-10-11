package streamComArrayInt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayInt {

	public static void main(String[] args) {
		Arrays.stream(teste(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 })).forEach(c -> System.out.println(c));
	}

	private static int[] teste(int[] list) {
		if (list.length == 0) {
			return list;
		} else {
			List<Integer> arrayList = new ArrayList<>();
			arrayList.add(list.length);
			Supplier<IntStream> sup = () -> Arrays.stream(list);
			int asInt = sup.get().min().getAsInt();
			int[] array = sup.get().filter(c -> c - asInt > 0).toArray();
			arrayList.addAll(Arrays.stream(teste(array)).boxed().collect(Collectors.toList()));
			return arrayList.stream().mapToInt(c -> c).toArray();
		}
	}

}
