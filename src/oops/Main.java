package oops;

public class Main {
	public static void main(String[] args) {
		
//		oops concepts student.java
		Cars c2 = new Cars();
		c2.nameOfCar = "McLaren";
		c2.costOfCar = 200000;
		c2.typeOfCar = "Sports";
		
//		c2.getInfo();
		
		//setters and getters from cars.java
//		Cars c1 = new Cars();
//		
//		c1.setName("Ferrari");
//		c1.setCost(300000);
//		c1.setType("Sports");
//		
//		c1.getDetails();
		
		//Constructors
		Cars c3 = new Cars(); //runs non parameterized constructor
		Cars c4 = new Cars(400000); //runs parameterized constructor
		Cars c5 = new Cars(500000);	//500000 is actual parameter
		Cars c6 = new Cars("RB 20", 20000000, "Formula 1", 15000000);
		//c6 sets the members directly while creating the object
		//using the constructors and hence no need to individually set
		
		c6.getInfo();
		
	}
}
