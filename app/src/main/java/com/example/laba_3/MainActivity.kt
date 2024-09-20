package com.example.laba_3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val strok_orig= findViewById<EditText>(R.id.editTextText)
        val strok_ch_el=findViewById<EditText>(R.id.editTextText2)
        val strok_el=findViewById<EditText>(R.id.editTextText3)
        val btn=findViewById<Button>(R.id.button)

        btn.setOnClickListener(){

            val text_org=strok_orig.text.toString()
            val el_change:Char=strok_ch_el.text.toString().first()
            val el:Char=strok_el.text.toString().first()
            var change_text=StringBuilder()
            for(char in text_org)
            {
                if (char==el)
                {
                    change_text.append(el_change)
                }else
                {
                    change_text.append(char)
                }
            }
            strok_orig.setText(change_text.toString())
        }
    }
}