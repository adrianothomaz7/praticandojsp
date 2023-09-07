package model;

import java.sql.DriverManager;

import java.sql.Connection;



public class DAO {

	/**módulo de conexão**/
	// parametros de conexão
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String user="root";
	private String Password="35352710";
	//método de conexão
	
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, Password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
	}
	//testando con
	//public void testeConexão() {
		//try {
		//	Connection con = conectar();
			// System.out.println(con);
		//	con.close();
	//	} catch (Exception e) {
		//	System.out.println(e);
	//	} 
	//}
}
