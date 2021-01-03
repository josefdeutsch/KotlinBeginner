package com.example.kotlin.examples

// abstract class

class ExampleTask13() : Task {

    override fun add(a: Int, b: Int): Int {
        return super.add(a, b)
    }

    override fun add2(a: Int, b: Int): Int {
        return a.plus(b)
    }

}
interface Task{

    fun add(a:Int,b:Int) = a.plus(b)
    fun add2(a:Int,b:Int):Int
}