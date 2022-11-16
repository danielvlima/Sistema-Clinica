/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import aplicacao.Paciente;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author danie
 */
public class PacienteDAO {
    
     public void Inserir(Paciente paciente) throws Exception {
        Conexao conexao = new Conexao();
        System.out.print("dentro do DAO: " + paciente.getNome());
        try {
            PreparedStatement sql = conexao.getConexao().prepareStatement("INSERT INTO paciente (nome, cpf, senha, autorizado, idtipoplano) VALUES (?,?,?,?,?)");
            sql.setString(1, paciente.getNome());
            sql.setString(2, paciente.getCpf());
            sql.setString(3, paciente.getSenha());
            sql.setString(4, paciente.getAutorizado());
            sql.setInt(5, paciente.getIdTipoPlano());
            //sql.setInt(5, 1);
            sql.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        } 
    }
}
