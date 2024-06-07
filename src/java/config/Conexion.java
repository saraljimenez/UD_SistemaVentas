package config;

import java.sql.*;


public class Conexion {

    private final String base = "bd_ventas";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private Connection con = null;

    public Connection Conexion() { 
        try {
            Class.forName(driver);
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("conexion realizada");
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("error en cargar ");
        }
        return con;
    }
}