package Feb_24;

public class ComparableDemo {

	public static void main(String[] args) {
     Integer i1=25;
     Integer i2=25;
     Integer i3=10;
     Integer i4=50;
     System.out.println(i1.compareTo(i2));   //25=25 :  0    i1 = i2 -->  0
     System.out.println(i1.compareTo(i3));   //25=10 :  1    i1 > i2 -->  1
     System.out.println(i1.compareTo(i4));   //25=50 : -1    i1 < i2 --> -1
	}

}
//Equal 0
//Greaterthan 1
//Lessthan -1