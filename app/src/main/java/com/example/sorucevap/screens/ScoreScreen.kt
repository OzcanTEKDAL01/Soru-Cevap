package com.example.sorucevap.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScoreScreen(
    score : Int,
    totalSoru : Int,
    Yeniden : () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "Sınav Tamamlandı!",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(text = "Skorunuz: $score / $totalSoru",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        Button(onClick = Yeniden) {
            Text("Yeniden Başla")
        }
    }
}