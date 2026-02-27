package com.example.moviles.RepasoP1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
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
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.R

@Composable
@Preview(showBackground = true)
fun TenisCafes() {
    var textoboton by remember {
        mutableStateOf(
            "Agregar al carrito"
        )
    }
    Column(modifier = Modifier.fillMaxWidth().padding(1.dp).background(Color.LightGray)) {
        Row(modifier= Modifier.padding(1.dp).align(Alignment.CenterHorizontally)) {
            Image(
                painter = painterResource(R.drawable.teniscafes),
                contentDescription = "imagen_producto",
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.CenterVertically)
            )
        }
        Row (modifier = Modifier.padding(1.dp).align(Alignment.CenterHorizontally)){
            Column {
                Spacer(modifier = Modifier.padding(1.dp))
                Text(
                    text = "Nuevo  |  +10mil vendidos",
                    fontSize = 12.sp,
                    fontStyle = FontStyle.Italic,
                    color = Color.Gray,
                    textAlign = TextAlign.Center,
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = "C H L O E",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "ZAPATILLAS DEPORTIVAS",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text= "Color Cafe",
                    fontSize = 10.sp,
                    )
                Spacer(modifier= Modifier.padding(5.dp))
                Text(
                    text = "$1,670.00 MXN",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
                Button(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    onClick = {
                        if (textoboton == "Agregar al carrito") {
                            textoboton = "Quitar del carrito"
                        } else {
                            textoboton = "Agregar al carrito"
                        } }
                )
                {
                    Text(text = textoboton)
                }
            }

        }
    }
}

