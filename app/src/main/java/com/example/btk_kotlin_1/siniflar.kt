package com.example.btk_kotlin_1

class Person {
    var isim:String? = null
    var soyisim:String? = null
    var yas:Int? = null
    var meslek:String? = null

    constructor(isim:String,soyisim:String,yas:Int,meslek:String){//pythondaki init metodu gibi
        this.isim = isim //pythondaki self gibi
        this.soyisim = soyisim
        this.yas = yas
        this.meslek = meslek
        println("constructor calisti")
    }

    override fun toString(): String { //pythondaki str metodu gibi
        return "isim: $isim soyisim: $soyisim yas: $yas meslek: $meslek"
    }

}
class Person2(var isim:String,var soyisim:String,var yas:Int,var meslek:String){
    override fun toString(): String {
        return "isim: $isim soyisim: $soyisim yas: $yas meslek: $meslek"

}
}
fun main(){
    val kisi = Person("mustafa","uyar",29,"molekuler biyolog")
//    kisi.isim = "mustafa"
//    kisi.soyisim = "uyar".uppercase()
//    kisi.yas = 29
//    kisi.meslek = "molekuler biyolog"
    println(kisi)
    val kisi2 =Person2("mustafa","uyar",29,"proses")
    println(kisi2)
}