package com.example.buttoncounterbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView:TextView
    lateinit var button:Button
    lateinit var button2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView =findViewById(R.id.textView)

        button = findViewById(R.id.button)
        button.setOnClickListener { var shown = textView.text.toString().toInt()
            textView.text = (shown + 1).toString() }

        button2 = findViewById(R.id.button2)
        button2.setOnClickListener { var shown = textView.text.toString().toInt()
            textView.text = (shown - 1).toString() }
    }
}