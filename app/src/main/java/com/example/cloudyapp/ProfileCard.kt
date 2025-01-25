package com.example.cloudyapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ProfileCard(navController: NavController) {
    val backgroundColor = Color.White.copy(alpha = 0.3f)
    val shape = RoundedCornerShape(16.dp)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color.Cyan, Color.Magenta)
                )
            )
    ) {
        Box(
            modifier = Modifier
                .padding(start = 16.dp, top = 120.dp, end = 16.dp)
                .clip(shape)
                .background(backgroundColor)
                .border(1.dp, Color.White.copy(alpha = 0.3f), shape)
                .height(520.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 26.dp)
            ) {
                Button(
                    modifier = Modifier.padding(bottom = 26.dp),
                    shape = RoundedCornerShape(4.dp),
                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                    border = BorderStroke(1.dp, Color.White.copy(alpha = 0.3f)),
                    elevation = ButtonDefaults.buttonElevation(100.dp),
                    onClick = {
                        navController.navigate("DetailsScreen")
                    }
                ) {
                    Text(
                        text = "About    ",
                        fontWeight = FontWeight.Bold
                    )
                }
                Button(
                    modifier = Modifier.padding(bottom = 26.dp),
                    shape = RoundedCornerShape(4.dp),
                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                    border = BorderStroke(1.dp, Color.White.copy(alpha = 0.3f)),
                    elevation = ButtonDefaults.buttonElevation(100.dp),
                    onClick = {
                        navController.navigate("Skills")
                    }
                ) {
                    Text(
                        text = "Explore ",
                        fontWeight = FontWeight.Bold
                    )
                }
                Button(
                    modifier = Modifier.padding(bottom = 26.dp),
                    shape = RoundedCornerShape(4.dp),
                    colors = ButtonDefaults.buttonColors(Color.Transparent),
                    border = BorderStroke(1.dp, Color.White.copy(alpha = 0.3f)),
                    elevation = ButtonDefaults.buttonElevation(100.dp),
                    onClick = {
                        navController.navigate("HomeScreen")
                    }
                ) {
                    Text(
                        text = "Project  ",
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}