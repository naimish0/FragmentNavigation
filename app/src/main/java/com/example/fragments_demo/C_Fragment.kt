package com.example.fragments_demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_a_.*
import kotlinx.android.synthetic.main.fragment_b_.*
import kotlinx.android.synthetic.main.fragment_c_.*


class C_Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {


        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var cFragment=C_Fragment()
        buttonC1.setOnClickListener()
        {
          //  fragmentManager?.beginTransaction()?.pop("B")?.commit
            fragmentManager?.popBackStack()
        }
        (requireActivity() as MainActivity).setTitle("Fragment C")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c_, container, false)
    }


}