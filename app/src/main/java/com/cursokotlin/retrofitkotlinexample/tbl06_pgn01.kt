package com.cursokotlin.retrofitkotlinexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner

class tbl06_pgn01 : AppCompatActivity() {

    fun ir_tbl07pgn01(view: View){
        // Aquí van las acciones del botón
        val tabla01 = Intent(this, tbl07_pgn01::class.java)
        startActivity(tabla01)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tbl06_pgn01)

        // my_child_toolbar is defined in the layout file
        setSupportActionBar(findViewById(R.id.act_tbl06_pgn01_toolbar))

        // Get a support ActionBar corresponding to this toolbar and enable the Up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

// *************************************************************************************************
// 1ER CAMPO - CARBURADOR
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
// 2DO CAMPO - FILTRO DE COMBUSTIBLE
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
// 3ER CAMPO - TANQUE DE COMBUSTIBLE
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
// 4TO CAMPO - BOMBA DE COMBUSTIBLE
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
// 5TO CAMPO - MANGUERAS Y DUCTOS
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
// 6TO CAMPO - CABLEADOS Y CONECTORES
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
// 7MO CAMPO - CONEXIONES E Y E
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
// 8VO CAMPO - FUGAS
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
// 9NO CAMPO - SOPORTES
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
// 10MO CAMPO - SUJECIONES
// *************************************************************************************************

        val spinner01C10: Spinner = findViewById(R.id.spinner01C10)
        val arrayAdapter01C10 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_evaluacion,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner01C10.adapter = adapter
        }

        val spinner02C10: Spinner = findViewById(R.id.spinner02C10)
        val arrayAdapter02C10 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_valores,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner02C10.adapter = adapter
        }
// *************************************************************************************************
// 11VO CAMPO - CON CONTROL ELECTRÓNICO
// *************************************************************************************************

// *************************************************************************************************
// 12VO CAMPO - CUERPO DE ACELERACIÓN
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

// *************************************************************************************************
// 13VO CAMPO - INYECTORES
// *************************************************************************************************

        val spinner01C13: Spinner = findViewById(R.id.spinner01C13)
        val arrayAdapter01C13 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_evaluacion,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner01C13.adapter = adapter
        }

        val spinner02C13: Spinner = findViewById(R.id.spinner02C13)
        val arrayAdapter02C13 = ArrayAdapter.createFromResource(
            this,
            R.array.arreglo_valores,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner02C13.adapter = adapter
        }
    }
}