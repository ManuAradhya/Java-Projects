package Feb_25;

public class Clone implements Cloneable {
int id;
String name;
double perc;
public Clone(int id, String name, double perc) {
	this.id=id;
	this.name=name;
	this.perc=perc;
}
@Override
public Object clone() throws CloneNotSupportedException {        //throws CloneNotSupportedException{
	return super.clone();
}
@Override
public String toString() {
	return id+" "+name+" "+perc+"%";
}

	public static void main(String[] args) throws CloneNotSupportedException{
Clone cl=new Clone(56, "Manu", 98.63);
System.out.println("C1= "+cl);
Clone c2=(Clone)cl.clone();
System.out.println("C2= "+c2);
	}
}
