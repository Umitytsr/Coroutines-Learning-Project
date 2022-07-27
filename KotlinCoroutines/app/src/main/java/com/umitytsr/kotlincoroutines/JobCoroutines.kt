package com.umitytsr.kotlincoroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    //launch çalıştırdığımız her şeyi Job'a eşitleyebiliyoruz.
    //Job -> döndürülen işleri sonradan kontrol edebiliyoruz.

    runBlocking {

        val myJob = launch {
            delay(2000)
            println("job")
        }

        myJob.invokeOnCompletion {
            //.invokeOnCompletion -> myJob bittiği zaman ne yapılacağını yaz gibi işlere yarar.
            println("my job end")
        }
    }
}