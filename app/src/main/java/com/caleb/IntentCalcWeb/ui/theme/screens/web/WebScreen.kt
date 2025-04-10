package com.caleb.IntentCalcWeb.ui.theme.screens.web

import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun Web_Screen(navConroller: NavController) {
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.
        fillMaxSize()
            .background(_root_ide_package_.androidx.compose.ui.graphics.Color.Black)) {
        Text(text = "Web Screen",
            fontWeight = FontWeight.ExtraBold,
            color = Color.Yellow,
            fontSize = 50.sp,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(onClick = {/*TODO*/},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "Youtube",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }
        }

}

@Preview
@Composable
private fun Web_prev() {
    Web_Screen(rememberNavController())
}
