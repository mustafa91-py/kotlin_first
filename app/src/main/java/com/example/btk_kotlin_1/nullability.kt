package com.example.btk_kotlin_1

val yas = "20aaa"
val yas2 = yas.toIntOrNull() // pythondaki try except gibi
fun deneme(input:String="20"){
    var input = input
    val nullability = input.toIntOrNull()
    println(nullability?.div(2) ?: "hata") // elvis operatoru
    println(nullability)
    nullability?.let { //pythondaki if gibi
        println(nullability * 5)
    }
}

fun main(){
//    if (yas2 != null) {//pythondaki is ile aynı
//        println("yasi = $yas2")
//    }
//    else println("ondalik sayi girin")
    deneme("20")

}
