package com.examen.tecnicos.definition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.util.List;

import com.examen.tecnicos.steps.PopupValidationSteps;
import com.examen.tecnicos.steps.opensourcecmsFormValidationSteps;
public class PopupValidationEdit {

@Steps
PopupValidationSteps popupValidationSteps;
@Steps
opensourcecmsFormValidationSteps opensourcecmsFormValidationSteps;
	
	
@Given("^Autentico el opensourcecms con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
public void autentico_el_opensourcecms_con_usuario_y_clave(String Usuario, String Clave) {
	popupValidationSteps.login_opensourcecms(Usuario, Clave);
  
}

@Given("^Ingreso al funcionalidad Forms Validation menu \"([^\"]*)\"$")
public void ingreso_al_funcionalidad_Forms_Validation_menu(String link) throws InterruptedException {
	popupValidationSteps.ingresar_form_validation(link);

}

@When("^Diligencio Forlulario Popup Validaction$")
public void diligencio_Forlulario_Popup_Validaction(DataTable dtDatosForm){
 List<List<String>> data = dtDatosForm.raw();
 
 for (int i=1; i<data.size(); i++)
 {
	 opensourcecmsFormValidationSteps.diligenciar_popup_datos_tabla(data,i);
	 try {
		 Thread.sleep(5000);
	 }catch (InterruptedException e) {
		// TODO: handle exception
	}
 }
 
}

@Then("^Verifico ingreso exitoso$")
public void verifico_ingreso_exitoso(){
	opensourcecmsFormValidationSteps.verificar_ingreso_datos_formulario_exitoso();
}

@Then("^Verifico que se presente mensaje informativo  de Validation$")
public void verifico_que_se_presente_mensaje_informativo_de_Validation() {
    // Write code here that turns the phrase above into concrete actions
    opensourcecmsFormValidationSteps.verificar_ingreso_datos_formulario_con_errores();
}



}