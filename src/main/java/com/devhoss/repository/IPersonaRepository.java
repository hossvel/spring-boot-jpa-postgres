package com.devhoss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devhoss.model.Persona;

@Repository
public interface IPersonaRepository  extends JpaRepository<Persona, Integer>{

}
