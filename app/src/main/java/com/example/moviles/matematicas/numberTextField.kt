package com.example.moviles.matematicas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import java.util.Arrays.fill

@Composable
@Preview(showBackground = true)

fun numbertextfield (mofificador: Modifier, fill:(String)-> Unit ){
    var number by remember { mutableStateOf("") }
    Column(Modifier.background(Color.Blue)) {
        Text("Ingresa un numero")
        TextField(value = number, onValueChange = {textoEscrito ->
            //val upper = textoEscrito.uppercase()
            if(textoEscrito.toIntOrNull() != null){
                number = textoEscrito.toInt().toString()
                fill(number)
            }
        } )
    }
}

@Preview
@Composable
fun numbertextpreview() {
    var texto by remember {mutableStateOf("")}
    Column(){
        Text(texto)
        numbertextfield(Modifier.fillMaxWidth()) { }
        val it = ""
        texto = it
    }
}