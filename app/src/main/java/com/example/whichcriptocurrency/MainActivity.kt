package com.example.whichcriptocurrency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cryptoText: TextView = findViewById(R.id.cryptoView)
        var cryptoImage: ImageView = findViewById(R.id.cryptoImage)
        var cryptoButton: Button = findViewById(R.id.cryptoButton)

        cryptoImage.setImageResource(R.drawable.cryptocurrency)

        cryptoButton.setOnClickListener() {
            var randomcryptoPoint = (1..11).random()

            when (randomcryptoPoint) {
                1 -> {
                    cryptoImage.setImageResource(R.drawable.binancecoin); cryptoText.text =
                        "Binance"
                }
                2 -> {
                    cryptoImage.setImageResource(R.drawable.bitcoin); cryptoText.text = "Bitcoin"
                }
                3 -> {
                    cryptoImage.setImageResource(R.drawable.ethereum); cryptoText.text = "Ethereum"
                }
                4 -> {
                    cryptoImage.setImageResource(R.drawable.terracoin); cryptoText.text = "Terra"
                }
                5 -> {
                    cryptoImage.setImageResource(R.drawable.dogecoin); cryptoText.text = "Doge"
                }
                6 -> {
                    cryptoImage.setImageResource(R.drawable.tron); cryptoText.text = "Tron"
                }
                7 -> {
                    cryptoImage.setImageResource(R.drawable.cardano); cryptoText.text = "Cardano"
                }
                8 -> {
                    cryptoImage.setImageResource(R.drawable.chainlink); cryptoText.text =
                        "Chainlink"
                }
                9 -> {
                    cryptoImage.setImageResource(R.drawable.litecoin); cryptoText.text = "Litecoin"
                }
                10 -> {
                    cryptoImage.setImageResource(R.drawable.shiba); cryptoText.text = "Shiba"
                }
                11 -> {
                    cryptoImage.setImageResource(R.drawable.solana); cryptoText.text = "Solana"
                }
            }
        }
    }
}