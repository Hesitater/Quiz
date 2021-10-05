package quiz02;

public class Person {

	String name;
	int age;
	int tall;
	
	//생성자를 직접 만들게 되면, 기본생성자를 자동으로 생성하지 않습니다. 그래서 생성 해줘야함
	Person(){
		
	}
	
	
	//생성자
	Person(String pName, int pAge, int pTall){
		
		name = pName;
		age = pAge;
		tall = pTall;
		
	}
	
	
	
	
	void info() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("신장: "  + tall);
		
		
	}
	
}
