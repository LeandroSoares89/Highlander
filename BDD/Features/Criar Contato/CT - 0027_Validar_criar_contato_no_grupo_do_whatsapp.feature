#language: pt
#encoding: UTF-8
#author:Tamires Cruz
#date: 20/06/2021
#versio: 1

Feature: <Criar contato na aplicação Whatsapp>

    Background:
        Given que tenho o whatsapp instalado no celular
        And estou na aba "Conversa"
        And acesso um grupo

   
    CT - 0027
    Scenario: Validar a entrada no "grupo" do whatsapp
        When estou na aba "Conversas"
        And acesso um grupo do "whatsapp"
        And escolho um "contato" para salvar
        And clico em "Adicionar  aos contatos"
        Then serei redirecionada para aba "adicionar aos contato"


    CT - 0030
    Scenario Outline: Verificar o preenchimento dos campos "Adicionar aos contatos"
        When insiro as informações "Nome", "Sobrenome", "Telefone"
        And clico em "Salvar em"
        And clico em "Salvar"
        Then visualizo os campos "Maria", "Julia", "81 90000-0000"
        And será exibido a mensagem "contato salvo: Maria Julia"

    Example:
            | Nome: | Sobrenome: | Telefone:     |
            | Maria | Julia      | 81 90000-0000 |