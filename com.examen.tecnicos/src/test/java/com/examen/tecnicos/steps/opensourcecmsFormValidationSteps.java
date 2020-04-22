package com.examen.tecnicos.steps;
import java.util.List;

import com.examen.tecnicos.pageobjects.OpenSourceCmsFormValidationPage;

import net.thucydides.core.annotations.Step;

public class opensourcecmsFormValidationSteps {

	OpenSourceCmsFormValidationPage opensourcecmsFormValidationPage;
	
	@Step
	public void diligenciar_popup_datos_tabla(List<List<String>> data, int id)
	{
		opensourcecmsFormValidationPage.title(data.get(id).get(0).trim());
		opensourcecmsFormValidationPage.Validate();
		
	}
	@Step
	public void verificar_ingreso_datos_formulario_exitoso() {
		opensourcecmsFormValidationPage.form_sin_errores();
	}
	
	@Step
	public void verificar_ingreso_datos_formulario_con_errores() {
		opensourcecmsFormValidationPage.form_con_errores();
	}

}
