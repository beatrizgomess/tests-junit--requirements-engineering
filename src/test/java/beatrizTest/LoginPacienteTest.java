package beatrizTest;

import org.ifpe.model.LoginPaciente;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginPacienteTest {

    LoginPaciente loginPaciente = new LoginPaciente();

    @Test
    public void testLoginCenarioIdeal(){
        boolean resultado = loginPaciente.validarLogin("23234663438", "P034nsdfs");
        assertTrue(resultado);
    }

    @Test
    public void testLoginCenarioDadoIncorretoCPF(){
        boolean resultado = loginPaciente.validarLogin("4123412", "P034nsdfs");
        assertFalse(resultado);

    }

    @Test
    public void testLoginCenarioDadoIncorretoSenha(){

        boolean resultado = loginPaciente.validarLogin("23234663438", "P6323");
        assertFalse(resultado);
    }

    @Test
    public void testLoginCenarioInputVazio(){
        boolean resultado = loginPaciente.validarLogin("", "");
        assertFalse(resultado);
    }

    @Test
    public void testLoginCenarioInputVazioCPF(){
        boolean resultado = loginPaciente.validarLogin("", "P034nsdfs");
        assertFalse(resultado);
    }

    @Test
    public void testLoginCenarioInputVazioSenha(){
        boolean resultado = loginPaciente.validarLogin("23234663438", "");
        assertFalse(resultado);
    }

}
