#language: pt
#encoding: UTF-8
#date: 20/06/2021
#Author: Leandro Soares
#version: 1.0

Funcionalidade: Conversas

Contexto:
Dado  que tenho o aplicativo instalado
E estou na aba conversas 
E E clico em nova conversa
E escolho um contato existente
E clico no botão do clip de papel
E clico em contato
E escolho um contato
E clico no botão avizinho
E o contata é apresendado no quadro de mensagens
E posso mandar mensagem ou adiciona-lo


CT-0070
Cenario:  Validar Anexar "Contato"
Quando  estou em uma em uma convesa 
E clico no botão do clip de papel
E clico em "Contato"
E escolho  o conatato  "João"
E clico no icone do avizinho
Então contato e mostrado no quadro de mensagens com as opçoes de  mensagem ou adicionar
 

Exemplo: 
Esquema de Cenario:
| contato       |
| Joao          |
| Mario         |
| Highlander    |
| Carvalho Cris |
| Souza José    |












