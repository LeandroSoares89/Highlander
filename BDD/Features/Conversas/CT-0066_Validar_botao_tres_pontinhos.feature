#language: pt
#encoding: UTF-8
#date: 20/06/2021
#Author: Leandro Soares
#version: 1.0

Funcionalidade: Conversas

Contexto:
Dado  que tenho o aplicativo instalado
E estou na aba conversas 
E clico no botão dos tres ponttinho canto superior esquerdo
E é apresentado o menu com as opções: Novo grupo, Novo Grupo, Nova Transmissão , WhatsApp WEB,E Pagamentos, Configurações


CT-0066
Cenario: Validar botão  "Tres pontinhos"
Quando  estou na aba convesas
E clico no botão dos tres ponttinho canto superior esquerdo
Então  é apresantado as opções: Novo grupo, Novo Grupo, Nova Transmissão , WhatsApp WEB,E Pagamentos, Configurações