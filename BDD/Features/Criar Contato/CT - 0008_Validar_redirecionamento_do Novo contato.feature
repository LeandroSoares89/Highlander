#language:pt
#encoding: UTF-8
#author: Tamires Cruz
#date:20/06/2021
#version: 1

Feature: <Criar contato da aplicação Whatsapp>

Contexto:
Given que eu já tenha a aplicação Whatsapp instalada no celular
And quero acessar o Whatsapp

CT - 0008
Scenario: Validar a criação do contato
When acesso o "Whatsapp"
And estou na aba de "Convesas"
And clico em "Contatos"
And clico em "Novo contato"
Then sou redirecionada para "Criar contato"