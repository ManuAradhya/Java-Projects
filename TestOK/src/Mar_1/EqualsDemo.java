package Mar_1;

public class EqualsDemo {

	public static void main(String[] args) {
String s1=new String("HELLO");
String s2=new String("HELLO");
String s3="HELLO";
String s4=null;
System.out.println("s1 and s2 are equal: "+(s1==s2));
System.out.println("s1 and s2 are equal: "+(s1.equals(s2)));

System.out.println("s1 and s3 are equal: "+(s1.equals(s3)));
System.out.println("s2 and s4 are equal: "+(s2.equals(s4)));
	}

}
