package model;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexao {
    /* Banco de dados: `dbjava` */

    public Connection getConexao() 
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/trabalho_dev_web_db", "root", "");
            return conexao;
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco" + e.getMessage());
            return null;
        }
    }
}
