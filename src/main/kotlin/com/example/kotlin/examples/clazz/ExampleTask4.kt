package com.example.kotlin.examples.clazz


class ExampleTask4(val name: String) {

    // INIT WILL BE CALLED BETWEEN PRIMARY ABD SECONDARY CONSTRUCTOR IN A SEQUENTIAL MANNER

    init {

    }
    init {

    }
    init {

    }

    constructor(fullName: String, age: Int) : this(fullName) {
        username = fullName
    }

    var username: String = ""
    var index = 0

}
