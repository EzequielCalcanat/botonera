package com.ezecalc.botonera.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorButton(symbol: String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .size(70.dp)
            .background(color = Color(0xFF673AB7), shape = CircleShape)
            .clickable { onClick() } //Por si acaso lo ocupamos jaja
    ) {
        Text(
            text = symbol,
            style = MaterialTheme.typography.bodyLarge.copy(
                fontSize = 24.sp,
                color = Color.White,
                textAlign = TextAlign.Center
            )
        )
    }
}