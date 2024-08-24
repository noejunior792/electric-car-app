package dev.noejunior299.electriccarapp.presentation

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import dev.noejunior299.electriccarapp.R

class CalcularAutonomiaActivity:  ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_calcular_autonomia)
    }
}