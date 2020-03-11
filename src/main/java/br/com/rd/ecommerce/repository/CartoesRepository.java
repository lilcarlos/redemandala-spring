package br.com.rd.ecommerce.repository;


import br.com.rd.ecommerce.model.Cartoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartoesRepository extends JpaRepository<Cartoes, Integer> {

}
