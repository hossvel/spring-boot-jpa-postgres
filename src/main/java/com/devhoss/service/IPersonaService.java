package com.devhoss.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devhoss.model.Persona;

@Service
public interface IPersonaService {
	public List<Persona> FindAll();
	
	public Persona FindById(int id);

	public Persona Save(Persona persona);

}
