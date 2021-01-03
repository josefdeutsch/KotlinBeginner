package com.example.kotlin.examples.clazz


class ExampleTask5(val name: String) {

    // INIT WILL BE CALLED BETWEEN PRIMARY ABD SECONDARY CONSTRUCTOR IN A SEQUENTIAL MANNER

  companion object {

      fun add(a:Int,b:Int):Int{
          return a.plus(b)
      }
  }

}
