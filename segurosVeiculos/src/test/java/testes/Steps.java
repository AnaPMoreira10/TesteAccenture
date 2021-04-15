package testes;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.Elementos;
import pages.Metodos;

public class Steps {
	
	Metodos sv = new Metodos();
	Elementos ct = new Elementos();
	
	
	@Given("^que eu acesse o site \"([^\"]*)\"$")
	public void que_eu_acesse_o_site(String arg1) throws Throwable {
	   
		sv.abrirNavegador(arg1);
	}

	@When("^preencher todos os dados do formulário$")
	public void preencher_todos_os_dados_do_formulário() throws Throwable {
	  
		sv.clicar(ct.btnFabricante);
		sv.clicar(ct.btnOpcao);
		sv.clicar(ct.btnModelo);
		sv.clicar(ct.btnEscolha);
		sv.preencher(ct.btnCilindrada, "1600");
	    sv.preencher(ct.btnPerformance, "180");
	    sv.preencher(ct.btnDataFabricacao, "03/24/2021");
	    sv.clicar(ct.btnNumeroSerie);
	    sv.clicar(ct.btnEscolherSerie);
		sv.clicar(ct.btnDirecao);
		sv.clicar(ct.btnNumeroSerie1);
		sv.clicar(ct.btnEscolherSerie1);
		sv.clicar(ct.btnCombustivel);
		sv.clicar(ct.btnEscolhaCombustivel);
		sv.preencher(ct.btnCargaUtil, "350");
		sv.preencher(ct.btnPesoTotal, "800");
		sv.preencher(ct.btnPrecoTabela, "55000");
		sv.preencher(ct.btnNumeroPlaca, "GF2587");
		sv.preencher(ct.btnKmAno, "20000");
		sv.clicar(ct.btnProximo);
		sv.preencher(ct.btnPrimeiroNome, "Juca");
		sv.preencher(ct.btnSobrenome, "Silva");
		sv.preencher(ct.btnNascimento, "02/25/1982");
		sv.clicar(ct.btnGeneroM);
		sv.preencher(ct.btnEndereco, "Av. Raimundo Pereira de Magalhaes");
		sv.clicar(ct.btnPais);
		sv.clicar(ct.btnSeuPais);
		sv.preencher(ct.btnCep, "05145100");
		sv.preencher(ct.btnCidade, "Sao Paulo");
		sv.clicar(ct.btnEscolhaOcupacao);
		sv.clicar(ct.btnEscolhaOcupacao);
		sv.clicar(ct.btnHobbies);
		sv.clicar(ct.btnEscolherHobbies);
		sv.preencher(ct.btnSite,"www.teste.com.br" );
		sv.clicar(ct.btnNext);
		sv.preencher(ct.btnDataInicio, "06/24/2021");
		sv.clicar(ct.btnValorSeguro);
		sv.clicar(ct.btnEscolhaValor);
		sv.clicar(ct.btnMerito);
		sv.clicar(ct.btnEsolhaMerito);
		sv.clicar(ct.btnDanos);
		sv.clicar(ct.btnEscolhaDanos);
		sv.clicar(ct.btnProduto);
		sv.clicar(ct.btnCortesia);
		sv.clicar(ct.btnEscolhaCortesia);
		sv.clicar(ct.btnProximapag);
		sv.esperarElemento(ct.btnGold);
		sv.clicar(ct.btnGold);
		sv.esperar(2000);
		sv.Scroll();
		sv.clicar(ct.btnProximaPag1);
		sv.preencherDadosCadastrais("ana_tana@ig.com.br", "5511958513590", "Amorabra", "Gu529782", "Gu529782");
		sv.clicar(ct.btnEnviar);
			
	
	}
		

	@Then("^valido formulário enviado com sucesso!!$")
	public void valido_formulário_enviado_com_sucesso() throws Throwable {
	 
		sv.esperarElemento(ct.btnMensagem);
		sv.validarTexto(ct.btnMensagem, "Sending e-mail success!");
		sv.screenShot("Sending e-mail success!");
		sv.fecharBrowser();
		
	}


	

}
