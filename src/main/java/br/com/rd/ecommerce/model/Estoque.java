package br.com.rd.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_estoque")

public class Estoque {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_imagem;

    @NotNull
    @Column(name = "quantidade_produto")
    private Integer quantidadeProduto;

}
