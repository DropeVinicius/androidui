package br.com.fiap.live16_08

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.fiap.live16_08.screens.DetailsScreen
import br.com.fiap.live16_08.screens.LoginScreen
import br.com.fiap.live16_08.screens.ProductScreen
import br.com.fiap.live16_08.ui.theme.Live1608Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Live1608Theme {

                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = "login"
                ){
                    composable(route = "login"){ LoginScreen(navegador = navController) }
                    composable(route = "product"){ ProductScreen(navegador = navController) }
                    composable(route = "details"){ DetailsScreen(navegador = navController) }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Live1608Theme {
        Greeting("Android")
    }
}