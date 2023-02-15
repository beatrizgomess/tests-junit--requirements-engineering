package joseTest;

import org.ifpe.model.Paciente;
import org.ifpe.repository.PacienteRepository;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AlterarDadosTest {

	PacienteRepository pacienteRepository = new PacienteRepository();

	@Test
	public void changeDataSuccessfully() {
		//GIVEN
		pacienteRepository.insert(createPaciente("Joaquim", "20/12/2000", 1L));
		var newPatient = createPaciente("Mario", "21/11/1988", 1L);

		//WHEN
		var result = pacienteRepository.update(newPatient, 1L);

		//THEN
		assertTrue(result);
		var patientFound = pacienteRepository.find(1L);
		assertEquals("Mario", patientFound.getNomeCompleto());
		assertEquals("21/11/1988", patientFound.getDataNascimento());

	}
	
	@Test
	public void changeDataWhenEmailIsEmpty() {
		//GIVEN
		pacienteRepository.insert(createPaciente("Miguel", "15/08/1999", 1L));
		var newPatient = createPacienteWithEmptyEmail("Pietra", "25/09/1977", 1L);

		//WHEN
		var result = pacienteRepository.update(newPatient, 1L);

		//THEN
		assertFalse(result);
		var patientFound = pacienteRepository.find(1L);
		assertEquals("Miguel", patientFound.getNomeCompleto());
		assertEquals("15/08/1999", patientFound.getDataNascimento());
	}

	public Paciente createPaciente(String nome, String dataNascimento, Long id) {
		return new Paciente(id, nome, nome+"@gmail.com", "121235454", "10300202", dataNascimento, "216354657",
				"SDS-PE", "54487587", "22A", "", "81985878787", "12345468ss");
	}

	public Paciente createPacienteWithEmptyEmail(String nome, String dataNascimento, Long id) {
		return new Paciente(id, nome, "", "121235454", "10300202", dataNascimento, "216354657",
				"SDS-PE", "54487587", "22A", "", "81985878787", "12345468ss");
	}
}
