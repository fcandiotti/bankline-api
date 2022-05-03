package com.dio.santander.bankline.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Correntista {

    private Integer id;
    private String cpf;
    private String nome;

    private Conta conta;
}
