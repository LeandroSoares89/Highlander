#language: pt
#encoding: UTF-8
#date: 20/06/2021
#Author: Leandro Soares
#version: 1.0

Funcionalidade: Conversas

Contexto:
Dado que cliquei em uma nova conversa
E escolhi o contato 
E pressiono  no icone do microfone
E aparece a mensagem solicitando permissão para usar o microfone
E clico em permitir o acesso ao microfone 
E digo algo "Testando envio de audio"
E solto o icone do microfone
E audio aparece no quadro de conversa

CT-0065

Cenario: Validar "Enviar" mesagem de audio
Quando pressiono o icone do microfone
E digo algo "Testando envio de audio"
E solto o icone do microfone
Então  o audio aparece no quadro de conversa