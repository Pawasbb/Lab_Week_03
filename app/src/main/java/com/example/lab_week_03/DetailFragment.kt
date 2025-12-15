package com.example.lab_week_03

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment : Fragment() {

    private lateinit var title: TextView
    private lateinit var desc: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        title = view.findViewById(R.id.coffee_title)
        desc = view.findViewById(R.id.coffee_desc)

        return view
    }

    fun setCoffeeData(id: Int) {
        when (id) {
            R.id.affogato -> {
                title.text = getString(R.string.affogato_title)
                desc.text = getString(R.string.affogato_desc)
            }
            R.id.americano -> {
                title.text = getString(R.string.americano_title)
                desc.text = getString(R.string.americano_desc)
            }
            R.id.latte -> {
                title.text = getString(R.string.latte_title)
                desc.text = getString(R.string.latte_desc)
            }
        }
    }
}
