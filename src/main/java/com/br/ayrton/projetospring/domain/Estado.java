package com.br.ayrton.projetospring.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Estado implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    public Estado(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidades = new ArrayList<>();
}
