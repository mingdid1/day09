package variable;

/*
 	클래스 변수 - 클래스가 메모리에 올라갔을 경우 생성된다
 	인스턴스 변수 - 인스턴스(객체)가 생성될 때 생성된다
 	지역 변수 - 해당 지역이 실행될 때 생성된다
*/
public class MainClass01 {
	public static void main(String[] args) {
		
		String name = "홍길동";
		
		if (true) {
			// String s2 = "김길이";
			name = "김개똥";
		}
		System.out.println(name);
		// 큰 범위에서 만든 변수는 작은 범위에서 사용가능
		
		// System.out.println(s2);
		// 작은 범위에서 만든 변수를 큰 범위에서 사용할 수 없다
		
		
		
	}
}
