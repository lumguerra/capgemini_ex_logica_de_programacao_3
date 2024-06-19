package cadastros;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

	protected Connection con;
	protected PreparedStatement stm;
	protected ResultSet rs;
	protected CallableStatement call;

	void open() throws Exception {
		String url = "jdbc:mysql://localhost:3306/cadastros";
		String user = "root";
		String password = "Lg024135";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException ex) {
			System.out.println("Erro ao conectar com o banco");
		}
	}

	void close() throws Exception {
		con.close();
	}

}
