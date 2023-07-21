/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionalidades;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Adriel
 */
public class Connector {

    public static Connection conectar() {
        String CLASSE_DRIVER = "com.mysql.cj.jdbc.Driver";
        String USUARIO = "nfadministrator";
        String SENHA = "nftrabalho#231D";
        String URL_SERVIDOR = "jdbc:mysql://nfdb.mysql.database.azure.com:3306/nota_fiscal1?useSSL=True";

        try {
            Class.forName(CLASSE_DRIVER);
            return DriverManager.getConnection(URL_SERVIDOR, USUARIO, SENHA);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erro ao conectar ao banco de dados.");
            System.exit(-42);
            return null;
        }
    }
    
    
    public static void desconectar(Connection conn, PreparedStatement stmt) {
        if (conn != null) {
            try {
                conn.close();
                stmt.close();
            } catch (SQLException e) {
                System.out.println("Não foi possível fechar a conexão");
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        conectar();
    }
    
}





