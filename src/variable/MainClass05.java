package variable;

class TestClass05 {
	
	public static String msg = "연습";	
	// static => 클래스 변수 (객체 생성전 미리 만들어짐)
	public int num;
}


public class MainClass05 {
	public static void main(String[] args) {
		
		System.out.println(TestClass05.msg);
		//System.out.println(TestClass05.num);
		
		TestClass05 t = new TestClass05();	// 여기서 int num 변수 생성됨
		System.out.println( t.num );

		
	
	}
}
