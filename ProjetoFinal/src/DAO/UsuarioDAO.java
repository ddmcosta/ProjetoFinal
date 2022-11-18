package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Factory.ConnectionFactory;
import Modelo.Usuario;

public class UsuarioDAO {
	
	public void criarUsuario(Usuario usuario)	{
		
		String dados = "INSERT INTRO  usuarios(id,nome,email,endereco,cpf,telefone)VALUES(?,?,?,?,?,?)";
		
		Connection conex = null;
		PreparedStatement pstm = null;
		
	try {
		conex = ConnectionFactory.createConnectionToMySQL();
		pstm = (PreparedStatement) conex.prepareStatement(dados);
		
		pstm.setInt(1, usuario.getId());
		pstm.setString(2, usuario.getNome());
		pstm.setString(3, usuario.getEmail());
		pstm.setString(4, usuario.getEndereço());
		pstm.setInt(5, usuario.getCpf());
		pstm.setInt(6, usuario.getTelefone());
		
		pstm.execute();
		
		System.out.println("Executado com Sucesso");
		
	} catch (Exception erro) {
		erro.printStackTrace();
		
	} finally {
		
		try {
			if(pstm !=null) {
				pstm.close();
			}
			if(conex != null) {
				conex.close();
				
			}
			
		}catch (Exception erro) {
			erro.printStackTrace();
		}
		
		
		}
	}
}

