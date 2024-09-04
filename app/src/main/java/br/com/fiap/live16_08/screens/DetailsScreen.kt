package br.com.fiap.live16_08.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun DetailsScreen(modifier: Modifier = Modifier, navegador: NavHostController?) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF9C27B0)
    ) {

        Column(
            modifier = Modifier.padding(32.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Details",
                fontSize = 48.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
            Column {
                Button(
                    onClick = {
                        navegador?.navigate("product")
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Products")
                }
                Button(
                    onClick = {
                        navegador?.navigate("login")
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Sair")
                }
            }
        }
    }

}

@Preview
@Composable
private fun DetailsScreenPreview() {
    DetailsScreen(navegador = null)
}