package com.picpay.api.model;

import jakarta.persistence.Entity; //ver com Kloster
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Objects;
@Data
@Entity
public class Consumer {

    @Id //propriedade q identifica nossa entidade. é a ""chave primária""
    @GeneratedValue(strategy = GenerationType.IDENTITY) //delegamos respons. de increment. esse id. para o banco de dados.
    private int id;
    private char blockCode;
    private String status;
    private double saldo;


}
