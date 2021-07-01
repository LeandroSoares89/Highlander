#language:pt
#encoding:UTF-8
#author:Tamires Cruz
#date:20/06/2021
#version:1

Feature: <Status da aplicação Whatsapp>

    Background:
        Given que eu tenho a aplicação whatsapp instalada no celular
        And quero visualizar o "Status"

    CT - 0045
    Scenario: Validar o redirecionamento do "status"
        When estou na aba "Conversas"
        And clico em "Status"
        Then serei redirecionada para a aba "Status"

    CT - 0046
    Scenario: Validar o redirecionamento do "Meu status"
        When estou na aba "Status"
        And clico em "Meu status"
        Then serei redirecionada para o acesso a "câmera"

    CT - 0047
    Scenario: Validar o acesso a "câmera" do status
        When estou na aba "Status"
        And clico na "câmera"
        Then serei redirecionada para acessar a "câmera"

    CT - 0048
    CT - 0050
    Scenario: Validar o acesso a "publicação de texto" do status
        When estou na aba "Status"
        And clico na "publicação de texto"
        Then serei redirecionada para uma tela de "texto"

   