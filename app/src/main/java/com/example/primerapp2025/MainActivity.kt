package com.example.primerapp2025

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
//import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    Column /*modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center*/{
    PrimerApp2025Theme {
        SimpleImage()
        CircleImageView()
        RoundCornerImageView()
        ImageWithBackgroundColor()
    }
}
}
@Composable
fun SimpleImage() {
    Image(
        painter = painterResource(id = R.drawable.pelon),
        contentDescription = "Andy Rubin",
        modifier = Modifier.fillMaxWidth()
    )
}
@Composable fun CircleImageView() {
    Image( painter = painterResource(R.drawable.pelon),
        contentDescription = "Circle Image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(128.dp)
            .clip(CircleShape)
            .border(5.dp, Color.Gray, CircleShape)
    )
}
@Composable
fun RoundCornerImageView() {
    Image(
        painter = painterResource(R.drawable.pelon),
        contentDescription = "Round corner image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(128.dp)
            .clip(RoundedCornerShape(10))
            .border(5.dp, Color.Gray, RoundedCornerShape(10))
    )
}
@Composable
fun ImageWithBackgroundColor() {
    Image(
        painter = painterResource(id = R.drawable.cart_24),
        contentDescription = "",
        modifier = Modifier
            .size( 200.dp)
            .background(Color.DarkGray)
            .padding(20.dp)
    )
}