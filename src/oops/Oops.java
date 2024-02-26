package oops;

class Student{
	String name;
	int age;
	
	public void printInfo() {
		System.out.println(name+" "+age);
	}
}



public class Oops {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.age=23;
		s1.name="Abc";
		s1.printInfo();
	}

}
