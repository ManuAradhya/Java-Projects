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
class D implements Runnable{
	public void run() {
		System.out.println("current id of D "+ Thread.currentThread().getId());
	}
}
public class Threading{
public static void main(String[] args) {
X x=new X();
x.start();
A a=new A();
a.start();
B b=new B();
b.start();
D d=new D();
Thread th=new Thread(d);
th.start();
System.out.println("ID of main method "+Thread.currentThread().getId());
	}

}
