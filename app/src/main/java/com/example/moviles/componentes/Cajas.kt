package com.example.moviles.componentes

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)

fun Cajas (){
    Capainterna (alignment = Alignment.TopStart)
    Capainterna (alignment = Alignment.BottomEnd)
}
@Composable
fun Capainterna(alignment: Alignment){
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = alignment) {
        Box(modifier = Modifier.size(size = 300.dp)){
            Text(text= "1", Modifier.background(color = Color.Blue).align(Alignment.TopStart).size(size = 40.dp), color = Color.White)
            Text(text= "2", Modifier.background(color = Color.Red).align(Alignment.TopCenter).size(size = 40.dp), color = Color.Black)
            Text(text= "3", Modifier.background(color = Color.Gray).align(Alignment.TopEnd).size(size = 40.dp), color = Color.White)
            Text(text= "4", Modifier.background(color = Color.Green).align(Alignment.CenterStart).size(size = 40.dp), color = Color.White)
            Text(text= "5", Modifier.background(color = Color.Magenta).align(Alignment.Center).size(size = 40.dp), color = Color.LightGray)
            Text(text= "6", Modifier.background(color = Color.Cyan).align(Alignment.CenterEnd).size(size = 40.dp), color = Color.Blue)
            Text(text= "7", Modifier.background(color = Color.Yellow).align(Alignment.BottomStart).size(size = 40.dp), color = Color.Black)
            Text(text= "8", Modifier.background(color = Color.DarkGray).align(Alignment.BottomCenter).size(size = 40.dp), color = Color.White)
            Text(text= "9", Modifier.background(color = Color.Black).align(Alignment.BottomEnd).size(size = 40.dp), color = Color.White)
        }
    }
}