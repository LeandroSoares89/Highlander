#language: pt
#encoding: UTF-8
#date: 22/06/2021
#Author: Leandro Soares
#version: 1.0

Funcionalidade: Conversas

Contexto:
Dado que cliquei em uma nova conversa
E  escolhi o contato 
E preencho o campo   Digite uma mensagem com  o texto Hello World
E Hello World sobre escreve o Digite uma mensagem

CT-0065

Cenario: Verificar "Digite uma Mensagem"
Quando digito o texto "Hello World" no campo Digite uma mensagem
Então  "Hello World" sobre escreve o campo Digite uma mensagem



