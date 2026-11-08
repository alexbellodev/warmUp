// ruta lógica dentro del proyecto
package com.example.warmup

// imports de Android y Jetpack Compose
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity(){
    // método del ciclo de vida de Android
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        // Jetpack Compose, a partir de aquí termina XML clásico
        setContent{
            // color del background
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background){
                // usamos un Column para que aparezca una tarjeta debajo de otra
                Column(modifier = Modifier.fillMaxSize().padding(16.dp)){
                    Text(text = "Mis Actividades", style = MaterialTheme.typography.headlineMedium, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 8.dp))

                    // tarjetas de ejemplo para el listado
                    // mantenemos el formato
                    TarjetaActividad(
                        titulo = "Correr · 10,00km",
                        fecha = "03/09/2026 - 12:00h"
                    )
                    TarjetaActividad(
                        titulo = "Senderismo · 22,32km",
                        fecha = "28/08/2026 - 10:15h"
                    )
                    TarjetaActividad(
                        titulo = "Ciclismo · 120,01km",
                        fecha = "26/08/2026 - 09:00h"
                    )
                }
            }
        }
    }
}

/*
  separación
    título
    fecha
  para hacerlo más visual
*/

// función reutilizable -> dibuja una tarjeta de forma independiente
@Composable
fun TarjetaActividad(
    titulo: String,
    fecha: String
){
    // Card es un elemento visual preconfigurado de la biblioteca "material3"
    Card(modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp), elevation = CardDefaults.cardElevation(defaultElevation = 4.dp), colors = CardDefaults.cardColors(containerColor = Color(0xFFE0E0E0))){
        Column(modifier = Modifier.padding(16.dp)){ // organiza el título y la fecha, uno debajo del otro
            Text( // mantenemos un poco el formato
                text = titulo,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp)) // simple separación para que sea más agradable a la vista
            Text( // mantenemos un poco el formato
                text = fecha,
                style = MaterialTheme.typography.bodyMedium,
                color = Color.DarkGray
            )
        }
    }
}


@androidx.compose.ui.tooling.preview.Preview(showBackground = true) // le dice a Android Studio que es exclusivamente para previsualizar un componente
@Composable
fun TarjetaPreview(){ // para probar una tarjeta
    Surface(modifier = Modifier.fillMaxWidth().padding(16.dp)){
        TarjetaActividad(
            titulo = "Correr · 10,00km",
            fecha = "03/09/2026 - 12:00h"
        )
    }
}