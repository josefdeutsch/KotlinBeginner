package com.example.kotlin.examples

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

//https://www.youtube.com/watch?v=CpME5rRUmZk&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8&index=10

class ExampleTask8Test {


    @Test
    fun assertThatMapHasValueEqualTo() {

        val map: Map<String, Int> = mapOf("John" to 1, "Helen" to 2)
        val content: String = "{John=1, Helen=2}"

        assertThat(content, `is`(equalTo(map.toString())))

    }

    @Test
    fun assertThatMapGetValueEqualTo() {

        val map: Map<String, Int> = mapOf("John" to 1, "Helen" to 2)

        assertThat(1, `is`(equalTo(map["John"])))

    }

    @Test
    fun assertThatMapGetValueConditionalEqualTo() {

        val map: Map<String, Int> = mapOf("John" to 1, "Helen" to 2)

        assertThat(1, `is`(equalTo(map.count {
            it.value > 1
        })))

    }

    @Test
    fun assertThatMapSizeValueEqualTo() {

        val map: Map<String, Int> = mapOf("John" to 1, "Helen" to 2)

        assertThat(2, `is`(equalTo(map.count())))

    }

    @Test
    fun assertThatMutableMapInsertedHasValueEqualTo() {

        val map: MutableMap<String, Int> = mutableMapOf("John" to 1, "Helen" to 2)
        map.put("Susanne",3)

        assertThat(3, `is`(equalTo(map.count())))

    }

    @Test
    fun assertThatMutableMapRemoveHasValueEqualTo() {

        val map: MutableMap<String, Int> = mutableMapOf("John" to 1, "Helen" to 2)
        map.remove("John")

        assertThat(1, `is`(equalTo(map.count())))

    }

    @Test
    fun assertThatMutableMapContainsValueEqualTo() {

        val map: MutableMap<String, Int> = mutableMapOf("John" to 1, "Helen" to 2)

        assertThat(true, `is`(equalTo(map.containsValue(1))))

    }

    @Test
    fun assertThatMutableMapContainsKeyEqualTo() {

        val map: MutableMap<String, Int> = mutableMapOf("John" to 1, "Helen" to 2)

        assertThat(true, `is`(equalTo(map.containsKey("John"))))

    }

    @Test
    fun assertThatMutableMapFilterKeyValueEqualTo() {

        val map: MutableMap<String, Int> = mutableMapOf("John" to 1, "Helen" to 2)
        val content: String = "<{John=1}>"

        assertThat(content, `is`(equalTo(map.filterKeys{
            it == "John"
        }).toString()))

    }

    @Test
    fun assertThatMutableMapFilterValueEqualTo() {

        val map: MutableMap<String, Int> = mutableMapOf("John" to 1, "Helen" to 2)
        val content: String = "<{John=1}>"

        assertThat(content, `is`(equalTo(map.filterValues{
            it == 1
        }).toString()))

    }

    @Test
    fun assertThatMutableMapHSortedHasValueEqualTo() {

        val map: MutableMap<String, Int> = mutableMapOf("John" to 1,"Helen" to 2)
        map.toSortedMap()
        val content: String = "{John=1, Helen=2}"

        assertThat(content, `is`(equalTo(map.toString())))

    }

    @Test
    fun assertThatMutableMapReturnDefaultValueEqualTo() {

        val map: MutableMap<String, Int> = mutableMapOf("John" to 1,"Helen" to 2)

        assertThat(-1, `is`(equalTo(map.getOrDefault("notPresent",-1))))

    }

    @Test
    fun assertThatMutableMapKeysHasKeyEqualTo() {

        val map: Map<String, Int> = mapOf("John" to 1, "Helen" to 2)
        val content: String = "[John, Helen]"

        assertThat(content, `is`(equalTo(map.keys.toString())))

    }

    @Test
    fun assertThatMutableMapValuesHasValueEqualTo() {

        val map: Map<String, Int> = mapOf("John" to 1, "Helen" to 2)
        val content: String = "[1, 2]"

        assertThat(content, `is`(equalTo(map.values.toString())))

    }

}