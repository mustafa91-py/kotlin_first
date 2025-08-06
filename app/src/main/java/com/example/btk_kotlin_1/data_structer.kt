package com.example.btk_kotlin_1

fun main(){
    //array sıfırdan başlıyor
    // arrayOf genişletilniyor ne kadar eklersen o kadar genişletiyor
//    val myArray = arrayOf("mustafa","ahmed","ali")
//    println(myArray[0])
//    println(myArray[1])
//    println(myArray.get(2))
//    println(myArray.last())

//    kumeler()
    kumeler_deneme()
}

fun Listeler(){
    val myList = listOf<String>("mustafa","ahmed","ali")
     
}
fun kumeler(){
    val kume = setOf<Int>(1,2,3,4,1,1)//sonradan ekleme yapılmaz
    println(kume)
    kume.forEach {
        println(it)

    }
    //hash setler setlere göre hızlıdır
    println("hash set")
    val hash_set = HashSet<Int>() // sonradan ekleme yapılır
    hash_set.add(1)
    hash_set.add(2)
    hash_set.add(3)
    hash_set.add(4)
    hash_set.add(1)
    hash_set.forEach {
        println(it)
    }

}

fun kumeler_deneme(){
    val kume = setOf<Int>(1,2,3,4,1,1)
    val kume2 = setOf<Int>(1,1,5,2,2)
    val kume3 = kume.union(kume2)
    val kume4 = kume.intersect(kume2)
    println("bireşimi $kume3")
    println("kesişimi $kume4")


}