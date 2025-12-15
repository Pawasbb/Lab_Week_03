package com.example.lab_week_03

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class ListFragment : Fragment() {

    private lateinit var listener: CoffeeListener

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as CoffeeListener
    }

    override fun onCreateView(
        inflater: android.view.LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val listView = ListView(requireContext())

        val coffees = arrayOf(
            "Affogato",
            "Americano",
            "Latte"
        )

        listView.adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            coffees
        )

        listView.setOnItemClickListener { _, _, position, _ ->
            listener.onSelected(coffees[position]) // ✅ STRING
        }

        return listView
    }
}
