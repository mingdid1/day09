package variable;

class TestClass02{
	public int test1() {
		int var = 100;
		
		System.out.println("test1 var : " + var);
		return var;
	}
	
	public void test2(int var) {
		System.out.println("test2 var : " + var);
	}
}



public class MainClass02 {
	public static void main(String[] args) {
		
		TestClass02 t = new TestClass02();
		int v = t.test1();
		t.test2(v);
	}
}
