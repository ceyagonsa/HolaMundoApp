package com.example.holamundoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
// Add this import (adjust the path if your theme is in a different sub-package)
import com.example.holamundoapp.ui.theme.HolaMundoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // Change MyApplicationTheme to HolaMundoAppTheme
            HolaMundoAppTheme(dynamicColor = false) {
                HolaMundoApp()
            }
        }
    }
}

@Composable
fun HolaMundoApp() {
    Text(
        text = "¡Hola Mundo!",
        style = MaterialTheme.typography.titleLarge,
        color = MaterialTheme.colorScheme.primary
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    // Change here as well
    HolaMundoAppTheme {
        HolaMundoApp()
    }
}
