package com.example.sorucevap.data

import com.example.sorucevap.model.Soru

object SoruData {
    val sorular = listOf(
        Soru(
            soru = "Türkiye'nin başkenti neresidir?",
            sıklar = listOf("Adana", "İstanbul", "Ankara", "İzmir","Van"),
            cevap = 2
        ),
        Soru(
            soru = "2+2 kaçtır?",
            sıklar = listOf("3","4","5","6","7"),
            cevap = 1
        ),
        Soru(
            soru = "Hangi gezegen güneş sisteminde üçüncü sıradadır?",
            sıklar = listOf("Dünya","Satürn","Mars","Venüs","Merkür"),
            cevap = 0
        ),
        Soru(
            soru = "Dünyanın uydusunun adı nedir?",
            sıklar = listOf("Mars","Satürn","Merkür","Venüs","Ay"),
            cevap = 4
        ),
        Soru(
            soru = "Su kaç derecede donar?",
            sıklar = listOf("10","20","25","0","15"),
            cevap = 3
        ),
        Soru(
            soru = "En büyük okyanus hangisidir?",
            sıklar = listOf("Pasifik Okyanusu","Atlantik Okyanusu","Kuzey Kutbu","Hint Okyanusu","Antarktika"),
            cevap = 0
        ),
        Soru(
            soru = "Elektriği icat eden bilim insanı kimdir?",
            sıklar = listOf("Graham Bell","Nicolas Tesla","Elon Musk","Thomas Edison","Newton"),
            cevap = 3
        ),
        Soru(
            soru = "Dünyanın en yüksek dağı hangisidir?",
            sıklar = listOf("Erciyes Dağı","Everest Dağı","Ağrı Dağı","Makalu","Godwin Austen"),
            cevap = 1
        ),

    )
}