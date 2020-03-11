package br.com.rd.ecommerce.repository;


import br.com.rd.ecommerce.model.Estoque;
import br.com.rd.ecommerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Produto> {
}
