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
@Table(name = "tb_ordem_pedidos")
public class OrdemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ordemPedido;

    @NotNull
    @Column(name = "frete")
    private BigDecimal frete;

    @NotNull
    @Column(name = "valor_total")
    private BigDecimal valorTotal;

}
