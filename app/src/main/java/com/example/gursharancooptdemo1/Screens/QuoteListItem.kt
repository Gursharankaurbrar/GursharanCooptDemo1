package com.example.gursharancooptdemo1.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gursharancooptdemo1.R

@Composable
fun QuoteListItem(){
    Card( modifier = Modifier.padding(8.dp)){
        Row(
            modifier = Modifier.padding(16.dp)
        ){
            Image(
                imageVector = Icons.Filled.FormatQuote,
                colorFilter = ColorFilter.tint(Color.White),
                alignment = Alignment.TopStart,
                contentDescription = "Quote",
                modifier = Modifier
                    .size(40.dp)
                    .rotate(180F)
                    .background(Color.Black)
            )
            Spacer(
                modifier = Modifier.padding(4.dp)
            )
            Column(
                modifier = Modifier.weight(1f)
            ){
                Text(
                    text="Time is money",
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp))

            }
            Box(
                modifier = Modifier.background(Color(0xFFEEEEEE))
                    .fillMaxWidth(.4f)
                    .height(1.dp)
            )
            Text(
                text ="Thero",
                style = MaterialTheme.typography.bodySmall,
                fontWeight = FontWeight.Thin,
                modifier = Modifier.padding(top= 4.dp)
            )
        }
    }

}

@Composable
fun QuoteDetail(){
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
            modifier = Modifier.padding(32.dp)
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
                    text = "Time is money",
                    fontFamily = FontFamily(Font(R.font.montserrat_regular)),
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(Modifier.height(16.dp))
                Text(
                    text = "Thro",
                    fontFamily = FontFamily(Font(R.font.montserrat_regular)),
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}