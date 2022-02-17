// child class
public class Inheritance extends A {
int a=4;         //Declaration
int b=22;
int c;           
void sum() {
	c=a+b;
	System.out.println("Sum "+c);
}
void multi(int a, double b) {
	System.out.println("Child result of multiplication "+(a*b));
}
void display() {
	System.out.println("I am your Child");
}
	public static void main(String[] args) {
	A a=new A();
	a.multi(9, 8);
	a.display();
	Inheritance in=new Inheritance();
	in.sum();
	in.multi(5, 6);
	in.display();
	
	}

}
