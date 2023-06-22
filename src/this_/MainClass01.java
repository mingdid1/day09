package this_;

class TestClass01 {
	public int num = 12345;		// this.num
	
	public void test() {
		int num = 67890;		// num
		
		System.out.println("this : " + this);
		System.out.println("test : " + num);	// 같은 이름의 변수이면 안쪽이 우선으로 사용된다	
		System.out.println("test this : " + this.num);
	}
}


public class MainClass01 {
	public static void main(String[] args) {
		/*
		 	this
		 	- 메소드의 0번째 매개변수로 자동으로 만들어진다
		 	- 클래스 자기자신의 정보를 가지고 있는 변수
		 */
		
		TestClass01 t = new TestClass01();
		
		System.out.println("t : " + t);
		System.out.println("main : " + t.num);
		
		t.test();
		
		
		
		
	}
}
