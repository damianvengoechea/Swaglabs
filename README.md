**Proyecto Mobile Appium**

Se tiene 2 escenarios de pruebas

* Realizar el inicio de sesión en la aplicación de SwagLabs.
* Realizar una compra añadiendo productos al carrito en SwagLabs.

En este proyecto se usó el framework serenity BDD junto con screenplay, cucumber, gherkin y gradle. 

Los tests usan el siguiente arquetipo: 
  **• tasks:** Clases que representan tareas que realiza el actor a nivel de proceso de negocio 
  **• interaction:** Clases que representan las interacciones directas con la interfaz de usuario 
  **• userinterfaces (Page Objects):** Se mapean los objetos de la interfaz de usuario 
  **• questions:** Objectos usados para consultar acerca del estado de la aplicación
  **• util:** Utilidades que nos sirven para nuestro desarrollo

**Herramientas utilizadas** 
Lenguaje de programación: **Java.** 
Frameworks: **Selenium, Junit, cucumber y Serenity BDD.** 
Patrón de diseño: **Screenplay.** 
Features: **Hechos en lenguaje Gherkin.** 
IDE: **Intellij Idea**

**Ejecución por Terminal**

Para ejecutar la automatización copiamos la siguiente línea de comando dentro del CMD:
**./gradlew clean test aggregate**

Una vez ejecutado, se puede verificar las evidencias en la ruta:

.../target/site/serenity/index.html

