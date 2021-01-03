package com.example.kotlin.examples

import com.example.kotlin.examples.clazz.ExampleTask10
import com.example.kotlin.examples.clazz.ExampleTask12
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertThat
import org.junit.Test

//https://www.youtube.com/watch?v=CpME5rRUmZk&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8&index=10

class ExampleTask14Test {


    @Test
    fun assertThatPairFirstValueEqualTo() {

        val pair = Pair<String, Int>("abc", 1)

        assertThat("abc", `is`(equalTo(pair.first)))
    }


    @Test
    fun assertThatPairSecondValueEqualTo() {

        val pair = Pair<String, Int>("abc", 1)

        assertThat(1, `is`(equalTo(pair.second)))
    }

    @Test
    fun assertThatPairDestructuringSecondValueEqualTo() {

        val (key:String, value:Int) = Pair<String, Int>("abc", 1)

        assertThat("abc", `is`(equalTo(key)))
    }

    @Test
    fun assertThatTripleFirstValueEqualTo() {

        val triple = Triple<String, Int,Long>("abc", 1,23L)

        assertThat("abc", `is`(equalTo(triple.first)))
    }


    @Test
    fun assertThatTripleThridValueEqualTo() {

        val triple = Triple<String, Int,Long>("abc", 1,23L)

        assertThat(23L, `is`(equalTo(triple.third)))
    }

    @Test
    fun assertThatTripleDestructuringThirdValueEqualTo() {

        val (key:String, value:Int, valueL:Long) = Triple<String, Int,Long>("abc", 1,23L)

        assertThat(23L, `is`(equalTo(valueL)))
    }




}



