package br.com.rd.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_itens_pedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_itemPedido;

    @NotNull
    @Column(name = "quantidade_item",length=50)
    private Integer quantidadeItem;

    @NotNull
    @Column(name = "valor_unitario")
    private BigDecimal valorUnitario;

}
