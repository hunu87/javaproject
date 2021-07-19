import java.util.Optional;

public class OptionalNullCheck {
	
	Integer num;
	
	public static void main(String[] args) {
		OptionalNullCheck onc = new OptionalNullCheck();
		
		// java8 버전 이전
		System.out.println("== java8 이전 ==");
		if(onc.num == null) {
			System.out.println("num은 null입니다.");
		}else {
			System.out.println(onc.num + " 출력");
		}
		
		// java8 버전 이후
		System.out.println("== java8 이후 ==");
		Optional.ofNullable(onc.num).ifPresent(num -> System.out.println(num + " 출력"));
	}

}
