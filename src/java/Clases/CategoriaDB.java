/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author Lina David
 */
public class CategoriaDB {
    
    public static boolean crearCategoria(Categoria cate){
        boolean respuesta = false;
        Conexion con = new Conexion();
        Connection cn = con.getConexion();
        try {
            CallableStatement cs = cn.prepareCall("INSERT INTO biblioteca.categoria(Nombre) VALUES('"
                                                   + cate.getNombre() + "')");
            int i = cs.executeUpdate();
            if(i == 1)
                respuesta = true;
            else
                respuesta = false;
            
        }catch(Exception e){
            System.err.println(e);
        }
        return respuesta;
    }
    
}
