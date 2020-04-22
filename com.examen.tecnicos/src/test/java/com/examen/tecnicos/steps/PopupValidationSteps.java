package com.examen.tecnicos.steps;

import com.examen.tecnicos.pageobjects.OpenSourceCmsLoginPage;
import com.examen.tecnicos.pageobjects.OpenSourceCmsMenuPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {
OpenSourceCmsLoginPage opensourcecmsLoginPage;
OpenSourceCmsMenuPage opensourcecmsmenuPage;

@Step
public void login_opensourcecms(String strUsuario, String strPass)
	{
	//a. abrir navegador con la url de prueba
		opensourcecmsLoginPage.open();
	//b.Ingresa usuario demo
	//c.Ingresar password demo
	//d.Click en boton Sign in
		opensourcecmsLoginPage.IngresarDatos(strUsuario,strPass);
	//e. Verificar la Autenticación (label en home)
		opensourcecmsLoginPage.VerificaHome();
	
	}
@Step

public void ingresar_form_validation(String strlink) throws InterruptedException
{
	opensourcecmsmenuPage.menuFormValidation(strlink);
}
}
