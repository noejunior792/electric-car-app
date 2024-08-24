package dev.noejunior299.electriccarapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import dev.noejunior299.electriccarapp.presentation.CalcularAutonomiaActivity


class MainActivity : ComponentActivity() {

    lateinit var preco: EditText
    lateinit var kmPercorrido: EditText
    lateinit var btnCalcular: Button
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
    }

    fun setupView() {
        btnCalcular = findViewById(R.id.btn_calcular)
        preco = findViewById(R.id.et_precoCalculo)
        kmPercorrido = findViewById(R.id.et_km_percorrido)
        resultado = findViewById(R.id.tv_resultado)
    }

    fun setupListeners() {
        btnCalcular.setOnClickListener {
            // calcular()
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
        }
    }

    fun calcular() {
        val preco = preco.text.toString().toFloat()
        val kmPercorrido = kmPercorrido.text.toString().toFloat()

        val result = preco / kmPercorrido
        resultado.text = result.toString()
    }
}