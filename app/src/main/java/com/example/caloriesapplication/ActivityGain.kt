package com.example.caloriesapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.caloriesapplication.databinding.ActivityGainBinding

import kotlin.math.roundToInt

class ActivityGain : AppCompatActivity() {
    private lateinit var binding: ActivityGainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityGainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var intent: Intent = Intent(applicationContext, MassResult::class.java)

        binding.massNextBtn.setOnClickListener() {
            if (binding.massWeightInPut.length() < 2 || binding.massWeightInPut.length() >=4 || binding.massRG.getCheckedRadioButtonId()==-1) {
                binding.massTryAgain.visibility = TextView.VISIBLE
            }
            else{
                var weight = binding.massWeightInPut.text.toString().toInt()
                var weightAfter = weight * 22


                if (binding.massSedentaryRB.isChecked){
                    var demand = (weightAfter * 1.4).roundToInt()
                    var finalKcal = demand + 300
                    var proteinsGrams = (weight * 2.4).roundToInt()
                    var proteins = proteinsGrams * 4
                    var fat = (finalKcal / 5)
                    var fatGrams = fat / 9
                    var carbo = finalKcal - proteins - fat
                    var carboGrams = carbo / 4
                    intent.putExtra("kcal",finalKcal.toString())
                    intent.putExtra("gramsOfProteins",proteinsGrams.toString())
                    intent.putExtra("gramsOfFat",fatGrams.toString())
                    intent.putExtra("gramsOfCarbs",carboGrams.toString())
                    startActivity(intent)
                }
                if (binding.massAverageRB.isChecked){
                    var demand = (weightAfter * 1.6).roundToInt()
                    var finalKcal = demand + 300
                    var proteinsGrams = (weight * 2.4).roundToInt()
                    var proteins = proteinsGrams * 4
                    var fat = (finalKcal / 5)
                    var fatGrams = fat / 9
                    var carbo = finalKcal - proteins - fat
                    var carboGrams = carbo / 4
                    intent.putExtra("kcal",finalKcal.toString())
                    intent.putExtra("gramsOfProteins",proteinsGrams.toString())
                    intent.putExtra("gramsOfFat",fatGrams.toString())
                    intent.putExtra("gramsOfCarbs",carboGrams.toString())
                    startActivity(intent)

                }
                if (binding.massActiveRB.isChecked){
                    var demand = (weightAfter * 1.8).roundToInt()
                    var finalKcal = demand + 300
                    var proteinsGrams = (weight * 2.4).roundToInt()
                    var proteins = proteinsGrams * 4
                    var fat = (finalKcal / 5)
                    var fatGrams = fat / 9
                    var carbo = finalKcal - proteins - fat
                    var carboGrams = carbo / 4
                    intent.putExtra("kcal",finalKcal.toString())
                    intent.putExtra("gramsOfProteins",proteinsGrams.toString())
                    intent.putExtra("gramsOfFat",fatGrams.toString())
                    intent.putExtra("gramsOfCarbs",carboGrams.toString())
                    startActivity(intent)

                }
                if (binding.massVeryActiveRB.isChecked){
                    var demand= weightAfter * 2
                    var finalKcal = demand + 300
                    var proteinsGrams = (weight * 2.4).roundToInt()
                    var proteins = proteinsGrams * 4
                    var fat = (finalKcal / 5)
                    var fatGrams = fat / 9
                    var carbo = finalKcal - proteins - fat
                    var carboGrams = carbo / 4
                    intent.putExtra("kcal",finalKcal.toString())
                    intent.putExtra("gramsOfProteins",proteinsGrams.toString())
                    intent.putExtra("gramsOfFat",fatGrams.toString())
                    intent.putExtra("gramsOfCarbs",carboGrams.toString())
                    startActivity(intent)

                }

            }

        }
    }
}