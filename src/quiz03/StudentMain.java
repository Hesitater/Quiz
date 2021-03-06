package quiz03;

public class StudentMain {
	public static void main(String[] args) {
		
		/*
		 * 멤버변수
		 * name - 학생이름
		 * no - 학생번호
		 * kor - 국어점수
		 * eng - 영어점수
		 * math - 수학점수
		 * 
		 * 생성자
		 * 멤버변수 5개를 초기화 하는 생성자
		 * 
		 * getTotal() - 국어, 영어, 수학 점수를 모두 더해서 합계반환
		 * getAvg() - 총점을 나눈 평균을 반환(단, 소수점 2자리까지)
		 * 소수점 2자리  ex) 33.333333   * 100 casting 후 / 100 ?
		 * 
		 *  main에서는 학생의 2명을 각각 생성하고 두학생의 평균합을 출력하세요
		 *  
		 */
		
		//학생 2명 먼저 받고
		Student stu01 = new Student("김태희",0001,100,98,78);
		stu01.getTotal();
		stu01.getAvg();
		
		System.out.println("----" + stu01.name + "----");
		System.out.println(stu01.getTotal());
		System.out.println(stu01.getAvg());
		
		Student stu02 = new Student("전지현",0001,50,30,20);
		
		stu02.getTotal();
		stu02.getAvg();
		
		System.out.println("----" + stu02.name + "----");
		System.out.println( stu02.getTotal() );
		System.out.println( stu02.getAvg() );
		
		System.out.println("===========================");
		
		// 객체생성    ClassName instanceName = new Constructor;
		StudentA s1 = new StudentA("홍길동", 1,100,40,23);

		Student s2 = new Student("홍길순",2, 90,60,34);

		System.out.println("평균합: " +(s1.getAvg() + s2.getAvg()));

		
		
		
	}

}
