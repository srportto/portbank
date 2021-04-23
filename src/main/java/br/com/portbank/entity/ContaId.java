package br.com.portbank.entity;

import lombok.EqualsAndHashCode;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ContaId implements Serializable {
    private static final long serialVerionUID = 1L;

    @EqualsAndHashCode.Include
    @Id
    private long idCliente;

    @EqualsAndHashCode.Include
    @Id
    private int agencia;

    @EqualsAndHashCode.Include
    @Id
    private long numeroDaConta;

    @EqualsAndHashCode.Include
    @Id
    private char digitoVerificador;

    public ContaId(){
        super();
    }

    // getters and setters
    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public long getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(long numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public char getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(char digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }

    //equals and hrashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContaId contaId = (ContaId) o;
        return idCliente == contaId.idCliente && agencia == contaId.agencia && numeroDaConta == contaId.numeroDaConta && digitoVerificador == contaId.digitoVerificador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, agencia, numeroDaConta, digitoVerificador);
    }
}
