import android.os.Bundle

import androidx.activity.ComponentActivity

import androidx.activity.compose.setContent

import androidx.compose.material3.*

import androidx.compose.runtime.Composable


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContent {

            HolaMundoApp()

        }

    }

}


@Composable

fun HolaMundoApp() {

    MaterialTheme {

        Text(text = "¡Hola Mundo!", style = MaterialTheme.typography.titleLarge)

    }

}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme(dynamicColor = false) {
                HolaMundoApp()
            }

        }
    }
}

@Composable

fun HolaMundoApp() {



    Text(text = "¡Hola Mundo!", style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.primary)



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {

        HolaMundoApp()
    }


}