package br.com.rd.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_estoque")

public class Estoque implements Serializable {


//    @Id
//    @Column(name = "id_produto")
//    private Long idProduto;

    @Id
    @OneToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    @NotNull
    @Column(name = "quantidade_produto")
    private Integer quantidadeProduto;

}
