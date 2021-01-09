import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {

	public static void main(String[] args) {
		Member member1 = new Member();
		member1.setName("이현우");
		member1.setSex("Male");
		member1.setAge(35);
		
		Member member2 = new Member();
		member2.setName("박진영");
		member2.setSex("Male");
		member2.setAge(45);
		
		Member member3 = new Member();
		member3.setName("수지");
		member3.setSex("Female");
		member3.setAge(25);
		
		List<Member> memberList = Arrays.asList(member1, member2, member3);
		
		Stream<Member> stream = memberList.stream();
		stream.forEach(s -> System.out.println(s.getName() + " : " + s.getAge()));
		

		// orders.스트림 생성().중개 연산().최종 연산() 
		// 1. 스트림을 생성한다.
		// 2. 초기 스트림을 다른 스트림으로 변환하는 중간 연산(intermediate operation)들을 하나 이상의 단계로 지정한다.
		// 3. 결과를 산출하기 위해 최종 연산(terminal operation)을 적용한다. 이 연산은 앞선 지연 연산(lazy operation)들의 실행을 강제한다. 
		// 이후로는 해당 스트림을 더는 사용할 수 없다.
		double avgAge = memberList.stream()	// 1
				.filter(m -> m.getSex().equals("Male"))	 // 2
				.mapToInt(Member::getAge)	// 2
				.average()	// 3
				.getAsDouble();
		System.out.println("Male Age Average : " + avgAge);
	}

}
