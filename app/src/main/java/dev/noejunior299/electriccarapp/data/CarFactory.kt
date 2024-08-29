package dev.noejunior299.electriccarapp.data

import dev.noejunior299.electriccarapp.domain.Carro

class CarFactory {

    val list = listOf(
        Carro(
            id = 1,
            preco = "R$ 300.000,00",
            bateria = "300 KWH",
            potencia = "200cv",
            recarga = "30 min",
            urlPhoto = "www.google.com.br"
        ),
        Carro(
            id = 2,
            preco = "R$ 600.000,00",
            bateria = "400 KWH",
            potencia = "350cv",
            recarga = "40 min",
            urlPhoto = "www.google.com.br"
        )
    )
}