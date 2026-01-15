package com.example.holamundoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge // 1. Faltaba este import
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview // 2. Faltaba este import
import com.example.holamundoapp.ui.theme.HolaMundoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HolaMundoAppTheme (dynamicColor = false) {
                // He añadido un Surface para que el fondo se gestione correctamente
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HolaMundoApp()
                }
            }
        }
    }
}

@Composable
fun HolaMundoApp() {
    // He añadido un modificador para centrar el texto (opcional pero recomendable)
    Text(
        text = "¡Hola Mundo!",
        style = MaterialTheme.typography.titleLarge,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.wrapContentSize()
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HolaMundoAppTheme {
        HolaMundoApp()
    }
}