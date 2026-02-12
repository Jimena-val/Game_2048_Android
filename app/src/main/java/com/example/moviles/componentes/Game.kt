package com.example.moviles.componentes

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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun Game() {
    Column(
        modifier = Modifier.background(Color(0xFFBBADA0)).padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .weight(0.1f).fillMaxSize(), horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(modifier = Modifier.clickable(onClick = {

            }).weight(1f).fillMaxSize().background(Color(0xFFEDE0C8)), contentAlignment = Alignment.Center) {
                Text(text = "4", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color(0xFF776E65))
            }
            Box(modifier = Modifier.weight(1f).fillMaxSize().background(Color(0xFFF67C5F)), contentAlignment = Alignment.Center) {
                Text(text = "32", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color(0xFFF2B179)), contentAlignment = Alignment.Center) {
                Text(text = "8", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color(0xFFF67C5F)), contentAlignment = Alignment.Center) {
                Text(text = "32", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }
        }
        Spacer(modifier = Modifier.height(8.dp))

        Row(modifier = Modifier.weight(0.1f).fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color(0xFFF59563)), contentAlignment = Alignment.Center) {
                Text(text = "16", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color(0xFFF65E3B)), contentAlignment = Alignment.Center) {
                Text(text = "64", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight()
                .background(Color(0xFFEEE4DA)), contentAlignment = Alignment.Center) {
                Text(text = "2", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color(0xFF776E65))
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color(0xFFEDCF72)), contentAlignment = Alignment.Center) {
                Text(text = "128", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(modifier = Modifier.weight(0.1f).fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color(0xFFCDC1B4)), contentAlignment = Alignment.Center
            ) {
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color(0xFFF65E3B)), contentAlignment = Alignment.Center) {
                Text(text = "64", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }

            Box(
                modifier = Modifier.weight(1f).fillMaxHeight().background(Color(0xFFF2B179)), contentAlignment = Alignment.Center) {
                Text(text = "8", fontSize = 32.sp, fontWeight = FontWeight.Bold, color = Color.White)
            }

            Box(modifier = Modifier.weight(1f).fillMaxHeight().background(Color(0xFFCDC1B4)), contentAlignment = Alignment.Center) {
            }
        }
        Spacer(modifier = Modifier.height(450.dp))
    }
}