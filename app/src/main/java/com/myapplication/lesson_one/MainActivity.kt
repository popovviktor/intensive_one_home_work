package com.myapplication.lesson_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name:String? = null
        name = "Ivan"
        name?.let {
            val user1 = User(name = it)
            println(user1)
        }
        val user2 = User("Sergey").apply {
            age = 15
        }
        println(user2)
        val arrayNumbers = arrayListOf<Int>()
        with(arrayNumbers){
            add(4)
            add(5)
            println("Количество элементов в массиве : " +size)
        }
        arrayNumbers.run {
            add(6)
            println("Количество элементов в массиве : " +size)
        }
        arrayNumbers.also { it.add(7) }
        writeToConloseWelcomeText(SealedLanguageWelcome.RuLanguageWelcome())

    }



    fun writeToConloseWelcomeText(sealedLanguageWelcome: SealedLanguageWelcome){
        when(sealedLanguageWelcome){
            is SealedLanguageWelcome.EnLanguageWelcome->{
                println(sealedLanguageWelcome.welcome)
            }
            is SealedLanguageWelcome.RuLanguageWelcome->{
                println(sealedLanguageWelcome.welcome)
            }
        }
    }
}