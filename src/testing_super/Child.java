package testing_super;

public class Child extends Parent{
	
	private String favoriteFood = "";
	
	Child(String name, int age, String favoriteFood){
		super(name, age);
		this.favoriteFood = favoriteFood;
	}
	
	void report(Child c) {
		System.out.println("Name: " + c.name + " Age: " + c.age + " Favorite food: " + c.favoriteFood);
	}
	
}
