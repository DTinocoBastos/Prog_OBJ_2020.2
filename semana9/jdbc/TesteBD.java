package semana9.jdbc;

import java.sql.Connection;

public class TesteBD {

	public static void main(String[] args) {

		
				try
				{
					Connection con = ConnectionFactory.getConnection();
			        
			 		System.out.println("Conexão Ok");
				}
				catch(Exception e)
				{
					System.out.println("Erro na conexão!");
				}
				
			}

}
