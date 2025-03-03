package com.example.gursharancooptdemo1.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.gursharancooptdemo1.Models.Quote

@Composable
fun QuoteListScreen(data:Array<Quote>, onClick: ()-> Unit){
    Column(){
        Text(text= "My Co-opt Demo 1: Quotes App",
            textAlign = TextAlign.Center,
            modifier =  Modifier.padding(8.dp, 24.dp)
                .fillMaxWidth(1f),
            style = MaterialTheme.typography.bodyMedium)
        QuoteList(data){
            onClick()
        }
    }
}