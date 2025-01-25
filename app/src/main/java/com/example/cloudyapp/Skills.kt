package com.example.cloudyapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Skills() {
    val items = listOf(
        Triple(R.drawable.c_icon_pic, "C Language", "C With DSA"),
        Triple(R.drawable.cpp_icon_pic, "Cpp", "C++ With STL"),
        Triple(R.drawable.python_img, "Python", "Basic Python"),
        Triple(R.drawable.java_icon_pic, "Java", "Java With android"),
        Triple(R.drawable.kotlin_icon_pic, "Kotlin", "Kotlin and jecpack"),
        Triple(R.drawable.unity_icon_pic, "Unity", "Game development"),
        Triple(R.drawable.html_icon_pic, "Html", "Web Devlopmen"),
        Triple(R.drawable.css_icon_pic, "Html", "Web Devlopmen"),
        Triple(R.drawable.sql_icon_pic, "Sql", "Server side")
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color.Blue, Color.Magenta)
                )
            )
    ) {
//        Image(
//            painter = painterResource(R.drawable.my_pic),
//            contentDescription = "my pic",
//            contentScale = ContentScale.FillHeight,
//            modifier = Modifier
//                .fillMaxSize()
//                .alpha(0.4f)
//                .blur(8.dp, 8.dp)
//        )
        Column(
            modifier = Modifier
                .height(700.dp)
                .fillMaxWidth()
                .padding(top = 100.dp)
//                .border(1.dp, Color.Red)
        ) {
            Text(
                text = "Skill and Languages",
                fontSize = 24.sp,
                fontWeight = FontWeight(800),
                fontFamily = FontFamily.Default,
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterHorizontally)
                    .padding(bottom = 20.dp)
            )
            LazyVerticalGrid(
                columns = GridCells.Fixed(1),
                modifier = Modifier.fillMaxSize()
            ) {
                items(items.size) { index ->
                    val (imageRes, text, description) = items[index]
                    GlassCard(imageRes, text, description)
                }
            }
        }
    }
}

@Composable
fun GlassCard(imageRes: Int, text: String, description: String) {
    val backgroundColor = Color.White.copy(alpha = 0.3f)
    val shape = RoundedCornerShape(16.dp)

    Box(
        modifier = Modifier
            .padding(16.dp)
            .clip(shape)
            .background(backgroundColor)
            .border(1.dp, Color.White.copy(alpha = 0.3f), shape)
            .height(110.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(imageRes),
                contentDescription = text,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)
                    .padding(bottom = 8.dp)
            )
            Text(
                text = text,
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold // Make the course name bold
            )
            Text(
                text = description,
                color = Color.White,
                fontSize = 12.sp // Normal style for the description
            )
        }
    }
}
