package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sales;

public interface SalesRepository extends JpaRepository<Sales, Long> {
		
}

//Componente do sistema responsavel por acessar o banco de dados