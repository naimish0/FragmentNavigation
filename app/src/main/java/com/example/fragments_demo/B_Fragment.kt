package com.example.fragments_demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_a_.*
import kotlinx.android.synthetic.main.fragment_b_.*


class B_Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       var cFragment=C_Fragment()
        var bFragment=B_Fragment()
        fragment_b__next_button.setOnClickListener()
        {
            fragmentManager?.beginTransaction()?.replace(R.id.Fragment,cFragment,"B")?.addToBackStack("B")?.commit()
        }

        fragment_b__previous_button.setOnClickListener()
        {
           // fragmentManager?.beginTransaction()?.addToBackStack("A")?.commit()
            fragmentManager?.popBackStack()
        }
        (requireActivity() as MainActivity).setTitle("Fragment B")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b_, container, false)
    }


    }