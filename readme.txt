


Este archivo contiene las guias de ejecución para los siguientes proyectos 
de pruebas:

- Pruebas E2E con Selenium 
- Pruebas de API con Karate






=======================================================================
                 GUÍA DE EJECUCIÓN DE PRUEBAS E2E CON SELENIUM
=======================================================================

PROYECTO: demoblaze-tests > e2e-selenium
OBJETIVO: Ejecutar las pruebas automáticas E2E con Selenium + Cucumber
REQUISITOS:
  - Tener instalado IntelliJ IDEA (o un IDE con soporte Maven)
  - Tener Java 8 o superior instalado

-----------------------------------------------------------------------
1. DESEMPAQUETAR EL ARCHIVO ZIP
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

Recomendación: asegúrate de tener Google Chrome actualizado a su versión 
más reciente para evitar incompatibilidades con el driver.

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











=======================================================================
                 GUÍA DE EJECUCIÓN DE PRUEBAS DE API CON KARATE
=======================================================================

PROYECTO: demoblaze-tests > api-karate
OBJETIVO: Ejecutar las pruebas automáticas de API con Karate Framework
REQUISITOS:
  - Tener instalado IntelliJ IDEA (o un IDE compatible con Maven)
  - Tener Java 8 o superior instalado

-----------------------------------------------------------------------
1. ABRIR EL PROYECTO EN INTELLIJ IDEA
-----------------------------------------------------------------------
1. Abre IntelliJ IDEA.
2. Selecciona la opción "File > Open" y elige la carpeta raíz del proyecto:
   api-karate
3. Espera a que Maven descargue las dependencias necesarias.

-----------------------------------------------------------------------
2. ACTIVAR EL PLUGIN DE KARATE
-----------------------------------------------------------------------
1. En IntelliJ IDEA, dirígete a:
       File > Settings > Plugins
2. Busca "Karate" en el buscador de plugins.
3. Verifica que el plugin esté instalado y habilitado.
   Si no lo está, instálalo y reinicia IntelliJ IDEA.

-----------------------------------------------------------------------
3. EJECUTAR LAS PRUEBAS
-----------------------------------------------------------------------
Existen dos formas de ejecutar las pruebas:

Opción 1 – Desde IntelliJ IDEA
  - Abre el archivo: src/test/java/com/tests/runners/ApiTestsRunner.java
  - Haz clic derecho sobre la clase ApiTestsRunner.
  - Selecciona "Run 'ApiTestsRunner'".

Opción 2 – Desde la terminal
  - Abre la terminal dentro de IntelliJ IDEA o en la raíz del proyecto.
  - Ejecuta el siguiente comando:
        mvn clean test -Dtest=ApiTestsRunner

-----------------------------------------------------------------------
4. REVISAR LOS RESULTADOS
-----------------------------------------------------------------------
1. Una vez finalizadas las pruebas, se generará la carpeta:
       target/
2. Dentro encontrarás los reportes de Karate en:
       target/karate-reports/karate-summary.html
3. Abre el archivo karate-summary.html en tu navegador web preferido
   para visualizar los resultados detallados de las pruebas.