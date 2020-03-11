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
@Table(name = "tb_endereco")
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Integer idEndereco;

    @NotNull
    @Column(name = "endereco",length=100)
    private String endereco;

    @NotNull
    @Column(name = "numero_endereco",length=6)
    private String numeroEndereco;

    @NotNull
    @Column(name = "cep_endereco",length=8)
    private String cepEndereco;

    @NotNull
    @Column(name = "cidade_endereco",length=80)
    private String cidadeEndereco;

    @NotNull
    @Column(name = "estado_endereco",length=2)
    private String estadoEndereco;


}
