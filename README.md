# PruebasUnitariasVSCode-Modulo15
# 🧪 Práctica: Pruebas Unitarias con JUnit 5 en VS Code

## 📌 Objetivo

Configurar un entorno de desarrollo para Java utilizando Visual Studio Code y Maven, y aprender a crear y ejecutar pruebas unitarias con JUnit 5.

---

## ⚙️ 1. Configuración del entorno

Para esta práctica se ha utilizado:

* Editor: Visual Studio Code
* Sistema de construcción: Apache Maven
* Lenguaje: Java (JDK 17 o superior)
* Framework de testing: JUnit 5

---

## 🧩 2. Creación del proyecto

Se ha creado el proyecto mediante el asistente de VS Code:

1. `Ctrl + Shift + P`
2. Ejecutar: `Java: Create Java Project`
3. Seleccionar:

   * Maven
   * `maven-archetype-quickstart`
4. Configuración:

   * **GroupId:** entornos
   * **ArtifactId:** test-vscode

Una vez generado, se abre la carpeta del proyecto en VS Code.

---

## 📦 3. Configuración de Maven (`pom.xml`)

Se ha configurado JUnit 5 añadiendo la siguiente dependencia:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
```

Y el plugin necesario para ejecutar los tests:

```xml
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>3.2.5</version>
        </plugin>
    </plugins>
</build>
```

---

## 💻 4. Código a probar

Archivo: `CalculadoraRiesgo.java`

```java
package entornos;

public class CalculadoraRiesgo {
    public String evaluarEdad(int edad) {
        if (edad < 0 || edad > 120) return "Error";
        if (edad < 18) return "Joven";
        if (edad <= 65) return "Adulto";
        return "Senior";
    }
}
```

---

## 🧪 5. Tests unitarios

Archivo: `CalculadoraRiesgoTest.java`

```java
package entornos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraRiesgoTest {
    CalculadoraRiesgo calc = new CalculadoraRiesgo();

    @Test
    void testEdadNegativa() {
        assertEquals("Error", calc.evaluarEdad(-5));
    }

    @Test
    void testAdulto() {
        assertEquals("Adulto", calc.evaluarEdad(25));
    }

    @Test
    void testSenior() {
        assertEquals("Senior", calc.evaluarEdad(70));
    }

    @Test
    void testLimite18() {
        assertEquals("Adulto", calc.evaluarEdad(18));
    }
}
```

---

## ▶️ 6. Ejecución de tests en VS Code

Se han utilizado las siguientes herramientas:

### 🧪 Testing Explorer

* Icono del matraz en la barra lateral
* Permite ejecutar todos los tests

### ▶️ CodeLens

* Opción `Run | Debug` encima de cada test
* Permite ejecutar tests individuales

### 🐞 Depuración

* Uso de breakpoints en el código
* Ejecución en modo Debug para analizar paso a paso

---

## 📸 7. Capturas

*(Añadir aquí capturas de pantalla)*

* Testing Explorer con tests en verde
* Ejecución de un test individual
* Uso del modo Debug

---

## 📁 8. Estructura del proyecto

```
test-vscode/
├── src/
│   ├── main/java/entornos/CalculadoraRiesgo.java
│   └── test/java/entornos/CalculadoraRiesgoTest.java
├── pom.xml
└── README.md
```

---

## ✅ Conclusión

Se ha aprendido a:

* Configurar un entorno Java en VS Code
* Gestionar dependencias con Maven
* Crear y ejecutar tests con JUnit 5
* Utilizar herramientas de testing y depuración

---

## ✅ Captura de Pantalla
<img width="751" height="984" alt="image" src="https://github.com/user-attachments/assets/41248bff-5374-47eb-9dbf-5cc516c29fd0" />
