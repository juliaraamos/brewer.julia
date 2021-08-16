package com.julia.brewer.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julia.brewer.model.Cidade;

public interface Cidades extends JpaRepository<Cidade, Serializable>{
	
	public List<Cidade> findByEstadoCodigo(Long codigoEstado);
	
}
