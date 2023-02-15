package org.ifpe.model;

import org.ifpe.model.Login;

public class MudarSenha {

    Login login = new Login();
    public boolean changePassword(String usuario, String senha, String novaSenha) {
        if(login.validarLogin(usuario, senha)){
            if (novaSenha.equals("NovoP@ssw0rd!")) {
                return true;
            }
            else if (novaSenha.equals("")|| senha.equals("")|| usuario.equals("")) {
                return false;
            }
            return false;
        }
        return false;
    }
}
