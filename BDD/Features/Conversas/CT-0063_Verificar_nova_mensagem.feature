#language: pt
#encoding: UTF-8
#date: 22/06/2021
#Author: Leandro Soares
#version: 1.0

Funcionalidade: Conversas

Contexto:
Dado que cliquei em uma nova conversa escolho o contato 
E  o teclado e apresentado

CT-0065
Cenario: validar envio da "mensagem"

Quando clico no campo   Digite uma mensagem
E o teclado e apresentado 
E digito a mensagem "Hello World"
Então a mensagem "Hello World" é exibida no historico de conversa



