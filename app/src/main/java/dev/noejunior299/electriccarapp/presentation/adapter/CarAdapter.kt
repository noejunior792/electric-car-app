package dev.noejunior299.electriccarapp.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.noejunior299.electriccarapp.R
import dev.noejunior299.electriccarapp.domain.Carro

class CarAdapter(private val carros: List<Carro>) :
    RecyclerView.Adapter<CarAdapter.ViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.carro_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolder, position: Int
    ) {
        holder.preco.text = carros[position].preco
        holder.bateria.text = carros[position].preco
        holder.potencia.text = carros[position].preco
        holder.recarga.text = carros[position].preco
    }

    override fun getItemCount(): Int = carros.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val preco: TextView = view.findViewById(R.id.tv_preco_value)
        val bateria: TextView = view.findViewById(R.id.tv_bateria_value)
        val potencia: TextView = view.findViewById(R.id.tv_potencia_value)
        val recarga: TextView = view.findViewById(R.id.tv_recarga_value)
    }
}

