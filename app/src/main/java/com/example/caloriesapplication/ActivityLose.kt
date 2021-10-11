package com.example.caloriesapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.caloriesapplication.databinding.ActivityLoseBinding

import kotlin.math.roundToInt


class ActivityLose : AppCompatActivity() {
    private lateinit var binding: ActivityLoseBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityLoseBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var intent: Intent = Intent(applicationContext, LoseResult::class.java)


        binding.loseNextBtn.setOnClickListener() {
            if (binding.loseWeightInPut.length() < 2 || binding.loseWeightInPut.length() >=4 || binding.radioGroup.getCheckedRadioButtonId()==-1) {
                binding.loseTryAgain.visibility = TextView.VISIBLE
            }

            else{
                var weight = binding.loseWeightInPut.text.toString().toInt()
                var weightAfter = weight * 22


                if (binding.loseSedentaryRB.isChecked){
                    var demand = (weightAfter * 1.4).roundToInt()
                    var finalKcal = demand - 300
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
                if (binding.loseAverageRB.isChecked){
                    var demand = (weightAfter * 1.6).roundToInt()
                    var finalKcal = demand - 300
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
                if (binding.loseActiveRB.isChecked){
                    var demand = (weightAfter * 1.8).roundToInt()
                    var finalKcal = demand - 300
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
                if (binding.loseVeryActiveRB.isChecked){
                    var demand = weightAfter * 2
                    var finalKcal = demand - 300
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