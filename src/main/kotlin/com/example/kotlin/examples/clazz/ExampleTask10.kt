package com.example.kotlin.examples.clazz

import com.example.kotlin.examples.clazz.ExampleTask9


class ExampleTask10(val a1:Int, val b1: Int) : ExampleTask9(a1,b1){

    lateinit var string: String

    override fun add(): Int {
        return a1.plus(b1)
    }

}

