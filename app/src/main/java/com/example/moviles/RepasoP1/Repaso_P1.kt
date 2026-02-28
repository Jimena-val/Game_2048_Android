package com.example.moviles.RepasoP1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.R

@Composable
@Preview(showBackground = true)
fun ecommerce() {

    Column(modifier= Modifier.fillMaxSize().background(Color.White)) {
        TextField(
            value= "",
            onValueChange = { },
            placeholder = { Text(text = "Color de las zapatillas...") },
            modifier = Modifier.padding(50.dp)
        )
        Spacer(modifier= Modifier.padding(5.dp))
        Text(
            text= "Zapatillas Deportivas",
            fontSize = 35.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold
        )
        Column {
            TenisRosas()
            TenisCafes()
        }
    }
}