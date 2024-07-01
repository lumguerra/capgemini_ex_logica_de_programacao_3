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
			System.out.println("Lista de Animais cadastrados:");
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
			System.out.println("==================");
		}
		return animalsList;		
		
	}
	
	Animals getAnimalById(int id) {
		Animals a = new Animals();
		
		try {			
			openConnection();
			stm = con.prepareStatement("SELECT * FROM animals WHERE id = (?)");			
			stm.setInt(1, id);
			rs = stm.executeQuery();
			if(rs.next()) {
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setLegsQtd(rs.getInt("legs_qtd"));
				a.setColor(rs.getString("color"));
			}
			rs.close();
			closeConnection();
		}catch(Exception e) {
			System.out.println("Erro ao tentar obter dados do BD");
			e.printStackTrace();
		}
		
		if(a.getName() != "null") {
			System.out.println("==================");
			System.out.println("Id: " + a.getId());
			System.out.println("Nome: " + a.getName());
			System.out.println("Quantidade de pernas: " + a.getLegsQtd());
			System.out.println("Cor: " + a.getColor());
			System.out.println("==================");
		}else {
			System.out.println("Animal inexistente");
		}	
		return a;
	}
	
	//update
	void editarAnimal(Animals a) {
		try {
			openConnection();
			stm = con.prepareStatement("UPDATE animals SET name = ?, legs_qtd = ?, color = ? WHERE id = ?"); 
			stm.setString(1, a.getName());
			stm.setInt(2, a.getLegsQtd());
			stm.setString(3, a.getColor());
			stm.setInt(4, a.getId());
			stm.execute();
			closeConnection();	
			System.out.println("Animal editado com sucesso.");
		}catch(Exception e) {
			System.out.println("Não foi possivel editar.");
			e.printStackTrace();
		}	
			
	}
	
	//delete
	void deletarAnimal(int id) {
		try {
			openConnection();
			stm = con.prepareStatement("DELETE FROM animals WHERE id = ?");
			stm.setInt(1, id);
			stm.execute();
			System.out.println("Animal com id " + id + " deletado com sucesso");
			closeConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}


















