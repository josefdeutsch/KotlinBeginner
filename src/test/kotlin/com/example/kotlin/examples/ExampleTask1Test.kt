package com.example.kotlin.examples

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Test

import org.junit.Assert.*

class ExampleTask1Test {

    val isEmpty = {
            s: String -> if (s.isNullOrEmpty()) true else false
    }

    @Test
    fun assertThatStringisEmpty() {

        assertThat(true, `is`(equalTo(isEmpty(""))))
    }

    @Test
    fun assertThatStringisNotEmpty() {

        fun isNotEmpty(s: String): Boolean {

            if (s.isNullOrEmpty()) return true
            return false
        }

        assertThat(false, `is`(equalTo(isNotEmpty("notempty"))))

    }

    @Test
    fun assertThatStringhasNumber() {

        val string = "1anyOneNumber"

        fun hasNumber(s: String): Boolean {

            val pattern = "\\d+".toRegex()
            val found = pattern.findAll(s)

            found.forEach { f ->
                val m = f.value
                if (m.isNotEmpty()) return true
                println(m)
            }

            return false
        }

        assertThat(true, `is`(equalTo(hasNumber(string))))
    }

    @Test
    fun assertThatStringhasNoNumber() {

        val string = "anyNoNumber"

        fun hasNumber(s: String): Boolean {

            val pattern = "\\d+".toRegex()
            val found = pattern.findAll(s)

            found.forEach { f ->
                val m = f.value
                if (m.isNotEmpty()) return true
                println(m)
            }

            return false
        }

        assertThat(false, `is`(equalTo(hasNumber(string))))
    }

    @Test
    fun assertThatStringHasSpecialChar() {

        val string = "!anySpecialChar"

        fun hasSpecialChar(s: String): Boolean {

            val pattern = "[ -\\/:-@\\[-\\`{-~]+".toRegex()
            val found = pattern.findAll(s)

            found.forEach { f ->
                val m = f.value
                if (m.isNotEmpty()) return true
                println(m)
            }
            return false
        }

        assertThat(true, `is`(equalTo(hasSpecialChar(string))))
    }

    @Test
    fun assertThatStringHasNoSpecialChar() {

        val string = "anySpecialChar"

        fun hasNoSpecialChar(s: String): Boolean {

            val pattern = "[ -\\/:-@\\[-\\`{-~]+".toRegex()
            val found = pattern.findAll(s)

            found.forEach { f ->
                val m = f.value
                if (m.isNotEmpty()) return true
                println(m)
            }
            return false
        }

        assertThat(false, `is`(equalTo(hasNoSpecialChar(string))))
    }
}