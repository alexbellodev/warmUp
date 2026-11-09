// ~ paquete principal de la aplicación ~ //
package com.example.warmup

// ~ librerías ~ //
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

// imports de otro TarjetaActividad.kt
import com.example.warmup.ui.components.ActividadData
import com.example.warmup.ui.components.TarjetaActividad

class MainActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)

        // Jetpack Compose, a partir de aquí termina XML clásico
        setContent{
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background){ // color del background
                // column permite apilar título y fecha uno encima del otro
                Column(modifier = Modifier.fillMaxSize().padding(16.dp)){
                    Text(
                        text = "Actividades",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )

                    // tarjetas de ejemplo para el listado
                    /*
                        título
                        fecha
                     para hacerlo más legible
                     */
                    TarjetaActividad(
                        data = ActividadData(
                            titulo = "Correr · 10,00km",
                            fecha = "03/09/2026 - 12:00h")
                    )
                    TarjetaActividad(
                        data = ActividadData(
                            titulo = "Senderismo · 22,32km",
                            fecha = "28/08/2026 - 10:15h")
                    )
                    TarjetaActividad(
                        data = ActividadData(
                            titulo = "Ciclismo · 120,01km",
                            fecha = "26/08/2026 - 09:00h")
                    )
                }
            }
        }
    }
}