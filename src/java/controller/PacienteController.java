/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import aplicacao.Paciente;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.PacienteDAO;

/**
 *
 * @author danie
 */
@WebServlet(name = "PacienteController", urlPatterns = {"/view/PacienteController"})
public class PacienteController extends HttpServlet{
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher rd;
        String nome_user = request.getParameter("nome");
        String cpf_user = request.getParameter("cpf");
        String senha_user = request.getParameter("senha");
        int id_tipo_plano = Integer.parseInt(request.getParameter("tipoPlano"));
        System.out.print(id_tipo_plano);
                
        String acao = request.getParameter("acao");

        Paciente paciente = new Paciente(nome_user, cpf_user, senha_user, "N" , id_tipo_plano);
        System.out.print("dentro do controller: " + paciente.getIdTipoPlano());
        try {
            PacienteDAO pacienteDAO = new PacienteDAO();
            pacienteDAO.Inserir(paciente);
            rd = request.getRequestDispatcher("/view/login.jsp");
            rd.forward(request, response);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw new RuntimeException("Falha em uma query para cadastro de paciente");
        }

    }
}
