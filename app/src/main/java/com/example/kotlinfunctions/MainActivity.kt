package com.example.kotlinfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //void - unit
        mySum(10,20)

        //return
        val result =myMultply(10,20)
        textView.text = "Result= ${result}"

        /*button.setOnClickListener() {   //onclick tanımlamadan butona basınca ne olacağını yazıyoruz.
            println("button")
        }*/

        //Class
        val homer = Simpson("Homer Simpson",50,"Nuclear")
        //Object & Instance
        //homer.age = 60
        //homer.name ="Homer Simpson"
        //homer.job = "Nuclear"

        println(homer.age, )

        //Nullabilty
        //Nullable (?) &&Non-null

        var myString : String? = null // ? işareti nullable olarak çalıştır anlamında.
        var myAge : Int? = null
       // println(myAge!! * 10) // !! işareti koymak myAge değeri eminim kesin orda demek. //program çökecektir.

        //1-) null safety
        if (myAge != null){
            println(myAge * 10)

    }else {
        println("myAge null")
        }







    }

    fun mySum (a : Int,b:Int){
        textView.text = "Result: ${a+b}"
    }

    fun myMultply (x:Int,y:Int) : Int { //bu fonksiyonu Int olarak döndür demek ():Int
        return x * y
    }



    fun helloKotlin(view : View){
        textView.text ="Hello Kotlin"

    }
}