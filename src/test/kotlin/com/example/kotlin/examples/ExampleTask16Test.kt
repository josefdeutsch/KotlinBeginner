package com.example.kotlin.examples

import com.example.kotlin.examples.clazz.*
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertThat
import org.junit.Test

//https://www.youtube.com/watch?v=CpME5rRUmZk&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8&index=10

class ExampleTask16Test {


    @Test
    fun assertThatNullableStringHasValueEqualTo() {

        val string: String? = "default"

        string?.let {
            assertThat("default", `is`(equalTo(it)))
        }
    }

    @Test
    fun assertThatInitValueEqualTo() {

        val actual = mutableListOf("one", "two", "three", "four", "five")
        val expected = "[5]"

        actual.map { it.length }.filter { it > 4 }.let {
            assertThat(expected, `is`(equalTo(it.toString())))
        }
    }

    @Test
    fun assertThatObjectHasValueEqualTo() {

        val actual = ExampleTask10(2, 3).run { add() }
        val expected = 5

        assertThat(expected, `is`(equalTo(actual)))
    }

    @Test
    fun assertThatObjectHasValueUpdatedEqualTo() {

        // will always return context object!
        val actual = ExampleTask10(2, 3).apply {
            string = "hello world"
        }

        assertThat("hello world", `is`(equalTo(actual.string)))
    }

    @Test
    fun assertThatCombinedHasValueUpdatedEqualTo() {

        // will always return context object!
        val actual = ExampleTask16(1,"").run {
            setValue(1)
            getValue()
        }

        assertThat(1, `is`(equalTo(actual)))
    }
    // also operator side effects..
    @Test
    fun assertThatCombinedNotHasValueUpdatedEqualTo() {

        // will always return context object!
        val actual = ExampleTask16(1,"").run {

            getValue()
        }

        assertThat(-1, `is`(equalTo(actual)))
    }

    @Test
    fun assertThatCombinedToStringHasValueUpdatedEqualTo() {

        // will always return context object!
        val actual = ExampleTask16(1,"").run {
            combineToString("hello ","world")
        }

        assertThat("hello world", `is`(equalTo(actual)))
    }
}



