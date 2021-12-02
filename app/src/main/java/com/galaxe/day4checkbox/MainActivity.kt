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
        var toastStr = "Thank you for your order: \n"

        if(c1.isChecked){
            total += 20
            toastStr += "Pizza: $20\n"
        }

        if(c2.isChecked){
            total += 5
            toastStr += "Coke: $5\n"
        }
        if(c3.isChecked){
            total += 10
            toastStr += "Burger: $10\n"
        }
        toastStr += "----------------\n Total: $$total"

        Toast.makeText(this, toastStr, Toast.LENGTH_LONG).show()
    }

}
