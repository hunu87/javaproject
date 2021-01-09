import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasicTest {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setName("홍길동");
		student1.setScore(80);
		
		Student student2 = new Student();
		student2.setName("이현우");
		student2.setScore(95);
		
		List<Student> list = Arrays.asList(student1, student2);
		
		Stream<Student> stream = list.stream();
		stream.forEach(s -> System.out.println("name : " + s.getName() + ", score : " + s.getScore()));
		
	}
}