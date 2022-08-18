package com.cursokotlin.retrofitkotlinexample
import com.google.gson.annotations.SerializedName

data class userRes(var id: Number, var user: String, var password:String);
data class getUserRes(@SerializedName("status") var status:String)
data class buscarSerie(@SerializedName("status") var status:String)