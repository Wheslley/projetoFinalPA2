package br.edu.ifsp.scl.projetofinal.Models

import com.google.gson.annotations.SerializedName

data class ResponseError(
    @SerializedName("Response")
    var response: String = "",
    @SerializedName("Error")
    var error: String = ""
)