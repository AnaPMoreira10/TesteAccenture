package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By btnFabricante = By.id("make");
	
	public By btnOpcao = By.cssSelector("#make > option:nth-child(3)");
	
	public By btnModelo = By.id("model");
	
	public By btnEscolha = By.cssSelector("#model > option:nth-child(2)");
	
	public By btnCilindrada = By.id("cylindercapacity");
	
	public By btnPerformance = By.id("engineperformance");
	
	public By btnDataFabricacao = By.id("dateofmanufacture");
	
	public By btnNumeroSerie = By.id("numberofseats");
	
	public By btnEscolherSerie = By.cssSelector("#numberofseats > option:nth-child(5)");
	
	public By btnDirecao = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span");
	
	public By btnNumeroSerie1 = By.id("numberofseatsmotorcycle");
	
	public By btnEscolherSerie1 = By.cssSelector("#numberofseatsmotorcycle > option:nth-child(3)");
	
	public By btnCombustivel = By.id("fuel");
	
	public By btnEscolhaCombustivel = By.cssSelector("#fuel > option:nth-child(4)");
	
	public By btnCargaUtil = By.id("payload");
	
	public By btnPesoTotal = By.id("totalweight");
	
	public By btnPrecoTabela = By.id("listprice");	
	
	public By btnNumeroPlaca = By.id("licenseplatenumber");
	
	public By btnKmAno = By.id("annualmileage");
	
	public By btnProximo = By.id("nextenterinsurantdata");
	
	public By btnPrimeiroNome = By.id("firstname");
	
	public By btnSobrenome = By.id("lastname");
	
	public By btnNascimento = By.id("birthdate");
	
	public By btnGeneroM = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]");
	
	public By btnEndereco = By.id("streetaddress");
	
	public By btnPais = By.id("country");
	
	public By btnSeuPais = By.cssSelector("#country > option:nth-child(7)");
	
	public By btnCep = By.id("zipcode");
	
	public By btnCidade = By.id("city");
	
	public By btnOcupacao = By.id("occupation");
	
	public By btnEscolhaOcupacao = By.cssSelector("#occupation > option:nth-child(3)");
	
	public By btnHobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p");
	
	public By btnEscolherHobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]");
		
	public By btnSite = By.id("website");
	
	public By btnFoto = By.id("picture");
	
	public By btnOpen = By.id("id=\"open\"");
	
	public By btnNext = By.id("nextenterproductdata");
	
	public By btnDataInicio = By.id("startdate");
	
	public By btnValorSeguro = By.id("insurancesum");
	
	public By btnEscolhaValor = By.cssSelector("#insurancesum > option:nth-child(2)");
	
	public By btnMerito = By.id("meritrating");
	
	public By btnEsolhaMerito = By.cssSelector("#meritrating > option:nth-child(5)");
	
	public By btnDanos = By.id("damageinsurance");
	
	public By btnEscolhaDanos = By.xpath("//*[@id=\"damageinsurance\"]/option[4]");
	
	public By btnProduto = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]/span");
	
	public By btnCortesia = By.id("courtesycar");
	
	public By btnEscolhaCortesia = By.cssSelector("#courtesycar > option:nth-child(3)");
	
	public By btnProximapag = By.id("nextselectpriceoption");
	
	public By btnGold = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(2) > span");
	
	public By btnProximaPag1 = By.id("nextsendquote");
	
	public By btnEmail = By.id("email");
	public By btnFone = By.id("phone");
	public By btnUsuario = By.id("username");
	public By btnSenha = By.id("password");
	public By btnConfirma = By.id("confirmpassword");
	public By btnEnviar = By.id("sendemail");
	public By btnMensagem = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > h2");
	
	
	
	
	

}
