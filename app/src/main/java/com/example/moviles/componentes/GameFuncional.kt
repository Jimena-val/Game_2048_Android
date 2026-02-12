package com.example.moviles.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import com.example.moviles.R

//Andrea Jimena Valencia González | 20161
@Composable
@Preview(showBackground = true)
fun GameFuntional() {

    // Estados individuales (uno por cada box)
    var b1 by remember { mutableStateOf<Int?>(null) }
    var b2 by remember { mutableStateOf<Int?>(null) }
    var b3 by remember { mutableStateOf<Int?>(null) }
    var b4 by remember { mutableStateOf<Int?>(null) }

    var b5 by remember { mutableStateOf<Int?>(null) }
    var b6 by remember { mutableStateOf<Int?>(null) }
    var b7 by remember { mutableStateOf<Int?>(null) }
    var b8 by remember { mutableStateOf<Int?>(null) }

    var b9 by remember { mutableStateOf<Int?>(null) }
    var b10 by remember { mutableStateOf<Int?>(null) }
    var b11 by remember { mutableStateOf<Int?>(null) }
    var b12 by remember { mutableStateOf<Int?>(null) }

    var b13 by remember { mutableStateOf<Int?>(null) }
    var b14 by remember { mutableStateOf<Int?>(null) }
    var b15 by remember { mutableStateOf<Int?>(null) }
    var b16 by remember { mutableStateOf<Int?>(null) }
    var nombreUsuario by remember { mutableStateOf("") }


    val values = listOf(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16)
    val score = values.filterNotNull().sum()
    val best = values.filterNotNull().maxOrNull() ?: 0

    var gameOver by remember { mutableStateOf(false) }

    if (best > 2048) gameOver = true

    if (gameOver) {
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            //Text("GAME OVER", fontSize = 30.sp, fontWeight = FontWeight.Bold)
            Text(
                text = if (nombreUsuario.isNotEmpty())
                    "$nombreUsuario, sigue participando"
                else
                    "Sigue participando",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                b1=null;b2=null;b3=null;b4=null
                b5=null;b6=null;b7=null;b8=null
                b9=null;b10=null;b11=null;b12=null
                b13=null;b14=null;b15=null;b16=null
                gameOver=false
            }) {
                Text("Play Again")
            }
        }
        return
    }

    fun next(v: Int?): Int = if (v == null) 2 else v * 2

    Column(modifier = Modifier.background(Color(0xFFFAF8F0)).padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {

        Row(modifier = Modifier.fillMaxWidth().background(Color(0xFFEAE7DA)), horizontalArrangement = Arrangement.SpaceEvenly) {
            Text("Score= $score", fontSize = 20.sp)
            Text("Best= $best", fontSize = 20.sp)
        }

        Spacer(modifier = Modifier.height(20.dp))

        // FILA 1
        Row(modifier = Modifier.weight(0.1f).fillMaxSize(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {

            Box(modifier = Modifier.weight(1f).fillMaxSize()
                .background(getTileColor(b1))
                .clickable { b1 = next(b1) },
                contentAlignment = Alignment.Center) {
                if (b1 != null)
                    Text(b1.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b1))
            }

            Box(modifier = Modifier.weight(1f).fillMaxSize()
                .background(getTileColor(b2))
                .clickable { b2 = next(b2) },
                contentAlignment = Alignment.Center) {
                if (b2 != null)
                    Text(b2.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b2))
            }

            Box(modifier = Modifier.weight(1f).fillMaxSize()
                .background(getTileColor(b3))
                .clickable { b3 = next(b3) },
                contentAlignment = Alignment.Center) {
                if (b3 != null)
                    Text(b3.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b3))
            }

            Box(modifier = Modifier.weight(1f).fillMaxSize()
                .background(getTileColor(b4))
                .clickable { b4 = next(b4) },
                contentAlignment = Alignment.Center) {
                if (b4 != null)
                    Text(b4.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b4))
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // FILA 2
        Row(modifier = Modifier.weight(0.1f).fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(getTileColor(b5))
                .clickable { b5 = next(b5) },
                contentAlignment = Alignment.Center) {
                if (b5 != null)
                    Text(b5.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b5))
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(getTileColor(b6))
                .clickable { b6 = next(b6) },
                contentAlignment = Alignment.Center) {
                if (b6 != null)
                    Text(b6.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b6))
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(getTileColor(b7))
                .clickable { b7 = next(b7) },
                contentAlignment = Alignment.Center) {
                if (b7 != null)
                    Text(b7.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b7))
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(getTileColor(b8))
                .clickable { b8 = next(b8) },
                contentAlignment = Alignment.Center) {
                if (b8 != null)
                    Text(b8.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b8))
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // FILA 3
        Row(modifier = Modifier.weight(0.1f).fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(getTileColor(b9))
                .clickable { b9 = next(b9) },
                contentAlignment = Alignment.Center) {
                if (b9 != null)
                    Text(b9.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b9))
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(getTileColor(b10))
                .clickable { b10 = next(b10) },
                contentAlignment = Alignment.Center) {
                if (b10 != null)
                    Text(b10.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b10))
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(getTileColor(b11))
                .clickable { b11 = next(b11) },
                contentAlignment = Alignment.Center) {
                if (b11 != null)
                    Text(b11.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b11))
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(getTileColor(b12))
                .clickable { b12 = next(b12) },
                contentAlignment = Alignment.Center) {
                if (b12 != null)
                    Text(b12.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b12))
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // FILA 4
        Row(modifier = Modifier.weight(0.1f).fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(getTileColor(b13))
                .clickable { b13 = next(b13) },
                contentAlignment = Alignment.Center) {
                if (b13 != null)
                    Text(b13.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b13))
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(getTileColor(b14))
                .clickable { b14 = next(b14) },
                contentAlignment = Alignment.Center) {
                if (b14 != null)
                    Text(b14.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b14))
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(getTileColor(b15))
                .clickable { b15 = next(b15) },
                contentAlignment = Alignment.Center) {
                if (b15 != null)
                    Text(b15.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b15))
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(getTileColor(b16))
                .clickable { b16 = next(b16) },
                contentAlignment = Alignment.Center) {
                if (b16 != null)
                    Text(b16.toString(), fontSize = 32.sp, fontWeight = FontWeight.Bold, color = getTextColor(b16))
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth().background(Color(0xFFEAE7DA)), horizontalArrangement = Arrangement.SpaceEvenly) {
            Image(painter = painterResource(R.drawable.flechita),
                contentDescription = "Flechita para atrás",
                modifier = Modifier
                    .size(40.dp)
                    .clickable(onClick = {
                        b1 = 4
                        b2 = 32
                        b3 = 8
                        b4 = 32

                        b5= null
                        b6= 16
                        b7= 64
                        b8= 4

                        b9= null
                        b10= 2
                        b11= 128
                        b12= 64

                        b13= null
                        b14= null
                        b15= 8
                        b16= null
                    })
            )
            Image(painter = (painterResource(R.drawable.segundapantalla)),
                contentDescription = "Segunda Pantalla",
                modifier = Modifier
                    .size(50.dp)
                    .clickable(onClick = {
                        b1 = 2
                        b2 = 32
                        b3 = 2
                        b4 = 4

                        b5= 4
                        b6= 64
                        b7= 4
                        b8= 128

                        b9= 8
                        b10= 256
                        b11= 512
                        b12= 8

                        b13= 4
                        b14= 8
                        b15= 2
                        b16= 4
                    }))
        }
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = nombreUsuario,
            onValueChange = { nombreUsuario = it },
            placeholder = { Text("Ingresa tu nombre") },
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        )

        Spacer(modifier = Modifier.height(250.dp))
        Text(text = "Andrea Jimena Valencia Gonzáles", fontSize = 15.sp, fontWeight = FontWeight.Light)
        Text(text = "20161", fontSize = 15.sp, fontWeight = FontWeight.Light)
    }
}
fun getTileColor(value: Int?): Color {
    return when (value) {
        null -> Color(0xFFCDC1B4)
        2 -> Color(0xFFEFE4DA)
        4 -> Color(0xFFEDE0C8)
        8 -> Color(0xFFF2B179)
        16 -> Color(0xFFF59563)
        32 -> Color(0xFFF67C5F)
        64 -> Color(0xFFF65E3B)
        128 -> Color(0xFFEDCF72)
        256 -> Color(0xFFEDCC61)
        512 -> Color(0xFFEDC850)
        1024 -> Color(0xFFEDC53F)
        2048 -> Color(0xFFEDC22E)
        else -> Color.Black
    }
}

fun getTextColor(value: Int?): Color {
    return if (value == 2 || value == 4)
        Color(0xFF776E65)
    else
        Color.White
}
