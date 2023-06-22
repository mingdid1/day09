package variable;

class TestClass07 {
	public static final String KOREA = "대한민국";
	// final : 값을 변경할 수 없음
	// static -> 객체없이 클래스 이름으로 가져다 쓸 수 있다
	//			 프로그램이 종료시까지 살아있다
}
 
class T01 {
	public void test() {	// TestClass07 static이 없을 경우
		TestClass07 t = new TestClass07();
		System.out.println(t.KOREA);
	}
}

class T02 {
	public void test() {	// TestClass07 static이 있을 경우
		System.out.println(TestClass07.KOREA);
	}
}

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		// t.KOREA = "미국";
		System.out.println( t.KOREA );
	}
}
