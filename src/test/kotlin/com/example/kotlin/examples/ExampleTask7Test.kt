package com.example.kotlin.examples


import junit.framework.Assert.*
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test
import java.util.*

//https://www.youtube.com/watch?v=CpME5rRUmZk&list=PL6nth5sRD25iv8jZrQWD-5dXgu56ae5m8&index=10

class ExampleTask7Test {


    @Test
    fun assertThatMutableListHasValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)
        val content: String = "[1, 2, 3, 4]"

        assertThat(content, `is`(equalTo(array.toString())))
    }

    @Test
    fun assertThatMutableListHasValueRemovedEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)
        val content: String = "[1, 2, 3, 4]"
        array.remove(3)

        assertNotSame(content, `is`(equalTo(array.toString())))
    }

    @Test
    fun assertThatMutableListContainsValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)

        assertThat(true, `is`(equalTo(array.contains(4))))
    }

    @Test
    fun assertThatMutableListFirstValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)

        assertThat(4, `is`(equalTo(array.last())))
    }


    @Test
    fun assertThatMutableListLastValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)

        assertThat(true, `is`(equalTo(array.contains(4))))
    }

    @Test
    fun assertThatMutableListFindValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)
        val number : Int? = array.find {
            it % 4 == 0
        }
        assertThat(4, `is`(equalTo(number)))
    }

    @Test
    fun assertThatMutableListFilterValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)
        val number : List<Int> = array.filter {
            it % 2 == 0
        }
        val content: String = "[2, 4]"
        assertThat(content, `is`(equalTo(number.toString())))

    }

    @Test
    fun assertThatMutableListDuplicateValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)
        val number : List<Int> = array.map {
            it * 1
        }
        val content: String = "[1, 2, 3, 4]"
        assertThat(content, `is`(equalTo(number.toString())))

    }

    @Test
    fun assertThatMutableListDuplicateEvenValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)
        val number : List<Int> = array.filter {
            it %2 == 0
        }
        val content: String = "[2, 4]"
        assertThat(content, `is`(equalTo(number.toString())))

    }

    @Test
    fun assertThatMutableListDuplicateOddValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)
        val number : List<Int> = array.filter {
            it %2 == 1
        }
        val content: String = "[1, 3]"
        assertThat(content, `is`(equalTo(number.toString())))

    }

    @Test
    fun assertThatMutableListSlicesValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)
        val number : List<Int> = array.slice(0..3)
        val content: String = "[1, 2, 3, 4]"
        assertThat(content, `is`(equalTo(number.toString())))

    }

    @Test
    fun assertThatMutableListTakeValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)
        val number : List<Int> = array.take(4)
        val content: String = "[1, 2, 3, 4]"
        assertThat(content, `is`(equalTo(number.toString())))

    }

    @Test
    fun assertThatMutableListTakeLastValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)
        val number : List<Int> = array.takeLast(2)
        val content: String = "[3, 4]"
        assertThat(content, `is`(equalTo(number.toString())))

    }

    @Test
    fun assertThatMutableListGetValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)

        assertThat(2, `is`(equalTo(array[1])))

    }

    @Test
    fun assertThatMutableListGetElementAtOrNullValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)

        assertNull(array.elementAtOrNull(4))

    }

    @Test
    fun assertThatMutableEmptyListHasValueEqualTo() {

        val array: List<Int> = emptyList<Int>()

        assertThat(true, `is`(equalTo(array.isEmpty())))

    }

    @Test
    fun assertThatMutableListIsEmptyEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 2, 3, 4)

        assertThat(false, `is`(equalTo(array.isEmpty())))

    }

    @Test
    fun assertThatMutableListSortValueEqualTo() {

        val array: MutableList<Int> = mutableListOf(1, 4, 3, 2)
        array.sort()
        val content: String = "[1, 2, 3, 4]"
        assertThat(content, `is`(equalTo(array.toString())))

    }



}