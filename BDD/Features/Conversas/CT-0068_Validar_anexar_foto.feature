#language: pt
#encoding: UTF-8
#date: 20/06/2021
#Author: Leandro Soares
#version: 1.0

Funcionalidade: Conversas

Contexto:
Dado  que estou como o aplicativo aberto na aba conversas 
E clico em nova conversa escolho um contato existente
E sou direcionado para a tela de conversa daquele contato escolhido
E clico no icone de papel escolho galeria

CT-0068
Cenario:  Validar Anexar "Foto e Vídeos"
Quando  estou em uma em uma convesa 
E clico no botão do clip de papel
E clico em "Galeria"
E escolho  uma "foto"
E Preencho o campo de descrição com "Envidando foto"
E clico no icone do avizinho
Então a "foto"  é exibida no historico de mensagens

Exemplo: 
Esquema de Cenario:
|Opção     | Arquivo       | Descrição             |
|Galeria   | img1.jpeg     | foto de aniversaio    |
|Galeria   | img2.png      | Foto de casamento     |
|Galeria   | video.mp4     | Video do aniversario  |
|Galeria   | vdo3.H264     |  Pegadinha de sexta   |
|Documento | teste.pdf     ||
|Documento | contas.xls    ||
|Audio     | mensagem1.aac ||
||||
||||