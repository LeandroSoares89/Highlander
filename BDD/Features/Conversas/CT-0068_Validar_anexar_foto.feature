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
E clico em Galeria
E escolho uma foto ou video 
E Preencho o campo de descrição com Envidando foto
E clico   no icone do aviazinho


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