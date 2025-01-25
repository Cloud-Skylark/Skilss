package com.example.cloudyapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun S3(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "S3",
            fontWeight = FontWeight.Bold,
            color = Color.Blue,
            fontSize = 30.sp
        )
        Button(
            shape = RoundedCornerShape(6.dp),
            onClick = {
                navController.navigate("S4")
            }
        ) { Text("GO TO S4") }

        Button(
            shape = RoundedCornerShape(6.dp),
            onClick = {
                navController.navigate("S2")
            }
        ) { Text("<GO TO S2") }

        Button(
            shape = RoundedCornerShape(6.dp),
            onClick = {
                navController.navigate("S1")
            }
        ) { Text("<==GO TO S1") }
    }
}
