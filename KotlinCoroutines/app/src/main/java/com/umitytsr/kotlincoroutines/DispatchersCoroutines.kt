package com.umitytsr.kotlincoroutines

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    /*Dispatchers.Default -> CPU yoğun işlerde kullanılır. Örneğin görsel işleme, çok uzun bi diziyi
                             alfabetik olarak dizme VB.Yani kısaca işlemciyi çok kullanacak işlemse
                             .Default kullanılması daha uygun olur.

      Dispatchers.IO -> Input, Output, networking işleri .yani internetten veri çekmek için kullanılır.

      Dispatcher.Main -> UI ile yapılacak işlemler.Yani kullanıcı arayüzü,kullanıcının göreciği
                         işlemleri bununla yaparız.Defaultta yapılan işlemleri Main ile gösterebiliriz.

      Dispatcher.Unconfined -> Inherited dicpatcher.Yani miras alıyor.İçerisinde çalıştığı yere göre
                               değişiyor.
     */

    /*
    runBlocking {
        launch(Dispatchers.Main) {
            println("Main Thread: ${Thread.currentThread().name}")
                //.currentThread() -> güncel thread neyse onu aldırır.
        }
        launch(Dispatchers.IO) {
            println("IO Thread: ${Thread.currentThread().name}")

        }
        launch(Dispatchers.Default) {
            println("Default Thread: ${Thread.currentThread().name}")

        }
        launch(Dispatchers.Unconfined) {
            println("Unconfined Thread: ${Thread.currentThread().name}")

        }
    }

    */
}