package io.github.luthsanches.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.luthsanches.domain.entity.ItemPedido;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
