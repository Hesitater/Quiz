package quiz03;

public class StudentA {

	String name;
	int no;
	int kor;
	int eng;
	int math;

	StudentA(String n, int n2, int k, int e, int m) {

		name = n;
		no = n2;
		kor = k;
		eng = e;
		math = m;

	}

	double getTotal() { // 반환을 double 로 하거나 getTota() /3.0
		return kor + eng + math;

	}

	double getAvg() { // 같은 클래스 안에 메소드 호출 getTotal가능

		double avg = (int) (getTotal() / 3.0 * 100) / 100.0;
		return avg;
	}

}
