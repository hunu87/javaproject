import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Foreach {
	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("이현우", "홍길동", "김미나", "최사장");
		
		// java old version
		System.out.println("=== java old version ===");
		for(int i=0; i<stringList.size(); i++) {
			System.out.println(stringList.get(i));
		}
		
		// java 1.5 foreach
		System.out.println("=== java 1.5 foreach ===");
		for(String list : stringList) {
			System.out.println(list);
		}
		
		// java 1.7 Iterator
		System.out.println("=== java 1.7 Iterator ===");
		Iterator<String> iterator = stringList.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		// java 1.8 Stream
		System.out.println("=== java 1.8 Stream ===");
		Stream<String> stream = stringList.stream();
		stream.forEach(name -> System.out.println(name));

	}
}
