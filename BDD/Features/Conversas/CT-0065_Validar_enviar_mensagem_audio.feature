#language: pt
#encoding: UTF-8
#date: 20/06/2021
#Author: Leandro Soares
#version: 1.0

Funcionalidade: Conversas

Contexto:
Dado que estou com o aplicativo whatsapp aberto, tenho contato salvo 
E clico no balão de mensagem escolho o contato
E pressiono  o icone do microfone 
E digo algo "Testando envio de audio" o audio é envidado

CT-0065

Cenario: Validar "Enviar" mesagem de audio
Quando pressiono o icone do microfone
E aparece a mensagem solicitando permissão para usar o microfone 
E permito o acesso
E digo algo "Testando envio de audio"
E solto o icone do microfone
Então  o audio é exibido no historico de mensagens