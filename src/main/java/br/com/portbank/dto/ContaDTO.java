package br.com.portbank.dto;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

public class ContaDTO {
   private long idCliente;

    private int agencia;

    private long numeroDaConta;

    private char digitoVerificador;

    private BigDecimal saldo;
    private Date dataCriacao;

    private String tipoConta;

    //getters and setters
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

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        return "ContaDTO{" +
                "idCliente=" + idCliente +
                ", agencia=" + agencia +
                ", numeroDaConta=" + numeroDaConta +
                ", digitoVerificador=" + digitoVerificador +
                ", saldo=" + saldo +
                ", dataCriacao=" + dataCriacao +
                ", tipoConta='" + tipoConta + '\'' +
                '}';
    }
}
