package Mar_4;
//import java.awt.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
//import java.util.Collection;

public class StreamAPIDemo {

	public static void main(String[] args) {
List<Integer> values=Arrays.asList(1,2,3,4,5,6);
for (int i=0; i<6; i++) {
	System.out.println(values.get(i));
}
Iterator<Integer> ivalues=values.iterator();
while(ivalues.hasNext()) {
	System.out.println(ivalues.next());
}
for(int i: values) {
	System.out.println(i);
   }
  }
 }
