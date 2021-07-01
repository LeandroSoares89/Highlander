#language:pt
#encoding:UTF-8
#author:Tamires Cruz
#date:20/06/2021
#version:1

Feature: <Status da aplicação Whatsapp>

    Background:
        Given que eu tenho a aplicação whatsapp instalada no celular
        And quero visualizar o "Status"


    CT - 0049
    Scenario: Validar o "ícone do emoticons" do texto
        When estou na aba "Status"
        And clico na "publicação de texto"
        And clico no "ícone do emoticons"
        Then será exibido um teclado abaixo com "ícone do emoticons"

    CT - 0052
    Scenario: Validar a visualização de "Atualizações recentes" dos status
        When estou na aba "Status"
        And seleciono um "contato"
        And clico em uma "Atualizações recentes"
        Then será exibido uma publicação do "contato"


    CT - 0053
    Scenario: Validar a visualização de "atualizações vistas" dos status
        When estou na aba "Status"
        And valido as "atualizações vistas"
        Then será exibido todas as "atualizações vistas"