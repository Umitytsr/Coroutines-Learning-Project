package com.umitytsr.kotlincoroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){

    var userName = ""
    var userAge = 0

    runBlocking {
        val downloadedName = async {
            downloadName()
        }
        val downloadedAge = async {
            downloadAge()
        }

        userName = downloadedName.await()
        userAge = downloadedAge.await()

        //.await() -> thread'i bloklamadan sırayla inmesini bekliyor

        println("${userName} ${userAge}")
    }

}

suspend fun downloadName() : String {
    delay(2000)
    val userName = "Ümit:"
    println("username download")
    return userName
}

suspend fun downloadAge() : Int{
    delay(4000)
    val userAge = 24
    println("userage download")
    return  userAge
}
