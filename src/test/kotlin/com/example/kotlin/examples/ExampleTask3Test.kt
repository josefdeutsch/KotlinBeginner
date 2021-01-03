package com.example.kotlin.examples

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

import org.junit.Assert.*

//https://www.youtube.com/watch?v=gfrMIxGH1u0&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8&index=6

class ExampleTask3Test {

    @Test
    fun assertThatSpecifiedNumberPrintsGivenValue() {

        val getNumber = { x: Int ->
            when (x) {
                in 10..20 -> 1
                in 21..50 -> 2
                else -> throw IllegalArgumentException("message")
            }
        }

        assertThat(1, `is`(equalTo(getNumber(11))))
    }

    @Test(expected = IllegalArgumentException::class)
    fun assertThatAdditionThrowsException() {
        val getNumber = { x: Int ->

            when (x) {
                1 -> 2
                35 -> 1
                else -> throw IllegalArgumentException("message")
            }
        }

        assertThat(2, `is`(equalTo(getNumber(34))))
    }

    @Test
    fun assertThatAsigndValueIsEqualTo() {
        var index = 1

        fun inner(a: Int):String{

            return when (a) {
                1 -> "Uschi"
                2 -> "Beate"
                else -> throw IllegalArgumentException("message")
            }

        }

        var type: String = inner(index)

        assertThat("Uschi", `is`(equalTo(type)))
    }


}