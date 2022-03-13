
public class Demo{
	public static void main(String[] args) {
		BuildHouse bd1, bd2;
		bd1=new BuildHouse();
		bd2=new BuildHouse();
		bd1.amount=5200000;
		bd2.amount=2500000;
		//bd1.amount-2600000;
		System.out.println(BuildHouse.amount);
	}
}