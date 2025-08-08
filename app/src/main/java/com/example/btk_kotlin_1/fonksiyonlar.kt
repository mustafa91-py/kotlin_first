package com.example.btk_kotlin_1
var x = 1 //global degisken
fun kare(kenar:Int): Int{
    println("kenarin degeri $kenar")//local degisken
    println("x $x kere cagrildi")
    x++ //global degiskeni kullandık
    return x
}
fun main(){
    kare(9)//fonksiyonu cagirdik
    kare(3)

}