package com.cqsrce.billing.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cqsrce.models.entities.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long>{}
