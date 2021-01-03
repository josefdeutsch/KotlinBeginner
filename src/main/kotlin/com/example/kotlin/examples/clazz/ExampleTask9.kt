package com.example.kotlin.examples.clazz

// Inheritance

open class ExampleTask9(val a:Int, val b: Int) {

    open fun add() = a.plus(b)

    open fun add(a: Int,b: Int) = a.plus(b)

}

