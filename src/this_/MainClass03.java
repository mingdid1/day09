package this_;

class TestClass03 {
	private int num, age;
	
	// setter, getter : Alt + shift + s 자동완성
	// 캡슐화

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int n) {
		num = n;
	}
	
	public void display() {
		System.out.println("출력 담당");
	}
	
}

public class MainClass03 {
	public static void main(String[] args) {
		
		TestClass03 t = new TestClass03();
		
		t.setNum(12345);
		int re = t.getNum();
		
		System.out.println("결과 : " + re);
		
		t.display();
	
	
	}
}
