package com.example.btk_kotlin_1

fun main(){
//    println("mustafa")
    side()
}
fun integer(y: Byte=1){

    //implicit data type x
    val x = 5

    //explicit data type y
    val y: Byte = y

    val result = x*y

    println("$result")
}
fun floating(){
    val x: Float =2.5f // float icin sonuna f koy


}

fun string(){
    val x: String = "mustafa"

    for (s in x){
        println(s)
    }
    println(x + " uyar".uppercase())
}
fun side(){
    //integer()
//    floating()
    string()
}