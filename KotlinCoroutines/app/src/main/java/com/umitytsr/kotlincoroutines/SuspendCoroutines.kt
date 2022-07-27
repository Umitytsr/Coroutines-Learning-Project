package com.umitytsr.kotlincoroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        delay(2000)
        println("run blocking")
        myFunction()
    }

}

suspend fun myFunction (){
    /*SuspendScope -> İçerisinde coroutine çalıştırabildiğimiz programlardır. İstediğimiz zaman durdurup
                      devam etmemiz için işe yararlar. Eğer ki bir coroutine çalıştırılacaksa onun suspend
                      olması gerekir.
                      */
    coroutineScope {
        delay(4000)
        println("suspend function")

    }

}