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
E é me apresentado os icones:  Sala, contato, documento, Câmera, Galeria, Áudio, Localização, Pagamento 


CT-0067
Cenario:  Validar "Anexar"  
Quando  estou em uma em uma convesa 
E clico no botão do clip de papel
Então  é me apresentado os icones:  Sala, contato, documento, Câmera, Galeria, Áudio, Localização, Pagamento 