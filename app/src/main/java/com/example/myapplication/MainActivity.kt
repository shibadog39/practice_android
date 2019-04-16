package com.example.myapplication

import android.databinding.DataBindingUtil
import android.databinding.Observable
import android.databinding.ObservableField
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    //var→codeで変更するとき val→変更しない(ObservableFieldだと変えられる)
    var numberText :String = "0"
    val text1 :ObservableField<String> = ObservableField( "")
    val text2 :ObservableField<String> = ObservableField( "")
    val symbol :ObservableField<SymbolTypeEnum> = ObservableField()

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
        if (text2.get()=="0"){
            text2.set("")
        }
        text2.set(text2.get() + number)
    }

    fun plusButton(){
        numberText = text2.get().toString()
        symbol.set(SymbolTypeEnum.PLUS)
        text2.set("0")
    }

    fun equalButton(){
        if(text2.get() == null){
            return
        }

        if(symbol.get() == null){
            return
        }

//        こうともかける
//        text2.get()?.let {
//            symbol.get()?.let {
//
//            }
//
//        }


       // kotlinだとswitchではなくwhen
        when(symbol.get()){
            SymbolTypeEnum.PLUS -> {
                // !! nullが入るかのうせいがあるものにnull来ないよと証明する 強制アンラップ
               val answer = text2.get()!!.toInt() + numberText.toInt()
                text2.set(answer.toString())
            }
            SymbolTypeEnum.MINUS -> {
                // !! nullが入るかのうせいがあるものにnull来ないよと証明する 強制アンラップ
                val answer = text2.get()!!.toInt() - numberText.toInt()
                text2.set(answer.toString())
            }else ->{
            text2.set("0")
        }
        }

//        ↓のようにsetの中にwhenを含むこともできる
//        text2.set(when(symbol.get()){
//            SymbolTypeEnum.PLUS -> {
//                // !! nullが入るかのうせいがあるものにnull来ないよと証明する 強制アンラップ
//                val answer = text2.get()!!.toInt() + numberText.toInt()
//
//            }
//            SymbolTypeEnum.MINUS -> {
//                // !! nullが入るかのうせいがあるものにnull来ないよと証明する 強制アンラップ
//                val answer = text2.get()!!.toInt() - numberText.toInt()
//
//            }else ->{
//                0
//            }
//        }.toString())


    }

    enum class SymbolTypeEnum(val code: String, val label: String, val symbol: String){
        PLUS("0", "足し算", "+"),
        MINUS("1", "引き算", "-")
    }
}
