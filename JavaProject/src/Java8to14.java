import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Java8to14 {
		
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
		
		/* Consumer<T> 예시 
		 * T 타입의 인자는 받고, 리턴은 하지 않는다.
		 * 즉, 전달받은 매개변수를 소비하고 끝낸다.
		 * */
	     Consumer<String> consumer = s -> System.out.println(s);
	     consumer.accept("Consumer 예시, 매개변수는 있지만 반환 데이터 없음");
	     
	     /*
	      * Consumer, 메소드 레퍼런스 
	      * */
	     Consumer<String> consumer2 = System.out::println;
	     consumer2.accept("Consumer 예시2, 메소드 레퍼런스");
	     
	     /* Function<T,R> 예시 
			 * 매개변수가 있고, 리턴 값도 있는 경우이다.
			 * */
	    Function<String, String> function = String::toUpperCase;
	    System.out.println(function.apply("eddy"));
	    
	    /* Predicate<T> 예시 
		 * 매개변수가를 받고, boolean 리턴한다.
		 * Function<T, Boolean> 와 같은 기능을 한다고 생각하면 됨
		 * */
	    Predicate<String> predicate = s -> s.startsWith("e");
	    System.out.println("e로 시작하면 true 리턴 : " + predicate.test("eddy"));
	}
}
