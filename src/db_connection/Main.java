package db_connection;

public class Main {

	public static void main(String[] args) {
		AnimalsCRUD aCrud = new AnimalsCRUD();
		aCrud.getAllAnimals();
		aCrud.deletarAnimal(2);
		aCrud.getAllAnimals();
	}

}
