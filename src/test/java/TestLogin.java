import org.ifpe.Login;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestLogin {


    @Test
    public void testLoginValido() {
        Login login = new Login();
        boolean resultado = login.validarLogin("12345678911", "P@ssw0rd!");
        assertTrue(resultado);
    }

    @Test
    public void testLoginInvalido() {
        Login login = new Login();
        boolean resultado = login.validarLogin("12345678911", "P@1234");
        assertFalse(resultado);
    }

    @Test
    public void testLoginVazio() {
        Login login = new Login();
        boolean resultado = login.validarLogin("", "");
        assertFalse(resultado);
    }



}
