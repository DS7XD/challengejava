Sistema de Cadastro de Motos e Usuários

Este projeto tem como objetivo cadastrar e listar motos e usuários de forma simples usando Java. Ele faz parte de um projeto semestral da faculdade, que envolve também um sistema de monitoramento IoT com ESP32.

Funcionalidades:

Cadastro de motos com modelo, placa, cor e status.

Cadastro de usuários com nome e e-mail.

Listagem de motos cadastradas.

Listagem de usuários cadastrados.

Como funciona:

O sistema é composto por classes separadas para moto e usuário. Cada uma possui seu próprio serviço responsável por armazenar os dados em memória (sem banco de dados). Os controladores (MotoController.java e UsuarioController.java) servem como teste para cadastrar e visualizar os dados no terminal.

Ao executar os controladores, o sistema simula o cadastro de alguns dados e mostra a saída com as informações inseridas.

Resultados:

Durante os testes, os dados foram inseridos corretamente e exibidos no terminal. A estrutura em camadas facilita a futura integração com banco de dados ou interfaces gráficas.

Tecnologias usadas: 

Java

Programação Orientada a Objetos

IDE de sua preferência (Eclipse, IntelliJ, VSCode)

Como executar:

Clone ou baixe este repositório.

Abra o projeto na sua IDE Java.

Execute MotoController.java para testar o cadastro de motos.

Execute UsuarioController.java para testar o cadastro de usuários.

Os resultados serão exibidos no console.

Guilherme Jesus Lima / RM:555002
Jean Roberto Gome / RM:94418
Lucas de Melo Pinheiro Pinho / RM:558791
