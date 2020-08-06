package steps;

import static core.DriverFactory.KillDriver;
import static core.DriverFactory.getDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	
	@Before
	public void setUp() {
		getDriver();
	}

	@Dado("estou na pagina inicial da kabum")
	public void estou_na_pagina_inicial_da_kabum() {
		homePage.verificarSeEstouNaHomePage();
	}

	@Quando("clico em login cadastre se")
	public void clico_em_login_cadastre_se() {
		homePage.clicarEmLoginCadastrese();
	}

	@Quando("preencho email de login {string}")
	public void preencho_email_de_login(String email) {
		loginPage.preencherInputEmailLoging(email);
	}

	@Quando("preencho senha de login {string}")
	public void preencho_senha_de_login(String senha) {
		loginPage.preencherInputSenhaLoging(senha);
	}

	@Quando("clico em entrar")
	public void clico_em_entrar() {
		loginPage.clicarBotaoEntreLogin();
	}

	@Entao("estou logado {string}")
	public void estou_logado(String nomeCliente) {
		homePage.validarLogin(nomeCliente);
	}
	
	@After
	public void tearDown(Scenario scenario) throws IOException {

		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		String idScenario = scenario.getId().substring(scenario.getId().lastIndexOf(".feature:")+9);
		String nomeArquivo = "target" + File.separator + "screenshot" + File.separator + scenario.getName() + "_" +  scenario.getStatus() + "_" + idScenario + ".jpg";
		FileUtils.copyFile(arquivo, new File(nomeArquivo));

		KillDriver();
	}
}
