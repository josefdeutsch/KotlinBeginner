package com.example.kotlin.examples

import com.example.kotlin.examples.clazz.ExampleTask10
import com.example.kotlin.examples.clazz.ExampleTask12
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertThat
import org.junit.Test

//https://www.youtube.com/watch?v=CpME5rRUmZk&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8&index=10

class ExampleTask13Test {


    @Test
    fun assertThatClassInheritanceValueEqualTo() {

        val example = ExampleTask10(1, 2)

        assertNotEquals(3, `is`(equalTo(example.add())))
    }

    @Test
    fun assertThatOverrideFunctionValueEqualTo() {

        val example = ExampleTask12()

        assertThat(3, `is`(equalTo(example.addition())))
    }

    @Test
    fun assertThatInterfaceDefaultValueEqualTo() {

        val example = ExampleTask13()

        assertThat(3, `is`(equalTo(example.add(1,2))))
    }

    @Test
    fun assertThatInterfaceOverrideValueEqualTo() {

        val example = ExampleTask13()

        assertThat(3, `is`(equalTo(example.add2(1,2))))
    }


}