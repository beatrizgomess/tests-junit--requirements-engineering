package org.ifpe.repository;

import org.ifpe.model.Medico;

import java.util.ArrayList;
import java.util.List;

public class MedicoRepository {
    private List<Medico> medicoDatabaseInMemory = new ArrayList<>();

    public void insert(Medico medico) {
        if(medico.validate()) {
            medicoDatabaseInMemory.add(medico);
        } else {
            throw new RuntimeException("médico inválido.");
        }

    }

    public Medico find(Long id) {
        for(var medico : medicoDatabaseInMemory) {
            if(medico.getId() == id) {
                return medico;
            }
        }
        throw new RuntimeException("Não existe um médico cadastrado com esse ID.");
    }

    public List<Medico> findAll() {
        return medicoDatabaseInMemory;
    }
}
