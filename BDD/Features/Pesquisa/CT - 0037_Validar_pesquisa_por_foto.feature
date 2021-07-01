#language:pt
#encoding:UTF-8
#author:Tamires Cruz
#date:20/06/2021
#version:1

Feature: <Pesquisa da aplicação Whatsapp>

    Background:
        Given que eu tenha a aplicação Whatsapp instalada no celular
        And quero realizar uma "pesquisa"

    CT - 0037
    Scenario: Validar o redirecionamento da pesquisa
        When escolho a opção de pesquisar... "Fotos"
        Then será exibido as "Fotos" no resultado da pesquisa

    CT - 0040
    Scenario: Validar o redirecionamento da pesquisa por "Vídeos"
        When escolho a opção da pesquisar... "Vídeos"
        Then será exibido os "Vídeos" no resultado da pesquisa

    CT - 0041
    Scenario: Validar o redirecionamento da pesquisa por "Links"
        When escolho a opção de pesquisar... "Links"
        Then será exibido os "Links" no resultado da pesquisa

    CT - 0042
    Scenario: Validar o redirecionamento da pesquisa por "Gif"
        When escolho a opção de pesquisar... "Gifs"
        Then será exibido os "Gifs" no resultado da pesquisa

    CT - 0043
    Scenario: Validar o redirecionamento da pesquisa por "Aúdios"
        When escolho a opção de pesquisar... "Aúdios"
        Then será exibido os "Aúdios" no resultado da pesquisa

    CT - 0044
    Scenario: Validar o redirecionamento da pesquisa por "Documentos"
        When escolho a opção de pesquisar "Documentos"
        Then será exibido os "Documentos" no resultado da pesquisa

    Scenario Outline:
        When valido a pesquisa com "foto", "vídeo", "link", "gif", "audio", "documentos"
        Then será exibido "foto", "vídeo", "link", "gif", "audio", "documentos"




