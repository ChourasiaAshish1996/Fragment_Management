package com.example.fragment_management

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val addfragment = findViewById<Button>(R.id.add)
        addfragment.setOnClickListener{
            val fragment = OneFragment()
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.main_container , fragment, "One Fragment")
            fragmentTransaction.commit()
        }
    }
}