package model;

import java.sql.DriverManager;

import java.sql.Connection;



public class DAO {

	/**m�dulo de conex�o**/
	// parametros de conex�o
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://127.0.0.1:3306/dbagenda?useTimezone=true&serverTimezone=UTC";
	private String user="root";
	private String Password="35352710";
	//m�todo de conex�o
	
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
	//public void testeConex�o() {
		//try {
		//	Connection con = conectar();
			// System.out.println(con);
		//	con.close();
	//	} catch (Exception e) {
		//	System.out.println(e);
	//	} 
	//}
}
