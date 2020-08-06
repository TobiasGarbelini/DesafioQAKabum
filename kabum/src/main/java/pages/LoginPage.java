package pages;

import core.DSL;

public class LoginPage extends DSL {
	
	public void preencherInputEmailLoging(String email) {
		esperaElementoclicavelId("textfield12");
		preencheInputPorId("textfield12", email);
	}
	
	public void preencherInputSenhaLoging(String senha) {
		esperaElementoclicavelId("textfield15");
		preencheInputPorId("textfield15", senha);
	}
	
	public void clicarBotaoEntreLogin() {
		clickXpath("(//input[@name=\'login\'])[2]");
	}
}
