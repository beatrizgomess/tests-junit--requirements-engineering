package joseTest;

import org.ifpe.model.Paciente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegistrarContaTest {
	
	@Test
	public void persistAccountSuccessfully() {
		//GIVEN
		var paciente = createPaciente("Pedro", "20/12/1999", 1L);
		
		//WHEN
		var result = paciente.validate();
		
		//THEN
		assertTrue(result);	
	}
	
	@Test
	public void persistAccountWhenAgeLowerThanEighteen() {
		//GIVEN
		var paciente = createPaciente("Maria", "20/12/2018", 2L);
		
		//WHEN
		var result = paciente.validate();
		
		//THEN
		assertFalse(result);	
	}
	
	@Test
	public void persistAccountWhenFieldsAreEmpty() {
		//GIVEN
		var paciente = createPacienteWithEmptyFields(); 
		
		//WHEN
		var result = paciente.validate();
		
		//THEN
		assertFalse(result);	
	}
	
	public Paciente createPaciente(String nome, String dataNascimento, Long id) {
		return new Paciente(id, nome, nome+"@gmail.com", "121235454", "10300202", dataNascimento, "216354657",
				"SDS-PE", "54487587", "22A", "", "81985878787", "12345468ss");
	}
	
	public Paciente createPacienteWithEmptyFields() {
		return new Paciente(1L, "", "", "", "", "", "",
				"", "", "", "", "", "");
	}
	
}
