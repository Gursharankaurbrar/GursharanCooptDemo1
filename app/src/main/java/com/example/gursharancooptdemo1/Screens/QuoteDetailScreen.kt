package com.example.gursharancooptdemo1.Screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.gursharancooptdemo1.DataManager
import com.example.gursharancooptdemo1.Models.Quote


@Composable
fun QuoteDetail(quote: Quote){

    BackHandler { DataManager.switchPages(null) }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color(0xFFAAAAAA),
                        Color(0xFF888888),
                        Color(0xFF666666)
                    )
                )
            )
    ){
        Card(
            modifier = Modifier.padding(32.dp).width(230.dp)
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(16.dp, 24.dp)
            ){
                Image(
                    imageVector = Icons.Filled.FormatQuote,
                    contentDescription = "Quote",
                    modifier = Modifier.size(80.dp).rotate(180F)
                )
                Text(
                    text = quote.quote,
                    color = Color.Black,
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = quote.author,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}