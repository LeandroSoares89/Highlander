#language:pt
#encoding: UTF-8
#author:Tamires Cruz
#date:20/06/2021
#version: 1

Feature: <Criar Contato na aplicação Whatsapp>

Background: 
Given que já tenho a aplicação do Whatsapp no celular
And estou na aba "Conversas"
And clico nos "três pontos"
And clico em "Novo contato"
And sou redirecionado para "Criar contato"

CT - 0019	
Scenario: Validar o "salvar" apenas com o preenchimento do telefone
When insiro o numero "81 98564-0000"
And clico em "Salvar"
Then será exibido a mensagem "contato salvo: 81 98564-0000"