package com.example.thinkanumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {

    lateinit var hp1: ImageView
    lateinit var hp2: ImageView
    lateinit var hp3: ImageView
    lateinit var hp4: ImageView
    lateinit var buttonMinusz: Button
    lateinit var buttonPlusz: Button
    lateinit var buttonTipp: Button
    lateinit var textViewSzam: TextView
    private var tippeltszam: Int = 0
    private var gondoltSzam: Int = 0
    private var elet: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();
        buttonPlusz.setOnClickListener {
            if (tippeltszam >= 10) {
                // TODO: Felugróablak
            } else {
                tippeltszam++
                textViewSzam.setText(tippeltszam)
            }
        }
        buttonMinusz.setOnClickListener {
            if (tippeltszam == 0) {
                // TODO: Felugróablak
            } else {
                tippeltszam--
                textViewSzam.setText(tippeltszam)
            }
        }
        buttonTipp.setOnClickListener {
            when {
                tippeltszam == gondoltSzam -> {
                    // TODO: Felugróablak, Győzelem
                }
                tippeltszam < gondoltSzam -> {
                    // TODO: Felugróablak, nagyobbra gondolt
                    eletMinusz()
                }
                tippeltszam > gondoltSzam -> {
                    // TODO: Felugróablak, kissebre gondolt
                    eletMinusz()
                }
            }
        }
    }

    fun eletMinusz(){
        when (elet){
            3 -> {
                hp4.setImageResource(R.drawable.heart1)
            }
            2 -> {
                hp3.setImageResource(R.drawable.heart1)
            }
            1 -> {
                hp2.setImageResource(R.drawable.heart1)
            }
            0 -> {
                hp1.setImageResource(R.drawable.heart1)
                // TODO: Felugró Ablak game over
            }
        }
    }

    fun init() {
        tippeltszam = 1
        elet = 4
        gondoltSzam = Random1.nextInt(0,10)
        buttonMinusz = findViewById(R.id.buttonMinusz)
        buttonPlusz = findViewById(R.id.buttonPlusz)
        buttonTipp = findViewById(R.id.buttonTipp)
        hp1 = findViewById(R.id.imageViewHP1)
        hp2 = findViewById(R.id.imageViewHP2)
        hp3 = findViewById(R.id.imageViewHP3)
        hp4 = findViewById(R.id.imageViewHP4)
    }


}