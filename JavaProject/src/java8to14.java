
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
		
	}
}
