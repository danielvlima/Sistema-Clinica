/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

/**
 *
 * @author danie
 */
public class Paciente {
    private int id;
    private String nome;
    private String cpf;
    private String senha;
    private String autorizado;
    private int idTipoPlano;
//31740
//8173

    public Paciente(String nome, String cpf, String senha, String autorizado, int idTipoPlano) {
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.autorizado = autorizado;
        this.idTipoPlano = idTipoPlano;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
    public String getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(String autorizado) {
        this.autorizado = autorizado;
    }

    public int getIdTipoPlano() {
        return idTipoPlano;
    }

    public void setIdTipoPlano(int idTipoPlano) {
        this.idTipoPlano = idTipoPlano;
    }
    
}
