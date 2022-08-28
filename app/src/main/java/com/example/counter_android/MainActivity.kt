package com.example.counter_android

import android.R
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.counter_android.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var valueTextView : TextView
    private var counterValue = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        valueTextView = binding.counterValue

        addCounter()

        removeCounter()
    }

    private fun addCounter(){
        binding.addFab.setOnClickListener { view ->
            counterValue++;

            valueTextView.text = counterValue.toString()

        }
    }

    private fun removeCounter(){
        binding.removeFab.setOnClickListener { view ->
            if(counterValue != 0)
            counterValue--;

            valueTextView.text = counterValue.toString()

        }
    }

}