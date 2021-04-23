package br.com.portbank.dto;


import br.com.portbank.entity.Cliente;

import java.text.SimpleDateFormat;

public class ClienteDTO {
    private long cpf;

    private String nomeCompleto;

    private String dataNascimento;

    private char tipoDePessoa;

    /*
        construtores
     */

    //default
    public ClienteDTO (){}

    // new
    public ClienteDTO (Cliente cliente){
        this.cpf = cliente.getCpfId();
        this.nomeCompleto = cliente.getNomeCompleto();

        SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada =  formatador.format(cliente.getDataNascimento());

        this.dataNascimento = dataFormatada;

        this.tipoDePessoa = cliente.getTipoDePessoa();

    }

    @Override
    public String toString() {
        return "ClienteDTO{" +
                "cpf=" + cpf +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", tipoDePessoa=" + tipoDePessoa +
                '}';
    }
}
