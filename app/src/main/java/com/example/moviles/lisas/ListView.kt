package com.example.moviles.lisas

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviles.R
import com.example.moviles.componentes.Modificador
import com.example.moviles.lists.ProductView

@Composable
@Preview(showBackground = true)

fun ListView() {
    //Column(){
    //ProductView(imagen = R.drawable.alien, nombre = "Alienware 16 Aurora", descriptor = "Laptop AC16250", calificación = 4.4f, precio = 31299, fecha = "Llega el viernes")
    //ProductView(imagen = R.drawable.alien, nombre = "Alienware 16 Aurora", descriptor = "Laptop AC16250", calificación = 4.4f, precio = 31299, fecha = "Llega el viernes")
    //ProductView(imagen = R.drawable.alien, nombre = "Alienware 16 Aurora", descriptor = "Laptop AC16250", calificación = 4.4f, precio = 31299, fecha = "Llega el viernes")
    //ProductView(imagen = R.drawable.alien, nombre = "Alienware 16 Aurora", descriptor = "Laptop AC16250", calificación = 4.4f, precio = 31299, fecha = "Llega el viernes")

    //}
//}
    val productVM = ProductViewModel()
    var estado by remember { mutableStateOf(0) }
    fun cambioColor(): Color{
        return if(estado== 0) Color.Black else Color.DarkGray
    }
    Column(modifier = Modifier.fillMaxSize()) {
        LazyColumn(modifier = Modifier.background(cambioColor()).padding(30.dp)) { //cambiar LazyColumn por LazyRow para convertirlo en un carruzel
            items(productVM.getProducts()) { producto ->
                ProductView(producto, selected = {
                    Log.d("EVENTO", "Probando el evento del producto")
                    estado = 1
                })
            }
            item { Text(text = "adios") }
        }
    }
}
