package com.example.practicamarcosmerino

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicamarcosmerino.ui.theme.PracticaMarcosMerinoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Col()
        }
    }
}


@Composable
fun Col() {
    var contador by remember { mutableStateOf(0) }
    LazyColumn(
        modifier = Modifier.fillMaxSize().background(color = Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        item {
                Image(
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                        .padding(20.dp),
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = "pfp"
                )
        }
        item {
            Text(
                text = "Marcos",
                modifier = Modifier.fillMaxSize(),
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 30.sp
            )
            Text(
                text = "Merino",
                modifier = Modifier.fillMaxSize(),
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 30.sp
            )
            Text(
                text = "Calle callez 26",
                modifier = Modifier.fillMaxSize(),
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 30.sp
            )
            Text(
                text = "676767676",
                modifier = Modifier.fillMaxSize(),
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 30.sp
            )
        }
        item {
            LazyRow() {
                item {
                    Text(
                        text = "19 años",
                        modifier = Modifier.fillMaxSize().padding(start = 10.dp, end = 10.dp),
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp
                    )
                }
                item {
                    Text(
                        text = "Valladolid",
                        modifier = Modifier.fillMaxSize().padding(start = 10.dp, end = 10.dp),
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp
                    )
                }
                item {
                    Text(
                        text = "DAM2",
                        modifier = Modifier.fillMaxSize().padding(start = 10.dp, end = 10.dp),
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp
                    )
                }
            }
        }
        item {
            Image(
                modifier = Modifier
                    .padding(20.dp)
                    .size(100.dp)
                    .clickable{contador++},
                painter = painterResource(R.drawable.baseline_casino_24),
                contentDescription = "btn"
            )
        }
        item {
            Text(
                text = contador.toString(),
                modifier = Modifier.fillMaxSize().padding(start = 10.dp, end = 10.dp),
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
}