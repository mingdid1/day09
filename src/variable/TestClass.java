package variable;

import java.util.Scanner;

/*
	입력, 연산, 출력 기능을 만들어 주세요
	입력 : 이름, 국, 영, 수
	연산 : 합을 구하는 기능, 평균을 구하는 기능, 등급 구하는 기능
	출력 : 이름, 국, 영, 수, 합, 평균, 등급
	등급 : 평균이 90이상 A, 80이상 B 나머진 C
*/

public class TestClass {
	public String name, grade;
	public int kor, eng, math, sum;
	public double avg;
	
	Scanner sc = new Scanner(System.in);

	public String inputName() {	
		System.out.print("이름 >> ");
		return name = sc.next();
	}
	public  int inputKor() {
		System.out.print("국어 점수입력");
		return kor = sc.nextInt();
	}
	public  int inputEng() {
		System.out.print("영어 점수입력");
		return eng = sc.nextInt();
	}
	public int inputMath() {
		System.out.print("수학 점수입력");
		return math = sc.nextInt();
	}	
	
	public int opSum() {
		sum = kor + eng + math;
		return sum;
	}
	
	public double opAvg() {
		avg = sum/3;
		return avg;
	}
	
	public String grade() {
		
		// 등급 : 평균이 90이상 A, 80이상 B 나머진 C
		
		grade = null;
		
		if (avg >= 90) 		grade = "A";
		else if (avg >= 80) grade = "B";
		else 				grade = "C";
		
		return grade;
	}
	
	public void printStu() {
		System.out.println(name + "님의 점수");
		System.out.println("==============================");
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("==============================");
		System.out.println("합계 : " + sum + " 평균 : " + avg);
		System.out.println();
		System.out.println("등급 : " + grade);
	}
}
