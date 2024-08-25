package dev.noejunior299.electriccarapp.presentation

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import dev.noejunior299.electriccarapp.R

class CalcularAutonomiaActivity:  ComponentActivity() {

    lateinit var preco: EditText
    lateinit var kmPercorrido: EditText
    lateinit var btnCalcular: Button
    lateinit var resultado: TextView
    lateinit var btnClose: ImageView

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_calcular_autonomia)
        setupView()
        setupListeners()
    }

    fun setupView() {
        btnCalcular = findViewById(R.id.btn_calcular)
        preco = findViewById(R.id.et_precoCalculo)
        kmPercorrido = findViewById(R.id.et_km_percorrido)
        resultado = findViewById(R.id.tv_resultado)
        btnClose = findViewById(R.id.imageView)
    }

    fun setupListeners() {
        btnCalcular.setOnClickListener {
            calcular()
        }
        btnClose.setOnClickListener {
            finish()
        }
    }

    fun calcular() {
        val preco = preco.text.toString().toFloat()
        val kmPercorrido = kmPercorrido.text.toString().toFloat()

        val result = preco / kmPercorrido
        resultado.text = result.toString()
    }

}