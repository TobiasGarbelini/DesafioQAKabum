# language: pt
Funcionalidade: Login
  Entro no site da Kabum
  faço login
  valido se esotou logafo

  @fluxoPadrao
  Esquema do Cenario: Deve adicionar um produto no carrinho e validar se o mesmo foi adicionar corretamente
    Dado estou na pagina inicial da kabum
    Quando clico em login cadastre se
    E preencho email de login <email>
    E preencho senha de login <senha>
    E clico em entrar
    Entao estou logado <nomeCliente>

    Exemplos: 
      | email                   | senha      | nomeCliente |
      | "kabumteste4@gmail.com" | "kabum123" | "TESTE"     |
