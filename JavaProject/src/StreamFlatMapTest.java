import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamFlatMapTest {

	public static void main(String[] args) {
		// string flatmap test
		List<String> inputTest1 = Arrays.asList("java8 lambda", "stream mapping");
		inputTest1.stream()
				.flatMap(s -> Arrays.stream(s.split(" ")))
				.forEach(System.out::println);
		
		System.out.println();
		
		// string -> int flatmap test
		List<String> inputTest2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		inputTest2.stream()
			.flatMapToInt(s -> {
				String[] strArrays = s.split(",");
				int[] intArrays = new int[strArrays.length];
				
				for(int i=0; i<strArrays.length; i++) {
					intArrays[i] = Integer.parseInt(strArrays[i].trim());
				}
				
				IntStream intStream = Arrays.stream(intArrays);
				return intStream;
			})
			.forEach(System.out::println);
	}

}
