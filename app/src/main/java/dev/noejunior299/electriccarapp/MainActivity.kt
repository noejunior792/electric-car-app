package dev.noejunior299.electriccarapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.layout)
        setupListeners()
    }

    fun setupListeners() {
        val preco = findViewById<EditText>(R.id.et_precoCalculo)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val textoDigitado = preco.text.toString()
            println(textoDigitado)
        }
    }
}