package org.ifpe;



public class Login {

    public boolean validarLogin(String usuario, String senha) {
        if (usuario.equals("12345678911") && senha.equals("P@ssw0rd!")) {
            return true;
        }
        else if (usuario.equals("") && senha.equals("")) {
                return false;
        }
        return false;
    }
}
