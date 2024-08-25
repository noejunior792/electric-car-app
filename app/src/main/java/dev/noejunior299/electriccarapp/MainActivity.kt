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

    lateinit var btnCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        setupView()
        setupListeners()
    }

    fun setupView() {
        btnCalcular = findViewById(R.id.btn_calcular)
    }

    fun setupListeners() {
        btnCalcular.setOnClickListener {
            startActivity(Intent(this, CalcularAutonomiaActivity::class.java))
        }
    }
}