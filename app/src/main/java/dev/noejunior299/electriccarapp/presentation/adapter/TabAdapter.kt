package dev.noejunior299.electriccarapp.presentation.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import dev.noejunior299.electriccarapp.MainActivity
import dev.noejunior299.electriccarapp.presentation.CarFragment

class TabAdapter(fragmentActivity: MainActivity): FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            1 -> CarFragment()
            else -> CarFragment()
        }
    }

    override fun getItemCount(): Int {
        return 2
    }
}