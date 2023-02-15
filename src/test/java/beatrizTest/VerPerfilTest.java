package beatrizTest;

import org.ifpe.model.Medico;
import org.ifpe.model.Paciente;
import org.ifpe.repository.PacienteRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class VerPerfilTest {


    PacienteRepository pacienteRepository = new PacienteRepository();

    @Before
    public void persistirPaciente(){
        pacienteRepository.insert(createPaciente("Pedro Silva", "01/01/2000", 1L));
    }


    @Test
    public void testVerPerfilPaciente() {

        var result = pacienteRepository.find(1L);


        assertNotNull(result);
        assertEquals("Pedro Silva", pacienteRepository.find(1L).getNomeCompleto());
        assertEquals("124252345", pacienteRepository.find(1L).getCpf());
        assertEquals("2323412", pacienteRepository.find(1L).getRg());
        assertEquals("SSD", pacienteRepository.find(1L).getOrgaoExpedidor());
        assertEquals("216354657", pacienteRepository.find(1L).getNumeroSus());
        assertEquals("01/01/2000", pacienteRepository.find(1L).getDataNascimento());
        assertEquals("51234678", pacienteRepository.find(1L).getCep());
        assertEquals("81985878787", pacienteRepository.find(1L).getNumeroTelefone());
        assertEquals("22A", pacienteRepository.find(1L).getNumeroResidencia());
    }


    public Paciente createPaciente(String nome, String dataNascimento, Long id) {
        return new Paciente(id, nome, nome+"@gmail.com", "124252345", "2323412", dataNascimento, "216354657",
                "SSD", "51234678", "22A", "", "81985878787", "12345468ss");

    }
}



