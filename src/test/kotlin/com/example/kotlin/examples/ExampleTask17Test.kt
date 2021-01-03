package com.example.kotlin.examples

import com.example.kotlin.examples.clazz.*
import junit.framework.Assert
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test
import java.awt.Point

//https://medium.com/tompee/idiomatic-kotlin-higher-order-functions-and-function-types-adb59172796

class ExampleTask17Test {


    @Test
    fun assertThatLambdaHasValueEqualTo() {

        val actual: (Int) -> Int = { number -> number * number }
        val expected: Int = 4

        assertThat(expected, `is`(equalTo(actual(2))))

    }

    @Test
    fun assertThatLambdaHasValueTrueEqualTo() {

        val filter: (Int) -> Boolean = { it < 2 }
        assertTrue(filter(1))

    }

    @Test
    fun assertThatLambdaHasNullValueEqualTo() {

        val actual: (Int) -> Unit = { it -> it * it }

        assertNotNull(actual(2))

    }

    // high order func

    @Test
    fun assertThatNestedLambdaHasValueEqualTo() {

        fun getString(s: String): String {
            return s
        }

        fun nested(getString: (String) -> Unit) {
            getString("helloWorld")
        }

        nested {
            assertThat("helloWorld", `is`(equalTo(it)))
        }

    }

    @Test
    fun assertThatNestedLambdaWithParamHasValueEqualTo() {

        fun getString(s: String): String {
            return s
        }

        fun nested(a: Int, b: Int, getString: (String) -> Unit) {
            getString("helloWorld$a$b")
        }

        nested(1, 2) {
            assertThat("helloWorld12", `is`(equalTo(it)))
        }

    }

    // extension func

    @Test
    fun assertThatExstensionFunctionHasValueEqualTo() {

        val value = 1

        fun Int.arithmetic(a: Int):Int { return this.plus(a)}
        assertThat(3, `is`(equalTo(value.arithmetic(2))))

    }

}



