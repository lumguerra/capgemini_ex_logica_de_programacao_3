package db_connection;

public class Main {

	public static void main(String[] args) {
		Animals passaro = new Animals(2,"Bemtivi", 2, "morrom e branco");
		AnimalsCRUD aCRUD = new AnimalsCRUD();
		aCRUD.getAllAnimals();
	}

}
