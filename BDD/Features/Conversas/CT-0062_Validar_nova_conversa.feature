#language: pt
#encoding: UTF-8
#date: 20/06/2021
#Author: Leandro Soares
#version: 1.0

Funcionalidade: Conversas

Contexto:
Dado  que tenho o aplicativo instalado
E Tenho contato salvo 
E Abro o app Whastapp
E Clico no icone nova conversa 
E Sou direcionado para a aba de nova conversa


CT-0062
Cenario: :Validar nova "Conversa"
Quando Clico no icone de nova conversa
Então  Sou direcionado para a aba de nova conversa



