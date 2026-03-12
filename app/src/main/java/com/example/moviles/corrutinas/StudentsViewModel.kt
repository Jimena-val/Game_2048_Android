package com.example.moviles.corrutinas
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import java.lang.Thread.sleep

class StudentsViewModel {

    var winner by mutableStateOf("")

    fun getWinner(){
        winner = ""
        sleep(5000)
        winner = "Juan Perez Perez"
    }
}