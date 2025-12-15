package com.example.lab_week_03

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DetailFragment : Fragment() {

    companion object {
        fun newInstance(coffeeName: String): DetailFragment {
            val fragment = DetailFragment()
            val bundle = Bundle()
            bundle.putString("coffee", coffeeName)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: android.view.LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val textView = TextView(requireContext())
        textView.textSize = 24f
        textView.gravity = Gravity.CENTER
        textView.text = arguments?.getString("coffee") ?: "No Data"

        return textView
    }
}
