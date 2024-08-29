package dev.noejunior299.electriccarapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.recyclerview.widget.RecyclerView
import dev.noejunior299.electriccarapp.data.CarFactory
import dev.noejunior299.electriccarapp.presentation.CalcularAutonomiaActivity
import dev.noejunior299.electriccarapp.presentation.adapter.CarAdapter


class MainActivity : ComponentActivity() {

    lateinit var btnCalcular: Button
    lateinit var listaCarros: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
        setupList()
    }

    fun setupView() {
        btnCalcular = findViewById(R.id.btn_calcular)
        listaCarros = findViewById(R.id.rv_lista_carros)
    }

    fun setupList() {
        listaCarros.adapter = CarAdapter(CarFactory().list)
    }

    fun setupListeners() {
        btnCalcular.setOnClickListener {
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
        }
    }
}