package quiz05;

public class Computer extends Calculator { //부모  Calculator 
	//자식 Math.PI 를 사용해서 원의 넓이를 구하도록  부모에게서 받아야하잖아?
	
		//   오버라이딩
	 double circle(int c) {
		 return (c*c)*Math.PI;
	 }
	 
	
	 //rect 오버로딩
	 
	 double rect( double x) {
		 return x*x;
	 }
	
	 double rect(double x, double y) {
		 return x*y;
	 }
	 
	 double rect(double x , double y, double z) {
		 return x*y*z;
	 }
	 
	 
	 
	
}
