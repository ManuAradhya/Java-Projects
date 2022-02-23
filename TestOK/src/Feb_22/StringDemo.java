package Feb_22;

public class StringDemo {

	public static void main(String[] args) {
		//System.out.println("1st String");
		// 1st String
		String s="Hello";
		System.out.println("Print 1st String: "+s);
		System.out.println("Length of 1st String: "+s.length());
		
		//System.out.println("2nd String");
	// 2nd String
		String s1=new String("World");
		System.out.println("Print 2nd String: "+s1);
		//s.concat(s1);
		System.out.println("concat 1st & 2nd String: "+s);
		
	// Join two string
		String s2=s.concat(s1);
		System.out.println("concat 1st and 2nd String:"+s2);
	
		//3rd String
		String s3="Hello";
		System.out.println("print 3rd string:"+s3);
		
		//To check whether s is equal to s3
		System.out.println(s==s3);
	
		if(s==s3)
		{
			System.out.println("print s=s3");
		}
		else
		{
			System.out.println("print s!=s3");
		}
		s.equals(s3);
		System.out.println("s and s1 are equal:"+s.equals(s2));
		}
	}
	
	


