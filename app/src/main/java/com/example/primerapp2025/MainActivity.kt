package com.example.primerapp2025

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.primerapp2025.ui.theme.PrimerApp2025Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimerApp2025Theme {
                GreetingPreview()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Content(mensaje1= "Hola", mensaje2= "amigo")
}
@Composable
fun Content(mensaje1: String,mensaje2: String){
   Column {
        Text(mensaje1, fontSize = 30.sp)
        Text(mensaje2, lineHeight = 30.sp)
        Text("Ivan", fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            lineHeight = 32.sp)
    }
}