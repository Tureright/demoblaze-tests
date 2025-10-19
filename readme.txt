Este archivo contiene las guias de ejecución para los proyectos de pruebas de "Pruebas E2E con Selenium" y "Pruebas de API con Karate".





=======================================================================
                 GUÍA DE EJECUCIÓN DE PRUEBAS E2E CON SELENIUM
=======================================================================

PROYECTO: demoblaze-tests > e2e-selenium
OBJETIVO: Ejecutar las pruebas automáticas E2E con Selenium + Cucumber
REQUISITOS:
  - Tener instalado IntelliJ IDEA (o un IDE con soporte Maven)
  - Tener Java 8 o superior instalado

-----------------------------------------------------------------------
1. DESEMPAQUETAR EL ARCHIVO
-----------------------------------------------------------------------
1. Localiza el archivo comprimido del proyecto (.zip)
2. Extrae el contenido en una carpeta de tu elección.

-----------------------------------------------------------------------
2. AGREGAR CHROMEDRIVER
-----------------------------------------------------------------------
1. Visita la página oficial de descargas de ChromeDriver:
   https://googlechromelabs.github.io/chrome-for-testing/
2. Dirígete a la sección "Stable releases".
3. Descarga la versión que coincida con la versión actual de tu navegador Chrome.
4. Extrae el archivo .zip descargado.
5. Copia el archivo chromedriver.exe dentro de la carpeta:
   demoblaze-tests > e2e-selenium > drivers > chromedriver.exe

Recomendación: asegúrate de tener Google Chrome actualizado a su versión más reciente
para evitar incompatibilidades con el driver.

-----------------------------------------------------------------------
3. ABRIR EL PROYECTO EN INTELLIJ IDEA
-----------------------------------------------------------------------
1. Abre IntelliJ IDEA.
2. Selecciona la opción "File > Open" y elige la carpeta raíz del proyecto:
   e2e-selenium
3. Espera a que Maven descargue todas las dependencias necesarias.
   Este proceso puede tardar algunos minutos.

-----------------------------------------------------------------------
4. EJECUTAR LAS PRUEBAS
-----------------------------------------------------------------------
Existen dos formas de ejecutar las pruebas:

Opción 1 – Desde IntelliJ IDEA
  - Abre el archivo: src/test/java/com/tests/runner/RunnerTest.java
  - Haz clic derecho sobre la clase RunnerTest.
  - Selecciona "Run 'RunnerTest'".

Opción 2 – Desde la terminal
  - Abre la terminal dentro de IntelliJ IDEA o en la raíz del proyecto.
  - Ejecuta el siguiente comando:
        mvn test -Dtest=RunnerTest

-----------------------------------------------------------------------
5. REVISAR LOS RESULTADOS
-----------------------------------------------------------------------
1. Una vez finalizadas las pruebas, se generará la carpeta:
       target/
2. Dentro encontrarás los reportes de Cucumber en:
       target/cucumber/cucumber-report.html
3. Abre el archivo cucumber-report.html en tu navegador web preferido
   para visualizar los resultados detallados de las pruebas.


