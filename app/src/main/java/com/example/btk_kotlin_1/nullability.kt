package com.example.btk_kotlin_1

val yas = "20aaa"
val yas2 = yas.toIntOrNull() // pythondaki try except gibi
fun main(){
    if (yas2 != null) {//pythondaki is ile aynı
        println("yasi = $yas2")
    }
    else println("ondalik sayi girin")

}