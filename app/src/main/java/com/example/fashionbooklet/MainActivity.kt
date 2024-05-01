package com.example.fashionbooklet

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView
    private var index = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.right1)
        rollButton.setOnClickListener {
            if(index < 6) {
                rollDice()
                index++
            }
        }


        rollButton.setOnClickListener {
            if(index > 1) {
                rollDice()
                index--
            }
        }
        diceImage = findViewById(R.id.face)
    }

    private fun rollDice() {
        val drawableResource = when (index) {
            1 -> R.drawable.one
            2 -> R.drawable.two
            else -> R.drawable.three
        }

        diceImage.setImageResource(drawableResource)
    }
}
