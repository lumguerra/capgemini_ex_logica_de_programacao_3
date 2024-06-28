package db_connection;

public class Animals {
	
	private int id;
	private String name;
	private int legsQtd;
	private String color;
	
	//Constructors
	Animals(){
		
	}
	
	Animals(String name, int legsQtd, String color){
		this.name = name;
		this.legsQtd = legsQtd;
		this.color = color;
	}
	
	Animals(int id, String name, int legsQtd, String color){
		this.id = id;
		this.name = name;
		this.legsQtd = legsQtd;
		this.color = color;
	}
	
	void printAnimalsInfo() {
		System.out.println("Animal id: " + this.id);
		System.out.println("Animal name: " + this.name);
		System.out.println("Animal legs quantity: " + this.legsQtd);
		System.out.println("Animal color: " + this.color);
	}
	
	//Getters and Setters
	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getLegsQtd() {
		return legsQtd;
	}

	void setLegsQtd(int legsQtd) {
		this.legsQtd = legsQtd;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}
	
}
