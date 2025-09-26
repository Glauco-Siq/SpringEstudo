package com.studo.spring.estudoSpring;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//Entity transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_cadastro_de_ninja")
public class NinjaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    Long id;
    String nome;
    int idade;
    String email;

}
