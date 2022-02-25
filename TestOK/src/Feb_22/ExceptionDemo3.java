package Feb_22;
import java.util.Scanner;

public class ExceptionDemo3 {
		static void func(int a, int b) {
			System.out.println(10/a);
			int[] arr= {1,2,3,4,5,6,7,8};
			System.out.println(arr[b]);
		}
		public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<8;i++) {
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
		
