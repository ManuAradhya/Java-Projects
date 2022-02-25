package Feb_22;
import java.util.*;
public class ExceptionDemo2 {
	static void func(int a, int b) {
		System.out.println(10/a);
		int[] arr= {1,2,3};
		System.out.println(arr[b]);
	}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
for(int i=0;i<3;i++) {
	try {
		func(sc.nextInt(),sc.nextInt());
	}catch (ArithmeticException e) {
		System.out.println("can't divide by zero");
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("out of bounds!");
	}
	}
	}
}
	
