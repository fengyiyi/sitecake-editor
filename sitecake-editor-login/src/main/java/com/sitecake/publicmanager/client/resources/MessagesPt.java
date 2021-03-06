package com.sitecake.publicmanager.client.resources;


public interface MessagesPt extends Messages, com.google.gwt.i18n.client.Messages {
	
	@DefaultMessage("Ops! O SiteCake teve um problema!")
	String errorMessage1();
	
	@DefaultMessage("Ajude a corrigir este problema nos informando <a target=\"_blank\" href=\"http://suporte.sitecake.com.br/pt/solicitacoes_anonimas/nova\">o que aconteceu</a>. Por favor inclua o relatório abaixo. Para continuar editando apenas <a href=\"javascript:location.reload()\">atualize</a> a página.")
	String errorMessage2();
	
	@DefaultMessage("Senha")
	String loginDialogLabel();

	@DefaultMessage("Login")
	String loginDialogSubmitLabel();
	
	@DefaultMessage("Erro: ")
	String loginAttemptOutcomeError();

	@DefaultMessage("Senha incorreta")
	String loginAttemptOutcomeInvalidCredential();

	@DefaultMessage("Resposta incorreta do servidor")
	String loginAttemptOutcomeInvalidServiceResponse();
	
	@DefaultMessage("O administrador já está conectado")
	String loginAttemptOutcomeLocked();
	
	@DefaultMessage("Conectando...")
	String loginAttemptOutcomeGranted();
	
	@DefaultMessage("Alterar senha")
	String switchToChangePassword();

	@DefaultMessage("CEsqueceu a senha?")
	String forgotPassword();

	@DefaultMessage("http://sitecake.com.br/pt/faq/senha-esquecida")
	String forgotPasswordLinkUrl();
	
	@DefaultMessage("Senha antiga")
	String oldCredentialLabel();
	
	@DefaultMessage("Nova senha")
	String newCredentialLabel();

	@DefaultMessage("Repita a nova senha")
	String newCredentialRepeatedLabel();
	
	@DefaultMessage("Alterar")
	String changeButton();
	
	@DefaultMessage("Cancelar")
	String cancelChangeButton();
	
	@DefaultMessage("As novas senhas não são iguais")
	String newCredentialDoesNotMatch();
	
	@DefaultMessage("A nova senha é muito curta")
	String newCredentialTooShort();
	
	@DefaultMessage("Alterando senha...")
	String chaningCredential();

	@DefaultMessage("Erro: ")
	String changeAttemptOutcomeError();
	
	@DefaultMessage("Senha alterada com sucesso...")
	String changeAttemptOutcomeGranted();
	
	@DefaultMessage("A senha antiga não esta correta")
	String changeAttemptOutcomeInvalidCredential();
	
	@DefaultMessage("A nova senha não foi aceita pelo sistema")
	String changeAttemptOutcomeInvalidNewCredential();
}
