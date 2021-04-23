package br.com.portbank.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//essa estrategia ja eh o default do hibernate caso não passe a anotation ele asume essa
@DiscriminatorColumn(name = "tipo_conta")               //coluna que guardara a informacao do tipo de conta na tabela
@IdClass(ContaId.class)                                 //classe que monta a chave composta
public class Conta implements Serializable {
    private static final long serialVerionUID = 1L;


    @Id
    private long idCliente;

    @Id
    private int agencia;

    @Id
    private long numeroDaConta;

    @Id
    private char digitoVerificador;

    private BigDecimal saldo;
    private Date dataCriacao;

    //*
    //*> Construtores
    //*

    //default
    public Conta() {
    }

    //Todos os argumentos
    public Conta(int agencia, long numeroDaConta, char digitoVerificador, long idCliente, BigDecimal saldo, Date dataCriacao) {
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.digitoVerificador = digitoVerificador;
        this.idCliente = idCliente;
        this.saldo = saldo;
        this.dataCriacao = dataCriacao;
    }

    //*
    //*> Metodos genericos
    //*

    //debito
    public void debitar(BigDecimal valorDedebito) {
        this.saldo.subtract(valorDedebito);
    }

    //credito
    public void creditar(BigDecimal valorDeCredito) {
        this.saldo.add(valorDeCredito);
    }

    public String obterIDCompleto() {
        /*
            idCompleto = idCliente + agencia + conta + dac
         */


        String idCompletoString = new String(
                String.valueOf(this.idCliente)
                        .concat(String.valueOf(this.agencia))
                        .concat(String.valueOf(this.numeroDaConta))
                        .concat(String.valueOf(this.digitoVerificador))
        );

        return idCompletoString;

    }
}
