
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE)

![Portbank](https://github.com/srportto/portbank/blob/main/outros/iconportbank.jpg)
# Sobre o projeto



PortBank é uma aplicação back-end que fornece uma API RestFul para prover serviços de uma instituição financeira fictícia. 

A aplicação consiste em possibilitar o cadastro de clientes com suas respectivas contas e a realização de movimentações financeiras credito/debito.

## Requisitos
- [x] Possibilitar o cadastro de clientes
- [ ] Possibilitar a criação de contas para um cliente (corrente, poupança, investimento)
- [ ] Listar todas as contas que um cliente possui.
- [ ] Possibilitar a manutenção de contas dos clientes(criar, inativar, cancelar)
- [ ] Possibilitar o "login" dos clientes apenas por CPF e senha.
- [ ] Mostrar a composição de saldo do cliente com base em todas as contas do mesmo na instituição.
- [ ] Possibilitar a exibição da composição de saldo de apenas uma das contas do cliente.
- [ ] Possibilitar o cliente movimentar dinheiro entre suas propárias contas (credito/debito) 
- [ ] Possibilitar o cliente movimentar dinheiro para contas de terceiros (credito/debito)
- [ ] Listar todas as transações realizadas por um cliente
- [ ] Possibilitar consulta inteligente de operações realizadas por um cliente (data, valor, descrição operação).




## Protótipo da aplicação
 ⚠ Em desenvolvimento ⚠


## Modelo conceitual
![Modelo Conceitual](https://github.com/srportto/portbank/blob/main/outros/modelagem.jpeg)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
## Front end
- Não há 

## Implantação em produção
- [ ] Deploy na AWS 


# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/srportto/portbank.git

# entrar na pasta do projeto back end
cd portbank

# executar o projeto
./mvnw spring-boot:run
```



# Autor

Caique SilVa Porto

https://www.linkedin.com/in/caique-porto-26b50586/
