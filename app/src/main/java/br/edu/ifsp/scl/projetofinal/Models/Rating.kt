package br.edu.ifsp.scl.projetofinal.Models

import com.google.gson.annotations.SerializedName

data class Rating(
    @SerializedName("Source")
    var source: String = "",
    @SerializedName("Value")
    var value: String = ""
)