package com.example.lab_week_03

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val title = view.findViewById<TextView>(R.id.coffee_title)
        val desc = view.findViewById<TextView>(R.id.coffee_desc)
        val backBtn = view.findViewById<Button>(R.id.btn_back)

        backBtn.setOnClickListener {
            it.findNavController().navigateUp()
        }

        when (arguments?.getInt(ListFragment.COFFEE_ID)) {
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
            R.id.cappuccino -> {
                title.text = getString(R.string.cappuccino_title)
                desc.text = getString(R.string.cappuccino_desc)
            }
            R.id.mocha -> {
                title.text = getString(R.string.mocha_title)
                desc.text = getString(R.string.mocha_desc)
            }
        }
    }
}
