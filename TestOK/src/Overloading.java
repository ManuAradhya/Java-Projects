public class Overloading {
void addition(int a, int b, int c) {      //m1
	System.out.println("Result "+(a+b));
}
void addition(int a, int b, double c) {   //m2
}
void addition(int a, int b, int c, int d){//m3
	System.out.println("Result "+(a+b+c+d));
}
void addition(int a, int b) {             //m4
	System.out.println("Result "+(a+b));
}
	public static void main(String[] args) {
Overloading ol=new Overloading();
ol.addition(6, 5, 8);      //m1
ol.addition(8, 4, 6.45);   //m2
ol.addition(8, 3, 4, 9);   //m3
ol.addition(16, 62);       //m4
	}
}