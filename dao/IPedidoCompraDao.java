package com.cqsrce.billing.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cqsrce.models.entities.PedidoCompra;

public interface IPedidoCompraDao extends JpaRepository<PedidoCompra, Long>{}