package com.example.kotlin.examples.clazz

// abstract class

class ExampleTask15(val string:String, val type:ExampleType) {

    fun print():String{
       return "$string is $type"
    }


}
enum class ExampleType(s: String) {
    FIRST("first"),
    SECOND("second")
}