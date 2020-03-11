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
@Table(name = "tb_ordem_pedidos")
public class OrdemPedido implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ordemPedido;

    @NotNull
    @Column(name = "frete")
    private BigDecimal frete;

    @NotNull
    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario idUsuario;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_itemPedido")
    private ItemPedido idItemPedido;

    @NotNull
    @OneToOne
    @JoinColumn(name = "id_nota_fiscal")
    private NotaFiscal idNotaFiscal;


}
