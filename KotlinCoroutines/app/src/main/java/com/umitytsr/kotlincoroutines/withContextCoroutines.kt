package com.umitytsr.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main(){
    //Aşağıdaki örnek bir dispatchers'dan diğerine nasıl geçeceğimizi gösteriyor.

    runBlocking {

        launch(Dispatchers.Default) {
            println("Context : ${coroutineContext}")
            withContext(Dispatchers.IO){
                println("Context : ${coroutineContext}")

                /*Bir launch içinden diğer launch'a bu şekilde referans verebiliriz. Bunu en çok üstte
                  IO, altta Main yazdığımız örneklerde görürüz. */

            }
        }
    }
}