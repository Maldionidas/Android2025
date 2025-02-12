package com.example.primerapp2025

import android.os.Bundle
import android.provider.SyncStateContract.Columns
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
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
    Column{
        //TextFieldSencillo()
        //TextFieldPlaceHolder()
        //outLineTextFieldSample()
        TextFieldWithIcon()
    }

}
@Composable
fun TextFieldSencillo() {
    var text by remember {mutableStateOf("")}

        Column {
            TextField(
                value = text,
                onValueChange = { newText -> text = newText },
                label = { Text("Introduce tu nombre") },
                placeholder = {Text("")}
            )
        }

    Text(text = "Tu nombre es: $text")

}
@Composable
fun TextFieldPlaceHolder() {
    var text by remember {mutableStateOf("")}

    Column {
        TextField(
            value = text,
            onValueChange = { newText -> text = newText },
            label = { Text("Telefono") },
            placeholder = {Text("Introduce tu numero telefonico")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
    }

    Text(text = "Tu numero es: $text")
}
@Composable
fun outLineTextFieldSample() {
    var text by remember { mutableStateOf("") }
    Column {
        OutlinedTextField(value = text,
            label = { Text(text="Enter your name") },
            onValueChange = {
                text = it
            }
            )
        Text(text = "Tu nombre es: $text")
    }

}
@Composable
fun TextFieldWithIcon() {
    var text by remember { mutableStateOf("") }
    Column {
        OutlinedTextField(value = text,
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email,
                    contentDescription = "emailIcon")
        },
            label = { Text(text="Email address") },
            onValueChange = {
                text = it
            },
            placeholder = {text = "Enter you email"}
        )
        Text(text = "Tu email es: $text")
    }

}