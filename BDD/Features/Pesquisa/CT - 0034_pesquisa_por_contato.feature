#language:pt
#encoding:UTF-8
#author:Tamires Cruz
#date:20/06/2021
#versio:1


Feature: <Pesquisa da aplicação Whatsapp>

    Background:
        Given que eu esteja na aplicação whatsapp
        And insiro as informações 
        And quero realizar fazer uma "pesquisa"

        CT - 0034	
        Scenario: Verificar o preenchimento da "pesquisa" por contato
        When estou na aba "conversas"
        And insiro as infomações da "pesquisa" por um determindo "contato"
        Then será exibido o "contato" pesquisado


        CT - 0036	Validar o "fechamento" da pesquisa do Whatsapp

        CT - 0035
        Scenario: Verificar o preenchimento da "pesquisa" por assunto
        When estou na aba "Conversas"
        And e insiro uma pesquisa por um determinado "assunto"
        Then será exibido o assunto ou similares a "pesquisa"
        And clico no "x" para fechar a pesquisa

        