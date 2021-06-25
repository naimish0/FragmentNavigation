package com.example.fragments_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_a_.*
import kotlinx.android.synthetic.main.fragment_b_.*
import kotlinx.android.synthetic.main.fragment_c_.*
import java.time.Instant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState==null)
        {
            var a_fragment=A_Fragment()
            var transaction=supportFragmentManager.beginTransaction()
            transaction.add(R.id.Fragment,a_fragment)
            transaction.commit()
        }
    }

   fun setTitle(titleName:String)
   {
       text.setText(titleName)
   }
}