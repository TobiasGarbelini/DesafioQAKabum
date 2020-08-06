package pages;

import core.DSL;

public class HomePage extends DSL {
	
	public void verificarSeEstouNaHomePage() {
		verificaTitle("KaBuM! - Explosão de Preços Baixos!");
	}
	
	public void clicarEmLoginCadastrese() {
		esperaElementoclicavelId("li-login-usuario");
		clickid("li-login-usuario");
	}

	public void validarLogin(String valor) {
		String mensagem = "OLÁ, " + valor + "!";
		verificaCSSSelector(".cliente-logado", mensagem);
	}
}
