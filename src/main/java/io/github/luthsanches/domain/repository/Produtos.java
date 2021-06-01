package io.github.luthsanches.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.luthsanches.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
