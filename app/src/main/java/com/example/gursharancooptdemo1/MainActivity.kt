package com.example.gursharancooptdemo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gursharancooptdemo1.Screens.QuoteDetail
import com.example.gursharancooptdemo1.Screens.QuoteListScreen
import com.example.gursharancooptdemo1.ui.theme.GursharanCooptDemo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        DataManager.loadAssetsFromFile(this )
        setContent {
            App()
        }
    }
}

@Composable
fun App(){
    if(DataManager.isDataLoaded.value){
        if(DataManager.currentPage.value == Pages.LISTING){
          QuoteListScreen(data = DataManager.data){
              DataManager.switchPages(it)
          }
        }
        else{
            DataManager.currentQuote?.let { QuoteDetail(quote = it) }
        }
    }
}

enum class Pages{
    LISTING,
    DETAIL
}

