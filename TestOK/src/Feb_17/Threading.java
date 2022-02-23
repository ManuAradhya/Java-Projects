package Feb_17;

class X extends Thread {
public void run() {
	System.out.println("current id of x "+ Thread.currentThread().getId());
}
}
class A extends Thread{
	public void run() {
		System.out.println("current id of A "+ Thread.currentThread().getId());
	}	
}
class B extends Thread{
	public void run() {
		System.out.println("current id of B "+ Thread.currentThread().getId());
	}
}
class D implements Runnable{     //runnable interface
	public void run() {
		System.out.println("current id of D "+ Thread.currentThread().getId());
	}
}
public class Threading{
public static void main(String[] args) {
X x=new X();  
x.start();     //8		
A a=new A();
a.start();     //9
B b=new B();
b.start();     //10
D d=new D();
//d.start();      //Exception error(because we have implemented runnable interface)
Thread th=new Thread(d);
th.start();    //11
System.out.println("ID of main method "+Thread.currentThread().getId());//1
	}

}
