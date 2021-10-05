package quiz03;

public class Student {
	// 멤버변수
	String name;
	int no;
	int kor;
	int eng;
	int math;

	// 생성자 생성할때 클래스 이름과 같이해야됨
	Student() {

	}

	// 매개변수 받고 초기화

	Student(String sName, int sNo, int sKor, int sEng, int sMath) {

		name = sName;
		no = sNo;
		kor = sKor;
		eng = sEng;
		math = sMath;

	}

	//

	// getTotal 국영수 점수 //return balance 처럼 주면되는것?
	double getTotal() {

		return kor + eng + math;
	}

	// getAvg 국영수 평균 (소수 2자리까지) 소수점 2자리 ex) 33.333333 * 100 casting 후 / 100 ?
	double getAvg() {
		return (int) ((kor + eng + math) / 3.0 * 100) / 100.0;

	}

}
