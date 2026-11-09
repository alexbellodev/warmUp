// ruta del paquete
package com.example.warmup.ui.components

// ~ Librerías ~ //
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// agrupa los datos que necesita la tarjeta para evitar pasar parámetros sueltos
data class ActividadData(
    val titulo: String,
    val fecha: String
)

// componente visual reutilizable
@Composable
fun TarjetaActividad(
    data: ActividadData,             // objeto con los datos a mostrar
    modifier: Modifier = Modifier    // modificador por defecto que nos permite personalizar
){
    // contenedor visual preconfigurado de la librería material3
    Card(
        modifier = modifier.fillMaxWidth().padding(vertical = 8.dp), elevation = CardDefaults.cardElevation(defaultElevation = 4.dp), colors = CardDefaults.cardColors(containerColor = Color(0xFFE0E0E0))){
        // column permite apilar título y fecha uno encima del otro
        Column(modifier = Modifier.padding(16.dp)){
            Text( // formato legible
                text = data.titulo,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )

            // separación vertical para hacerlo más agradable a la vista
            Spacer(modifier = Modifier.height(4.dp))

            Text( // formato legible
                text = data.fecha,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.DarkGray // color secundario
            )
        }
    }
}

// permite previsualizar la tarjeta en tiempo real sin emulador
@Preview(showBackground = true)
@Composable
fun TarjetaPreview(){
    Surface(modifier = Modifier.fillMaxWidth().padding(16.dp)){
        TarjetaActividad(
            data = ActividadData(
                titulo = "Correr · 10,00km",
                fecha = "03/09/2026 - 12:00h"
            )
        )
    }
}