
@Regresion
Feature: Formulario Edit

  @CasoExitosoEditarPost
  Scenario: Editar Post y  se presenta ningún mensaje de validación.
    Given Autentico el opensourcecms con usuario "opensourcecms" y clave "opensourcecms" 
    And Ingreso al funcionalidad Forms Validation menu "Posts"
    When Diligencio Forlulario Popup Validaction
      | title 				  |
      | titlePrueba     |

  @CasoAlternoEditarPost
  Scenario: Editar Post y no se presenta ningún mensaje de validación.
    Given Autentico el opensourcecms con usuario "opensourcecms" y clave "opensourcecms" 
    And Ingreso al funcionalidad Forms Validation menu "Posts"
    When Diligencio Forlulario Popup Validaction
      | title 				  |
      |     						|
      
    Then Verifico que se presente mensaje informativo  de Validation

 @CasoExitosoEditarPage
  Scenario: Editar Page y  se presenta ningún mensaje de validación.
    Given Autentico el opensourcecms con usuario "opensourcecms" y clave "opensourcecms" 
    And Ingreso al funcionalidad Forms Validation menu "Pages"
    When Diligencio Forlulario Popup Validaction
      | title 				  |
      | titlePrueba     |

  @CasoAlternoEditarPage
  Scenario: Editar Page y no se presenta ningún mensaje de validación.
    Given Autentico el opensourcecms con usuario "opensourcecms" y clave "opensourcecms" 
    And Ingreso al funcionalidad Forms Validation menu "Pages"
    When Diligencio Forlulario Popup Validaction
      | title 				  |
      |     						|
      
    Then Verifico que se presente mensaje informativo  de Validation