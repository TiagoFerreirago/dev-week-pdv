package web.dio.dev.week.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import web.dio.dev.week.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
