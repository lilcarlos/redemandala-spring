package br.com.rd.ecommerce.repository;


import br.com.rd.ecommerce.model.Imagem;
import br.com.rd.ecommerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagemRepository extends JpaRepository<Imagem, Produto> {
}
