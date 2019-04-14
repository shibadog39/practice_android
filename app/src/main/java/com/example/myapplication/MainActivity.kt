package com.example.myapplication

import android.databinding.DataBindingUtil
import android.databinding.Observable
import android.databinding.ObservableField
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val text :String = "テキストだよ"
    val text1 :ObservableField<String> = ObservableField( "")
    val text2 :ObservableField<String> = ObservableField( "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.view = this

//        setContentView(R.layout.activity_main)
//
//        val view: TextView = findViewById(R.id.text)

        text2.set("0")

    }


    fun selectButton(number: Int){
        text1.set(text2.get())
        val result = number + Integer.parseInt(text2.get())
        text2.set("" + result)
    }
}
