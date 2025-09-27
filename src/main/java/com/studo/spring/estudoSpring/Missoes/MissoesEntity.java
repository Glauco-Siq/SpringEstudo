package com.studo.spring.estudoSpring.Missoes;


import com.studo.spring.estudoSpring.Ninjas.NinjaEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_missoes")
public class MissoesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private Long Id;

    private String nome;

    private RankMissao rank;

    @OneToMany(mappedBy = "missao")
    private List<NinjaEntity> ninjas;

}
