package com.ezecalc.botonera.ui.views

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ezecalc.botonera.ui.components.CalculatorButton

@Composable
fun CalculatorScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        val buttons = listOf(
            listOf("1", "2", "3", "+"),
            listOf("4", "5", "6", "-"),
            listOf("7", "8", "9", "*"),
            listOf("0", "C", "=", "/")
        )

        // Usamos un for para recorrer las filas de botones
        for (row in buttons) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                row.forEach { symbol ->
                    // Para cada botón, pasamos una función onClick personalizada
                    CalculatorButton(symbol = symbol, onClick = {
                        // Aquí puedes manejar el evento de clic de cada botón
                        println("Button $symbol clicked")
                    })
                }
            }
            Spacer(modifier = Modifier.height(16.dp)) // Espacio entre filas
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CalculatorScreenPreview() {
    CalculatorScreen()
}