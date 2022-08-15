package com.cursokotlin.retrofitkotlinexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner

class tbl04_pgn01 : AppCompatActivity() {

    fun ir_tbl05pgn01(view: View){
        // Aquí van las acciones del botón
        val tabla01 = Intent(this, tbl05_pgn01::class.java)
        startActivity(tabla01)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tbl04_pgn01)

// *************************************************************************************************
// 1ER CAMPO - RADIADOR
// *************************************************************************************************
        val spinner01C01: Spinner = findViewById(R.id.spinner01C01)
        val arrayAdapter01C01 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_evaluacion,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner01C01.adapter = adapter
        }

        val spinner02C01: Spinner = findViewById(R.id.spinner02C01)
        val arrayAdapter02C01 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_valores,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner02C01.adapter = adapter
        }
// *************************************************************************************************
// 2DO CAMPO - TAPON DE RADIADOR
// *************************************************************************************************
        val spinner01C02: Spinner = findViewById(R.id.spinner01C02)
        val arrayAdapter01C02 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_evaluacion,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner01C02.adapter = adapter
        }

        val spinner02C02: Spinner = findViewById(R.id.spinner02C02)
        val arrayAdapter02C02 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_valores,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner02C02.adapter = adapter
        }

// *************************************************************************************************
// 3ER CAMPO - DEFORMIDADES O GOLPES
// *************************************************************************************************

        val spinner01C03: Spinner = findViewById(R.id.spinner01C03)
        val arrayAdapter01C03 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_evaluacion,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner01C03.adapter = adapter
        }

        val spinner02C03: Spinner = findViewById(R.id.spinner02C03)
        val arrayAdapter02C03 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_valores,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner02C03.adapter = adapter
        }

// *************************************************************************************************
// 4TO CAMPO - MANGUERAS Y DUCTOS
// *************************************************************************************************

        val spinner01C04: Spinner = findViewById(R.id.spinner01C04)
        val arrayAdapter01C04 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_evaluacion,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner01C04.adapter = adapter
        }

        val spinner02C04: Spinner = findViewById(R.id.spinner02C04)
        val arrayAdapter02C04 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_valores,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner02C04.adapter = adapter
        }

// *************************************************************************************************
// 5TO CAMPO - CABLEADOS Y CONECTORES
// *************************************************************************************************

        val spinner01C05: Spinner = findViewById(R.id.spinner01C05)
        val arrayAdapter01C05 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_evaluacion,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner01C05.adapter = adapter
        }

        val spinner02C05: Spinner = findViewById(R.id.spinner02C05)
        val arrayAdapter02C05 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_valores,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner02C05.adapter = adapter
        }

// *************************************************************************************************
// 6TO CAMPO - CONEXIONES E Y E
// *************************************************************************************************

        val spinner01C06: Spinner = findViewById(R.id.spinner01C06)
        val arrayAdapter01C06 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_evaluacion,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner01C06.adapter = adapter
        }

        val spinner02C06: Spinner = findViewById(R.id.spinner02C06)
        val arrayAdapter02C06 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_valores,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner02C06.adapter = adapter
        }

// *************************************************************************************************
// 7MO CAMPO - FUGAS
// *************************************************************************************************

        val spinner01C07: Spinner = findViewById(R.id.spinner01C07)
        val arrayAdapter01C07 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_evaluacion,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner01C07.adapter = adapter
        }

        val spinner02C07: Spinner = findViewById(R.id.spinner02C07)
        val arrayAdapter02C07 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_valores,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner02C07.adapter = adapter
        }

// *************************************************************************************************
// 8VO CAMPO - SOPORTES
// *************************************************************************************************

        val spinner01C08: Spinner = findViewById(R.id.spinner01C08)
        val arrayAdapter01C08 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_evaluacion,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner01C08.adapter = adapter
        }

        val spinner02C08: Spinner = findViewById(R.id.spinner02C08)
        val arrayAdapter02C08 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_valores,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner02C08.adapter = adapter
        }

// *************************************************************************************************
// 9NO CAMPO - SUJECIONES
// *************************************************************************************************

        val spinner01C09: Spinner = findViewById(R.id.spinner01C09)
        val arrayAdapter01C09 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_evaluacion,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner01C09.adapter = adapter
        }

        val spinner02C09: Spinner = findViewById(R.id.spinner02C09)
        val arrayAdapter02C09 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_valores,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner02C09.adapter = adapter
        }
// *************************************************************************************************
// 10MO CAMPO - CON CONTROL ELECTRÓNICO
// *************************************************************************************************

// *************************************************************************************************
// 11VO CAMPO - SENSORES DE TEMPERATURA
// *************************************************************************************************

        val spinner01C11: Spinner = findViewById(R.id.spinner01C11)
        val arrayAdapter01C11 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_evaluacion,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner01C11.adapter = adapter
        }

        val spinner02C11: Spinner = findViewById(R.id.spinner02C11)
        val arrayAdapter02C11 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_valores,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner02C11.adapter = adapter
        }

// *************************************************************************************************
// 12VO CAMPO - MODULOS
// *************************************************************************************************

        val spinner01C12: Spinner = findViewById(R.id.spinner01C12)
        val arrayAdapter01C12 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_evaluacion,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner01C12.adapter = adapter
        }

        val spinner02C12: Spinner = findViewById(R.id.spinner02C12)
        val arrayAdapter02C12 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_valores,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner02C12.adapter = adapter
        }
    }
}