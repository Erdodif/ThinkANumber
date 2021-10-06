package com.example.thinkanumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.thinkanumber.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private var tippeltszam: Int = 0
    private var gondoltSzam: Int = 0
    private var elet: Int = 0
    private lateinit var bind : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init();
        bind.buttonPlusz.setOnClickListener {
            if (tippeltszam >= 10) {
                // TODO: Felugróablak
            } else {
                tippeltszam++
                bind.texViewSzam.text = tippeltszam.toString()
            }
        }
        bind.buttonMinusz.setOnClickListener {
            if (tippeltszam == 0) {
                // TODO: Felugróablak
            } else {
                tippeltszam--
                bind.texViewSzam.text = tippeltszam.toString()
            }
        }
        bind.buttonTipp.setOnClickListener {
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
                bind.imageViewHP4.setImageResource(R.drawable.heart1)
            }
            2 -> {
                bind.imageViewHP3.setImageResource(R.drawable.heart1)
            }
            1 -> {
                bind.imageViewHP2.setImageResource(R.drawable.heart1)
            }
            0 -> {
                bind.imageViewHP1.setImageResource(R.drawable.heart1)
                // TODO: Felugró Ablak game over
            }
        }
    }

    fun init() {
        tippeltszam = 1
        elet = 4
        gondoltSzam = Random.nextInt(0,10)
    }

*/
}