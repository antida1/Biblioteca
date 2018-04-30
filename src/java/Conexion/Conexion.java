/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;

/**
 *
 * @author Lina David
 */
public class Conexion {
    
    Connection conectar;

	public Conexion() {
    
		String aux = "";
		String bd = "biblioteca";
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/biblioteca";
		String usuario = "root";
		String clave = "";
		
                try {
			Class.forName(driver);
			this.conectar = DriverManager.getConnection(url, usuario, clave);
		} catch (SQLException arg29) {
			aux = "<br><br>error al comunicarse la base de datos\n\n<br><br>"
					+ arg29.getMessage() + "<br>" + "<br>";
			System.out.println(aux);
		} catch (ClassNotFoundException arg30) {
			aux = aux + "error al cargar el driver\n\n" + "<br>" + "<br>"
					+ arg30.getMessage() + "<br>" + "<br>";
			System.out.println(aux);
		}
        }
	

	public Connection getConexion() {
		return conectar;
	}

	public void setConexion(Connection conectar) {
		this.conectar = conectar;
	}

	public void cerrarConexion() {
		try {
			this.conectar.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
