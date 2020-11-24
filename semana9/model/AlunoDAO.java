package semana9.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import semana9.bo.Aluno;
import semana9.jdbc.*;

public class AlunoDAO {
	
	public void create(Aluno aluno)
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into aluno(username, email, password, create_time ) values (?, ?, ?, CURRENT_TIMESTAMP )";
		
		try
		{
			stmt = con.prepareStatement(sql);  //instancia uma instrucao sql
			stmt.setString(1, aluno.getUsername() ); //primeiro parametro da query
			stmt.setString(2, aluno.getEmail());
			stmt.setString(3, aluno.getPassword());
			
			stmt.executeUpdate();
			System.out.println("[AlunoDAO] Aluno incluido com sucesso");
			
			
		} catch (SQLException e)
		{
			System.out.println("Erro na tentativa de insercao: "+ e.getMessage());
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
	}
   
	//READ ****************************************
	public List<Aluno> read() {
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		
		//ler banco mysql e preencher lista de alunos
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT * FROM db_aula_prog_java.aluno";
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Aluno aluno = new Aluno();
				aluno.setUsername(rs.getString("username"));
				aluno.setEmail(rs.getString("email"));
				
				listaAlunos.add(aluno);
			}
			
			
		}catch(SQLException e)
		{
			System.out.println("<DAO> Erro lendo banco");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		
		return listaAlunos;
	}

	
	// UPDATE *************************************
		public void update(Aluno aluno) {
			
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
				
		String sql = "update aluno set  username = ?, email = ? where password = ?";
			
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
            preparedStatement.setString(1, aluno.getUsername());
            preparedStatement.setString(2, aluno.getEmail());
            preparedStatement.setString(3, aluno.getPassword());
        
            preparedStatement.execute();
        }catch(SQLException e){
            e.printStackTrace();
        }	
			
	}
	// DELETE  *****************************
		
		public void delete(Aluno aluno){
			
			Connection con = ConnectionFactory.getConnection();
			PreparedStatement stmt = null;
			
			
			String sql = "delete from aluno where username = ?";
        
			try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
        	
            preparedStatement.setString(1, aluno.getUsername());
            preparedStatement.execute();
            
        }
			catch(SQLException e){
            e.printStackTrace();
        }
			
    }
		
			
		
		
		
		
		
	
	
	

}
