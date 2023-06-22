package variable;

class TestClass06 {
	
	//public int su;		// static을 넣지 않으면 객체 생성 전까지 사용할 수 없음
							// main에서 TestClass06 t = new TestClass06(); 객체 생성시 사용가능
	
	public static int su;
	public static void test() {
		su = 100;
	}
}


public class MainClass06 {
	
	public static int num;
	public static void test() {
		num = 100;
	}
	public static void main(String[] args) {
		num =100;
	}
}
