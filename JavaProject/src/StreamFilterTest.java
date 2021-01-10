import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("이현우", "정준하", "박명수", "이현우", "유재석");
		
		List<String> result = names.stream()
								.distinct()
								.filter(s -> s.startsWith("이"))
								.collect(Collectors.toList());
		
		result.stream().forEach(System.out::println);
	}
}
