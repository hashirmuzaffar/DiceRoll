package com.example.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn : Button = findViewById(R.id.button)
        btn.setOnClickListener {
            rollDice()
            btn.text="roll again"
        }

    }

    private fun rollDice() {

        val resource = when(Random().nextInt(6) + 1){

                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5


            else -> { R.drawable.dice_6}
        }

        val diceimg : ImageView = findViewById(R.id.dice)
        diceimg.setImageResource(resource)
    }
}