package com.example.primerapp2025.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.primerapp2025.components.ActionButton
import com.example.primerapp2025.components.MainButton
import com.example.primerapp2025.components.MainIconButton
import com.example.primerapp2025.components.Spacers
import com.example.primerapp2025.components.TitleView

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
fun DetailView(navController: NavController,id:Int) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Home View",
                    color = Color.White) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Blue
                ),
                navigationIcon = {
                    MainIconButton(Icons.AutoMirrored.Filled.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        },
        floatingActionButton = {
            ActionButton(Color.Black)
        }
    ) {
        ContentView(navController,id)
    }
}

@Composable
private fun ContentView(navController: NavController,id:Int) {
    LazyColumn {
        item {
            Text(
                text = id.toString(),
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        item {
            Text(
                text = id.toString()+"2",
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        item {
            Text(
                text = "Item 3",
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        item {
            Text(
                text = "Item 3",
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        item {
            Text(
                text = "Item 3",
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        item {
            Text(
                text = "Item 3",
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        item {
            Text(
                text = "Item 3",
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
        item {
            Text(
                text = "Item 35",
                modifier = Modifier.padding(64.dp),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}