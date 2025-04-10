package com.caleb.IntentCalcWeb.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Home_Screen(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color.Unspecified)) {
        Text(text = "Welcome to home Screen",
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.ExtraBold,
            color = Color.White
        )
        Button(onClick = {/*TODO*/},
            modifier = Modifier.width(300.dp)) {
            Text(text = "Web",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive)
        }
        Button(onClick = {/*TODO*/},
            modifier = Modifier.width(300.dp)) {
            Text(text = "Intent",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive)
        }
        Button(onClick = {/*TODO*/},
            modifier = Modifier.width(300.dp)) {
            Text(text = "Calculator",
                fontSize = 30.sp,
                fontFamily = FontFamily.Cursive)
        }
    }

}

@Preview
@Composable
private fun Home_preview() {
    Home_Screen()
}