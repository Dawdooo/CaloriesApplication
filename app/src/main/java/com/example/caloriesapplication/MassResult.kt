package com.example.caloriesapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.caloriesapplication.databinding.MassResultBinding


class MassResult : AppCompatActivity() {
    private lateinit var binding: MassResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = MassResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        if (intent.hasExtra("kcal")) binding.massResultKcal.setText(intent.getCharSequenceExtra("kcal"))
        if (intent.hasExtra("gramsOfProteins")) binding.massGramsOfProteins.setText(intent.getCharSequenceExtra("gramsOfProteins"))
        if (intent.hasExtra("gramsOfFat"))binding.massGramsOfFat.setText(intent.getCharSequenceExtra("gramsOfFat"))
        if (intent.hasExtra("gramsOfCarbs"))binding.massGramsOfCarbs.setText(intent.getCharSequenceExtra("gramsOfCarbs"))



    }
}