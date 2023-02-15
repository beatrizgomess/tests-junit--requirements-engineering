package beatrizTest;

import org.ifpe.model.Paciente;
import org.junit.Test;
import static org.junit.Assert.*;

public class EsqueceuSenhaTest {

    Paciente paciente = new Paciente();
    @Test
    public void testEsquecerSenhaCenarioIdeal(){
        boolean resultado = paciente.validarEsqueceuSenha("joao.silva@gmail.com", "123456789");
        assertTrue(resultado);
    }

    @Test
    public void testEsquecerSenhaComCPFVazio(){
        boolean resultado = paciente.validarEsqueceuSenha("joao.silva@gmail.com", "");
        assertFalse(resultado);
    }

    @Test
    public void testEsquecerSenhaComEmailVazio(){
        boolean resultado = paciente.validarEsqueceuSenha("", paciente.getCpf());
        assertFalse(resultado);
    }

    @Test
    public void testEsquecerSenhaComDadosIncorretosCPF(){
        boolean resultado = paciente.validarEsqueceuSenha("joao.silva@gmail.com", "12345678");
        assertFalse(resultado);


    }

    @Test
    public void testEsquecerSenhaComDadosIncorretosEmail(){
        boolean resultado = paciente.validarEsqueceuSenha("joao@gmail.com", "123456789");
        assertFalse(resultado);

    }

    @Test
    public void testEsquecerSenhaComDadosVazios(){
        boolean resultado = paciente.validarEsqueceuSenha("", "");
        assertFalse(resultado);


    }


}
