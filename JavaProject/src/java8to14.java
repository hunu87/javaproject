import java.util.function.Supplier;

public class java8to14 {
		
	public static void main(String[] args) {
		
		// 익명 내부 클래스
		/*
		SimpleInterface funSimpleInterface = new SimpleInterface() {
			@Override
			public void action() {
				System.out.println("익명 클래스, 안녕하세요!");
			}
		};
		*/
		
		// lambda
		SimpleInterface funSimpleInterface = () -> System.out.println("람다식, 안녕하세요!");
		
		funSimpleInterface.action();
		
		// 익명 내부 클래스8
		/*
		SimpleConsumerInterface consumerInterface = new SimpleConsumerInterface() {
			@Override
			public void accept(String s) {
				System.out.println("익명 클래스, " + s + "님, 안녕하세요!");
			}
		};
		*/
		
		/* 람다식이 하나의 실행문이라면, 중괄호를 생략할 수 있다. */
		SimpleConsumerInterface consumerInterface = 
				// (s) -> System.out.println("람다식, " + s + "님, 안녕하세요!");
				s -> System.out.println("람다식, " + s + "님, 안녕하세요!");	// 하나의 매개변수만 존재 한다면, () 생략할 수 있다.
		
		consumerInterface.accept("이현우");
		
		/* Supplier 예시 
		 * 인자는 받지 않고, 리턴 타입만 존재한다.
		 * get 메소드는 항상 동일한 데이터를 반환
		 * */
		Supplier<String> supplier = () -> "Supplier 예시, 반환 데이터 존재";
		System.out.println(supplier.get());
	}
}
