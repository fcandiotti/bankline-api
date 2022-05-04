package com.dio.santander.bankline.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Conta {

    @Column(name = "conta_numero")
    private Long numero;
    @Column(name = "conta_saldo")
    private Double saldo;
}
