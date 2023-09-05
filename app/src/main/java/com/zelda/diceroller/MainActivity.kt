package com.zelda.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var diceIcon: ImageView
    private lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // find views
        diceIcon = findViewById(R.id.dice_image)
        rollButton = findViewById(R.id.roll_button)

        // Referencing a view with the ID roll_button
        rollButton.text = "LET'S ROLL"

        // make the rollButton show a Toast message
        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val iconRes = when (Random.nextInt(1, 7)) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceIcon.setImageResource(iconRes)
    }
}