package com.dio.santander.bankline.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movimentacao {

    private Integer id;
    private LocalDateTime dataHora;
    private String descricao;
    private Double valor;

    private MovimentacaoTipo tipo;
}
