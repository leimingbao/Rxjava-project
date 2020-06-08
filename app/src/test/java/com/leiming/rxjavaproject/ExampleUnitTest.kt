package com.leiming.rxjavaproject

import com.leiming.rxjavaproject.rxjavasimple.Observable
import com.leiming.rxjavaproject.rxjavasimple.Observer
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
    fun rxjava() {
        val observable = Observable()

        val observer: Observer = Observer("leiming")
        val observer2: Observer = Observer("li")
        val observer3: Observer = Observer("tangyuan")

        observable.add(observer)
        observable.add(observer2)
        observable.add(observer3)

        observable.notifys("今天天气温度21")
    }
}