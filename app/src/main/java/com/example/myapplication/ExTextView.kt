package com.example.myapplication

import android.databinding.BindingAdapter
import android.widget.TextView

object ExTextView {
    @BindingAdapter("numberWithComma")
    @JvmStatic
    fun setComma(view: TextView, number: String){
        if(number){

        }
        view.text = String.format("%1$,3d", number)
    }
}