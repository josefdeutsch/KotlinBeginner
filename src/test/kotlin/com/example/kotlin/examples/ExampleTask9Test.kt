package com.example.kotlin.examples

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertThat
import org.junit.Test

//https://www.youtube.com/watch?v=CpME5rRUmZk&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8&index=10

class ExampleTask9Test {

    @Test
    fun assertThatForLoopHasTotalValueEqualTo() {

        var result : Int = 1

        for(number: Int in 0 until 3 ) {result += result}

        assertThat(8, `is`(equalTo(result)))
    }

    @Test
    fun assertThatForLoopHasTotal2ValueEqualTo() {

        var result : Int = 1

        for(number: Int in 0 until 5 step 2) {result += result}

        assertThat(8, `is`(equalTo(result)))
    }

    @Test
    fun assertThatForLoopHasTotal3ValueEqualTo() {

        var result : Int = 1

        for(number: Int in 2 downTo 0) {result += result}

        assertThat(8, `is`(equalTo(result)))
    }

    @Test
    fun assertThatForLoopHasTotal4ValueEqualTo() {

        var result : Int = 1

        for(number: Int in 4 downTo 0 step 2) {result += result}

        assertThat(8, `is`(equalTo(result)))
    }


    @Test
    fun assertThatArrayHasValueEqualTo() {

        val expectedOutput = arrayOf("apple", "mango", "grape")
        val output = arrayOf("apple", "mango", "grape")

        assertArrayEquals(expectedOutput, output)

    }

    @Test
    fun assertThatArrayHasValueUpdatedEqualTo() {

        val expectedOutput = arrayOf("apple", "mango", "grape")
        val output = arrayOf("apple1", "mangof", "grape3")

        var input = { str: String -> str.substring(0, str.length - 1) }
        var expected = expectedOutput.get(1)

        assertThat(expected, `is`(equalTo(input(output.get(1)))))

    }

    @Test
    fun assertThatMutableArrayHasValueEqualTo() {

        val expectedOutput = arrayOf("abc", "abc", "abc")
        val output = arrayOf("apple1", "mangof", "grape3")

        for(index: Int in output.indices){
            output[index] = "abc"
        }

        assertArrayEquals(expectedOutput, output)

    }

    @Test
    fun assertThatMutableArrayHasValueWithIndexEqualTo() {

        val expectedOutput = arrayOf("abc", "abc", "abc")
        val output = arrayOf("apple1", "mangof", "grape3")

        for((index: Int,value: String) in output.withIndex()){
            output[index] = "abc"
        }

        assertArrayEquals(expectedOutput, output)

    }
    @Test
    fun assertThatMutableArrayHasValueForEachEqualTo() {

        val expectedOutput = arrayOf("abc", "abc", "abc")
        val output = arrayOf("apple1", "mangof", "grape3")

        output.forEachIndexed { index,string ->
            output.set(index,"abc")
        }

        assertArrayEquals(expectedOutput, output)

    }

}