package org.ifpe.model;

public class LoginPaciente {

    private String cpf;
    private String senha;


    public LoginPaciente() {}

    public LoginPaciente(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }


    public boolean validarLogin(String cpf, String senha){
        if (cpf == null || cpf.trim().isEmpty()) {
            return false;
        }
        if (senha == null || senha.trim().isEmpty()) {
            return false;
        }

        if (cpf.equals("23234663438") && senha.equals("P034nsdfs")) {
            return true;
        }
        else if (cpf.equals("") || senha.equals("")) {
            return false;
        }

        return false;
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
}
