package com.julia.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.julia.brewer.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{

}
