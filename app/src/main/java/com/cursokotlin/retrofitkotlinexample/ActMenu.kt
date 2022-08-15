package com.cursokotlin.retrofitkotlinexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ActMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_menu)

        // my_child_toolbar is defined in the layout file
        setSupportActionBar(findViewById(R.id.act_menu_toolbar))

        // Get a support ActionBar corresponding to this toolbar and enable the Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    fun menu_ir_tbl01(view: View){
        // Aquí van las acciones del botón
        val tabla01 = Intent(this, tbl01_pgn01::class.java)
        startActivity(tabla01)
    }

    fun menu_ir_tbl02(view: View){
        // Aquí van las acciones del botón
        val tabla01 = Intent(this, tbl02_pgn01::class.java)
        startActivity(tabla01)
    }

    fun menu_ir_tbl03(view: View){
        // Aquí van las acciones del botón
        val tabla01 = Intent(this, tbl03_pgn01::class.java)
        startActivity(tabla01)
    }

    fun menu_ir_tbl04(view: View){
        // Aquí van las acciones del botón
        val tabla01 = Intent(this, tbl04_pgn01::class.java)
        startActivity(tabla01)
    }

}