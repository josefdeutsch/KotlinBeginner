package com.example.kotlin.examples.clazz

import com.example.kotlin.examples.clazz.ExampleTask11

// abstract class

class ExampleTask14 {

    lateinit var string: String

    fun setValue(string: String) {
        this.string = string
    }

    fun getValue() = if(::string.isInitialized) string else "default"


}
