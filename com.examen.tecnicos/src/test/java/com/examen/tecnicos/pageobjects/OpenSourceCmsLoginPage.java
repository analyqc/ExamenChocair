package com.examen.tecnicos.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://s1.demo.opensourcecms.com/wordpress/wp-login.php")
public class OpenSourceCmsLoginPage extends PageObject{

	//Campo usuario
	@FindBy (id="user_login")

	public WebElementFacade txtUsername;
	//Campo password
	@FindBy (id="user_pass")
	public WebElementFacade txtPassword;
	
	//boton
	@FindBy (id="wp-submit")
	public WebElementFacade btnSingIn;

	//label del cms a verificar
	@FindBy(xpath ="//A[@class='ab-item'][text()='opensourcecms']")////A[@class='ab-item'][text()='opensourcecms']
	public WebElementFacade lblHomePpal;
	
	
	
	public void IngresarDatos(String strUsuario, String strPass) {
		txtUsername.sendKeys(strUsuario);
		txtPassword.sendKeys(strPass);
		btnSingIn.click();
	}
	public void VerificaHome() {
		String labelv="opensourcecms";
		String strMensaje= lblHomePpal.getText();
		assertThat(strMensaje,containsString(labelv));
		
	}

	
}
