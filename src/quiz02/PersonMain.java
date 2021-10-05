package quiz02;

public class PersonMain {
	public static void main(String[] args) {
		
	

		
		Person p1 = new Person("홍길동", 20, 180);
		p1.info();
		
		System.out.println("-------------------------");
		
		//매개변수받는 생성자 하나만 생성하면 기본생성자가 실행이 안되요  이게 무슨말일까...user님의 답변.. 정답이라고한다.. 근데 난 몰라..
		//우리가 건들면 기본생성자를 안만들어준다 그래서 기본 생성자를 생성해줘야한다
		// Person(){
		// }
		
		
		Person p2 = new Person();
		p2.name = "홍길동";
		p2.age = 30;
		p2.tall = 170;
		
		p2.info();

		System.out.println("================================");
		//2. 일상생활에서 있을법한 사물,동물 등을 클래스로 표현하고  객체로 생성해보세요~!
		
		
		
		Animal A1 = new Animal("개",5, 'a');
		A1.info();
		
		System.out.println("-------------------");
		Tv tv = new Tv();
		tv.changeChannel(10); //채널변ㄱㅇ
		tv.info();
		tv.power();
		
		
		
		
		
		
	}
}
