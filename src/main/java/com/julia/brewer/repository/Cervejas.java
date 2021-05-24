package com.julia.brewer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julia.brewer.model.Cerveja;

@Repository
public interface Cervejas extends JpaRepository<Cerveja, Long>{
	
	//public Optional<Cerveja> findBySku(String sku);

}
