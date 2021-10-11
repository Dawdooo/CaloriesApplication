package com.example.caloriesapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.caloriesapplication.databinding.ActivityKeepBinding

import kotlin.math.roundToInt

class ActivityKeep : AppCompatActivity() {
    private lateinit var binding: ActivityKeepBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityKeepBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var intent: Intent = Intent(applicationContext, KeepResult::class.java)
        binding.keepNextBtn.setOnClickListener() {
            if (binding.keepWeightInPut.length() < 2 || binding.keepWeightInPut.length() >= 4 || binding.keepRG.getCheckedRadioButtonId() == -1) {
                binding.keepTryAgain.visibility = TextView.VISIBLE
            } else {
                var weight = binding.keepWeightInPut.text.toString().toInt()
                var weightAfter = weight * 22


                if (binding.keepSedentaryRB.isChecked) {
                    var demand = (weightAfter * 1.4).roundToInt()
                    var proteinsGrams = (weight * 2.4).roundToInt()
                    var proteins = proteinsGrams * 4
                    var fat = (demand / 5)
                    var fatGrams = fat / 9
                    var carbo = demand - proteins - fat
                    var carboGrams = carbo / 4
                    intent.putExtra("kcal", demand.toString())
                    intent.putExtra("gramsOfProteins", proteinsGrams.toString())
                    intent.putExtra("gramsOfFat", fatGrams.toString())
                    intent.putExtra("gramsOfCarbs", carboGrams.toString())
                    startActivity(intent)
                }
                if (binding.keepAverageRB.isChecked) {
                    var demand = (weightAfter * 1.6).roundToInt()
                    var proteinsGrams = (weight * 2.4).roundToInt()
                    var proteins = proteinsGrams * 4
                    var fat = (demand / 5)
                    var fatGrams = fat / 9
                    var carbo = demand - proteins - fat
                    var carboGrams = carbo / 4
                    intent.putExtra("kcal", demand.toString())
                    intent.putExtra("gramsOfProteins", proteinsGrams.toString())
                    intent.putExtra("gramsOfFat", fatGrams.toString())
                    intent.putExtra("gramsOfCarbs", carboGrams.toString())
                    startActivity(intent)
                }
                if (binding.keepActiveRB.isChecked){
                    var demand= (weightAfter * 1.8).roundToInt()
                    var proteinsGrams = (weight * 2.4).roundToInt()
                    var proteins = proteinsGrams * 4
                    var fat = (demand / 5)
                    var fatGrams = fat / 9
                    var carbo = demand- proteins - fat
                    var carboGrams = carbo / 4
                    intent.putExtra("kcal",demand.toString())
                    intent.putExtra("gramsOfProteins",proteinsGrams.toString())
                    intent.putExtra("gramsOfFat",fatGrams.toString())
                    intent.putExtra("gramsOfCarbs",carboGrams.toString())
                    startActivity(intent)

                }
                if (binding.keepVeryActiveRB.isChecked){
                    var demand = weightAfter * 2

                    var proteinsGrams = (weight * 2.4).roundToInt()
                    var proteins = proteinsGrams * 4
                    var fat = (demand / 5)
                    var fatGrams = fat / 9
                    var carbo = demand - proteins - fat
                    var carboGrams = carbo / 4
                    intent.putExtra("kcal",demand.toString())
                    intent.putExtra("gramsOfProteins",proteinsGrams.toString())
                    intent.putExtra("gramsOfFat",fatGrams.toString())
                    intent.putExtra("gramsOfCarbs",carboGrams.toString())
                    startActivity(intent)

                }
            }

        }
    }
}