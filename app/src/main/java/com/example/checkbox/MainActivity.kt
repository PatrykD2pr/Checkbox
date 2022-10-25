package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ananas = findViewById<CheckBox>(R.id.check_ananas)
        var apple = findViewById<CheckBox>(R.id.check_apple)
        var arbuz = findViewById<CheckBox>(R.id.check_arbuz)
        var banany = findViewById<CheckBox>(R.id.check_banany)
        var cytryna = findViewById<CheckBox>(R.id.check_cytryna)
        var gruszka = findViewById<CheckBox>(R.id.check_gruszka)
        var kokos = findViewById<CheckBox>(R.id.check_kokos)
        var maliny = findViewById<CheckBox>(R.id.check_maliny)
        var mango = findViewById<CheckBox>(R.id.check_mango)
        var truskawka = findViewById<CheckBox>(R.id.check_truskawka)

        var imgAnanas = findViewById<ImageView>(R.id.imgAnanas)
        var imgApple = findViewById<ImageView>(R.id.imgApple)
        var imgArbuz = findViewById<ImageView>(R.id.imgArbuz)
        var imgBanany = findViewById<ImageView>(R.id.imgBanany)
        var imgCytryna = findViewById<ImageView>(R.id.imgCytryna)
        var imgGruszka = findViewById<ImageView>(R.id.imgGruszka)
        var imgKokos = findViewById<ImageView>(R.id.imgKokos)
        var imgMaliny = findViewById<ImageView>(R.id.imgMaliny)
        var imgMango = findViewById<ImageView>(R.id.imgMango)
        var imgTruskawka = findViewById<ImageView>(R.id.imgTruskawka)

        ananas.setOnClickListener() {
            if (ananas.isChecked) imgAnanas.setImageResource(R.drawable.ananas)
            else imgAnanas.setImageDrawable(null)
        }
        apple.setOnClickListener() {
            if (apple.isChecked) imgApple.setImageResource(R.drawable.apple)
            else imgApple.setImageDrawable(null)
        }
        arbuz.setOnClickListener() {
            if (arbuz.isChecked) imgArbuz.setImageResource(R.drawable.arbuz)
            else imgArbuz.setImageDrawable(null)
        }
        banany.setOnClickListener() {
            if (banany.isChecked) imgBanany.setImageResource(R.drawable.banany)
            else imgBanany.setImageDrawable(null)
        }
        cytryna.setOnClickListener() {
            if (cytryna.isChecked) imgCytryna.setImageResource(R.drawable.cytryna)
            else imgCytryna.setImageDrawable(null)
        }
        gruszka.setOnClickListener() {
            if (gruszka.isChecked) imgGruszka.setImageResource(R.drawable.gruszka)
            else imgGruszka.setImageDrawable(null)
        }
        kokos.setOnClickListener() {
            if (kokos.isChecked) imgKokos.setImageResource(R.drawable.kokos)
            else imgKokos.setImageDrawable(null)
        }
        maliny.setOnClickListener() {
            if (maliny.isChecked) imgMaliny.setImageResource(R.drawable.maliny)
            else imgMaliny.setImageDrawable(null)
        }
        mango.setOnClickListener() {
            if (mango.isChecked) imgMango.setImageResource(R.drawable.mango)
            else imgMango.setImageDrawable(null)
        }
        truskawka.setOnClickListener() {
            if (truskawka.isChecked) imgTruskawka.setImageResource(R.drawable.truskawka)
            else imgTruskawka.setImageDrawable(null)
        }
    }
}