package org.ifpe;

public class Deslogar {
    Login login = new Login();

    public boolean deslogar(String username, String password, String logoutCode){
        if (login.validarLogin(username, password)){
            return login.validarLogout(logoutCode);
        }
        return false;
    }

}
