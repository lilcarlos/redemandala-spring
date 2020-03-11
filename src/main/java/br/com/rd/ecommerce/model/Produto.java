package br.com.rd.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_produto")
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduto;

    @NotNull
    @Column(name = "nome_produto")
    private String nomeProduto;

    @NotNull
    @Column(name = "descricao_produto")
    private String descricaoProduto;

    @NotNull
    @Column(name = "valor_produto")
    private BigDecimal valorProduto;

}
