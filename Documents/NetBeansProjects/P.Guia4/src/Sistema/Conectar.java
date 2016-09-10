package Sistema;//Sistema Administracion de Elementos Tecnologicos

import java.sql.*;

public class Conectar {
    
    Connection Conexion=null;
    
    public Connection miConexion(){
       try{
           Class.forName("com.mysql.jdbc.Driver");
          //Conexion = DriverManager.getConnection("jdbc:mysql://localhost/Sistema","root","");//Acceso Local 
          Conexion = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/sistema_adm_elem","proyectog4ean","Proyecto_ean123");//Acceso Remoto
       }catch(ClassNotFoundException e){
           System.err.println("No se encontro Driver");
           Conexion=null;
       }catch(SQLException ex){
           System.err.println("No se pudo conectar a la Base de Datos");
           Conexion=null;
       }
       return Conexion;
    }
}