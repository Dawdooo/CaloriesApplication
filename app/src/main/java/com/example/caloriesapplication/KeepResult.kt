package com.example.caloriesapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.caloriesapplication.databinding.KeepResultBinding



class KeepResult : AppCompatActivity() {

    private lateinit var binding: KeepResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding =KeepResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (intent.hasExtra("kcal")) binding.keepKcal.setText(intent.getCharSequenceExtra("kcal"))
        if (intent.hasExtra("gramsOfProteins")) binding.keepGramsOfProteins.setText(intent.getCharSequenceExtra("gramsOfProteins"))
        if (intent.hasExtra("gramsOfFat"))binding.keepGramsOfFat.setText(intent.getCharSequenceExtra("gramsOfFat"))
        if (intent.hasExtra("gramsOfCarbs"))binding.keepGramsOfCarbs.setText(intent.getCharSequenceExtra("gramsOfCarbs"))
    }
}