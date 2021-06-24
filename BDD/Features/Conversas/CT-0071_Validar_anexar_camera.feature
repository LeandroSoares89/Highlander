#language: pt
#encoding: UTF-8
#date: 20/06/2021
#Author: Leandro Soares
#version: 1.0

Funcionalidade: Conversas

Contexto:
Dado que estou como o aplicativo aberto tela de conversa com um contato escolhido
E clico no botão do clip de papel
E clico no icone de  contato
E escolho um contato
E envio o contato


CT-0070
Cenario:  Validar Anexar "Contato"
Quando  estou em uma  convesa 
E clico no botão do clip de papel 
E clico em "Contato"
E escolho  o conatato  "João"
E clico no icone do avizinho
Então  o  "contato"  é exibido no historico de mensagens com as opçoes enviar mensagem ou adicionar a um grupo
 

Exemplo: 
Esquema de Cenario:
| contato       |
| Joao          |
| Mario         |
| Highlander    |
| Carvalho Cris |
| Souza José    |












