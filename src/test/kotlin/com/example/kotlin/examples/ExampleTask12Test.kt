package com.example.kotlin.examples

import com.example.kotlin.examples.clazz.ExampleTask7
import com.example.kotlin.examples.clazz.ExampleTask8
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

//https://www.youtube.com/watch?v=CpME5rRUmZk&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8&index=10

class ExampleTask12Test {


    @Test
    fun assertThatDataClassHasValueEqualTo() {

        val example = ExampleTask7(1)

        assertThat(1, `is`(equalTo(example.component1())))
    }

    @Test
    fun assertThatDataClassCopyHasValueEqualTo() {

        val example = ExampleTask7(1)
        val example2 = example.copy(2)

        assertThat(2, `is`(equalTo(example2.component1())))

    }

    @Test
    fun assertThatDataClassHasValue2EqualTo() {

        val example = ExampleTask8()
        val (b: Int) = example

        assertThat(2, `is`(equalTo(b)))

    }


}