package com.example.kotlin.examples.clazz

class ExampleTask1 {


    fun isValidCharacter(s: String): Boolean {

        if (isEmpty(s))return false
        if (hasNumber(s))return false
        if (hasSpecialChar(s))return false

        return true
    }


    fun isEmpty(s: String): Boolean {

        if (s.isNullOrEmpty()) return true

        return false
    }


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
}