package quiz02;

public class Animal {
	
	String name;
	int age;
	char kind;
	
	// 생성자 생성..
	Animal(){
		
	}
	
	Animal(String aName, int aAge, char aKind) {
		
		name = aName;
		age = aAge;
		kind = aKind;
		
		
		
	}
	
	
	
	void info()  {
		System.out.println("동물이름 :" + name);
		System.out.println("동물나이 :" + age);
		System.out.println("동물좋류 :" + kind );
		
		
	}
	
	
	
	
	
}
