package com.example.moviles.componentes

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviles.MyTextView

//@Preview(showBackground = true)
@Composable
fun Columnas () {
    Column(verticalArrangement = Arrangement.Bottom,
        modifier = Modifier
            .background(Color.Red)
            .padding(end = 50.dp),
        horizontalAlignment = Alignment.End) {
        Text(text= "Hola")
        Spacer(modifier = Modifier.height(height = 20.dp))
        Text(text= "Adiós")
        Spacer(modifier = Modifier.height(height = 20.dp))
        Text(text= "Cotton")
        Spacer(modifier = Modifier.height(height =20.dp))
    }
}
@Preview(showBackground = true)
@Composable
fun Separadores () {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text= "Palabra1", modifier = Modifier.fillMaxSize().weight(weight = 0.25f))
        Text(text= "Palabra2", modifier = Modifier.fillMaxSize().weight(weight = 0.5f))
        Text(text= "Palabra3", modifier = Modifier.fillMaxSize().weight(weight = 0.25f))
        Columnas()
        MyTextView()
    }
}