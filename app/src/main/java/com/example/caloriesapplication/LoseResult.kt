package com.example.caloriesapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.caloriesapplication.databinding.LoseResultBinding


class LoseResult : AppCompatActivity(){

    private lateinit var binding: LoseResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = LoseResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra("kcal")) binding.loseResultKcal.setText(intent.getCharSequenceExtra("kcal"))
        if (intent.hasExtra("gramsOfProteins")) binding.loseGramsOfProteins.setText(intent.getCharSequenceExtra("gramsOfProteins"))
        if (intent.hasExtra("gramsOfFat"))binding.loseGramsOfFat.setText(intent.getCharSequenceExtra("gramsOfFat"))
        if (intent.hasExtra("gramsOfCarbs"))binding.loseGramsOfCarbs.setText(intent.getCharSequenceExtra("gramsOfCarbs"))
    }

}