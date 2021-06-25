package com.example.fragments_demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_a_.*
import kotlinx.android.synthetic.main.fragment_a_.view.*
import kotlinx.android.synthetic.main.fragment_b_.*

class A_Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var bFragment=B_Fragment()
        fragment_a__next_button.setOnClickListener()
        {
            fragmentManager?.beginTransaction()?.replace(R.id.Fragment,bFragment,"A")?.addToBackStack("A")?.commit()
        }
        (requireActivity() as MainActivity).setTitle("Fragment A")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_a_, container, false)
    }
    }