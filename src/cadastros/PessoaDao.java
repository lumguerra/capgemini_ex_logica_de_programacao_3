package cadastros;

public class PessoaDao extends Dao{
	
	//CREATE
	void incluirPessoa(Pessoa p) throws Exception{
		open();
		stm = con.prepareStatement("INSERT INTO pessoas VALUES(?,?,?)");
		stm.setInt(1, p.getIdPessoa());
		stm.setString(2, p.getNomePessoa());
		stm.setString(3, p.getEmailPessoa());
		stm.execute();
		stm.close();
		close();
	}
	
	//READ
	void consultarPessoa(int idPessoa) throws Exception{
		open();
		Pessoa p = null;
		stm = con.prepareStatement("SELECT * FROM pessoas WHERE idPessoa = ?");
		stm.setInt(1, idPessoa);
		rs = stm.executeQuery();
		
		if(rs.next()) {
			p = new Pessoa();
			p.setIdPessoa(rs.getInt("idPessoa"));
			p.setNomePessoa(rs.getString("nomePessoa"));
			p.setEmailPessoa(rs.getString("email"));
		}
		rs.close();
		stm.close();
		close();
	}
	
	
	//UPDATE
	void alterarPessoa(Pessoa p) throws Exception{
		open();
		stm = con.prepareStatement("UPDATE pessoas nome = ?, email = ?, WHERE idPessoa = ?");
		stm.setString(2, p.getNomePessoa());
		stm.setString(3, p.getEmailPessoa());
		stm.setInt(1, p.getIdPessoa());
		stm.execute();
		stm.close();
		close();
	}
	
	//DELETE	
	void excluirPessoa(Pessoa p) throws Exception{
		open();
		stm = con.prepareStatement("DELETE FROM pessoas WHERE idPessoa = ?");
		stm.setInt(1, p.getIdPessoa());
		stm.execute();
		stm.close();
		close();
	}
	
}
