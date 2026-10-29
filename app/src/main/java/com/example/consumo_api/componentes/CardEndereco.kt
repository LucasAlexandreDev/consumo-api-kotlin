package com.example.consumo_api.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.consumo_api.model.Endereco

@Composable
fun CardEndereco(endereco: Endereco) {
    Card(
        modifier = Modifier.fillMaxWidth()
            .padding(bottom = 4.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
                .padding(8.dp)
        ) {
            Text(text = "CEP:  ${endereco.cep}")
            Text(text = "Rua:  ${endereco.rua}")
            Text(text = "Cidade:  ${endereco.cidade}")
            Text(text = "Bairro:  ${endereco.bairro}")
            Text(text = "UF:  ${endereco.uf}")
        }
    }
}
