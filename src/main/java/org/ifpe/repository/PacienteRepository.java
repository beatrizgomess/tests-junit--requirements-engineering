package org.ifpe.repository;

import org.ifpe.model.Paciente;

import java.util.ArrayList;
import java.util.List;


public class PacienteRepository {
	private List<Paciente> patientDatabaseInMemory = new ArrayList<>();
	
	public void insert(Paciente paciente) {
		if(paciente.validate()) {
			patientDatabaseInMemory.add(paciente);
		} else {
			throw new RuntimeException("Paciente inválido.");
		}
		
	}	
	
	public Paciente find(Long id) {
		for(var paciente : patientDatabaseInMemory) {
			if(paciente.getId() == id) {
				return paciente;
			}
		}
		throw new RuntimeException("Não existe um paciente cadastrado com esse ID.");
	}

	public boolean update(Paciente paciente, Long id) {
		if(paciente.validate()) {
			for(Paciente p : patientDatabaseInMemory) {
				if(p.getId() == id) {
					patientDatabaseInMemory.remove(p);
					patientDatabaseInMemory.add(paciente);
					return true;
				}
			}
		}
		return false;
	}
}	
