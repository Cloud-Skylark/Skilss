package com.example.cloudyapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DetailsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
        , contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Details",
            color = Color.Green,
            fontSize = MaterialTheme.typography.headlineLarge.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)

fun DetailsScreenPreview() {
    DetailsScreen()
}