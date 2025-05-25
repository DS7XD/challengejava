**Sistema de Cadastro de Motos e Usuários**

Este projeto tem como objetivo fornecer uma aplicação simples para o gerenciamento de dados relacionados a usuários e motos. A aplicação permite cadastrar, armazenar e listar essas informações de maneira estruturada, utilizando a linguagem Java. O foco do sistema é demonstrar um fluxo básico de entrada e exibição de dados com organização modular, simulando o funcionamento de um cadastro em uma aplicação real.

**Objetivo do Sistema:** 

O sistema foi criado com o propósito de simular a base de um módulo administrativo para empresas que precisam registrar e controlar motos e seus respectivos condutores ou clientes. Embora não utilize banco de dados, o sistema permite a visualização clara das informações e simula operações essenciais como cadastro e listagem.
Com isso, o projeto serve como uma base inicial para um sistema de gestão que pode futuramente evoluir para novas funcionalidades.

**Funcionalidades:**

Cadastro de Motos: cada moto é registrada com um identificador único, modelo, cor, placa e status de disponibilidade.

Cadastro de Usuários: cada usuário é registrado com identificador, nome e e-mail.

Listagem: ao final dos cadastros, o sistema apresenta em tela a lista completa de motos e de usuários registrados.


**Como funciona:**

O sistema é composto por classes separadas para moto e usuário. Cada uma possui seu próprio serviço responsável por armazenar os dados em banco. Os controladores (MotoController.java e UsuarioController.java) servem como teste para cadastrar e visualizar os dados no terminal.

Ao executar os controladores, o sistema simula o cadastro de alguns dados e mostra a saída com as informações inseridas.

**Resultados:**

Durante os testes, os dados foram inseridos corretamente e exibidos no terminal. A estrutura em camadas facilita a futura integração com banco de dados ou interfaces gráficas.

Tecnologias usadas: 

Java

Programação Orientada a Objetos

IDE de sua preferência (Eclipse, IntelliJ, VSCode)

**Como executar:**

Clone ou baixe este repositório.

Abra o projeto na sua IDE Java.

Execute MotoController.java para testar o cadastro de motos.

Execute UsuarioController.java para testar o cadastro de usuários.

Os resultados serão exibidos no console.

Guilherme Jesus Lima / RM:555002
Jean Roberto Gome / RM:94418
Lucas de Melo Pinheiro Pinho / RM:558791
