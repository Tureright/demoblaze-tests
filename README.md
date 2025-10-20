# Demoblaze Test Automation Suite

Proyecto de automatización de pruebas para la aplicación [Demoblaze](https://www.demoblaze.com/), que incluye pruebas de API con Karate y pruebas end-to-end (E2E) con Selenium WebDriver.

## 📋 Tabla de Contenidos

- [Descripción General](#descripción-general)
- [Tecnologías Utilizadas](#tecnologías-utilizadas)
- [Requisitos Previos](#requisitos-previos)
- [Documentación de Defectos](#documentación-de-defectos)
- [Hallazgos Principales](#hallazgos-principales)

## Descripción General

Este repositorio contiene dos suites de pruebas automatizadas diseñadas para validar la funcionalidad y calidad de la aplicación Demoblaze:

- **Pruebas de API con Karate**: Validación de endpoints de registro y autenticación
- **Pruebas E2E con Selenium**: Validación del flujo completo de compra en la interfaz web

## Tecnologías Utilizadas

### Pruebas de API (Karate)

- **Karate Framework** - Framework BDD para pruebas de API
- **Java 11+** - Lenguaje de programación
- **Maven** - Gestión de dependencias y construcción

### Pruebas E2E (Selenium)

- **Selenium WebDriver** - Automatización de navegadores
- **Java 11+** - Lenguaje de programación
- **Maven** - Gestión de dependencias y construcción
- **JUnit** - Framework de pruebas

## Requisitos Previos

- Java JDK 11 o superior
- Maven 3.6+
- Navegador web (Chrome/Firefox)
- WebDriver correspondiente al navegador
- IDE recomendado: IntelliJ IDEA o Eclipse

## Documentación de Defectos

Cada proyecto incluye documentación detallada de defectos encontrados:

- `api-karate/documentation/DefectReport.xlsx`
- `e2e-selenium/documentation/DefectReport.xlsx`

## Hallazgos Principales

### Pruebas de API

-  Incumplimiento de estándares HTTP (código 200 para errores)
-  Validación insuficiente en campo "password"
-  Respuestas inconsistentes sin información del recurso creado
- **Resultado**: 3 de 5 casos fallidos

### Pruebas E2E

-  Falta de validación en campos de entrada del checkout
-  Ausencia de sanitización (riesgo de inyección SQL)
-  Campos de tarjeta aceptan valores no numéricos
-  Sin validación de consistencia geográfica
- **Resultado**: Flujo de compra fallido

Para más detalles, consultar los directorios de "documentation" de cada proyecto.
