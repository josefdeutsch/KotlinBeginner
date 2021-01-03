package com.example.kotlin.examples

import org.hamcrest.CoreMatchers
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

import org.junit.Assert.*

class ExampleTask2Test {

    @Test
    fun addition() {
        val result = { x: Int, y: Int -> x.plus(y) }
        assertThat(5, `is`(equalTo(result(2, 3))))
    }

    @Test
    fun concat() {
        val string = { a: String, b: String -> "$a$b" }
        assertThat("ab", `is`(equalTo(string("a", "b"))))
    }

    @Test
    fun getLength() {
        val len = { a: String -> a.length }
        assertThat(3, `is`(equalTo(len("abc"))))
    }

    @Test
    fun getChar() {
        val ch = { a: String -> a[0] }
        assertThat('a', `is`(equalTo(ch("abc"))))
    }
}