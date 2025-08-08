package com.example.btk_kotlin_1

fun if_ler(){
    val skor:Int = 10
    for (i in 1..skor){
        if (i % 2 == 0){
            println("cift $i")
        }
        else {
            println("tek $i")
        }
    }
}
fun when_control(){
    val gramaj:Int = 0
    var mesaj:String = ""
    when(gramaj){
        0 -> mesaj = "sıfır"
        10 -> mesaj = "on"
        else -> mesaj = "hata"
    }
    println(mesaj)
}
fun while_dongusu(){
    var j = 1
    while (j<10){
        println("$j mumdur")
        j++
    }
}
fun for_dongusu(){
    val dizi = arrayOf(1,2,3,4,5)
    for (i in dizi){
        println("$i nin karesi ${i*i}")
    }
    dizi.forEach { it ->
        println("$it nin kupu ${it*it*it}")
    }
}
fun main(){
//    if_ler()
//    when_control()
//    while_dongusu()
    for_dongusu()

}
