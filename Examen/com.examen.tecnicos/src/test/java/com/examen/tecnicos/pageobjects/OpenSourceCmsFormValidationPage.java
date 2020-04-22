package com.examen.tecnicos.pageobjects;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.PageObject;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class OpenSourceCmsFormValidationPage extends PageObject {
		// Campo txttitlecontent
		@FindBy(xpath = "//TEXTAREA[@role='button']")
		public WebElementFacade txttitlecontent;
		
		// Campo txttitle
		@FindBy(id = "post-title-0")
		public WebElementFacade  txttitle;
		
		//Boton Valitate
		@FindBy(xpath="//BUTTON[@type='button'][text()='Update']")
		public WebElement btnUpdate;
		
		//mensaje informativo
		@FindBy(xpath="//DIV[@class='components-notice is-error is-dismissible']")
		public WebElementFacade mensageError;
		
		@FindBy(xpath="//DIV[@class='components-notice is-success is-dismissible']")
		public WebElementFacade mensageexitoso;
		
		public void title(String datoPrueba) {
			txttitle.click();
			txttitle.clear();
			txttitle.sendKeys(datoPrueba);
		}
		
		public void Validate() {
			btnUpdate.click();
		}
		
		public void form_sin_errores() {
			assertThat(mensageexitoso.isCurrentlyVisible(), is(true));
		}

		public void form_con_errores() {
			assertThat(mensageexitoso.isCurrentlyVisible(), is(false));
		}

}
