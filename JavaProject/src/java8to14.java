
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
		
		SimpleConsumerInterface consumerInterface = (s) -> System.out.println("람다식, " + s + "님, 안녕하세요!");
		
		consumerInterface.accept("이현우");
	}
}
