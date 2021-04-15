$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("veiculos.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: ana.moreira_10@gmail.com"
    }
  ],
  "line": 4,
  "name": "Preencher Formulário",
  "description": "Eu como usuário quero preencher o formulário",
  "id": "preencher-formulário",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@executa"
    }
  ]
});
formatter.scenario({
  "line": 9,
  "name": "Enviar formulário preenchido",
  "description": "",
  "id": "preencher-formulário;enviar-formulário-preenchido",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "que eu acesse o site \"http://sampleapp.tricentis.com/101/app.php\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "preencher todos os dados do formulário",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "valido formulário enviado com sucesso!!",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://sampleapp.tricentis.com/101/app.php",
      "offset": 22
    }
  ],
  "location": "Steps.que_eu_acesse_o_site(String)"
});
formatter.result({
  "duration": 7823546800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.preencher_todos_os_dados_do_formulário()"
});
formatter.result({
  "duration": 11546666400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.valido_formulário_enviado_com_sucesso()"
});
formatter.result({
  "duration": 10687424500,
  "status": "passed"
});
});