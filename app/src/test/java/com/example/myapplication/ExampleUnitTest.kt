package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun somme() {
        println("************************************************")

        for (i in 1..10){
            println(i)
        }

        println("************************************************")
    }
    @Test
    fun ex12() {
        var n=10
        var s=0
        println("************************************************")
        for (i in 1 until n){
            if (i%2==0){
                s=s+i
            }
        }
        println(s)
        println("************************************************")
    }
    @Test
    fun ex13() {
        var n=4
        var f=1

        println("************************************************")
        while (n>1){
            f=f*n
            n=n-1
        }

              println(f)
        println("************************************************")
    }

@Test
    fun ex15 (){
        var n=478789
        var f= n.toString()

    println("************************************************")
    println(f.length)
    println("************************************************")
}
}
