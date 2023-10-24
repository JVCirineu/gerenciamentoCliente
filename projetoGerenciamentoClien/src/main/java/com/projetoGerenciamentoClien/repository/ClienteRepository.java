package com.projetoGerenciamentoClien.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoGerenciamentoClien.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
