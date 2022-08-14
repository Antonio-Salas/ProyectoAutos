package com.cursokotlin.retrofitkotlinexample

import android.content.Intent
import android.os.Bundle
import android.os.StrictMode
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class MainActivity : AppCompatActivity() {

    private fun toast(){
        val text = "Usuario y/o contraseña invalidos"
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
    private fun getRetrofit(): Retrofit{
        return Retrofit.Builder()
                .baseUrl("http://192.168.100.7:8000/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val user = findViewById<EditText>(R.id.user).text;
        val password = findViewById<EditText>(R.id.password).text;
        val submitForm = findViewById<Button>(R.id.btnIniciarSesion);

        submitForm.setOnClickListener{
            if(user.toString() == "" || password.toString() == ""){
                toast();
            } else{
                val inicio = Intent(this, DisplayMessageActivity::class.java);
                CoroutineScope(Dispatchers.IO).launch {
                    Log.d("user", "Enviando request...")
                    val call = getRetrofit().create(APIService::class.java).getUser("usuarios/$user/$password").execute()
                    Log.d("user", "convirtiendo response...")
                    val response = call.body() as getUserRes
                    runOnUiThread{
                        if (response.status == "200"){
                            startActivity(inicio)
                        } else {
                            toast()
                        }
                    }
                }
            }
        }
    }

    /*
    fun sendMessage(view: View) {
        /* Aquí va la acción del botón*/
        val editText = findViewById<EditText>(R.id.password)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
    */
}