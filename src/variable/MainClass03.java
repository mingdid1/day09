package variable;

class TestClass03{
	
	public int var;		// 인스턴스(객체) 변수
						// 여러곳에서 사용할 때 인스턴스 변수 사용
	
	public void test1() {
		
		// int num;	 // 일회성 변수 (메서드가 끝나면 없어짐)
		var = 100;
	}
	
	public void test2() {
		System.out.println(var);
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		
		TestClass03 t = new TestClass03();
		
		t.test1();
		t.test2();
		
		
		
		
	}
}
