package br.com.portbank.controller;

import java.util.List;

import br.com.portbank.dto.ClienteDTO;
import br.com.portbank.dto.ContaDTO;
import br.com.portbank.entity.Cliente;
import br.com.portbank.entity.Conta;
import br.com.portbank.entity.ContaCorrente;
import br.com.portbank.entity.Endereco;
import br.com.portbank.service.interfaces.IClienteService;
import br.com.portbank.service.interfaces.IContaService;
import br.com.portbank.service.interfaces.IEnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ContaController {
    @Autowired
    private IContaService contaService;


    @GetMapping("contas")
    public ResponseEntity<List<Conta>> getAllContas() {
        List<Conta> lista = contaService.getAllContas();
        return new ResponseEntity<List<Conta>>(lista, HttpStatus.OK);
    }

    @PostMapping("contas")
    @ResponseStatus(HttpStatus.CREATED)
    public Conta addConta(@RequestBody ContaDTO contaDTO) {
        System.out.println("objeto chegou: \n"+contaDTO.toString());
        // teste de colaboracao projeto caique
        System.out.println("vamos colaborar!");

        String tipoConta = contaDTO.getTipoConta();
        Conta conta;

        // usar sempre metodos pra comparar strings
        if (tipoConta.equalsIgnoreCase("corrente")){
            // especifico
            conta = new ContaCorrente();
        } else {
            //generico
             conta = new Conta();
        }

        conta.setIdCliente(contaDTO.getIdCliente());
        conta.setAgencia(contaDTO.getAgencia());
        conta.setNumeroDaConta(contaDTO.getNumeroDaConta());
        conta.setDigitoVerificador(contaDTO.getDigitoVerificador());
        conta.setSaldo(contaDTO.getSaldo());
        conta.setDataCriacao(contaDTO.getDataCriacao());

        contaService.addConta(conta);

        return conta;
    }


}