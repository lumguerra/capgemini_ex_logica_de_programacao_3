package db_connection;

public class AnimalsData {
	
	private int id;
	private String name;
	private int legsQtd;
	private String color;
	
	//Constructors
	AnimalsData(){
		
	}
	
	AnimalsData(String name, int legsQtd, String color){
		this.name = name;
		this.legsQtd = legsQtd;
		this.color = color;
	}
	
	AnimalsData(int id, String name, int legsQtd, String color){
		this.id = id;
		this.name = name;
		this.legsQtd = legsQtd;
		this.color = color;
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
