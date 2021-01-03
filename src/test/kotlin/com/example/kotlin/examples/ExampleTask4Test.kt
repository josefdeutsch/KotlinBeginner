package com.example.kotlin.examples

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

import org.junit.Assert.*


//https://www.youtube.com/watch?v=MBnniF-o1AQ&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8&index=7

class ExampleTask4Test {


    //val aInt: Int? = a as? Int safe casts..


    @Test
    fun assertThatGivenValueIsNUll() {

        var string: String? = "hello"
        assertNull(string)

    }

    @Test
    fun assertThatNullableValueHasLengthOf() {

        var string: String? = "abc"
        assertThat(3, `is`(equalTo(string?.length)))

    }

    @Test
    fun assertThatNullableValueHasLengthNull() {

        var string: String? = null
        assertThat(null, `is`(equalTo(string?.length)))

    }

    @Test
    fun assertThatNullValueIsNotNullWithLocalFunc() {

        fun getValue(s: String?): Int {
            return s?.length ?: 0
        }
        assertNotNull(getValue(null))

    }

    @Test
    fun assertThatNullValueIsNotNullWithLambda() {

        val getValue = { s: String? -> s?.length ?: 0 }
        assertNotNull(getValue(null))

    }

    @Test
    fun assertThatNullValueIsInteger() {

        val getValue = { s: String? -> s?.length ?: 0 }
        assertThat(0, `is`(equalTo(getValue(null))))

    }
}