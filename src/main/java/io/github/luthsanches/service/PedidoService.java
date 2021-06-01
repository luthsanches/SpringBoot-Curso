package io.github.luthsanches.service;

import io.github.luthsanches.domain.entity.Pedido;
import io.github.luthsanches.domain.enums.StatusPedido;
import io.github.luthsanches.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
