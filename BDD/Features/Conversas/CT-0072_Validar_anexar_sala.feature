#language: pt
#encoding: UTF-8
#date: 20/06/2021
#Author: Leandro Soares
#version: 1.0

Funcionalidade: Conversas

Contexto:
Dado  que estou como o aplicativo aberto na aba conversas 
E clico em nova conversa escolho um contato existente
E clico no botão do clip de papel depois clico no icone de sala
E abre o popup "Entre no Messeger para criar uma sala"


CT-0072
Cenario:  Validar Anexar "Contato"

Quando  estou  em uma convesa 
E clico no botão do clip de papel
E clico em "Sala"

Então abre  o popup "Entre no Messeger para criar uma sala"
 












