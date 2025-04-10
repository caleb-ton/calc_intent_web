package com.caleb.IntentCalcWeb.ui.theme.screens.intent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Intent_Screen(navConroller: NavController) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()){
        Text(text = "Intent Screen",
            fontWeight = FontWeight.ExtraBold,
            color = androidx.compose.ui.graphics.Color.Yellow,
            fontSize = 50.sp,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(70.dp))
        OutlinedButton(onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "CALL",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }
        Spacer(modifier = Modifier.height(45.dp))
        OutlinedButton(onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "DAIL",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }
        Spacer(modifier = Modifier.height(45.dp))
        OutlinedButton(onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "SMS",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }
        Spacer(modifier = Modifier.height(45.dp))
        OutlinedButton(onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "STK",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }
        Spacer(modifier = Modifier.height(45.dp))
        OutlinedButton(onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "EMAIL",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }
        Spacer(modifier = Modifier.height(45.dp))
        OutlinedButton(onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "SHARE",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }
        Spacer(modifier = Modifier.height(45.dp))
        OutlinedButton(onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "CAMERA",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }



    }
}

@Preview
@Composable
private fun Intent_prev() {
    Intent_Screen(rememberNavController())
}