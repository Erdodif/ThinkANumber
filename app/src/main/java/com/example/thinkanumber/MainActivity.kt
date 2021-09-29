package com.example.thinkanumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.random.Random
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

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
                texViewSzam.text = tippeltszam.toString()
            }
        }
        buttonMinusz.setOnClickListener {
            if (tippeltszam == 0) {
                // TODO: Felugróablak
            } else {
                tippeltszam--
                texViewSzam.text = tippeltszam.toString()
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

    private fun eletMinusz(){
        elet--
        when (elet){
            3 -> {
                imageViewHP4.setImageResource(R.drawable.heart1)
            }
            2 -> {
                imageViewHP3.setImageResource(R.drawable.heart1)
            }
            1 -> {
                imageViewHP2.setImageResource(R.drawable.heart1)
            }
            0 -> {
                imageViewHP1.setImageResource(R.drawable.heart1)
                // TODO: Felugró Ablak game over
            }
        }
    }

    fun init() {
        tippeltszam = 1
        elet = 4
        gondoltSzam = Random.nextInt(0,10)
    }


}