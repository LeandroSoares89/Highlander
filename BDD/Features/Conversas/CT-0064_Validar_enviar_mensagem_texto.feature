#language: pt
#encoding: UTF-8
#date: 20/06/2021
#Author: Leandro Soares
#version: 1.0

Funcionalidade: Conversas

Contexto:
Dado que cliquei em uma nova conversa
E  escolhi o contato 
E preencho o campo   Digite uma mensagem com  o texto Hello World
E cliquei em no icone do aviao
E a mensagem apareceu no quadro de conversa

CT-0064

Cenario: Validar "Enviar" da mensagem de texto
Quando digito o texto "Hello World" no campo Digite uma mensagem
E clico no icone de avião 
Então  a mensagem é exibida no historico de mensagens