package quiz05;

public class Calculator {
	// 부모

	int result; // 멤버변수 선언함
	double pi = 3.14;

	// 생성자 선언
	Calculator() {
		result = 1;
		pi = 3.14;
	}

	int add(int a) { // result 누적

		result += a;

		return result;
	}

	int sub(int b) { // result 차감

		result -= b;

		return result;
	}

	double circle(int c) { // pi 이용 원의 넓이

		return c * c * pi;
	}

}
