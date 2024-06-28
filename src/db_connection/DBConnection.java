package db_connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class DBConnection {
	
	Connection con;
	PreparedStatement stm;
	ResultSet rs;
	CallableStatement cstm;
	
	private String filepath = "src/db_connection/password.txt";
	private String password;
	private String userName = "root";
	private String url = "jdbc:mysql://localhost:3306/beeings";
	
	void openConnection(){		
		//get password from file
		try {
            String password = new String(Files.readAllBytes(Paths.get(this.filepath))); 
            this.password = password;
        } catch (IOException e) {
            System.out.println("Password file missing or incorrect file path");
            e.printStackTrace();
        }
		//connect
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.con = DriverManager.getConnection(this.url, this.userName, this.password);
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("Falha na conexão com banco de dados.");
			e.printStackTrace();
		}		
	}	
	
	void closeConnection() {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Falha no encerramento da conexão com banco de dados.");
			}		
	}
}