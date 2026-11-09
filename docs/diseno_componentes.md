# Memoria de Diseño: WarmUp

## 1. Estudio de Layouts y Componentes (Mockups)

### Pantalla Principal (`MainActivity`)

#### Layouts Principales
- **Surface**: Contenedor raíz que aplica el fondo general del tema.
- **Column (Layout Vertical)**: Organiza la pantalla de forma secuencial descendente, 
ubicando el cabecero de la interfaz en la parte superior y la lista de tarjetas a 
continuación, como haríamos en una columna.

#### Componentes Fundamentales
- **Text (Headline)**: Renderiza el título principal de la pantalla ("Mis Actividades") 
aplicando "negrita".
- **TarjetaActividad (Card Component)**: Componente modular reutilizable diseñado para 
mostrar el resumen de un entrenamiento. Contiene:
    - **Card (Material 3)**: Proporciona el contenedor visual con esquinas redondeadas, 
  elevación (sombra) y color de fondo personalizado.
    - **Column Interna**: Dispone la información interna en sentido vertical.
    - **Text (Título)**: Muestra la disciplina y la distancia recorrida 
  (`titleMedium` en negrita).
    - **Spacer**: Proporciona una separación vertical fija de `4.dp` entre líneas de 
  texto.
    - **Text (Fecha y hora)**: Muestra la marca temporal del registro (`bodyMedium` 
  con contraste reducido).

---

## 2. Justificación de Reutilización
El diseño se ha modularizado aislando `TarjetaActividad` como un `@Composable` 
independiente. Esto permite alimentar la pantalla principal mediante una lista estática
(ampliable en futuros hitos a listas dinámicas mediante `LazyColumn`) garantizando la 
coherencia visual y facilitando el mantenimiento del código.