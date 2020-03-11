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
@Table(name = "tb_imagens")
public class Imagem implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "id_produto")
    private Produto idProduto;

    @NotNull
    @Column(name = "url_imagem")
    private Integer urlImagem;

    @NotNull
    @Column(name = "flag_imagem")
    private Boolean flaImagem;

}
