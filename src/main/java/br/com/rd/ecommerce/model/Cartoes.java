package br.com.rd.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cartao")
public class Cartoes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCartao;

    @NotNull
    @Column(name = "numero_cartao")
    private String numeroCartao;

    @NotNull
    @Column(name = "validade_cartao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date validadeCartao;

    @NotNull
    @Column(name = "codigo_seguranca")
    private String codigoSeguranca;

    @NotNull
    @Column(name = "nome_proprietario")
    private String nomeProprietario;


}
