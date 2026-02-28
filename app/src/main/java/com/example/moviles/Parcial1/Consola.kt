package com.example.moviles.Parcial1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.moviles.R
import com.example.moviles.componentes.Modificador
import com.example.moviles.componentes.getTextColor
import com.example.moviles.componentes.getTileColor


@Composable
@Preview(showBackground = true)
fun consola() {
    Column(modifier = Modifier.padding(8.dp).fillMaxSize().background(Color(color = 0xFF2DB1CD))) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End){
            Image(
                painter = painterResource(R.drawable.power),
                contentDescription = "Imagen de power",
                modifier = Modifier.size(40.dp)
            )
        }

        Row(
            modifier = Modifier.weight(0.1f).fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier.weight(1f).fillMaxSize()
                    .background(color = Color.Black),
                contentAlignment = Alignment.Center
            ) {
            }
            Box(
                modifier = Modifier.weight(1f).fillMaxSize().background(color = Color.Black), contentAlignment = Alignment.Center) {
                Image(painter = painterResource(R.drawable.mii), contentDescription = "Miii")
            }
            Box(
                modifier = Modifier.weight(1f).fillMaxSize()
                    .background(color = Color.Black),
                contentAlignment = Alignment.Center
            ) {
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.weight(0.1f).fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier.weight(1f).fillMaxSize().background(color = Color.Black), contentAlignment = Alignment.Center) {
                Image(painter = painterResource(R.drawable.fireemblem), contentDescription = "Fireemblem")
            }
            Box(
                modifier = Modifier.weight(1f).fillMaxSize()
                    .background(color = Color.Black),
                contentAlignment = Alignment.Center
            ) {
            }
            Box(
                modifier = Modifier.weight(1f).fillMaxSize().background(color = Color.Black), contentAlignment = Alignment.Center) {
                Image(painter = painterResource(R.drawable.sergio_canales), contentDescription = "sergioo")
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.weight(0.1f).fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(
                modifier = Modifier.weight(1f).fillMaxSize()
                    .background(color = Color.Black),
                contentAlignment = Alignment.Center
            ) {
            }
            Box(
                modifier = Modifier.weight(1f).fillMaxSize().background(color = Color.Black), contentAlignment = Alignment.Center) {
                Image(painter = painterResource(R.drawable.sonic), "sonic:)")
            }
            Box(
                modifier = Modifier.weight(1f).fillMaxSize()
                    .background(color = Color.Black),
                contentAlignment = Alignment.Center
            ) {
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                Image(
                    painter = painterResource(R.drawable.up_arrow),
                    contentDescription = "Flechita para atrás",
                    modifier = Modifier.size(40.dp))
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                Image(
                    painter = painterResource(R.drawable.left_arrow),
                    contentDescription = "flechita<-",
                    modifier = Modifier.size(40.dp))
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                Image(
                    painter = painterResource(R.drawable.right_arrow),
                    contentDescription = "flechita->",
                    modifier = Modifier.size(40.dp))
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                Image(
                    painter = painterResource(R.drawable.down_arrow),
                    contentDescription = "flechita abajo",
                    modifier = Modifier.size(40.dp))
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                //--
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                Text(text = "A",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White)
            }
            Box(modifier = Modifier.weight(1f).background(Color(color = 0xFF2DB1CD)), contentAlignment = Alignment.Center){
                Text(text = "B",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White)
            }
        }
        Spacer(modifier = Modifier.padding(50.dp))
    }
}



