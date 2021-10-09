package com.br.ayrton.projetospring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria implements Serializable {
    private Integer id;
    private String nome;
}
