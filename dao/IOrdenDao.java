package com.cqsrce.billing.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cqsrce.models.entities.Orden;

public interface IOrdenDao extends JpaRepository<Orden, Long>{}