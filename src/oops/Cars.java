package oops;

public class Cars {
	
	//Classes and Objects
	String nameOfCar;
	int costOfCar;
	String typeOfCar;
	int usedCar;
	
	public void getInfo() {
		System.out.println(nameOfCar);
		System.out.println(costOfCar);
		System.out.println(typeOfCar);
		
	}
	
	//setters and getters
	private String name;
	private int cost;
	private String type;
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	//getter
	public String getName(){
		return this.name;
	}
	
	public void setCost(int cost) {
		this.cost=cost;
	}
	
	public int getCost() {
		return this.cost;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void getDetails() {
		System.out.println(this.name);
		System.out.println(this.cost);
		System.out.println(this.type);
	}
	
	//Constructors
	Cars(){
		System.out.println("Non-parameterized constructor");
	}
	
	Cars(int cost){	//cost is formal parameter
//		this.cost = cost;
		System.out.println("The cost of car is $" + cost);
	}
	
	Cars(String a, int b, String c, int d){ //this sets the members directly
		nameOfCar = a;
		costOfCar = b;
		typeOfCar = c;
		usedCar = d;
	}
}

