package quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65

		System.out.println(y += 10 - x++); // 13 , x == 3
		System.out.println(x += 2); // x3에서 2가 더해져 5
		System.out.println(!('A' <= c && c <= 'Z')); // !(true && true) = false
		System.out.println('C' - c); // 2 여기서 c가 65인 상황
		System.out.println(c + 1); // 66
		System.out.println(++c); // B
		System.out.println(c++); // B 출력하고 증가한다.
		System.out.println(c); //

	}
}
