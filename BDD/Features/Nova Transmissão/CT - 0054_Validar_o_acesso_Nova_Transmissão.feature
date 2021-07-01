#language:pt
#encoding:UTF-8
#author:Tamires Cruz
#date:20/06/2021
#version:1

Feature: <Nova Transmissão da aplicação do Whatsapp>

    Background:
        Given que tenho a aplicação whatsapp instalada no meu celular
        And acesso o whatsapp
        And estou na aba "Conversas"
        And quero realizar uma "Nova Transmissão"


    CT - 0054
    CT - 0057	Validar a seleção dos "contatos" da Nova Transmissão
    CT - 0058	Validar o "botão check" da Nova Trasmissão
    Scenario: Validar o acesso a "Nova Transmissão"
        When estou na aba "Conversas"
        And clico nos "três pontos"
        And clico em "Nova Transmissão"
        And sou redirecionada para a aba "Nova Transmissão"
        And seleciono os "contatos"
        And clico no "check"
        Then será criado uma "lista de transmissão"


    CT - 0056
    Scenario: Verificar o preenchimento da "lupa (pesquisa)" da Nova Transmissão
        When estou na aba "Nova Transmissão"
        And clico na "lupa"
        And digito um contato salvo na "Pesquisar..."
        Then será exibido o contato no resultado da pesquisa

