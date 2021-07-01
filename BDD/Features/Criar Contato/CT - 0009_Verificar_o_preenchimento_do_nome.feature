#language:pt
#encoding: UTF-8
#author: Tamires Cruz
#date:20/06/2021
#version: 1

@mobile
Feature: <Criar contato na aplicação Whatsapp>

    Background:
        Given que tenho a aplicação Whatsapp instalada no celular
        And fui redirecionada para aba "Criar contato"

    CT - 0009	Verificar o preenchiment do "nome"
    CT - 0010	Verificar o preenchimento do "sobrenome"
    CT - 0011	Verificar o preenchimento do "empresa"
    CT - 0012	Verificar o preenchimento do "Telefone"
    CT - 0016	Validar o direcionamento do "salvar em"
    CT - 0018	Validar o "Salvar" do criar novo contato


    CT - 0009
    Scenario: Verificar o preenchimento do "Criar contato"
        When estou na aba "Criar contato"
        And submeto as infomações "nome", "sobrenome", "empresa", "Telefone"
        And valido o "salva em"
        And valido o "Salvar"
        Then será exibido "name" e "sobrenome" saved

    Scenario Outline: Validar variações das informações da criação do contato
        When insiro as informações "Nome", "Sobrenome", "Empresa", "Telefone"
        Then visualizo os campos "Francisco", "Gonzalez", "TechInfo", "81 9988-9090"

            Exemples:
            Nome:      | Empresa: | Telefone:            |
            | Francisco | Gonzalez | TechInfo | 81 9988-9090  |
            | Maria     | Marta    | Service  | 81 98899-8080 |