package com.caleb.IntentCalcWeb.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.caleb.IntentCalcWeb.navigation.ROUTE_CALC
import com.caleb.IntentCalcWeb.navigation.ROUTE_INTENT
import com.caleb.IntentCalcWeb.navigation.ROUTE_WEB

@Composable
fun Home_Screen(navConroller: NavController) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(color = Color.Unspecified)) {
        Text(text = "Welcome to my home Screen",
            fontSize = 35.sp,
            fontFamily = FontFamily.Default,
            fontWeight = FontWeight.ExtraBold,
            color = Color.White
        )
        Spacer(modifier = Modifier.height(150.dp))
        Button(onClick = {navConroller.navigate(ROUTE_WEB)},
            modifier = Modifier.width(300.dp)) {
            Text(text = "Web",
                fontSize = 50.sp,
                fontFamily = FontFamily.Cursive)
        }
        Spacer(modifier = Modifier.height(150.dp))
        Button(onClick = {navConroller.navigate(ROUTE_INTENT)},
            modifier = Modifier.width(300.dp)) {
            Text(text = "Intent",
                fontSize = 50.sp,
                fontFamily = FontFamily.Cursive)
        }
        Spacer(modifier = Modifier.height(150.dp))
        Button(onClick = {navConroller.navigate(ROUTE_CALC)},
            modifier = Modifier.width(300.dp)) {
            Text(text = "Calculator",
                fontSize = 50.sp,
                fontFamily = FontFamily.Cursive)
        }
    }

}

@Preview
@Composable
private fun Home_preview() {
    Home_Screen(rememberNavController())
}