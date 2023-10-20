package com.example.gameapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var btn_left: Button?=null
    var btn_right: Button?=null
    var score_value : TextView?=null
    var points = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialisation()
    }

    fun initialisation(){
        var btn_left = findViewById<Button>(R.id.left_btn)
        var btn_right = findViewById<Button>(R.id.right_btn)
        var a = 0
        var b = 0
        do {
            a = Random.nextInt(0,10)
            b = Random.nextInt(0,10)
        }while (a == b)
        btn_left?.text= a.toString()
        btn_right?.text= b.toString()
    }

    fun left_click(view: View) {
        var btn_left = findViewById<Button>(R.id.left_btn)
        var btn_right = findViewById<Button>(R.id.right_btn)
        var a = btn_left?.text.toString().toInt()
        var b = btn_right?.text.toString().toInt()
        score_value = findViewById(R.id.score)
        if (a > b){
            points ++
            Toast.makeText(this, "\uD83D\uDCA5 good job", Toast.LENGTH_SHORT).show()
        }
        else{
            points --
            Toast.makeText(this, "\uD83D\uDE14 Oups", Toast.LENGTH_SHORT).show()
        }
        score_value?.text = points.toString()
        initialisation()
    }
    fun right_click(view: View) {
        var btn_left = findViewById<Button>(R.id.left_btn)
        var btn_right = findViewById<Button>(R.id.right_btn)
        var a = btn_left?.text.toString().toInt()
        var b = btn_right?.text.toString().toInt()
        score_value = findViewById(R.id.score)
        if (a < b){
            points ++
            Toast.makeText(this, "\uD83D\uDCA5 good job", Toast.LENGTH_SHORT).show()
        }
        else{
            points --
            Toast.makeText(this, "\uD83D\uDE14 Oups", Toast.LENGTH_SHORT).show()
        }
        score_value?.text = points.toString()
        initialisation()


    }
}