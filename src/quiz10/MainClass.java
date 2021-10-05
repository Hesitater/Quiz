package quiz10;

public class MainClass {
	public static void main(String[] args) {
		
		//생각 못했음
//		Hotel h = new Hotel(); 
		
		Computer com = new Computer();
		com.computerInfo();
		System.out.println("====================");
		
		KeyBoard key = com.getKey(); //1번
		key.info();
		
		com.getKey().info(); // 2번  
		//1번과 2번은 같다...
		
		com.getMonitor().info();
		com.getMouse().info();
	
	
	}
}
