package model;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
	/* crud create*/
	public void inserirContato(Javabeans contato) {
		String create = "insert into contatos (nome,fone,email) values (?,?,?)";
		
		try {
			/* abrir conex�o*/
			Connection con= conectar();
			/* preparar a query*/
			PreparedStatement pst = con.prepareStatement(create);
			/* substituindo os parametros (?)*/
			pst.setString(1,contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3,contato.getEmail());
			/* executar a query*/
			pst.executeUpdate();
			/* encerrar conex�o */
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
