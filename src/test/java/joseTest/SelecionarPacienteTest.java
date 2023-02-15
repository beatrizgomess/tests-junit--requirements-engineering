package joseTest;

import org.ifpe.model.Paciente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.ifpe.repository.PacienteRepository;

public class SelecionarPacienteTest {
	
	PacienteRepository pacienteRepository = new PacienteRepository();
	
	@Test
	public void selectPatientSuccessfully() {
		//GIVEN		
		pacienteRepository.insert(createPaciente("João", "15/09/1998",  1L));
		pacienteRepository.insert(createPaciente("Maria", "15/10/1992", 2L));
		pacienteRepository.insert(createPaciente("Mariana", "12/11/1982", 3L));
	
		//WHEN
		var pacienteBuscado = pacienteRepository.find(2L);
	
		//THEN
		assertEquals("Maria", pacienteBuscado.getNomeCompleto());
		assertEquals("15/10/1992", pacienteBuscado.getDataNascimento());
	}
	
	public Paciente createPaciente(String nome, String dataNascimento, Long id) {
		return new Paciente(id, nome, nome+"@gmail.com", "121235454", "10300202", dataNascimento, "216354657",
				"SDS-PE", "54487587", "22A", "", "81985878787", "12345468ss");
	}
}
