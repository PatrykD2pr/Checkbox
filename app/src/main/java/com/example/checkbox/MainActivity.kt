package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox

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
    }
}