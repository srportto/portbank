package br.com.portbank.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
@Entity
@DiscriminatorValue("ContaCorrente")    //indica o valor a ser inserido na coluna tipo_conta quando for esse tipo de conta
public class ContaCorrente extends Conta implements Serializable {
    private static final long serialVerionUID = 1L;

    private BigDecimal valorDeLis;
    private BigDecimal saldoOculto;

    //*
    //*> Construtores
    //*

    //default
    public ContaCorrente() {
        super();
        this.valorDeLis = new BigDecimal(00.00);
        this.saldoOculto= new BigDecimal(00.00);
    }

    //Todos os argumentos
    public ContaCorrente(int agencia, long numeroDaConta, char digitoVerificador, long idCliente, BigDecimal saldo, Date dataCriacao, double valorDeLis, double saldoOculto) {
        super(agencia, numeroDaConta, digitoVerificador, idCliente, saldo, dataCriacao);
        this.valorDeLis = new BigDecimal(valorDeLis);
        this.saldoOculto = new BigDecimal(saldoOculto);
    }

    //*
    //*> Metodos especificos de ContaCorrente
    //*

    @Override
    public BigDecimal getSaldo (){
        BigDecimal saldoContaCorrente = new BigDecimal(0);

        saldoContaCorrente.add(super.getSaldo().add(this.saldoOculto).add(this.valorDeLis));

        return saldoContaCorrente;
    }

    //debito
    @Override
    public void debitar(BigDecimal valorDedebito) {
        this.getSaldo().subtract(valorDedebito);
    }

    //credito
    @Override
    public void creditar(BigDecimal valorDeCredito) {
        this.getSaldo().add(valorDeCredito);
    }

}
