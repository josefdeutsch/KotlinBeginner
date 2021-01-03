package com.example.kotlin.examples


import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test
import java.util.*

//www.youtube.com/watch?v=vF6wba3D1-0&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8&index=9

class ExampleTask6Test {


    @Test
    fun assertThatArrayHasValueEqualTo() {

        val array: Array<Any> = arrayOf(1, 2, 3, "string")
        val content: String = "[1, 2, 3, string]"

        assertThat(content, `is`(equalTo(Arrays.toString(array))))
    }

    @Test
    fun assertThatArrayHasSpecificValueEqualTo() {

        val array: Array<Any> = arrayOf(1, 2, 3, "string")

        assertThat("string", `is`(equalTo(array[3])))
    }

    @Test
    fun assertThatArrayHasSpecificUpdatedValueEqualTo() {

        val array: Array<Any> = arrayOf(1, 2, 3, "string")
        array[3] = 4

        assertThat(4, `is`(equalTo(array[3])))
    }

    @Test
    fun assertThatArrayHasFirstValueEqualTo() {

        val array: Array<Any> = arrayOf(1, 2, 3, "string")

        assertThat(1, `is`(equalTo(array.first())))
    }

    @Test
    fun assertThatArrayHasLastValueEqualTo() {

        val array: Array<Any> = arrayOf(1, 2, 3, "string")

        assertThat("string", `is`(equalTo(array.last())))
    }

    @Test
    fun assertThatArrayHasSetSpecificValueEqualTo() {

        val array: Array<Any> = arrayOf(1, 2, 3, "string")
        array.set(1,4)

        assertThat(4, `is`(equalTo(array[1])))
    }


    @Test
    fun assertThatArrayIndexOfSpecificValueEqualTo() {

        val array: Array<Any> = arrayOf(1, 2, 3, "string")

        assertThat(3, `is`(equalTo(array.indexOf("string"))))
    }

    @Test
    fun assertThatArraySumValueEqualTo() {

        val array: IntArray = intArrayOf(1,2,3,4)

        assertThat(10, `is`(equalTo(array.sum())))
    }

    @Test
    fun assertThatArrayMaxValueEqualTo() {

        val array: IntArray = intArrayOf(1,2,3,4)

        assertThat(4, `is`(equalTo(array.max())))
    }

    @Test
    fun assertThatArrayMinValueEqualTo() {

        val array: IntArray = intArrayOf(1,2,3,4)

        assertThat(1, `is`(equalTo(array.min())))
    }

    @Test
    fun assertThatArrayCountValueEqualTo() {

        val array: IntArray = intArrayOf(1,2,3,4)

        assertThat(4, `is`(equalTo(array.count())))
    }

    @Test
    fun assertThatArraySortedValueEqualTo() {

        val array: IntArray = intArrayOf(1,4,2,3)
        val content: String = "[1, 2, 3, 4]"

        assertThat(content, `is`(equalTo(Arrays.toString(array.sortedArray()))))
    }

    @Test
    fun assertThatArrayOneElementIsDivisbleByValueEqualTo() {

        val array: IntArray = intArrayOf(1,2,4,3)
        val number : Int? = array.find {
            it % 4 == 0
        }

        assertThat(4, `is`(equalTo(number)))
    }



}