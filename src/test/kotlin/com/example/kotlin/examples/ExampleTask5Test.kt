package com.example.kotlin.examples

import junit.framework.Assert.assertNotNull
import junit.framework.Assert.assertNull
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

// https://www.youtube.com/watch?v=K-luYtjqe8Y&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8&index=8

class ExampleTask5Test {


    @Test
    fun assertThatFunctionReturnsStringIsNull() {

        fun nullReturn(): String? {
            var s: String? = null
            return s
        }
        assertNull(nullReturn())
    }

    @Test
    fun assertThatFunctionReturnsUnitIsNull() {

        fun nullReturn(): Unit? {
            var s: Unit? = null
            return s
        }
        assertNull(nullReturn())
    }


    @Test
    fun assertThatSingleExpressionReturnResult() {

        fun add(a: Int,b: Int) = a.plus(b)
        assertThat(5, `is`(equalTo(add(2,3))))
    }

    @Test
    fun assertThatFunctionReturnsUnitIsNotNull() {

        fun nullReturn(): Unit {

        }
        assertNotNull(nullReturn())
    }

}