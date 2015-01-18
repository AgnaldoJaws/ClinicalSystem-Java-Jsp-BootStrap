package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class metodos {

    private String connectionUrl;
    Connection con;
    ResultSet rs;
    private static final String DRIVER = "com.mysql.jdbc.Driver";

    public void abreConexaoSQLServer() throws SQLException {

        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection("jdbc:mysql://localhost/sistema_clinico", "root", "");
            System.out.println("Conexão ok");
        } catch (Exception e) {

            e.printStackTrace();

        }
    }

    public static void main(String[] args) throws SQLException {
        metodos m = new metodos ();
        m.abreConexaoSQLServer();

    }

}