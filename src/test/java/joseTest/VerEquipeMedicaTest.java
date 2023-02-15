package joseTest;

import org.ifpe.model.Medico;
import org.ifpe.repository.MedicoRepository;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VerEquipeMedicaTest {

    MedicoRepository medicoRepository = new MedicoRepository();

    @Test
    public void seeMedicalTeamSuccessfully() {
        //GIVEN
        medicoRepository.insert(createMedico("Pedro", "Clínico Geral", "2323212"));
        medicoRepository.insert(createMedico("Maria", "Ortopedia", "2221465"));
        medicoRepository.insert(createMedico("Beatriz", "Pediatra", "54877821"));

        //WHEN
        var result = medicoRepository.findAll();

        //THEN
        assertNotNull(result);
        assertEquals(3, result.size());
        assertEquals("Pedro", result.get(0).getNome());
        assertEquals("Maria", result.get(1).getNome());
        assertEquals("Beatriz", result.get(2).getNome());
    }

    @Test
    public void seeMedicalTeamWhenListIsEmpty() {
        //WHEN
        var result = medicoRepository.findAll();

        //THEN
        assertNotNull(result);
        assertEquals(0, result.size());
    }


    public Medico createMedico(String name, String crm, String especialidade) {
        return new Medico(name, especialidade, crm);
    }
}
