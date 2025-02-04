package com.example.sorucevap.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.sorucevap.data.SoruData

@Composable
fun QuizScreen() {
    var currenSoruIndex by remember { mutableStateOf(0) }
    var sonuc by remember { mutableStateOf(0) }
    var showscore by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        if (!showscore) {
            Text(
                text = "Soru ${currenSoruIndex + 1} / ${SoruData.sorular.size}",
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = SoruData.sorular[currenSoruIndex].soru,
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 16.dp)
            )

            SoruData.sorular[currenSoruIndex].sıklar.forEachIndexed { index, sık ->
                Button(
                    onClick = {
                        if (index == SoruData.sorular[currenSoruIndex].cevap) {
                            sonuc++
                        }
                        if (currenSoruIndex < SoruData.sorular.size - 1){
                            currenSoruIndex++
                        }else{
                            showscore = true
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ) {
                    Text(text = sık)
                }
            }
        } else {
            ScoreScreen(
                score = sonuc,
                totalSoru = SoruData.sorular.size,
                Yeniden = {
                    sonuc = 0
                    currenSoruIndex = 0
                    showscore = false
                })
        }
    }
}