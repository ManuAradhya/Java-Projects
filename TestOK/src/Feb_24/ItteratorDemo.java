package Feb_24;
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;

public class ItteratorDemo {
public static void main(String[] args) {
	Collection<String> ll=new LinkedList<>();
	ll.add("Lotus");
	ll.add("Lilly");
	ll.add("Jasmine");
	
	Iterator<String> itr=ll.iterator();
	System.out.println(itr.next()); // next() it will just go to next line
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());  //NoSuchElementException error
	
	while(itr.hasNext())    //if we use hasnext it will look for next element is present 
		                     // or not 
	{
		String flr=itr.next();
		System.out.println(flr);
	}
}
}
