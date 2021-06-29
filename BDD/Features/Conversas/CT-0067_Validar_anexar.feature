#language: pt
#encoding: UTF-8
#date: 20/06/2021
#Author: Leandro Soares
#version: 1.0

Funcionalidade: Conversas

Contexto:
Dado  que estou como aplicativo aberto na aba de convesas 
E  clico no balão de mensagem escolho um contato existente
E clico no botão do clip de papel
E é me apresentado os icones:  Sala, contato, documento, Câmera, Galeria, Áudio, Localização, Pagamento 


CT-0067
Cenario:  Validar "Anexar"  
Quando  estou em uma em uma convesa 
E clico no botão do clip de papel
Então  é me apresentado os icones:  Sala, contato, documento, Câmera, Galeria, Áudio, Localização, Pagamento 