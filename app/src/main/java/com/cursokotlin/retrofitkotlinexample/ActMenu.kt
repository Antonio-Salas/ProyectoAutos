package com.cursokotlin.retrofitkotlinexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_menu)
    }

    fun tbl01(view: View){
        // Aquí van las acciones del botón
        val tabla01 = Intent(this, tbl01_pgn01::class.java)
        startActivity(tabla01)
    }
}