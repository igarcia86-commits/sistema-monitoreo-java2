| Rol | Integrante | Usuario de GitHub | Fecha de inicio |
| :--- | :--- | :--- | :--- |
| Estudiante A | Iván Alejandro García Ramírez | igarcia86 | Jueves 9 de septiembre de 2026 |
| Estudiante B | Alexis Emmanuel González Rico | alemgori-max | Jueves 9 de septiembre de 2026 |

#---

# Fase 2: Análisis orientado a objetos

## 1. Descripción del problema

EL problema que vamos a realizar es el control de un tanque de liquido a nivel industrial, se va atener el control de llenado del tanque, todo este control se llevara
por medio de un sensor el cual nos dara el nivel actual del tanque

## 2. Identificación de objetos

**Tanque:** va a guardar el líquido y cuidar que no se llene de mas o se  quede vacio.

**Sensor de Nivel:** Es el aparato que mide  cuánto líquido tiene el tanque y checar que la medición esté bien.




## 3. Estado y comportamiento

| Objeto propuesto | Responsabilidad                    | Información que debe conservar                                 | Comportamientos que debe realizar |
|------------|------------------------------------|----------------------------------------------------------------| --- |
| Tanque     | Almacena el liquido.               | - Identificador<br>- Capacidades<br>- Nivel actual<br>- Estado | - Llenar y vaciar<br>- Detener<br> |
| Sensor de Nivel| Mide y valida el nivel del tanque. | - Identificador del sensor<br>- Última lectura                 | - Medir el tanque<br> |
---

## 4. Relaciones entre objetos
El Sensor de nivel se relaciona con el Tanque porque necesita leer el volumen que tiene adentro para poder monitorearlo.

El Tanque que cambia su nivel de líquido y su estado depende del sensor de nivel.

# Fase 3. Diseño orientado a objetos y UML

## 5. Diseño de clases

| Clase | Atributos | Tipo de dato | Métodos | Responsabilidad |
| :--- | :--- | :--- | :--- | :--- |
| **Tanque** | idTanque<br>capacidadMax<br>nivelActual<br>estadoOperacion | Alfanumérico<br>Numérico<br>Numérico<br>Alfanumérico | Tanque(idTanque, capacidad)<br>llenar(litros)<br>vaciar(litros)<br>detener()<br>getNivel()<br>getPorcentaje()<br>getEstado() | Guardar cuánto líquido hay, cambiar el estado y cuidar que no se pase del límite ni baje de cero. |
| **SensorNivel** | idSensor | Alfanumérico | SensorNivel(idSensor)<br>medir(Tanque t)<br>validarLectura(lectura, Tanque t) | Leer el nivel del tanque y revisar que el valor tenga sentido sin modificarlo. |

## 6. Diagrama UML inicial

