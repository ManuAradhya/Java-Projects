package Feb_22;

public class ExceptionDemo1 {
static void Canvote(int age) {
	if(age>18)
		System.out.println("You can vote");
	else
		System.out.println("you cannot");
}
	public static void main(String[] args) {
Canvote(20);
Canvote(10);
	}

}
