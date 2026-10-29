package com.example.consumo_api.service

import com.example.consumo_api.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface EnderecoService {

    @GET("{cep}/json/")
    fun getEnderecoByIdCep(@Path("cep") cep: String): Call<Endereco>

    @GET("{uf}/{cidade}/{rua}/json/")
    fun getEnderecoByUfCidadeRua(
        @Path("uf")     uf    : String,
        @Path("cidade") cidade: String,
        @Path("rua")    rua   : String

    ): Call<List<Endereco>>

}