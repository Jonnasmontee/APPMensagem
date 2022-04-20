package com.example.appmensagem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BTN_mensagem.setOnClickListener() {

            val MSG = ADT_mensagem.text.toString();

            TV_Resultado.text = MSG;


        }




    }
}