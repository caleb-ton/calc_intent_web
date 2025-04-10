package com.caleb.IntentCalcWeb.ui.theme.screens.calc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Calc_Screen(navConroller: NavController) {
    var firstnum by remember { mutableStateOf(TextFieldValue("")) }
    var secondnum by remember { mutableStateOf(TextFieldValue("")) }
    var answer by remember { mutableStateOf("") }
    Column (verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Unspecified)){
        Text(text = "Calculate here",
            fontWeight = FontWeight.ExtraBold,
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(value =firstnum ,
            onValueChange={firstnum=it},
            label = {Text(text = "Enter First Digit.",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Magenta)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(5.dp))

        OutlinedTextField(value =secondnum ,
            onValueChange={secondnum=it},
            label = {Text(text = "Enter Second Digit.",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Magenta)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedButton(onClick = {
            val myfirstnum=firstnum.text.trim()
            val mysecondnum=secondnum.text.trim()
            if (myfirstnum.isEmpty()|| mysecondnum.isEmpty()) {
                answer = "Please fill in all details"
            }else{
                val my_answer=myfirstnum.toDouble() + mysecondnum.toDouble()
                answer=my_answer.toString()
            }
            }
        ,
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "+",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = Color.Black)
        }
        Spacer(modifier = Modifier.height(5.dp))

        OutlinedButton(onClick = {val myfirstnum=firstnum.text.trim()
            val mysecondnum=secondnum.text.trim()
            if (myfirstnum.isEmpty() || mysecondnum.isEmpty()) {
                answer = "Please fill in all details"
            }else{
                val my_answer=myfirstnum.toDouble() - mysecondnum.toDouble()
                answer=my_answer.toString()
            }
        },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "-",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = Color.Black)
        }
        Spacer(modifier = Modifier.height(5.dp))

        OutlinedButton(onClick = {val myfirstnum=firstnum.text.trim()
            val mysecondnum=secondnum.text.trim()
            if (myfirstnum.isEmpty() || mysecondnum.isEmpty()) {
                answer = "Please fill in all details"
            }else{
                val my_answer=myfirstnum.toDouble() * mysecondnum.toDouble()
                answer=my_answer.toString()
            }
        },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "*",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = Color.Black)
        }
        Spacer(modifier = Modifier.height(5.dp))

        OutlinedButton(onClick = {val myfirstnum=firstnum.text.trim()
            val mysecondnum=secondnum.text.trim()
            if (myfirstnum.isEmpty() || mysecondnum.isEmpty()) {
                answer = "Please fill in all details"
            }else{
                val my_answer=myfirstnum.toDouble() / mysecondnum.toDouble()
                answer=my_answer.toString()
            }
        },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "/",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = Color.Black)
        }
        Text(text = answer,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Red,
            fontSize = 50.sp,
            fontFamily = FontFamily.SansSerif
        )
    }

}

@Preview
@Composable
private fun Calc_prev() {
    Calc_Screen(rememberNavController())
}