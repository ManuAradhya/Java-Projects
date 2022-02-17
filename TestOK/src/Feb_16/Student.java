package Feb_16;

final class Student {
	 final int Rank=2;  //final variable
void Class() {
	System.out.println("10th");
}

final void precentage() { //final method
	System.out.println("93%");
}

public static void main(String[] args) {
Student sc=new Student();
sc.Class();
sc.precentage();
sc.Rank=2;  //Final variable method cannot be invoked
}           //Compilation error
}
 //final class cannot have subclass and cannot be inherited
 class Teacher extends Student{
	 
 }