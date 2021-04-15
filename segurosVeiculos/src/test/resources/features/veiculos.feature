#Author: ana.moreira_10@gmail.com

@executa
Feature: Preencher Formulário
  Eu como usuário quero preencher o formulário


  
  Scenario: Enviar formulário preenchido
    Given que eu acesse o site "http://sampleapp.tricentis.com/101/app.php"
    When preencher todos os dados do formulário
    Then valido formulário enviado com sucesso!! 
  
