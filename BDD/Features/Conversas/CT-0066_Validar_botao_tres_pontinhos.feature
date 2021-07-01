#language: pt
#encoding: UTF-8
#date: 20/06/2021
#Author: Leandro Soares
#version: 1.0

Funcionalidade: Conversas

Contexto:
Dado  que que estou com o app whatsapp aberto
E clico no botão dos tres ponttinho canto superior direito
E é apresentado o menu com as opções: Novo grupo, Novo Grupo, Nova Transmissão , WhatsApp WEB,E Pagamentos, Configurações


CT-0066
Cenario: Validar botão  "Tres pontinhos"
Quando  estou na aba convesas
E clico no botão dos tres ponttinho canto superior direito
Então  é apresantado as opções: Novo grupo, Novo Grupo, Nova Transmissão , WhatsApp WEB,E Pagamentos, Configurações