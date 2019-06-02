package com.cqsrce.billing.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cqsrce.models.entities.Compradetalle;

public interface ICompraDetalleDao extends JpaRepository<Compradetalle, Long>{}