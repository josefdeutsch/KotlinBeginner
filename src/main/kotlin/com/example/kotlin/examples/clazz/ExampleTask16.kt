package com.example.kotlin.examples.clazz

import com.example.kotlin.examples.clazz.ExampleTask11

// abstract class

class ExampleTask16<T : Any, K>(t: T, k: K) {

    lateinit var lateT: T

    fun <F> combineToString(val1: F, val2: F) = "$val1$val2"

    fun getValue() = if (::lateT.isInitialized) lateT else -1

    fun setValue(t: T): Unit {
        this.lateT = t
    }
}
