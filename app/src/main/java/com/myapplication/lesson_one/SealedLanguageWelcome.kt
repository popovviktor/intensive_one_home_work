package com.myapplication.lesson_one

sealed class SealedLanguageWelcome(val welcome:String) {
    class RuLanguageWelcome:SealedLanguageWelcome("Добро пожаловать!")
    class EnLanguageWelcome:SealedLanguageWelcome("Welcome!")
}