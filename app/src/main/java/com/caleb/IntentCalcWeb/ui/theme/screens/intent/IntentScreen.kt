package com.caleb.IntentCalcWeb.ui.theme.screens.intent

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.provider.MediaStore
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Intent_Screen(navConroller: NavController) {
    val context= LocalContext.current
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
        OutlinedButton(onClick = {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+25470390159015"))

            if (ContextCompat.checkSelfPermission(
                    context,
                    android.Manifest.permission.CALL_PHONE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    context as Activity,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    1
                )
            } else {
                context.startActivity(intent)
            }},
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "CALL",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }
        Spacer(modifier = Modifier.height(45.dp))
        OutlinedButton(onClick = {
            val phone = "+254703901595"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            context.startActivity(intent)
        },
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "DAIL",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }
        Spacer(modifier = Modifier.height(45.dp))
        OutlinedButton(onClick = {
            val uri = Uri.parse("smsto:070390155")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "How is todays weather")

            context.startActivity(intent)
        },
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "SMS",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }
        Spacer(modifier = Modifier.height(45.dp))
        OutlinedButton(onClick = {
                val simToolKitLaunchIntent =
                    context.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { context.startActivity(it) }
        },
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "STK",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }
        Spacer(modifier = Modifier.height(45.dp))
        OutlinedButton(onClick = {
            val emailIntent=
                Intent(Intent.ACTION_SENDTO, Uri.fromParts
                    ("malito","calebcak7@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Subject")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Body")
            context.startActivity(emailIntent)

        },
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "EMAIL",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }
        Spacer(modifier = Modifier.height(45.dp))
        OutlinedButton(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            context.startActivity(shareIntent)
        },
            colors = ButtonDefaults.buttonColors(androidx.compose.ui.graphics.Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "SHARE",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif, color = androidx.compose.ui.graphics.Color.Black)
        }
        Spacer(modifier = Modifier.height(45.dp))
        OutlinedButton(onClick = {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(context as Activity,takePictureIntent,1,null)
        },
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