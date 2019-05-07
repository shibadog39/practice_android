package com.example.myapplication

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMenuBinding = DataBindingUtil.setContentView(this, R.layout.activity_menu)
        binding.view = this

    }

    fun selectDentaku() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)


    }



}
