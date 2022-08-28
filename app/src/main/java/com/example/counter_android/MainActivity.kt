package com.example.counter_android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.counter_android.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var valueTextView : TextView
    private var counterValue = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        supportActionBar?.title = "Counter"

        valueTextView = binding.counterValue


        addCounter()

        removeCounter()
    }

    private fun addCounter(){
        binding.addFab.setOnClickListener {
            counterValue++

            valueTextView.text = counterValue.toString()

        }
    }

    private fun removeCounter(){
        binding.removeFab.setOnClickListener {
            if(counterValue != 0)
            counterValue--

            valueTextView.text = counterValue.toString()

        }
    }

}