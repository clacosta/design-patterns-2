package cap1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnctionFactory {
	
	private String tipoBanco = System.getenv("tipoBanco");
	
	public ConnctionFactory() {
		
		this.tipoBanco = retornaTipoDoBanco();
		
	}
	

	private String retornaTipoDoBanco() {
		
		String variavelAmbienteTipoBanco  = retornaVariavelAmbienteTipoBanco();
		
		if(variavelAmbienteTipoBanco.equals("mysql")) {
			return "mysql";
		}
		
		return "postgres";
		
	}

	private String retornaVariavelAmbienteTipoBanco() {
		
		return System.getenv("tipoBanco");
		
	}

	public Connection getConnection() {
		
		try {
		
			Connection c = DriverManager.getConnection("jdbc:" + this.tipoBanco + "://localhost:3306/banco", "root", "123");
			return c;
		
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		
		}
		
	}
	
}
