package com.cursokotlin.retrofitkotlinexample

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.RequestBody
import org.json.JSONObject
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DisplayMessageActivity : AppCompatActivity() {
    private fun toast(){
        val text = "Folio no encontrado"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
                .baseUrl("http://192.168.100.7:8000/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        // Get the Intent that started this activity and extract the string
        val folio = findViewById<EditText>(R.id.txtNumeroSerie).text;
        val comenzarBtn = findViewById<Button>(R.id.btnComenzar);
        val collectData = Intent(this, ActMenu::class.java)

        comenzarBtn.setOnClickListener{
            if(folio.toString() == ""){
                toast()
            } else{
            CoroutineScope(Dispatchers.IO).launch {
                    val call = getRetrofit().create(APIService::class.java).buscarSerie("evaluacion/folio/$folio").execute()
                    val resBody = call.body() as buscarSerie

                    runOnUiThread{
                        if (resBody?.status == "200") {
                            startActivity(collectData)
                        }else{
                            toast()
                        }
                    }
                }
            }
        }

    }

    private fun createJsonRequestBody(vararg params: Pair<String, Editable>) =
            RequestBody.create(
                    okhttp3.MediaType.parse("application/json; charset=utf-8"),
                    JSONObject(mapOf(*params)).toString())

    fun cerrar_sesion(view: View) {
        // Aquí va la acción del botón
        val cerrarSesion = Intent(this, MainActivity::class.java)
        startActivity(cerrarSesion)
    }

}
