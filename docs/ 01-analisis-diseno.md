| Rol | Integrante | Usuario de GitHub | Fecha de inicio |
| :--- | :--- | :--- | :--- |
| Estudiante A | Iván Alejandro García Ramírez | igarcia86 | Jueves 9 de septiembre de 2026 |
| Estudiante B | Alexis Emmanuel González Rico | alemgori-max | Jueves 9 de septiembre de 2026 |

# Fase 2: Análisis orientado a objetos

## 1. Descripción del problema
El sistema que se simulara dentro del entorno es el monitoreo de tanques de liquidos, en el cual se debe tener el control sobre el tanque; si el tanque esta lleno, vacio, su nivel actual.
Todo el control del tanque estara ligado a los sensores del tanque, que seran los encargados de manejar la informacion anteriormente mencionada por el tanque.
---

## 2. Identificación de objetos

**1 tanque** Representa el objeto donde se tiene un liquido y dentro del tiene la responsabilidad de tener el nivel del liquido.

**2 sensor** Representa el controlador dentro del sistema y tiene la responsabilidad de obtener la informacion del tanque.

## 3. Estado y comportamiento


## 4. Relaciones entre los objetos

# Fase 3. Diseño orientado a objetos y UML

## 5. Diseño de clases

| Clase | Atributos propuestos | Tipo de dato | Métodos propuestos | Responsabilidad |
| :--- | :--- | :--- | :--- | :--- |
| **main.Tanque** | `- id`<br>`- capacidadMaxima`<br>`- nivelActual`<br>`- estado` | String<br>double<br>double<br>String | `+ Tanque(id, capacidad)`<br>`+ llenar(cantidad)`<br>`+ vaciar(cantidad)`<br>`+ detener()`<br>`+ getNivel()`<br>`+ getPorcentaje()`<br>`+ getEstado()` | Mantener los límites de líquido seguros y actualizar su estado operativo. |
| **SensorNivel** | `- idSensor` | String | `+ SensorNivel(id)`<br>`+ medir(Tanque t)`<br>`+ esLecturaValida(lectura, Tanque t)` | Extraer el nivel actual del tanque sin alterarlo. |

## 6. Diagrama UML inicial

```text
-------------------------
         main.Tanque
-------------------------
- id : String
- capacidadMaxima : double
- nivelActual : double
- estado : String
-------------------------
+ main.Tanque(id : String, capacidadMaxima : double)
+ llenar(cantidad : double) : void
+ vaciar(cantidad : double) : void
+ detener() : void
+ getNivel() : double
+ getPorcentaje() : double
+ getEstado() : String
-------------------------

-------------------------
      SensorNivel
-------------------------
- idSensor : String
-------------------------
+ SensorNivel(idSensor : String)
+ medir(tanque : main.Tanque) : double
+ esLecturaValida(lectura : double, tanque : main.Tanque) : boolean
-------------------------