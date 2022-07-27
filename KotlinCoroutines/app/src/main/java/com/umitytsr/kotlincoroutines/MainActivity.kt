package com.umitytsr.kotlincoroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Scope -> coroutine'nin nerede çalışacağını ve yaşam döngüsünü belirleyen yapıdır.
        //Global scope -> bütün application içinde çalıştırabileceğimiz kapsamda açılır.
        //runnblocking -> oluşturduğuğu scope'ları bloklayarak işini yapar.
        //coroutinescope -> içindeki bütün coroutine'ler bitene kadar çalışmaya devam eder.


        /* runBlocking
        println("run blocking start")
        runBlocking {
            //Coroutine başlatma kelimelerimizden bir tanesi launch'dur.
            launch {
                delay(2000)
                println("run blocking")
            }
            println("run blocking end")
        } */


        /*
        //GlobalScope
        println("Global Scope Start ")
        GlobalScope.launch {
            delay(5000)
            println("Global Scope")
        }
        println("Global Scope End")
        */


        /*
        //CoroutineScope
                /*CoroutineScope ile GlobalScope birbirlerine çok benzer ama arqadaki fark
                  CoroutineScope'da çalışacağı yerleri biz seçebiliyorken GlobalScope'da tüm uygulama
                  içinde çalıştırmış oluyoruz */
        println("CoroutineScope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(5000)
            println("CoroutineScope")
        }
        println("CoroutineScope End")
        */

    }
}