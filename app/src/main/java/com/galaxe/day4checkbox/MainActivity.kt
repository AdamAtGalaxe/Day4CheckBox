package com.galaxe.day4checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var c1: CheckBox
    lateinit var c2: CheckBox
    lateinit var c3: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        c1 = findViewById(R.id.checkBox)
        c2 = findViewById(R.id.checkBox2)
        c3 = findViewById(R.id.checkBox3)

    }
    fun click(v: View){
        var total: Int = 0

        if(c1.isChecked){
            total += 20
        }
        if(c2.isChecked){
            total += 15
        }
        if(c3.isChecked){
            total += 15
        }
        Toast.makeText(this, "$total", Toast.LENGTH_LONG).show()
    }

}