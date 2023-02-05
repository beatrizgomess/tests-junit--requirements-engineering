package org.ifpe;

public class InativarConta {
    Login login = new Login();

        public boolean inativarConta(String username, String password, String EmailCode){
            if (login.validarLogin(username, password)){
                return login.validarEmail(EmailCode);
            }
            return false;
        }

}

