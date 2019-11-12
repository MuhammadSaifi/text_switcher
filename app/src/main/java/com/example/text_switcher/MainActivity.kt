package com.example.text_switcher

import androidx.appcompat.app.AppCompatActivity

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.TextSwitcher
import android.widget.TextView
import android.widget.ViewSwitcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
/*
* Textswitcher means when we click on next then it will move toward next item of array.
* We have used inAnimation and  outAnimation in our xml file you can see that.
* The set Factory used to initialize the values of our TextView and styles etc.
*
* */
    private var stringindex = 0
    private val row = arrayOf("One", "Two", "Three", "Four", "Five")
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button!!.setOnClickListener {
            if (stringindex == row.size - 1) {
                stringindex = 0
                textSwitcher!!.setText(row[stringindex])
            } else {
                textSwitcher!!.setText(row[++stringindex])
            }
        }

        textSwitcher!!.setFactory {
            textView = TextView(this)
            textView!!.setTextColor(Color.BLACK)
            textView!!.textSize = 60f
            textView!!.gravity = Gravity.CENTER
            textView
        }
        textSwitcher!!.setText(row[stringindex])
    }
}
