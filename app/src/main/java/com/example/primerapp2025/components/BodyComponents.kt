package com.example.primerapp2025.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun TitleView(name:String){
    Text(text = name,
        fontSize = 50.sp,
        color = Color.DarkGray)
}