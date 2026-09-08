| Rol | Integrante | Usuario de GitHub | Fecha de inicio |
| :--- | :--- | :--- | :--- |
| Estudiante A | Iván Alejandro García Ramírez | igarcia86 | Jueves 9 de septiembre de 2026 |
| Estudiante B | Alexis Emmanuel González Rico | alemgori-max | Jueves 9 de septiembre de 2026 |

# Fase 2: Análisis orientado a objetos

## 1. Descripción del problema
El sistema simula el monitoreo de tanques industriales de líquidos, el sistema maneja informacion  del tanque, capacidad máxima (L), nivel actual (L), estado  y datos del sensor. 
Maneja acciones como Llenar, vaciar, detener, consultar nivel, porcentaje de llenado y lecturas del sensor.
Las restricciones del sistema son que el nivel nunca debe ser negativo  ni superar la capacidad máxima

---

## 2. Identificación de objetos

1. **Tanque:**  Representa el contenedor de líquido y tiene la responsabilidad de administrar su nivel de líquido y controlar su estado de operación de forma segura.

2. **Sensor de Nivel:** Representa el dispositivo que mide el líquido, y tiene la responsabilidad de tomar lecturas del tanque y verificar que los datos sean válidos.

## 3. Estado y comportamiento

| Objeto propuesto | Responsabilidad | Información que conserva | Comportamientos |
| :--- | :--- | :--- | :--- |
| **Tanque** | Administrar el nivel y estado respetando los límites. | - ID<br>- Capacidad máxima<br>- Nivel actual<br>- Estado | - Llenar y vaciar.<br>- Detener operación.<br>- Consultar nivel y estado.<br>- Calcular % de llenado. |
| **SensorNivel** | Leer y validar niveles del tanque. | - ID del sensor<br>- Última lectura | - Medir el nivel del tanque.<br>- Consultar última lectura.<br>- Validar rangos. |

## 4. Relaciones entre los objetos
- **SensorNivel → Tanque:** El sensor necesita leer la información del tanque para obtener la medición.
- **División de trabajo:** El **Tanque** es el único que cambia su nivel de líquido. El **SensorNivel** solo lee y verifica el valor sin modificarlo.