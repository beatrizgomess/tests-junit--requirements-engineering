package beatrizTest;

import org.ifpe.model.Paciente;
import org.ifpe.exceptions.CPFInvalidException;
import org.ifpe.exceptions.RGInvalidException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmitirCartaoSusTest {
    @Test
    public void pacienteCenarioIdeal() throws Exception {
        Paciente paciente = new Paciente();
        paciente.setNomeCompleto("João Silva");
        paciente.setCpf("12345678910");
        paciente.setRg("123456789");
        paciente.setDataNascimento("20/05/2000");
        paciente.setOrgaoExpedidor("SSP");
        paciente.setCep("12345678");
        paciente.setBairro("Bairro X");
        paciente.setLogradouro("Rua Y");
        paciente.setNumeroResidencia("123");
        paciente.setNumeroTelefone("12345678910");
        paciente.setEmail("joao.silva@email.com");

        boolean result = paciente.validar();

        assertTrue(result);
    }

    @Test
    public void testPacienteCPFInvalido() {
        Paciente paciente = new Paciente();
        paciente.setNomeCompleto("João da Silva");
        paciente.setCpf("123456789000");
        paciente.setRg("123456789");
        paciente.setDataNascimento("01/01/2000");
        paciente.setOrgaoExpedidor("SSP");
        paciente.setCep("12345678");
        paciente.setBairro("Bairro");
        paciente.setLogradouro("Rua");
        paciente.setNumeroResidencia("123");
        paciente.setNumeroTelefone("1234567890");
        paciente.setEmail("email@email.com");
        assertThrows(CPFInvalidException.class , () -> paciente.validar());
    }

    @Test
    public void testPacienteRGInvalido() {
        Paciente paciente = new Paciente();
        paciente.setNomeCompleto("João da Silva");
        paciente.setCpf("12345678910");
        paciente.setRg("12347578989000");
        paciente.setDataNascimento("01/01/2000");
        paciente.setOrgaoExpedidor("SSP");
        paciente.setCep("12345678");
        paciente.setBairro("Bairro");
        paciente.setLogradouro("Rua");
        paciente.setNumeroResidencia("123");
        paciente.setNumeroTelefone("1234567890");
        paciente.setEmail("email@email.com");
        assertThrows(RGInvalidException.class , () -> paciente.validar());
    }



    @Test
    public void testPacienteDataNascimentoInvalido() {
        Paciente paciente = new Paciente();
        paciente.setNomeCompleto("João da Silva");
        paciente.setCpf("12345678910");
        paciente.setRg("123456789");
        paciente.setDataNascimento("32/01/2000");
        paciente.setOrgaoExpedidor("SSP");
        paciente.setCep("12345678");
        paciente.setBairro("Bairro");
        paciente.setLogradouro("Rua");
        paciente.setNumeroResidencia("123");
        paciente.setNumeroTelefone("1234567890");
        paciente.setEmail("email@email.com");
        paciente.setSenha("12345");
        paciente.setComplemento("Casa");
        String resultadoEsperado = "Data de nascimento inválida";

        String resultado = paciente.cadastrarPaciente(paciente.getNomeCompleto(), paciente.getCpf(), paciente.getRg(),
                paciente.getDataNascimento(), paciente.getOrgaoExpedidor(), paciente.getCep(), paciente.getBairro(),
                paciente.getLogradouro(), paciente.getNumeroResidencia(), paciente.getNumeroTelefone(), paciente.getEmail(),
                paciente.getId(), paciente.getSenha());

        assertEquals(resultadoEsperado, resultado);

    }


}
