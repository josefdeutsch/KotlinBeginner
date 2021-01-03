package com.example.kotlin.examples

import com.example.kotlin.examples.clazz.*
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertThat
import org.junit.Test

//https://www.youtube.com/watch?v=CpME5rRUmZk&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8&index=10

class ExampleTask15Test {


    @Test
    fun assertThatInitValueEqualTo() {

        val example = ExampleTask15("abc",ExampleType.FIRST)

        assertThat("abc is FIRST", `is`(equalTo(example.print())))
    }




}



