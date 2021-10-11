package com.example.caloriesapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.caloriesapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.MainBtnLose.setOnClickListener(){
            var intent: Intent = Intent(applicationContext,ActivityLose::class.java)
            startActivity(intent)
        }
        binding.MainBtnGain.setOnClickListener(){
            var intent: Intent = Intent(applicationContext,ActivityGain::class.java)
            startActivity(intent)
        }
        binding.MainBtnKeep.setOnClickListener(){
            var intent: Intent = Intent(applicationContext,ActivityKeep::class.java)
            startActivity(intent)
        }

    }
}