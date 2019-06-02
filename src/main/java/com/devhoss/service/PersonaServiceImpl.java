package com.devhoss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devhoss.model.Persona;
import com.devhoss.repository.IPersonaRepository;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaRepository iPersonaRepository;

	public List<Persona> FindAll() {
		return iPersonaRepository.findAll();
	}

	public Persona FindById(int id) {
		return iPersonaRepository.findById(id).get();
	}

	public Persona Save(Persona persona) {
		Persona savedPersona = iPersonaRepository.save(persona);
		return savedPersona;
	}

	
	
}
