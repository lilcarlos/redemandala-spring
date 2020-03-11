package br.com.rd.ecommerce.repository;


import br.com.rd.ecommerce.model.OrdemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemPedidoRepository extends JpaRepository<OrdemPedido, Integer> {
}
