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
@Table(name = "tb_usuario")
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    @NotNull
    @Column(name = "email_usuario", length = 100)
    private String emailUsuario;

    @NotNull
    @Column(name = "senha_usuario", length = 45)
    private String senhaUsuario;

    @NotNull
    @Column(name = "nome_usuario", length = 80)
    private String nomeUsuario;


    @Column(name = "cpf_usuario", length = 11)
    private String cpfUsuario;


    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @ManyToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @OneToOne
    @JoinColumn(name = "id_cartao")
    private Cartoes cartao;

}