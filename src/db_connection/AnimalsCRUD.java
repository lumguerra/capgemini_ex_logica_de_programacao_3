package db_connection;
import java.util.Vector;

public class AnimalsCRUD extends DBConnection{
	
	
	//Create
	void insertAnimal(Animals a){
		try{
			openConnection();
			stm = con.prepareStatement("INSERT INTO animals VALUES(?,?,?,?)");
			stm.setInt(1, a.getId());
			stm.setString(2, a.getName());
			stm.setInt(3, a.getLegsQtd());
			stm.setString(4, a.getColor());
			stm.execute();
			stm.close();
			closeConnection();
			System.out.println(a + " inserido no banco de dados com sucesso.");
		}catch(Exception e) {
			System.out.println("Não foi possivel inserir " + a + " no banco de dados");
			e.printStackTrace();
		}
	}
	
	//Read
	Vector<Animals> getAllAnimals(){
		
		Vector<Animals> animalsList = new Vector<>();
		
		try {
			openConnection();
			stm = con.prepareStatement("SELECT * FROM animals");
			rs = stm.executeQuery();
			while(rs.next()) {
				Animals a = new Animals();
				a.setId(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setLegsQtd(rs.getInt(3));
				a.setColor(rs.getString(4));
				animalsList.add(a);
			}			
			stm.close();
			closeConnection();
			System.out.println("Lista de Animais criada com sucesso");
		}catch(Exception e) {
			System.out.println("Erro ao tentar criar lista de animais");
			e.printStackTrace();			
		}
		
		for(Animals animal : animalsList) {
			System.out.println("==================");
			System.out.println("Id: " + animal.getId());
			System.out.println("Nome: " + animal.getName());
			System.out.println("Quantidade de pernas: " + animal.getLegsQtd());
			System.out.println("Cor: " + animal.getColor());
		}
		return animalsList;		
		
	}
	
	Animals getAnimalById(int id) {
		
	}
	
}
