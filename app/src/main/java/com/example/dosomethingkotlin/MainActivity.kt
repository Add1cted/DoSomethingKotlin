package com.example.dosomethingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd.setOnClickListener(){
            val firstVal:String=editText1.text.toString()
            val secondVal:String=editText2.text.toString()

            val result:Int=add(firstVal, secondVal)

            textAnswer.setText("Answer = "+result)
        }

        buttonSubtract.setOnClickListener(){
            val firstVal:String=editText1.text.toString()
            val secondVal:String=editText2.text.toString()

            val result:Int=subtract(firstVal, secondVal)

            textAnswer.setText("Answer = "+result)
        }

        buttonMultiply.setOnClickListener(){
            val firstVal:String=editText1.text.toString()
            val secondVal:String=editText2.text.toString()

            val result:Int=multiply(firstVal, secondVal)

            textAnswer.setText("Answer = "+result)
        }

        buttonDivide.setOnClickListener(){
            val firstVal:String=editText1.text.toString()
            val secondVal:String=editText2.text.toString()

            val result:Int=divide(firstVal, secondVal)

            textAnswer.setText("Answer = "+result)
        }
    }

    private fun add(firstVal: String, secondVal: String):Int
    {
        val a:Int = Integer.parseInt(firstVal)
        val b:Int = Integer.parseInt(secondVal)

        val sum:Int =a+b

        return sum
    }

    private fun subtract(firstVal: String, secondVal: String):Int
    {
        val a:Int = Integer.parseInt(firstVal)
        val b:Int = Integer.parseInt(secondVal)

        val sub:Int =a-b

        return sub
    }

    private fun multiply(firstVal: String, secondVal: String):Int
    {
        val a:Int = Integer.parseInt(firstVal)
        val b:Int = Integer.parseInt(secondVal)

        val mult:Int =a*b

        return mult
    }

    private fun divide(firstVal: String, secondVal: String):Int
    {
        val a:Int = Integer.parseInt(firstVal)
        val b:Int = Integer.parseInt(secondVal)

        val div:Int =a/b

        return div
    }
}
