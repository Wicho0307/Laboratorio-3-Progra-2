# Laboratorio 3 - Programación II

Repositorio de ejercicios desarrollados en **Java** para el curso de **Programación II**. El proyecto está organizado por niveles, temas y número de ejercicio para que cada programa pueda localizarse y ejecutarse de forma independiente.

## Organización general

El repositorio contiene **70 ejercicios**, distribuidos de la siguiente manera:

| Nivel | Ejercicios | Cantidad | Tema general |
|---|---:|---:|---|
| Nivel 1 | 001 al 025 | 25 | Manejo de excepciones, validación de datos y control de errores |
| Nivel 2 | 026 al 050 | 25 | Clases, objetos, atributos, métodos y encapsulamiento |
| Nivel 3 | 051 al 070 | 20 | Herencia, polimorfismo, abstracción e integración de conceptos |
| **Total** | **001 al 070** | **70** | **Programación orientada a objetos en Java** |

## Estructura del repositorio

```text
Laboratorio-3-Progra-2/
├── .vscode/
│   └── settings.json
│
├── src/
│   ├── Nivel1/
│   │   ├── Ejercicio001/
│   │   │   └── Ejercicio001.java
│   │   ├── Ejercicio002/
│   │   │   └── Ejercicio002.java
│   │   ├── ...
│   │   └── Ejercicio025/
│   │       └── Ejercicio025.java
│   │
│   ├── Nivel2/
│   │   ├── Ejercicio026/
│   │   │   └── Ejercicio026.java
│   │   ├── ...
│   │   └── Ejercicio050/
│   │       └── Ejercicio050.java
│   │
│   └── Nivel3/
│       ├── Herencia/
│       │   ├── Ejercicio051/
│       │   ├── ...
│       │   └── Ejercicio055/
│       │
│       ├── Polimorfismo/
│       │   ├── Ejercicio056/
│       │   ├── ...
│       │   └── Ejercicio060/
│       │
│       ├── Abstraccion/
│       │   ├── Ejercicio061/
│       │   ├── ...
│       │   └── Ejercicio065/
│       │
│       └── Integracion/
│           ├── Ejercicio066/
│           ├── ...
│           └── Ejercicio070/
│
├── bin/
│   ├── Nivel1/
│   ├── Nivel2/
│   └── Nivel3/
│
└── README.md
```

## Descripción de las carpetas

### `.vscode`

Contiene la configuración utilizada por Visual Studio Code para reconocer las carpetas de código fuente, dependencias y archivos compilados del proyecto.

### `src`

Es la carpeta principal del código fuente. Dentro de ella se encuentran todos los archivos `.java`, organizados por nivel y número de ejercicio.

Cada ejercicio tiene su propia carpeta y su propia clase principal. Por ejemplo:

```text
src/Nivel1/Ejercicio001/Ejercicio001.java
```

La estructura también coincide con el nombre del paquete declarado en Java:

```java
package Nivel1.Ejercicio001;
```

Esto evita mezclar clases de distintos ejercicios y permite ejecutar cada programa de manera independiente.

### `bin`

Contiene los archivos `.class` generados después de compilar los ejercicios. Su estructura refleja la organización de la carpeta `src`.

Los archivos de esta carpeta son resultados de compilación, por lo que normalmente no deben editarse manualmente.

## Distribución de los ejercicios

### Nivel 1: ejercicios 001 al 025

Los ejercicios del primer nivel se encuentran directamente dentro de `src/Nivel1`. Están enfocados principalmente en el manejo de errores y excepciones, incluyendo validación de entradas, operaciones que pueden producir errores, uso de `try`, `catch` y excepciones personalizadas.

```text
src/Nivel1/Ejercicio001/
src/Nivel1/Ejercicio002/
...
src/Nivel1/Ejercicio025/
```

### Nivel 2: ejercicios 026 al 050

Los ejercicios del segundo nivel se encuentran dentro de `src/Nivel2`. Trabajan la creación de clases y objetos, atributos privados, constructores, métodos, encapsulamiento y listas de objetos.

Los ejercicios se agrupan de forma progresiva utilizando distintas clases de ejemplo:

| Ejercicios | Clase o tema principal |
|---|---|
| 026 al 030 | `Persona` |
| 031 al 035 | `Cuenta` |
| 036 al 040 | `Producto` |
| 041 al 045 | `Estudiante` |
| 046 al 050 | `Empleado` |

### Nivel 3: ejercicios 051 al 070

El tercer nivel está dividido en subcarpetas según el concepto de programación orientada a objetos que se practica.

| Carpeta | Ejercicios | Contenido |
|---|---:|---|
| `Herencia` | 051 al 055 | Clases base, clases derivadas, uso de `extends` y reutilización de atributos y métodos |
| `Polimorfismo` | 056 al 060 | Sobrescritura de métodos y uso de una referencia común para diferentes objetos |
| `Abstraccion` | 061 al 065 | Clases abstractas, métodos abstractos y figuras geométricas |
| `Integracion` | 066 al 070 | Combinación de abstracción, listas, interfaces e implementación de clases |

## Forma de nombrar los ejercicios

Todos los ejercicios utilizan tres dígitos para mantener el orden:

```text
Ejercicio001
Ejercicio002
Ejercicio003
...
Ejercicio070
```

El nombre de la carpeta, el archivo, la clase principal y el paquete están relacionados. Por ejemplo:

```text
Carpeta: src/Nivel3/Herencia/Ejercicio051/
Archivo: Ejercicio051.java
Clase:   Ejercicio051
Paquete: Nivel3.Herencia.Ejercicio051
```

## Ejecución en Visual Studio Code

1. Abrir la carpeta completa del repositorio en Visual Studio Code.
2. Tener instalado un JDK de Java y la extensión **Extension Pack for Java**.
3. Ingresar a la carpeta `src` y abrir el archivo del ejercicio que se desea ejecutar.
4. Presionar el botón **Run** que aparece sobre el método `main`.

También se puede compilar y ejecutar desde la terminal. Por ejemplo, para el ejercicio 001:

```bash
javac -d bin src/Nivel1/Ejercicio001/Ejercicio001.java
java -cp bin Nivel1.Ejercicio001.Ejercicio001
```

Para un ejercicio del Nivel 3, debe incluirse también la carpeta del tema. Por ejemplo:

```bash
javac -d bin src/Nivel3/Herencia/Ejercicio051/Ejercicio051.java
java -cp bin Nivel3.Herencia.Ejercicio051.Ejercicio051
```

## Propósito de la organización

La estructura utilizada permite:

- Mantener separados los ejercicios.
- Identificar rápidamente el nivel y el tema de cada programa.
- Evitar conflictos entre clases que utilizan nombres similares.
- Ejecutar y revisar cada ejercicio de forma independiente.
- Conservar en `src` el código fuente y en `bin` los archivos compilados.

---

**Curso:** Programación II  
**Proyecto:** Laboratorio 3  
**Lenguaje:** Java
