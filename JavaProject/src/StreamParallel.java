import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamParallel {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("홍길동", "이현우", "박진영", "설현");
		
		Stream<String> stream = stringList.stream();
		Stream<String> parallelStream = stringList.parallelStream();	// 병렬처리 stream
		
		stream.forEach(StreamParallel::print);
		parallelStream.forEach(StreamParallel::print);
		
	}
	
	public static void print(String string) {
		System.out.println(string + " : " + Thread.currentThread().getName());
	}
	
}
