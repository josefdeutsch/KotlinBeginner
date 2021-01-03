package com.example.kotlin.examples

import com.example.kotlin.examples.clazz.ExampleTask5
import com.example.kotlin.examples.clazz.ExampleTask6
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

////https://www.youtube.com/watch?v=CpME5rRUmZk&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8&index=10

class ExampleTask11Test {

    @Test
    fun assertThatCompanionObjectHasValueEqualTo() {

        var result = ExampleTask5.add(2,3)

        assertThat(5, `is`(equalTo(result)))

    }

    @Test
    fun assertThatObjectIsSingletonValueEqualTo() {

        val x = ExampleTask6.toString()
        val y = ExampleTask6.toString()


        assertThat(x, `is`(equalTo(y)))

    }
}