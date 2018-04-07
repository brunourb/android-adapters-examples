package br.com.senaigo.mobile.vouaprenderandroid.entidades;

/**
 * Created by bruno on 07/04/18.
 */

public class Pessoa {

    protected String nome;
    protected String email;
    protected String telefone;
    protected String senha;

    public Pessoa(final String nome,
                  final String email,
                  final String telefone,
                  final String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}